// Generated from D:/Dem Bois/College/Fourth Year 2/AngularCompiler (Only allowed in 2nd Semester)/src/MyParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(MyParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MyParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActions(MyParser.ActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#controlFlow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlFlow(MyParser.ControlFlowContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#structures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructures(MyParser.StructuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#importRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportRule(MyParser.ImportRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#importedObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportedObject(MyParser.ImportedObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(MyParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelector(MyParser.CssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#decoratorStandalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorStandalone(MyParser.DecoratorStandaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#htmlTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTemplate(MyParser.HtmlTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(MyParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(MyParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(MyParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#constArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstArray(MyParser.ConstArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#varArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArray(MyParser.VarArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#letArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetArray(MyParser.LetArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#objectLiteralAttributeAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralAttributeAssignment(MyParser.ObjectLiteralAttributeAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(MyParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MyParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(MyParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MyParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#plusSomething}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusSomething(MyParser.PlusSomethingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#minusSomething}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusSomething(MyParser.MinusSomethingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MyParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MyParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MyParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(MyParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(MyParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(MyParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(MyParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#atomicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicExpression(MyParser.AtomicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#calls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalls(MyParser.CallsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#dataContainers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataContainers(MyParser.DataContainersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#groupedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupedExpression(MyParser.GroupedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MyParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(MyParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(MyParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MyParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MyParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#hooks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHooks(MyParser.HooksContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#onInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnInit(MyParser.OnInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#onDestroy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnDestroy(MyParser.OnDestroyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#onChanges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnChanges(MyParser.OnChangesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#onAfterViewInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnAfterViewInit(MyParser.OnAfterViewInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(MyParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#classScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassScope(MyParser.ClassScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#classField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassField(MyParser.ClassFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#classFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFunctionDefinition(MyParser.ClassFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#privacyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivacyType(MyParser.PrivacyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#classFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFunction(MyParser.ClassFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(MyParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(MyParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotation(MyParser.TypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(MyParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(MyParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#genericTypeInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeInstance(MyParser.GenericTypeInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(MyParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MyParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#functionScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionScope(MyParser.FunctionScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MyParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MyParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MyParser.IdContext ctx);
}