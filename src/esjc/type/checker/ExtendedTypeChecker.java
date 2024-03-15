package esjc.type.checker;

import java.util.Map;

import org.eclipse.jdt.core.dom.*;

import esjc.symboltable.SymbolTable;
import esjc.symboltable.ExtendedSymbolTable;
import esjc.type.ClassType;
import esjc.type.Type;
import esjc.type.TypeFactory;
import esjc.util.Pair;

/**
 * This class is used to type check a StaticJava {@link CompilationUnit} with a
 * given {@link SymbolTable}.
 *
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ExtendedTypeChecker extends TypeChecker {
    /**
     * The visitor for {@link ASTNode} to type check an ExtendedStaticJava
     * {@link CompilationUnit}.
     *
     * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
     */
    protected static class Visitor extends TypeChecker.Visitor {
        protected Map<String, TypeDeclaration> classMap;

        protected Map<Pair<String, String>, FieldDeclaration> fieldMap;

        protected Visitor(final TypeFactory tf, final ExtendedSymbolTable est) {
            super(tf, est);
            this.classMap = est.classMap;
            this.fieldMap = est.fieldMap;
            for (final Pair<String, String> p : est.fieldMap.keySet()) {
                final FieldDeclaration fd = est.fieldMap.get(p);
                final Type t = convertType(fd, fd.getType());
                final String className = p.first;
                final String fieldName = p.second;
                final ClassType ct = tf.getClassType(className);
                ct.fieldTypeMap.put(fieldName, t);
            }
        }

        @Override
        public boolean visit(final InfixExpression node) {
            node.getLeftOperand().accept(this);
            final Type lhsType = getResult();
            node.getRightOperand().accept(this);
            final Type rhsType = getResult();
            final InfixExpression.Operator op = node.getOperator();
            if ((op == InfixExpression.Operator.TIMES)
                    || (op == InfixExpression.Operator.DIVIDE)
                    || (op == InfixExpression.Operator.REMAINDER)
                    || (op == InfixExpression.Operator.PLUS)
                    || (op == InfixExpression.Operator.MINUS)) {
                if (lhsType != this.tf.Int) {
                    throw new Error(node,
                            "Expecting an int type expression as the left-hand operand of \""
                                    + op + "\" in \"" + node + "\"");
                }
                if (rhsType != this.tf.Int) {
                    throw new Error(node,
                            "Expecting an int type expression as the right-hand operand of \""
                                    + op + "\" in \"" + node + "\"");
                }
                setResult(node, this.tf.Int);
            } else if ((op == InfixExpression.Operator.LESS)
                    || (op == InfixExpression.Operator.GREATER)
                    || (op == InfixExpression.Operator.LESS_EQUALS)
                    || (op == InfixExpression.Operator.GREATER_EQUALS)) {
                if (lhsType != this.tf.Int) {
                    throw new Error(node,
                            "Expecting an int type expression as the left-hand operand of \""
                                    + op + "\" in \"" + node + "\"");
                }
                if (rhsType != this.tf.Int) {
                    throw new Error(node,
                            "Expecting an int type expression as the right-hand operand of \""
                                    + op + "\" in \"" + node + "\"");
                }
                setResult(node, this.tf.Boolean);
            } else if ((op == InfixExpression.Operator.CONDITIONAL_AND)
                    || (op == InfixExpression.Operator.CONDITIONAL_OR)) {
                if (lhsType != this.tf.Boolean) {
                    throw new Error(node,
                            "Expecting a boolean type expression as the left-hand operand of \""
                                    + op + "\" in \"" + node + "\"");
                }
                if (rhsType != this.tf.Boolean) {
                    throw new Error(node,
                            "Expecting a boolean type expression as the right-hand operand of \""
                                    + op + "\" in \"" + node + "\"");
                }
                setResult(node, this.tf.Boolean);
            } else if ((op == InfixExpression.Operator.EQUALS)
                    || (op == InfixExpression.Operator.NOT_EQUALS)) {
                if (lhsType != rhsType) {
                    throw new Error(node, "Type mismatch in \"" + node + "\": " + lhsType
                            + " " + op + " " + rhsType);
                }
                setResult(node, this.tf.Boolean);
            }

            else if ((op == InfixExpression.Operator.LEFT_SHIFT)
                    || (op == InfixExpression.Operator.RIGHT_SHIFT_SIGNED)
                    || (op == InfixExpression.Operator.RIGHT_SHIFT_UNSIGNED)) {
                if (lhsType != rhsType) {
                    throw new Error(node, "Type mismatch in \"" + node + "\": " + lhsType
                            + " " + op + " " + rhsType);
                }
                setResult(node, this.tf.Int);
            } else {
                throw new Error(node, "Unexpected InfixExpression: \'" + node + "\'");
            }

            return false;
        }

        @Override
        public boolean visit(final ExpressionStatement node) {
            final Expression e = node.getExpression();
            e.accept(this);
            if (e instanceof Assignment) {
                // assignment should not have a resulting type.
                assert getResult() == null;
            } else if (node.getExpression() instanceof MethodInvocation) {
                // method invocation's result can be any type (including void)
                // so we can ignore it.
                getResult();
            } else if (node.getExpression() instanceof PostfixExpression) {
                node.getExpression().accept(this);
                if (getResult() != this.tf.Int) {
                    throw new Error(node,
                            "Expecting an int type expression");
                }
            } else {
                throw new Error(node, "Unexpected SimpleName: \'" + node + "\'");
            }
            return false;
        }

        @Override
        public boolean visit(final PrefixExpression node) {
            node.getOperand().accept(this);
            final Type t = getResult();
            final PrefixExpression.Operator op = node.getOperator();
            if ((op == PrefixExpression.Operator.PLUS)
                    || (op == PrefixExpression.Operator.MINUS)) {
                if (t != this.tf.Int) {
                    throw new Error(node,
                            "Expecting an int type expression as the operand of \"" + op
                                    + "\" in \"" + node + "\"");
                }
                setResult(node, this.tf.Int);
            } else if (op == PrefixExpression.Operator.NOT) {
                if (t != this.tf.Boolean) {
                    throw new Error(node,
                            "Expecting a boolean type expression as the operand of \"" + op
                                    + "\" in \"" + node + "\"");
                }
                setResult(node, this.tf.Boolean);
            } else if (op == PrefixExpression.Operator.COMPLEMENT) {
                if (t != this.tf.Int) {
                    throw new Error(node,
                            "Expecting an int type expression as the operand of \"" + op
                                    + "\" in \"" + node + "\"");
                }
                setResult(node, this.tf.Int);
            } else {
                throw new Error(node, "Unexpected PrefixExpression: \'" + node + "\'");
            }
            return false;
        }
        
        @Override
        public boolean visit(final ClassInstanceCreation node) {
            final Type t = convertType(node, node.getType());
            setResult(node, t);
            this.symbolMap.put(node, this.classMap.get(node.getType().toString()));
            return false;
        }


        @Override
        protected Type convertType(final ASTNode node,
                                   final org.eclipse.jdt.core.dom.Type t) {
            if (t instanceof SimpleType) {
                final SimpleType st = (SimpleType) t;
                final String name = st.getName().getFullyQualifiedName();
                if (this.classMap.containsKey(name)) {
                    return this.tf.getClassType(name);
                }
            }
            return super.convertType(node, t);
        }

        @Override
        protected void dispose() {
            super.dispose();

            this.classMap = null;
            this.fieldMap = null;
        }
    }

    /**
     * Type checks an ExtendedStaticJava {@link CompilationUnit} with the given
     * {@link ExtendedSymbolTable} and the given {@link TypeFactory}. It also
     * resolves {@link MethodInvocation} of library call (and put its mapping in
     * the {@link ExtendedSymbolTable}).
     *
     * @param tf          The {@link TypeFactory}.
     * @param cu          The StaticJava {@link CompilationUnit}.
     * @param symbolTable The {@link ExtendedSymbolTable} of the {@link CompilationUnit}
     * @return The {@link ExtendedTypeTable}.
     * @throws Error If the type checker encounter type error in the
     *               {@link CompilationUnit}.
     */
    public static ExtendedTypeTable check(final TypeFactory tf,
                                          final CompilationUnit cu,
                                          final ExtendedSymbolTable symbolTable) throws Error {
        assert (tf != null) && (cu != null) && (symbolTable != null);

        final Visitor v = new Visitor(tf, symbolTable);
        cu.accept(v);
        final ExtendedTypeTable result = new ExtendedTypeTable(v.resultTypeMap,
                v.resultMethodTypeMap);
        v.dispose();
        return result;
    }

    /**
     * Declared as protected to disallow creation of this object outside from the
     * methods of this class.
     */
    protected ExtendedTypeChecker() {

    }


}
