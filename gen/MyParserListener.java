// Generated from D:/Dem Bois/College/Fourth Year 2/AngularCompiler (Only allowed in 2nd Semester)/src/MyParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(MyParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(MyParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MyParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MyParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(MyParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(MyParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#controlFlow}.
	 * @param ctx the parse tree
	 */
	void enterControlFlow(MyParser.ControlFlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#controlFlow}.
	 * @param ctx the parse tree
	 */
	void exitControlFlow(MyParser.ControlFlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#structures}.
	 * @param ctx the parse tree
	 */
	void enterStructures(MyParser.StructuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#structures}.
	 * @param ctx the parse tree
	 */
	void exitStructures(MyParser.StructuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#importRule}.
	 * @param ctx the parse tree
	 */
	void enterImportRule(MyParser.ImportRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#importRule}.
	 * @param ctx the parse tree
	 */
	void exitImportRule(MyParser.ImportRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#importedObject}.
	 * @param ctx the parse tree
	 */
	void enterImportedObject(MyParser.ImportedObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#importedObject}.
	 * @param ctx the parse tree
	 */
	void exitImportedObject(MyParser.ImportedObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(MyParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(MyParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(MyParser.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(MyParser.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#decoratorStandalone}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorStandalone(MyParser.DecoratorStandaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#decoratorStandalone}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorStandalone(MyParser.DecoratorStandaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#htmlTemplate}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTemplate(MyParser.HtmlTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#htmlTemplate}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTemplate(MyParser.HtmlTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(MyParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(MyParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(MyParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(MyParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(MyParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(MyParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#constArray}.
	 * @param ctx the parse tree
	 */
	void enterConstArray(MyParser.ConstArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#constArray}.
	 * @param ctx the parse tree
	 */
	void exitConstArray(MyParser.ConstArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#varArray}.
	 * @param ctx the parse tree
	 */
	void enterVarArray(MyParser.VarArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#varArray}.
	 * @param ctx the parse tree
	 */
	void exitVarArray(MyParser.VarArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#letArray}.
	 * @param ctx the parse tree
	 */
	void enterLetArray(MyParser.LetArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#letArray}.
	 * @param ctx the parse tree
	 */
	void exitLetArray(MyParser.LetArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#objectLiteralAttributeAssignment}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralAttributeAssignment(MyParser.ObjectLiteralAttributeAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#objectLiteralAttributeAssignment}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralAttributeAssignment(MyParser.ObjectLiteralAttributeAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(MyParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(MyParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(MyParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(MyParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(MyParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(MyParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MyParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MyParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#plusSomething}.
	 * @param ctx the parse tree
	 */
	void enterPlusSomething(MyParser.PlusSomethingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#plusSomething}.
	 * @param ctx the parse tree
	 */
	void exitPlusSomething(MyParser.PlusSomethingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#minusSomething}.
	 * @param ctx the parse tree
	 */
	void enterMinusSomething(MyParser.MinusSomethingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#minusSomething}.
	 * @param ctx the parse tree
	 */
	void exitMinusSomething(MyParser.MinusSomethingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MyParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MyParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MyParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MyParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(MyParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(MyParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(MyParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(MyParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(MyParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(MyParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(MyParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(MyParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicExpression(MyParser.AtomicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicExpression(MyParser.AtomicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#calls}.
	 * @param ctx the parse tree
	 */
	void enterCalls(MyParser.CallsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#calls}.
	 * @param ctx the parse tree
	 */
	void exitCalls(MyParser.CallsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#dataContainers}.
	 * @param ctx the parse tree
	 */
	void enterDataContainers(MyParser.DataContainersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#dataContainers}.
	 * @param ctx the parse tree
	 */
	void exitDataContainers(MyParser.DataContainersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#groupedExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupedExpression(MyParser.GroupedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#groupedExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupedExpression(MyParser.GroupedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MyParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(MyParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(MyParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(MyParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(MyParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MyParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MyParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MyParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MyParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#hooks}.
	 * @param ctx the parse tree
	 */
	void enterHooks(MyParser.HooksContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#hooks}.
	 * @param ctx the parse tree
	 */
	void exitHooks(MyParser.HooksContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#onInit}.
	 * @param ctx the parse tree
	 */
	void enterOnInit(MyParser.OnInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#onInit}.
	 * @param ctx the parse tree
	 */
	void exitOnInit(MyParser.OnInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#onDestroy}.
	 * @param ctx the parse tree
	 */
	void enterOnDestroy(MyParser.OnDestroyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#onDestroy}.
	 * @param ctx the parse tree
	 */
	void exitOnDestroy(MyParser.OnDestroyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#onChanges}.
	 * @param ctx the parse tree
	 */
	void enterOnChanges(MyParser.OnChangesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#onChanges}.
	 * @param ctx the parse tree
	 */
	void exitOnChanges(MyParser.OnChangesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#onAfterViewInit}.
	 * @param ctx the parse tree
	 */
	void enterOnAfterViewInit(MyParser.OnAfterViewInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#onAfterViewInit}.
	 * @param ctx the parse tree
	 */
	void exitOnAfterViewInit(MyParser.OnAfterViewInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(MyParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(MyParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#classScope}.
	 * @param ctx the parse tree
	 */
	void enterClassScope(MyParser.ClassScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#classScope}.
	 * @param ctx the parse tree
	 */
	void exitClassScope(MyParser.ClassScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#classField}.
	 * @param ctx the parse tree
	 */
	void enterClassField(MyParser.ClassFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#classField}.
	 * @param ctx the parse tree
	 */
	void exitClassField(MyParser.ClassFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#classFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassFunctionDefinition(MyParser.ClassFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#classFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassFunctionDefinition(MyParser.ClassFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#privacyType}.
	 * @param ctx the parse tree
	 */
	void enterPrivacyType(MyParser.PrivacyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#privacyType}.
	 * @param ctx the parse tree
	 */
	void exitPrivacyType(MyParser.PrivacyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#classFunction}.
	 * @param ctx the parse tree
	 */
	void enterClassFunction(MyParser.ClassFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#classFunction}.
	 * @param ctx the parse tree
	 */
	void exitClassFunction(MyParser.ClassFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(MyParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(MyParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(MyParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(MyParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(MyParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(MyParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(MyParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(MyParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(MyParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(MyParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#genericTypeInstance}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeInstance(MyParser.GenericTypeInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#genericTypeInstance}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeInstance(MyParser.GenericTypeInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(MyParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(MyParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MyParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MyParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#functionScope}.
	 * @param ctx the parse tree
	 */
	void enterFunctionScope(MyParser.FunctionScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#functionScope}.
	 * @param ctx the parse tree
	 */
	void exitFunctionScope(MyParser.FunctionScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MyParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MyParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MyParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MyParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MyParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MyParser.IdContext ctx);
}