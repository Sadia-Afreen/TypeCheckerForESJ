package esjc.type.checker;

import java.util.Map;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.TypeDeclaration;

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
   * @param tf
   *          The {@link TypeFactory}.
   * @param cu
   *          The StaticJava {@link CompilationUnit}.
   * @param symbolTable
   *          The {@link ExtendedSymbolTable} of the {@link CompilationUnit}
   * @return The {@link ExtendedTypeTable}.
   * @throws Error
   *           If the type checker encounter type error in the
   *           {@link CompilationUnit}.
   */
  public static
  ExtendedTypeTable check(final TypeFactory tf,
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
