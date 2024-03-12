// Generated from G:/My Drive/Boise State University/Spring '24/Programming Language Translation/TypeCheckerForESJ/src/esjc/parser/ExtendedStaticJava.g4 by ANTLR 4.13.1
package esjc.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtendedStaticJavaParser}.
 */
public interface ExtendedStaticJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExtendedStaticJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExtendedStaticJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#simpleClassDefintion}.
	 * @param ctx the parse tree
	 */
	void enterSimpleClassDefintion(ExtendedStaticJavaParser.SimpleClassDefintionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#simpleClassDefintion}.
	 * @param ctx the parse tree
	 */
	void exitSimpleClassDefintion(ExtendedStaticJavaParser.SimpleClassDefintionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#publicFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPublicFieldDeclaration(ExtendedStaticJavaParser.PublicFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#publicFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPublicFieldDeclaration(ExtendedStaticJavaParser.PublicFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExtendedStaticJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExtendedStaticJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(ExtendedStaticJavaParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(ExtendedStaticJavaParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#intType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(ExtendedStaticJavaParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#intType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(ExtendedStaticJavaParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(ExtendedStaticJavaParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(ExtendedStaticJavaParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(ExtendedStaticJavaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(ExtendedStaticJavaParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(ExtendedStaticJavaParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(ExtendedStaticJavaParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonVoidReturnType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterNonVoidReturnType(ExtendedStaticJavaParser.NonVoidReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonVoidReturnType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitNonVoidReturnType(ExtendedStaticJavaParser.NonVoidReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ExtendedStaticJavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ExtendedStaticJavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(ExtendedStaticJavaParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(ExtendedStaticJavaParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(ExtendedStaticJavaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(ExtendedStaticJavaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodDeclaration(ExtendedStaticJavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodDeclaration(ExtendedStaticJavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ExtendedStaticJavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ExtendedStaticJavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ExtendedStaticJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ExtendedStaticJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ExtendedStaticJavaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ExtendedStaticJavaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ExtendedStaticJavaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ExtendedStaticJavaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(ExtendedStaticJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(ExtendedStaticJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclaration(ExtendedStaticJavaParser.LocalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclaration(ExtendedStaticJavaParser.LocalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExtendedStaticJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExtendedStaticJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#incDecStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStatement(ExtendedStaticJavaParser.IncDecStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#incDecStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStatement(ExtendedStaticJavaParser.IncDecStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(ExtendedStaticJavaParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(ExtendedStaticJavaParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ExtendedStaticJavaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ExtendedStaticJavaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleLHS}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterSimpleLHS(ExtendedStaticJavaParser.SimpleLHSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleLHS}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitSimpleLHS(ExtendedStaticJavaParser.SimpleLHSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAccessLHS}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccessLHS(ExtendedStaticJavaParser.FieldAccessLHSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAccessLHS}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccessLHS(ExtendedStaticJavaParser.FieldAccessLHSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessLHS}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessLHS(ExtendedStaticJavaParser.ArrayAccessLHSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessLHS}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessLHS(ExtendedStaticJavaParser.ArrayAccessLHSContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ExtendedStaticJavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ExtendedStaticJavaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#forInits}.
	 * @param ctx the parse tree
	 */
	void enterForInits(ExtendedStaticJavaParser.ForInitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#forInits}.
	 * @param ctx the parse tree
	 */
	void exitForInits(ExtendedStaticJavaParser.ForInitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#forUpdates}.
	 * @param ctx the parse tree
	 */
	void enterForUpdates(ExtendedStaticJavaParser.ForUpdatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#forUpdates}.
	 * @param ctx the parse tree
	 */
	void exitForUpdates(ExtendedStaticJavaParser.ForUpdatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#incDec}.
	 * @param ctx the parse tree
	 */
	void enterIncDec(ExtendedStaticJavaParser.IncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#incDec}.
	 * @param ctx the parse tree
	 */
	void exitIncDec(ExtendedStaticJavaParser.IncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(ExtendedStaticJavaParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(ExtendedStaticJavaParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExtendedStaticJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExtendedStaticJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ExtendedStaticJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ExtendedStaticJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#invokeExpStatement}.
	 * @param ctx the parse tree
	 */
	void enterInvokeExpStatement(ExtendedStaticJavaParser.InvokeExpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#invokeExpStatement}.
	 * @param ctx the parse tree
	 */
	void exitInvokeExpStatement(ExtendedStaticJavaParser.InvokeExpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ExtendedStaticJavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ExtendedStaticJavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExp(ExtendedStaticJavaParser.LiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExp(ExtendedStaticJavaParser.LiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExp(ExtendedStaticJavaParser.ArrayAccessExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExp(ExtendedStaticJavaParser.ArrayAccessExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvokeExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInvokeExp(ExtendedStaticJavaParser.InvokeExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvokeExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInvokeExp(ExtendedStaticJavaParser.InvokeExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftLeftExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterShiftLeftExp(ExtendedStaticJavaParser.ShiftLeftExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftLeftExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitShiftLeftExp(ExtendedStaticJavaParser.ShiftLeftExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnsignedShiftRightExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedShiftRightExp(ExtendedStaticJavaParser.UnsignedShiftRightExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnsignedShiftRightExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedShiftRightExp(ExtendedStaticJavaParser.UnsignedShiftRightExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayCreationExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExp(ExtendedStaticJavaParser.ArrayCreationExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayCreationExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExp(ExtendedStaticJavaParser.ArrayCreationExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExp(ExtendedStaticJavaParser.BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExp(ExtendedStaticJavaParser.BinaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdExp(ExtendedStaticJavaParser.IdExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdExp(ExtendedStaticJavaParser.IdExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCondExp(ExtendedStaticJavaParser.CondExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCondExp(ExtendedStaticJavaParser.CondExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(ExtendedStaticJavaParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(ExtendedStaticJavaParser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftRightExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterShiftRightExp(ExtendedStaticJavaParser.ShiftRightExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftRightExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitShiftRightExp(ExtendedStaticJavaParser.ShiftRightExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(ExtendedStaticJavaParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(ExtendedStaticJavaParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAccessExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccessExp(ExtendedStaticJavaParser.FieldAccessExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAccessExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccessExp(ExtendedStaticJavaParser.FieldAccessExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(ExtendedStaticJavaParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(ExtendedStaticJavaParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(ExtendedStaticJavaParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(ExtendedStaticJavaParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNewExp(ExtendedStaticJavaParser.NewExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNewExp(ExtendedStaticJavaParser.NewExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(ExtendedStaticJavaParser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(ExtendedStaticJavaParser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(ExtendedStaticJavaParser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(ExtendedStaticJavaParser.FalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void enterArrayInit(ExtendedStaticJavaParser.ArrayInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void exitArrayInit(ExtendedStaticJavaParser.ArrayInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#invoke}.
	 * @param ctx the parse tree
	 */
	void enterInvoke(ExtendedStaticJavaParser.InvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#invoke}.
	 * @param ctx the parse tree
	 */
	void exitInvoke(ExtendedStaticJavaParser.InvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(ExtendedStaticJavaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(ExtendedStaticJavaParser.ArgsContext ctx);
}