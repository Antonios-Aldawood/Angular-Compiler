// Generated from D:/Dem Bois/College/Fourth Year 2/AngularCompiler (Only allowed in 2nd Semester)/src/MyParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WhiteSpace=1, NotTypeEquals=2, NotEquals=3, TypeEquals=4, Equals=5, Assign=6, 
		MinusOne=7, MinusSomething=8, Minus=9, PlusOne=10, PlusSomething=11, Plus=12, 
		Divide=13, Multiply=14, Overflow=15, OpenBracket=16, CloseBracket=17, 
		OpenCurlyBracket=18, CloseCurlyBracket=19, OpenArrayBracket=20, CloseArrayBracket=21, 
		SingleQuotation=22, DoubleQuotation=23, BackTick=24, Reference=25, SmallerOrEqualsOperator=26, 
		LargerOrEqualsOperator=27, SmallerOperator=28, LargerOperator=29, NullOperator=30, 
		DoubleColon=31, SemiColon=32, Dot=33, Comma=34, Escape=35, And=36, Or=37, 
		Not=38, ArrowFunction=39, True=40, False=41, If=42, Else=43, Switch=44, 
		Case=45, Default=46, For=47, While=48, Do=49, Break=50, Continue=51, Throw=52, 
		Try=53, Catch=54, Finally=55, TypeOf=56, InstanceOf=57, In=58, New=59, 
		This=60, Super=61, String=62, Number=63, Boolean=64, Any=65, Void=66, 
		Unknown=67, Set=68, Map=69, Record=70, Object=71, Static=72, Public=73, 
		Private=74, Protected=75, Var=76, Let=77, Const=78, Return=79, Function=80, 
		Class=81, Extends=82, Implements=83, Import=84, From=85, As=86, Export=87, 
		Console=88, Log=89, Selector=90, Standalone=91, Template=92, OnInit=93, 
		OnDestroy=94, OnChanges=95, OnAfterViewInit=96, Numbers=97, Identifier=98, 
		StringLiteral=99, Html=100;
	public static final int
		RULE_page = 0, RULE_statement = 1, RULE_declaration = 2, RULE_actions = 3, 
		RULE_controlFlow = 4, RULE_structures = 5, RULE_importRule = 6, RULE_importedObject = 7, 
		RULE_decorator = 8, RULE_cssSelector = 9, RULE_decoratorStandalone = 10, 
		RULE_htmlTemplate = 11, RULE_const = 12, RULE_var = 13, RULE_let = 14, 
		RULE_constArray = 15, RULE_varArray = 16, RULE_letArray = 17, RULE_objectLiteralAttributeAssignment = 18, 
		RULE_objectLiteral = 19, RULE_array = 20, RULE_object = 21, RULE_assign = 22, 
		RULE_plusSomething = 23, RULE_minusSomething = 24, RULE_ifStatement = 25, 
		RULE_whileStatement = 26, RULE_expression = 27, RULE_logicalExpression = 28, 
		RULE_comparisonExpression = 29, RULE_additiveExpression = 30, RULE_multiplicativeExpression = 31, 
		RULE_atomicExpression = 32, RULE_calls = 33, RULE_dataContainers = 34, 
		RULE_groupedExpression = 35, RULE_literal = 36, RULE_memberAccess = 37, 
		RULE_methodCall = 38, RULE_functionCall = 39, RULE_print = 40, RULE_hooks = 41, 
		RULE_onInit = 42, RULE_onDestroy = 43, RULE_onChanges = 44, RULE_onAfterViewInit = 45, 
		RULE_class = 46, RULE_classScope = 47, RULE_classField = 48, RULE_classFunctionDefinition = 49, 
		RULE_privacyType = 50, RULE_classFunction = 51, RULE_field = 52, RULE_fieldDeclaration = 53, 
		RULE_typeAnnotation = 54, RULE_type = 55, RULE_primitiveType = 56, RULE_genericType = 57, 
		RULE_genericTypeInstance = 58, RULE_scope = 59, RULE_function = 60, RULE_functionScope = 61, 
		RULE_parameters = 62, RULE_returnStatement = 63, RULE_id = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"page", "statement", "declaration", "actions", "controlFlow", "structures", 
			"importRule", "importedObject", "decorator", "cssSelector", "decoratorStandalone", 
			"htmlTemplate", "const", "var", "let", "constArray", "varArray", "letArray", 
			"objectLiteralAttributeAssignment", "objectLiteral", "array", "object", 
			"assign", "plusSomething", "minusSomething", "ifStatement", "whileStatement", 
			"expression", "logicalExpression", "comparisonExpression", "additiveExpression", 
			"multiplicativeExpression", "atomicExpression", "calls", "dataContainers", 
			"groupedExpression", "literal", "memberAccess", "methodCall", "functionCall", 
			"print", "hooks", "onInit", "onDestroy", "onChanges", "onAfterViewInit", 
			"class", "classScope", "classField", "classFunctionDefinition", "privacyType", 
			"classFunction", "field", "fieldDeclaration", "typeAnnotation", "type", 
			"primitiveType", "genericType", "genericTypeInstance", "scope", "function", 
			"functionScope", "parameters", "returnStatement", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'!=='", "'!='", "'==='", "'=='", "'='", "'--'", "'-='", 
			"'-'", "'++'", "'+='", "'+'", "'/'", "'*'", "'%'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'''", "'\"'", "'`'", "'@'", "'<='", "'>='", "'<'", 
			"'>'", "'?'", "':'", "';'", "'.'", "','", "'\\'", "'&&'", "'||'", "'!'", 
			"'=>'", "'true'", "'false'", "'if'", "'else'", "'switch'", "'case'", 
			"'default'", "'for'", "'while'", "'do'", "'break'", "'continue'", "'throw'", 
			"'try'", "'catch'", "'finally'", "'typeof'", "'instanceof'", "'in'", 
			"'new'", "'this'", "'super'", "'string'", "'number'", "'boolean'", "'any'", 
			"'void'", "'unknown'", "'Set'", "'Map'", "'Record'", "'object'", "'static'", 
			"'public'", "'private'", "'protected'", "'var'", "'let'", "'const'", 
			"'return'", "'function'", "'class'", "'extends'", "'implements'", "'import'", 
			"'from'", "'as'", "'export'", "'console'", "'log'", "'selector'", "'standalone'", 
			"'template'", "'ngOnInit'", "'ngOnDestroy'", "'ngOnChanges'", "'ngAfterViewInit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WhiteSpace", "NotTypeEquals", "NotEquals", "TypeEquals", "Equals", 
			"Assign", "MinusOne", "MinusSomething", "Minus", "PlusOne", "PlusSomething", 
			"Plus", "Divide", "Multiply", "Overflow", "OpenBracket", "CloseBracket", 
			"OpenCurlyBracket", "CloseCurlyBracket", "OpenArrayBracket", "CloseArrayBracket", 
			"SingleQuotation", "DoubleQuotation", "BackTick", "Reference", "SmallerOrEqualsOperator", 
			"LargerOrEqualsOperator", "SmallerOperator", "LargerOperator", "NullOperator", 
			"DoubleColon", "SemiColon", "Dot", "Comma", "Escape", "And", "Or", "Not", 
			"ArrowFunction", "True", "False", "If", "Else", "Switch", "Case", "Default", 
			"For", "While", "Do", "Break", "Continue", "Throw", "Try", "Catch", "Finally", 
			"TypeOf", "InstanceOf", "In", "New", "This", "Super", "String", "Number", 
			"Boolean", "Any", "Void", "Unknown", "Set", "Map", "Record", "Object", 
			"Static", "Public", "Private", "Protected", "Var", "Let", "Const", "Return", 
			"Function", "Class", "Extends", "Implements", "Import", "From", "As", 
			"Export", "Console", "Log", "Selector", "Standalone", "Template", "OnInit", 
			"OnDestroy", "OnChanges", "OnAfterViewInit", "Numbers", "Identifier", 
			"StringLiteral", "Html"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 285873058152448L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 4200759L) != 0)) {
				{
				{
				setState(130);
				statement();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ImportRuleContext importRule() {
			return getRuleContext(ImportRuleContext.class,0);
		}
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ControlFlowContext controlFlow() {
			return getRuleContext(ControlFlowContext.class,0);
		}
		public StructuresContext structures() {
			return getRuleContext(StructuresContext.class,0);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				importRule();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				decorator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				controlFlow();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				structures();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				actions();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ConstArrayContext constArray() {
			return getRuleContext(ConstArrayContext.class,0);
		}
		public LetArrayContext letArray() {
			return getRuleContext(LetArrayContext.class,0);
		}
		public VarArrayContext varArray() {
			return getRuleContext(VarArrayContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				const_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				let();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				var();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				constArray();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				letArray();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				varArray();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionsContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsContext actions() throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actions);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Console:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				print();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ControlFlowContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ControlFlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlFlow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterControlFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitControlFlow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitControlFlow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlFlowContext controlFlow() throws RecognitionException {
		ControlFlowContext _localctx = new ControlFlowContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_controlFlow);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				ifStatement();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				whileStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructuresContext extends ParserRuleContext {
		public GroupedExpressionContext groupedExpression() {
			return getRuleContext(GroupedExpressionContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public StructuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterStructures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitStructures(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStructures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuresContext structures() throws RecognitionException {
		StructuresContext _localctx = new StructuresContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structures);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				groupedExpression();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SemiColon) {
					{
					{
					setState(162);
					match(SemiColon);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				object();
				}
				break;
			case OpenArrayBracket:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				array();
				}
				break;
			case Class:
			case Export:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				class_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportRuleContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(MyParser.Import, 0); }
		public TerminalNode StringLiteral() { return getToken(MyParser.StringLiteral, 0); }
		public ImportedObjectContext importedObject() {
			return getRuleContext(ImportedObjectContext.class,0);
		}
		public TerminalNode From() { return getToken(MyParser.From, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public ImportRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterImportRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitImportRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitImportRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportRuleContext importRule() throws RecognitionException {
		ImportRuleContext _localctx = new ImportRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(Import);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenCurlyBracket) {
				{
				setState(174);
				importedObject();
				setState(175);
				match(From);
				}
			}

			setState(179);
			match(StringLiteral);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(180);
				match(SemiColon);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportedObjectContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(MyParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(MyParser.CloseCurlyBracket, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public List<TerminalNode> Comma() { return getTokens(MyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MyParser.Comma, i);
		}
		public ImportedObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importedObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterImportedObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitImportedObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitImportedObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportedObjectContext importedObject() throws RecognitionException {
		ImportedObjectContext _localctx = new ImportedObjectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importedObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(OpenCurlyBracket);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				id();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(188);
					match(Comma);
					}
				}

				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(195);
			match(CloseCurlyBracket);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(196);
				match(SemiColon);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode Reference() { return getToken(MyParser.Reference, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(MyParser.OpenBracket, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(MyParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(MyParser.CloseCurlyBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(MyParser.CloseBracket, 0); }
		public CssSelectorContext cssSelector() {
			return getRuleContext(CssSelectorContext.class,0);
		}
		public DecoratorStandaloneContext decoratorStandalone() {
			return getRuleContext(DecoratorStandaloneContext.class,0);
		}
		public HtmlTemplateContext htmlTemplate() {
			return getRuleContext(HtmlTemplateContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(Reference);
			setState(203);
			id();
			setState(204);
			match(OpenBracket);
			setState(205);
			match(OpenCurlyBracket);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Selector) {
				{
				setState(206);
				cssSelector();
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Standalone) {
				{
				setState(209);
				decoratorStandalone();
				}
			}

			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(212);
				htmlTemplate();
				}
			}

			}
			setState(215);
			match(CloseCurlyBracket);
			setState(216);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public TerminalNode Selector() { return getToken(MyParser.Selector, 0); }
		public TerminalNode DoubleColon() { return getToken(MyParser.DoubleColon, 0); }
		public TerminalNode StringLiteral() { return getToken(MyParser.StringLiteral, 0); }
		public TerminalNode Comma() { return getToken(MyParser.Comma, 0); }
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cssSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(Selector);
			setState(219);
			match(DoubleColon);
			setState(220);
			match(StringLiteral);
			setState(221);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorStandaloneContext extends ParserRuleContext {
		public TerminalNode Standalone() { return getToken(MyParser.Standalone, 0); }
		public TerminalNode DoubleColon() { return getToken(MyParser.DoubleColon, 0); }
		public TerminalNode Comma() { return getToken(MyParser.Comma, 0); }
		public TerminalNode True() { return getToken(MyParser.True, 0); }
		public TerminalNode False() { return getToken(MyParser.False, 0); }
		public DecoratorStandaloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorStandalone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDecoratorStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDecoratorStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDecoratorStandalone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorStandaloneContext decoratorStandalone() throws RecognitionException {
		DecoratorStandaloneContext _localctx = new DecoratorStandaloneContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decoratorStandalone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(Standalone);
			setState(224);
			match(DoubleColon);
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==True || _la==False) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(226);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTemplateContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(MyParser.Template, 0); }
		public TerminalNode DoubleColon() { return getToken(MyParser.DoubleColon, 0); }
		public TerminalNode Html() { return getToken(MyParser.Html, 0); }
		public TerminalNode Comma() { return getToken(MyParser.Comma, 0); }
		public HtmlTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterHtmlTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitHtmlTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitHtmlTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTemplateContext htmlTemplate() throws RecognitionException {
		HtmlTemplateContext _localctx = new HtmlTemplateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_htmlTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(Template);
			setState(229);
			match(DoubleColon);
			setState(230);
			match(Html);
			setState(231);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(MyParser.Const, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MyParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(Const);
			setState(234);
			field();
			setState(235);
			match(Assign);
			setState(236);
			expression();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(237);
				match(SemiColon);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(MyParser.Var, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MyParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(Var);
			setState(244);
			field();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(245);
				match(Assign);
				setState(246);
				expression();
				}
			}

			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(249);
				match(SemiColon);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LetContext extends ParserRuleContext {
		public TerminalNode Let() { return getToken(MyParser.Let, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MyParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(Let);
			setState(256);
			field();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(257);
				match(Assign);
				setState(258);
				expression();
				}
			}

			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(261);
				match(SemiColon);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstArrayContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(MyParser.Const, 0); }
		public TerminalNode OpenArrayBracket() { return getToken(MyParser.OpenArrayBracket, 0); }
		public TerminalNode CloseArrayBracket() { return getToken(MyParser.CloseArrayBracket, 0); }
		public TerminalNode Assign() { return getToken(MyParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(MyParser.StringLiteral, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(MyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MyParser.Comma, i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public TerminalNode OpenBracket() { return getToken(MyParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(MyParser.CloseBracket, 0); }
		public ConstArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterConstArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitConstArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitConstArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstArrayContext constArray() throws RecognitionException {
		ConstArrayContext _localctx = new ConstArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(Const);
			setState(268);
			match(OpenArrayBracket);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(269);
				id();
				setState(270);
				match(Comma);
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(CloseArrayBracket);
			setState(278);
			match(Assign);
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(279);
				match(StringLiteral);
				}
				break;
			case Identifier:
				{
				setState(280);
				id();
				}
				break;
			case OpenBracket:
				{
				{
				setState(281);
				match(OpenBracket);
				setState(282);
				match(StringLiteral);
				setState(283);
				match(CloseBracket);
				}
				}
				break;
			case OpenArrayBracket:
				{
				setState(284);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(287);
				match(SemiColon);
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarArrayContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(MyParser.Var, 0); }
		public TerminalNode OpenArrayBracket() { return getToken(MyParser.OpenArrayBracket, 0); }
		public TerminalNode CloseArrayBracket() { return getToken(MyParser.CloseArrayBracket, 0); }
		public TerminalNode Assign() { return getToken(MyParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(MyParser.StringLiteral, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(MyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MyParser.Comma, i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public TerminalNode OpenBracket() { return getToken(MyParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(MyParser.CloseBracket, 0); }
		public VarArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterVarArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitVarArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitVarArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarArrayContext varArray() throws RecognitionException {
		VarArrayContext _localctx = new VarArrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(Var);
			setState(294);
			match(OpenArrayBracket);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(295);
				id();
				setState(296);
				match(Comma);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(CloseArrayBracket);
			setState(304);
			match(Assign);
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(305);
				match(StringLiteral);
				}
				break;
			case Identifier:
				{
				setState(306);
				id();
				}
				break;
			case OpenBracket:
				{
				{
				setState(307);
				match(OpenBracket);
				setState(308);
				match(StringLiteral);
				setState(309);
				match(CloseBracket);
				}
				}
				break;
			case OpenArrayBracket:
				{
				setState(310);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(313);
				match(SemiColon);
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LetArrayContext extends ParserRuleContext {
		public TerminalNode Let() { return getToken(MyParser.Let, 0); }
		public TerminalNode OpenArrayBracket() { return getToken(MyParser.OpenArrayBracket, 0); }
		public TerminalNode CloseArrayBracket() { return getToken(MyParser.CloseArrayBracket, 0); }
		public TerminalNode Assign() { return getToken(MyParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(MyParser.StringLiteral, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(MyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MyParser.Comma, i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public TerminalNode OpenBracket() { return getToken(MyParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(MyParser.CloseBracket, 0); }
		public LetArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLetArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLetArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitLetArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetArrayContext letArray() throws RecognitionException {
		LetArrayContext _localctx = new LetArrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_letArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(Let);
			setState(320);
			match(OpenArrayBracket);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(321);
				id();
				setState(322);
				match(Comma);
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(CloseArrayBracket);
			setState(330);
			match(Assign);
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(331);
				match(StringLiteral);
				}
				break;
			case Identifier:
				{
				setState(332);
				id();
				}
				break;
			case OpenBracket:
				{
				{
				setState(333);
				match(OpenBracket);
				setState(334);
				match(StringLiteral);
				setState(335);
				match(CloseBracket);
				}
				}
				break;
			case OpenArrayBracket:
				{
				setState(336);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(339);
				match(SemiColon);
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralAttributeAssignmentContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(MyParser.DoubleColon, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public ObjectLiteralAttributeAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteralAttributeAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterObjectLiteralAttributeAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitObjectLiteralAttributeAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitObjectLiteralAttributeAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralAttributeAssignmentContext objectLiteralAttributeAssignment() throws RecognitionException {
		ObjectLiteralAttributeAssignmentContext _localctx = new ObjectLiteralAttributeAssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_objectLiteralAttributeAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
			case Numbers:
			case StringLiteral:
				{
				setState(345);
				literal();
				}
				break;
			case Identifier:
				{
				setState(346);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(349);
			match(DoubleColon);
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case True:
			case False:
			case Numbers:
			case StringLiteral:
				{
				setState(350);
				literal();
				}
				break;
			case Identifier:
				{
				setState(351);
				memberAccess();
				setState(352);
				parameters();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(356);
				match(SemiColon);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(MyParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(MyParser.CloseCurlyBracket, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MyParser.Comma, i);
		}
		public List<ObjectLiteralAttributeAssignmentContext> objectLiteralAttributeAssignment() {
			return getRuleContexts(ObjectLiteralAttributeAssignmentContext.class);
		}
		public ObjectLiteralAttributeAssignmentContext objectLiteralAttributeAssignment(int i) {
			return getRuleContext(ObjectLiteralAttributeAssignmentContext.class,i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(OpenCurlyBracket);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 1008806316530991107L) != 0)) {
				{
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(363);
					id();
					setState(364);
					match(Comma);
					}
					break;
				case 2:
					{
					setState(366);
					objectLiteralAttributeAssignment();
					}
					break;
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OpenArrayBracket() { return getToken(MyParser.OpenArrayBracket, 0); }
		public TerminalNode CloseArrayBracket() { return getToken(MyParser.CloseArrayBracket, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MyParser.Comma, i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(OpenArrayBracket);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3573414166528L) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0)) {
				{
				{
				setState(375);
				expression();
				setState(376);
				match(Comma);
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(CloseArrayBracket);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					match(SemiColon);
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(MyParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(MyParser.CloseCurlyBracket, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(OpenCurlyBracket);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3573414166528L) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0)) {
				{
				{
				setState(391);
				expression();
				setState(393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(392);
					match(SemiColon);
					}
					}
					setState(395); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SemiColon );
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(CloseCurlyBracket);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(403);
				match(SemiColon);
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MyParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public PlusSomethingContext plusSomething() {
			return getRuleContext(PlusSomethingContext.class,0);
		}
		public MinusSomethingContext minusSomething() {
			return getRuleContext(MinusSomethingContext.class,0);
		}
		public TerminalNode PlusOne() { return getToken(MyParser.PlusOne, 0); }
		public TerminalNode MinusOne() { return getToken(MyParser.MinusOne, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(409);
				id();
				setState(410);
				match(Assign);
				setState(411);
				expression();
				}
				break;
			case 2:
				{
				{
				setState(413);
				id();
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==MinusOne || _la==PlusOne) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 3:
				{
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(416);
					plusSomething();
					}
					break;
				case 2:
					{
					setState(417);
					minusSomething();
					}
					break;
				}
				}
				break;
			}
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(422);
				match(SemiColon);
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlusSomethingContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PlusSomething() { return getToken(MyParser.PlusSomething, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PlusSomethingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusSomething; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPlusSomething(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPlusSomething(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPlusSomething(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusSomethingContext plusSomething() throws RecognitionException {
		PlusSomethingContext _localctx = new PlusSomethingContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_plusSomething);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			id();
			setState(429);
			match(PlusSomething);
			setState(430);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MinusSomethingContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode MinusSomething() { return getToken(MyParser.MinusSomething, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusSomethingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusSomething; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMinusSomething(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMinusSomething(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMinusSomething(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusSomethingContext minusSomething() throws RecognitionException {
		MinusSomethingContext _localctx = new MinusSomethingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_minusSomething);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			id();
			setState(433);
			match(MinusSomething);
			setState(434);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(MyParser.If, 0); }
		public TerminalNode OpenBracket() { return getToken(MyParser.OpenBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(MyParser.CloseBracket, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(If);
			setState(437);
			match(OpenBracket);
			setState(438);
			expression();
			setState(439);
			match(CloseBracket);
			setState(440);
			scope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(MyParser.While, 0); }
		public TerminalNode OpenBracket() { return getToken(MyParser.OpenBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(MyParser.CloseBracket, 0); }
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(While);
			setState(443);
			match(OpenBracket);
			setState(444);
			expression();
			setState(445);
			match(CloseBracket);
			setState(446);
			scope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			logicalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(MyParser.And); }
		public TerminalNode And(int i) {
			return getToken(MyParser.And, i);
		}
		public List<TerminalNode> Or() { return getTokens(MyParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(MyParser.Or, i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			comparisonExpression();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And || _la==Or) {
				{
				{
				setState(451);
				_la = _input.LA(1);
				if ( !(_la==And || _la==Or) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(452);
				comparisonExpression();
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> SmallerOperator() { return getTokens(MyParser.SmallerOperator); }
		public TerminalNode SmallerOperator(int i) {
			return getToken(MyParser.SmallerOperator, i);
		}
		public List<TerminalNode> LargerOperator() { return getTokens(MyParser.LargerOperator); }
		public TerminalNode LargerOperator(int i) {
			return getToken(MyParser.LargerOperator, i);
		}
		public List<TerminalNode> SmallerOrEqualsOperator() { return getTokens(MyParser.SmallerOrEqualsOperator); }
		public TerminalNode SmallerOrEqualsOperator(int i) {
			return getToken(MyParser.SmallerOrEqualsOperator, i);
		}
		public List<TerminalNode> LargerOrEqualsOperator() { return getTokens(MyParser.LargerOrEqualsOperator); }
		public TerminalNode LargerOrEqualsOperator(int i) {
			return getToken(MyParser.LargerOrEqualsOperator, i);
		}
		public List<TerminalNode> Equals() { return getTokens(MyParser.Equals); }
		public TerminalNode Equals(int i) {
			return getToken(MyParser.Equals, i);
		}
		public List<TerminalNode> TypeEquals() { return getTokens(MyParser.TypeEquals); }
		public TerminalNode TypeEquals(int i) {
			return getToken(MyParser.TypeEquals, i);
		}
		public List<TerminalNode> NotEquals() { return getTokens(MyParser.NotEquals); }
		public TerminalNode NotEquals(int i) {
			return getToken(MyParser.NotEquals, i);
		}
		public List<TerminalNode> NotTypeEquals() { return getTokens(MyParser.NotTypeEquals); }
		public TerminalNode NotTypeEquals(int i) {
			return getToken(MyParser.NotTypeEquals, i);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			additiveExpression();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006633020L) != 0)) {
				{
				{
				setState(459);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006633020L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(460);
				additiveExpression();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(MyParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(MyParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(MyParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(MyParser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			multiplicativeExpression();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Minus || _la==Plus) {
				{
				{
				setState(467);
				_la = _input.LA(1);
				if ( !(_la==Minus || _la==Plus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(468);
				multiplicativeExpression();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<AtomicExpressionContext> atomicExpression() {
			return getRuleContexts(AtomicExpressionContext.class);
		}
		public AtomicExpressionContext atomicExpression(int i) {
			return getRuleContext(AtomicExpressionContext.class,i);
		}
		public List<TerminalNode> Multiply() { return getTokens(MyParser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(MyParser.Multiply, i);
		}
		public List<TerminalNode> Divide() { return getTokens(MyParser.Divide); }
		public TerminalNode Divide(int i) {
			return getToken(MyParser.Divide, i);
		}
		public List<TerminalNode> Overflow() { return getTokens(MyParser.Overflow); }
		public TerminalNode Overflow(int i) {
			return getToken(MyParser.Overflow, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			atomicExpression();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) {
				{
				{
				setState(475);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(476);
				atomicExpression();
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicExpressionContext extends ParserRuleContext {
		public GroupedExpressionContext groupedExpression() {
			return getRuleContext(GroupedExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Not() { return getToken(MyParser.Not, 0); }
		public CallsContext calls() {
			return getRuleContext(CallsContext.class,0);
		}
		public DataContainersContext dataContainers() {
			return getRuleContext(DataContainersContext.class,0);
		}
		public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterAtomicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitAtomicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAtomicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicExpressionContext atomicExpression() throws RecognitionException {
		AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_atomicExpression);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				groupedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				match(Not);
				setState(486);
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
				calls();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(488);
				dataContainers();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallsContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public CallsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterCalls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitCalls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCalls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallsContext calls() throws RecognitionException {
		CallsContext _localctx = new CallsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_calls);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				memberAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataContainersContext extends ParserRuleContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DataContainersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataContainers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterDataContainers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitDataContainers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDataContainers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContainersContext dataContainers() throws RecognitionException {
		DataContainersContext _localctx = new DataContainersContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dataContainers);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				objectLiteral();
				}
				break;
			case OpenArrayBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupedExpressionContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(MyParser.OpenBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(MyParser.CloseBracket, 0); }
		public GroupedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterGroupedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitGroupedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitGroupedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupedExpressionContext groupedExpression() throws RecognitionException {
		GroupedExpressionContext _localctx = new GroupedExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_groupedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(OpenBracket);
			setState(501);
			expression();
			setState(502);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(MyParser.StringLiteral, 0); }
		public TerminalNode Numbers() { return getToken(MyParser.Numbers, 0); }
		public TerminalNode True() { return getToken(MyParser.True, 0); }
		public TerminalNode False() { return getToken(MyParser.False, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_la = _input.LA(1);
			if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 720575940379279363L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(MyParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(MyParser.Dot, i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_memberAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			id();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				setState(511);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(507);
					match(Dot);
					setState(508);
					id();
					}
					break;
				case 2:
					{
					setState(509);
					match(Dot);
					setState(510);
					functionCall();
					}
					break;
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Dot() { return getToken(MyParser.Dot, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			id();
			setState(517);
			match(Dot);
			setState(518);
			functionCall();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			id();
			setState(521);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Console() { return getToken(MyParser.Console, 0); }
		public TerminalNode Dot() { return getToken(MyParser.Dot, 0); }
		public TerminalNode Log() { return getToken(MyParser.Log, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(Console);
			setState(524);
			match(Dot);
			setState(525);
			match(Log);
			setState(526);
			parameters();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(527);
				match(SemiColon);
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HooksContext extends ParserRuleContext {
		public OnInitContext onInit() {
			return getRuleContext(OnInitContext.class,0);
		}
		public OnDestroyContext onDestroy() {
			return getRuleContext(OnDestroyContext.class,0);
		}
		public OnChangesContext onChanges() {
			return getRuleContext(OnChangesContext.class,0);
		}
		public OnAfterViewInitContext onAfterViewInit() {
			return getRuleContext(OnAfterViewInitContext.class,0);
		}
		public HooksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hooks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterHooks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitHooks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitHooks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HooksContext hooks() throws RecognitionException {
		HooksContext _localctx = new HooksContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_hooks);
		try {
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OnInit:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				onInit();
				}
				break;
			case OnDestroy:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				onDestroy();
				}
				break;
			case OnChanges:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				onChanges();
				}
				break;
			case OnAfterViewInit:
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
				onAfterViewInit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnInitContext extends ParserRuleContext {
		public TerminalNode OnInit() { return getToken(MyParser.OnInit, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionScopeContext functionScope() {
			return getRuleContext(FunctionScopeContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public OnInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterOnInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitOnInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitOnInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnInitContext onInit() throws RecognitionException {
		OnInitContext _localctx = new OnInitContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_onInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(OnInit);
			setState(540);
			parameters();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleColon) {
				{
				setState(541);
				typeAnnotation();
				}
			}

			setState(544);
			functionScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnDestroyContext extends ParserRuleContext {
		public TerminalNode OnDestroy() { return getToken(MyParser.OnDestroy, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionScopeContext functionScope() {
			return getRuleContext(FunctionScopeContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public OnDestroyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDestroy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterOnDestroy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitOnDestroy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitOnDestroy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnDestroyContext onDestroy() throws RecognitionException {
		OnDestroyContext _localctx = new OnDestroyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_onDestroy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(OnDestroy);
			setState(547);
			parameters();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleColon) {
				{
				setState(548);
				typeAnnotation();
				}
			}

			setState(551);
			functionScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnChangesContext extends ParserRuleContext {
		public TerminalNode OnChanges() { return getToken(MyParser.OnChanges, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionScopeContext functionScope() {
			return getRuleContext(FunctionScopeContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public OnChangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onChanges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterOnChanges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitOnChanges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitOnChanges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnChangesContext onChanges() throws RecognitionException {
		OnChangesContext _localctx = new OnChangesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_onChanges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(OnChanges);
			setState(554);
			parameters();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleColon) {
				{
				setState(555);
				typeAnnotation();
				}
			}

			setState(558);
			functionScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnAfterViewInitContext extends ParserRuleContext {
		public TerminalNode OnAfterViewInit() { return getToken(MyParser.OnAfterViewInit, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionScopeContext functionScope() {
			return getRuleContext(FunctionScopeContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public OnAfterViewInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onAfterViewInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterOnAfterViewInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitOnAfterViewInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitOnAfterViewInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnAfterViewInitContext onAfterViewInit() throws RecognitionException {
		OnAfterViewInitContext _localctx = new OnAfterViewInitContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_onAfterViewInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(OnAfterViewInit);
			setState(561);
			parameters();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleColon) {
				{
				setState(562);
				typeAnnotation();
				}
			}

			setState(565);
			functionScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(MyParser.Class, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ClassScopeContext classScope() {
			return getRuleContext(ClassScopeContext.class,0);
		}
		public TerminalNode Export() { return getToken(MyParser.Export, 0); }
		public TerminalNode Implements() { return getToken(MyParser.Implements, 0); }
		public TerminalNode Extends() { return getToken(MyParser.Extends, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(567);
				match(Export);
				}
			}

			setState(570);
			match(Class);
			setState(571);
			id();
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends || _la==Implements) {
				{
				setState(572);
				_la = _input.LA(1);
				if ( !(_la==Extends || _la==Implements) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(573);
				id();
				}
			}

			setState(576);
			classScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassScopeContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(MyParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(MyParser.CloseCurlyBracket, 0); }
		public List<ClassFieldContext> classField() {
			return getRuleContexts(ClassFieldContext.class);
		}
		public ClassFieldContext classField(int i) {
			return getRuleContext(ClassFieldContext.class,i);
		}
		public List<ClassFunctionDefinitionContext> classFunctionDefinition() {
			return getRuleContexts(ClassFunctionDefinitionContext.class);
		}
		public ClassFunctionDefinitionContext classFunctionDefinition(int i) {
			return getRuleContext(ClassFunctionDefinitionContext.class,i);
		}
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
		}
		public ClassScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterClassScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitClassScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitClassScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassScopeContext classScope() throws RecognitionException {
		ClassScopeContext _localctx = new ClassScopeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_classScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(OpenCurlyBracket);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 98566159L) != 0)) {
				{
				setState(582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(579);
					classField();
					}
					break;
				case 2:
					{
					setState(580);
					classFunctionDefinition();
					}
					break;
				case 3:
					{
					setState(581);
					hooks();
					}
					break;
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassFieldContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public PrivacyTypeContext privacyType() {
			return getRuleContext(PrivacyTypeContext.class,0);
		}
		public TerminalNode Static() { return getToken(MyParser.Static, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public ClassFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterClassField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitClassField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitClassField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassFieldContext classField() throws RecognitionException {
		ClassFieldContext _localctx = new ClassFieldContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 7L) != 0)) {
				{
				setState(589);
				privacyType();
				}
			}

			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(592);
				match(Static);
				}
			}

			setState(595);
			field();
			setState(597); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(596);
				match(SemiColon);
				}
				}
				setState(599); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SemiColon );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassFunctionDefinitionContext extends ParserRuleContext {
		public ClassFunctionContext classFunction() {
			return getRuleContext(ClassFunctionContext.class,0);
		}
		public PrivacyTypeContext privacyType() {
			return getRuleContext(PrivacyTypeContext.class,0);
		}
		public TerminalNode Static() { return getToken(MyParser.Static, 0); }
		public ClassFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterClassFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitClassFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitClassFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassFunctionDefinitionContext classFunctionDefinition() throws RecognitionException {
		ClassFunctionDefinitionContext _localctx = new ClassFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 7L) != 0)) {
				{
				setState(601);
				privacyType();
				}
			}

			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(604);
				match(Static);
				}
			}

			setState(607);
			classFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrivacyTypeContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(MyParser.Public, 0); }
		public TerminalNode Private() { return getToken(MyParser.Private, 0); }
		public TerminalNode Protected() { return getToken(MyParser.Protected, 0); }
		public PrivacyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privacyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPrivacyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPrivacyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPrivacyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivacyTypeContext privacyType() throws RecognitionException {
		PrivacyTypeContext _localctx = new PrivacyTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_privacyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassFunctionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionScopeContext functionScope() {
			return getRuleContext(FunctionScopeContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ClassFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterClassFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitClassFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitClassFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassFunctionContext classFunction() throws RecognitionException {
		ClassFunctionContext _localctx = new ClassFunctionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			id();
			setState(612);
			parameters();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleColon) {
				{
				setState(613);
				typeAnnotation();
				}
			}

			setState(616);
			functionScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			fieldDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MyParser.Assign, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GenericTypeInstanceContext genericTypeInstance() {
			return getRuleContext(GenericTypeInstanceContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			id();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleColon) {
				{
				setState(621);
				typeAnnotation();
				}
			}

			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(624);
				match(Assign);
				setState(627);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBracket:
				case OpenCurlyBracket:
				case OpenArrayBracket:
				case Not:
				case True:
				case False:
				case Numbers:
				case Identifier:
				case StringLiteral:
					{
					setState(625);
					expression();
					}
					break;
				case New:
					{
					setState(626);
					genericTypeInstance();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(631);
					match(SemiColon);
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotationContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(MyParser.DoubleColon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(DoubleColon);
			setState(638);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_type);
		try {
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
			case Number:
			case Boolean:
			case Any:
			case Void:
			case Unknown:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				primitiveType();
				}
				break;
			case Set:
			case Map:
			case Record:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				genericType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(MyParser.String, 0); }
		public TerminalNode Number() { return getToken(MyParser.Number, 0); }
		public TerminalNode Boolean() { return getToken(MyParser.Boolean, 0); }
		public TerminalNode Any() { return getToken(MyParser.Any, 0); }
		public TerminalNode Unknown() { return getToken(MyParser.Unknown, 0); }
		public TerminalNode Void() { return getToken(MyParser.Void, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeContext extends ParserRuleContext {
		public TerminalNode Set() { return getToken(MyParser.Set, 0); }
		public TerminalNode SmallerOperator() { return getToken(MyParser.SmallerOperator, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode LargerOperator() { return getToken(MyParser.LargerOperator, 0); }
		public TerminalNode Record() { return getToken(MyParser.Record, 0); }
		public TerminalNode Comma() { return getToken(MyParser.Comma, 0); }
		public TerminalNode Map() { return getToken(MyParser.Map, 0); }
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_genericType);
		try {
			setState(665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Set:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				match(Set);
				setState(647);
				match(SmallerOperator);
				setState(648);
				type();
				setState(649);
				match(LargerOperator);
				}
				break;
			case Record:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				match(Record);
				setState(652);
				match(SmallerOperator);
				setState(653);
				type();
				setState(654);
				match(Comma);
				setState(655);
				type();
				setState(656);
				match(LargerOperator);
				}
				break;
			case Map:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				match(Map);
				setState(659);
				match(SmallerOperator);
				setState(660);
				type();
				setState(661);
				match(Comma);
				setState(662);
				type();
				setState(663);
				match(LargerOperator);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeInstanceContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(MyParser.New, 0); }
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public GenericTypeInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeInstance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterGenericTypeInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitGenericTypeInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitGenericTypeInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeInstanceContext genericTypeInstance() throws RecognitionException {
		GenericTypeInstanceContext _localctx = new GenericTypeInstanceContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_genericTypeInstance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(New);
			setState(668);
			genericType();
			setState(669);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(MyParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(MyParser.CloseCurlyBracket, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(OpenCurlyBracket);
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 285873058152448L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 4200759L) != 0)) {
				{
				{
				setState(672);
				statement();
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(MyParser.Function, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionScopeContext functionScope() {
			return getRuleContext(FunctionScopeContext.class,0);
		}
		public TerminalNode Export() { return getToken(MyParser.Export, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(680);
				match(Export);
				}
			}

			setState(683);
			match(Function);
			setState(684);
			id();
			setState(685);
			parameters();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DoubleColon) {
				{
				setState(686);
				typeAnnotation();
				}
			}

			setState(689);
			functionScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionScopeContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(MyParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(MyParser.CloseCurlyBracket, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterFunctionScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitFunctionScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFunctionScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionScopeContext functionScope() throws RecognitionException {
		FunctionScopeContext _localctx = new FunctionScopeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_functionScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(OpenCurlyBracket);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 285873058152448L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 4200759L) != 0)) {
				{
				{
				setState(692);
				statement();
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(698);
				returnStatement();
				}
			}

			setState(701);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(MyParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(MyParser.CloseBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(MyParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MyParser.Comma, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<ObjectLiteralContext> objectLiteral() {
			return getRuleContexts(ObjectLiteralContext.class);
		}
		public ObjectLiteralContext objectLiteral(int i) {
			return getRuleContext(ObjectLiteralContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> DoubleColon() { return getTokens(MyParser.DoubleColon); }
		public TerminalNode DoubleColon(int i) {
			return getToken(MyParser.DoubleColon, i);
		}
		public List<MemberAccessContext> memberAccess() {
			return getRuleContexts(MemberAccessContext.class);
		}
		public MemberAccessContext memberAccess(int i) {
			return getRuleContext(MemberAccessContext.class,i);
		}
		public List<StructuresContext> structures() {
			return getRuleContexts(StructuresContext.class);
		}
		public StructuresContext structures(int i) {
			return getRuleContext(StructuresContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(OpenBracket);
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3298536194048L) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0)) {
				{
				{
				setState(714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(704);
					literal();
					}
					break;
				case 2:
					{
					setState(705);
					objectLiteral();
					}
					break;
				case 3:
					{
					setState(706);
					array();
					}
					break;
				case 4:
					{
					setState(707);
					id();
					setState(708);
					match(DoubleColon);
					setState(711);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case True:
					case False:
					case Numbers:
					case StringLiteral:
						{
						setState(709);
						literal();
						}
						break;
					case OpenBracket:
					case OpenCurlyBracket:
					case OpenArrayBracket:
					case Class:
					case Export:
						{
						setState(710);
						structures();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 5:
					{
					setState(713);
					memberAccess();
					}
					break;
				}
				setState(716);
				match(Comma);
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(723);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(MyParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(MyParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(MyParser.SemiColon, i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(Return);
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3573414166528L) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0)) {
				{
				setState(726);
				expression();
				}
			}

			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(729);
				match(SemiColon);
				}
				}
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MyParser.Identifier, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyParserListener ) ((MyParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001d\u02e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0001"+
		"\u0000\u0005\u0000\u0084\b\u0000\n\u0000\f\u0000\u0087\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0090\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0098\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u009c\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00a0\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0005\u0005\u00a4\b\u0005\n\u0005\f\u0005"+
		"\u00a7\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ac\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b2"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b6\b\u0006\n\u0006\f\u0006"+
		"\u00b9\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00be\b"+
		"\u0007\u0004\u0007\u00c0\b\u0007\u000b\u0007\f\u0007\u00c1\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00c6\b\u0007\n\u0007\f\u0007\u00c9\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d0\b\b\u0001\b\u0003\b\u00d3"+
		"\b\b\u0001\b\u0003\b\u00d6\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00ef\b\f\n\f\f\f\u00f2\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00f8\b\r\u0001\r\u0005\r\u00fb\b\r\n\r\f\r"+
		"\u00fe\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0104\b\u000e\u0001\u000e\u0005\u000e\u0107\b\u000e\n\u000e\f\u000e\u010a"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0111\b\u000f\n\u000f\f\u000f\u0114\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u011e\b\u000f\u0001\u000f\u0005\u000f\u0121\b\u000f\n\u000f"+
		"\f\u000f\u0124\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u012b\b\u0010\n\u0010\f\u0010\u012e\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0138\b\u0010\u0001\u0010\u0005\u0010\u013b"+
		"\b\u0010\n\u0010\f\u0010\u013e\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u0145\b\u0011\n\u0011\f\u0011\u0148"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0152\b\u0011\u0001\u0011\u0005"+
		"\u0011\u0155\b\u0011\n\u0011\f\u0011\u0158\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u015c\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0163\b\u0012\u0001\u0012\u0005\u0012\u0166\b"+
		"\u0012\n\u0012\f\u0012\u0169\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0170\b\u0013\n\u0013\f\u0013\u0173"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u017b\b\u0014\n\u0014\f\u0014\u017e\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0182\b\u0014\n\u0014\f\u0014\u0185\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u018a\b\u0015\u000b\u0015\f"+
		"\u0015\u018b\u0005\u0015\u018e\b\u0015\n\u0015\f\u0015\u0191\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0195\b\u0015\n\u0015\f\u0015\u0198\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01a3\b\u0016\u0003\u0016"+
		"\u01a5\b\u0016\u0001\u0016\u0005\u0016\u01a8\b\u0016\n\u0016\f\u0016\u01ab"+
		"\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u01c6\b\u001c\n\u001c\f\u001c\u01c9\t\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01ce\b\u001d\n\u001d"+
		"\f\u001d\u01d1\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u01d6\b\u001e\n\u001e\f\u001e\u01d9\t\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u01de\b\u001f\n\u001f\f\u001f\u01e1\t\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01ea\b \u0001!\u0001"+
		"!\u0001!\u0003!\u01ef\b!\u0001\"\u0001\"\u0003\"\u01f3\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0005"+
		"%\u0200\b%\n%\f%\u0203\t%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'"+
		"\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0211\b(\n(\f(\u0214"+
		"\t(\u0001)\u0001)\u0001)\u0001)\u0003)\u021a\b)\u0001*\u0001*\u0001*\u0003"+
		"*\u021f\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0003+\u0226\b+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0003,\u022d\b,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0003-\u0234\b-\u0001-\u0001-\u0001.\u0003.\u0239\b.\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u023f\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0005"+
		"/\u0247\b/\n/\f/\u024a\t/\u0001/\u0001/\u00010\u00030\u024f\b0\u00010"+
		"\u00030\u0252\b0\u00010\u00010\u00040\u0256\b0\u000b0\f0\u0257\u00011"+
		"\u00031\u025b\b1\u00011\u00031\u025e\b1\u00011\u00011\u00012\u00012\u0001"+
		"3\u00013\u00013\u00033\u0267\b3\u00013\u00013\u00014\u00014\u00015\u0001"+
		"5\u00035\u026f\b5\u00015\u00015\u00015\u00035\u0274\b5\u00035\u0276\b"+
		"5\u00015\u00055\u0279\b5\n5\f5\u027c\t5\u00016\u00016\u00016\u00017\u0001"+
		"7\u00037\u0283\b7\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u029a\b9\u0001:\u0001:\u0001:\u0001:\u0001"+
		";\u0001;\u0005;\u02a2\b;\n;\f;\u02a5\t;\u0001;\u0001;\u0001<\u0003<\u02aa"+
		"\b<\u0001<\u0001<\u0001<\u0001<\u0003<\u02b0\b<\u0001<\u0001<\u0001=\u0001"+
		"=\u0005=\u02b6\b=\n=\f=\u02b9\t=\u0001=\u0003=\u02bc\b=\u0001=\u0001="+
		"\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u02c8"+
		"\b>\u0001>\u0003>\u02cb\b>\u0001>\u0001>\u0005>\u02cf\b>\n>\f>\u02d2\t"+
		">\u0001>\u0001>\u0001?\u0001?\u0003?\u02d8\b?\u0001?\u0005?\u02db\b?\n"+
		"?\f?\u02de\t?\u0001@\u0001@\u0001@\u0000\u0000A\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0000\n\u0001\u0000()"+
		"\u0002\u0000\u0007\u0007\n\n\u0001\u0000$%\u0002\u0000\u0002\u0005\u001a"+
		"\u001d\u0002\u0000\t\t\f\f\u0001\u0000\r\u000f\u0003\u0000()aacc\u0001"+
		"\u0000RS\u0001\u0000IK\u0001\u0000>C\u0311\u0000\u0085\u0001\u0000\u0000"+
		"\u0000\u0002\u008f\u0001\u0000\u0000\u0000\u0004\u0097\u0001\u0000\u0000"+
		"\u0000\u0006\u009b\u0001\u0000\u0000\u0000\b\u009f\u0001\u0000\u0000\u0000"+
		"\n\u00ab\u0001\u0000\u0000\u0000\f\u00ad\u0001\u0000\u0000\u0000\u000e"+
		"\u00ba\u0001\u0000\u0000\u0000\u0010\u00ca\u0001\u0000\u0000\u0000\u0012"+
		"\u00da\u0001\u0000\u0000\u0000\u0014\u00df\u0001\u0000\u0000\u0000\u0016"+
		"\u00e4\u0001\u0000\u0000\u0000\u0018\u00e9\u0001\u0000\u0000\u0000\u001a"+
		"\u00f3\u0001\u0000\u0000\u0000\u001c\u00ff\u0001\u0000\u0000\u0000\u001e"+
		"\u010b\u0001\u0000\u0000\u0000 \u0125\u0001\u0000\u0000\u0000\"\u013f"+
		"\u0001\u0000\u0000\u0000$\u015b\u0001\u0000\u0000\u0000&\u016a\u0001\u0000"+
		"\u0000\u0000(\u0176\u0001\u0000\u0000\u0000*\u0186\u0001\u0000\u0000\u0000"+
		",\u01a4\u0001\u0000\u0000\u0000.\u01ac\u0001\u0000\u0000\u00000\u01b0"+
		"\u0001\u0000\u0000\u00002\u01b4\u0001\u0000\u0000\u00004\u01ba\u0001\u0000"+
		"\u0000\u00006\u01c0\u0001\u0000\u0000\u00008\u01c2\u0001\u0000\u0000\u0000"+
		":\u01ca\u0001\u0000\u0000\u0000<\u01d2\u0001\u0000\u0000\u0000>\u01da"+
		"\u0001\u0000\u0000\u0000@\u01e9\u0001\u0000\u0000\u0000B\u01ee\u0001\u0000"+
		"\u0000\u0000D\u01f2\u0001\u0000\u0000\u0000F\u01f4\u0001\u0000\u0000\u0000"+
		"H\u01f8\u0001\u0000\u0000\u0000J\u01fa\u0001\u0000\u0000\u0000L\u0204"+
		"\u0001\u0000\u0000\u0000N\u0208\u0001\u0000\u0000\u0000P\u020b\u0001\u0000"+
		"\u0000\u0000R\u0219\u0001\u0000\u0000\u0000T\u021b\u0001\u0000\u0000\u0000"+
		"V\u0222\u0001\u0000\u0000\u0000X\u0229\u0001\u0000\u0000\u0000Z\u0230"+
		"\u0001\u0000\u0000\u0000\\\u0238\u0001\u0000\u0000\u0000^\u0242\u0001"+
		"\u0000\u0000\u0000`\u024e\u0001\u0000\u0000\u0000b\u025a\u0001\u0000\u0000"+
		"\u0000d\u0261\u0001\u0000\u0000\u0000f\u0263\u0001\u0000\u0000\u0000h"+
		"\u026a\u0001\u0000\u0000\u0000j\u026c\u0001\u0000\u0000\u0000l\u027d\u0001"+
		"\u0000\u0000\u0000n\u0282\u0001\u0000\u0000\u0000p\u0284\u0001\u0000\u0000"+
		"\u0000r\u0299\u0001\u0000\u0000\u0000t\u029b\u0001\u0000\u0000\u0000v"+
		"\u029f\u0001\u0000\u0000\u0000x\u02a9\u0001\u0000\u0000\u0000z\u02b3\u0001"+
		"\u0000\u0000\u0000|\u02bf\u0001\u0000\u0000\u0000~\u02d5\u0001\u0000\u0000"+
		"\u0000\u0080\u02df\u0001\u0000\u0000\u0000\u0082\u0084\u0003\u0002\u0001"+
		"\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0001\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u0090\u0003\f\u0006\u0000\u0089\u0090\u0003\u0010\b\u0000"+
		"\u008a\u0090\u0003\u0004\u0002\u0000\u008b\u0090\u0003\b\u0004\u0000\u008c"+
		"\u0090\u0003\n\u0005\u0000\u008d\u0090\u0003\u0006\u0003\u0000\u008e\u0090"+
		"\u0003x<\u0000\u008f\u0088\u0001\u0000\u0000\u0000\u008f\u0089\u0001\u0000"+
		"\u0000\u0000\u008f\u008a\u0001\u0000\u0000\u0000\u008f\u008b\u0001\u0000"+
		"\u0000\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0003\u0001\u0000"+
		"\u0000\u0000\u0091\u0098\u0003\u0018\f\u0000\u0092\u0098\u0003\u001c\u000e"+
		"\u0000\u0093\u0098\u0003\u001a\r\u0000\u0094\u0098\u0003\u001e\u000f\u0000"+
		"\u0095\u0098\u0003\"\u0011\u0000\u0096\u0098\u0003 \u0010\u0000\u0097"+
		"\u0091\u0001\u0000\u0000\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0097"+
		"\u0093\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0005\u0001\u0000\u0000\u0000\u0099\u009c\u0003P(\u0000\u009a\u009c\u0003"+
		",\u0016\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u0007\u0001\u0000\u0000\u0000\u009d\u00a0\u00032\u0019"+
		"\u0000\u009e\u00a0\u00034\u001a\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\t\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a5\u0003F#\u0000\u00a2\u00a4\u0005 \u0000\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00ac\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ac\u0003"+
		"*\u0015\u0000\u00a9\u00ac\u0003(\u0014\u0000\u00aa\u00ac\u0003\\.\u0000"+
		"\u00ab\u00a1\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u000b\u0001\u0000\u0000\u0000\u00ad\u00b1\u0005T\u0000\u0000\u00ae"+
		"\u00af\u0003\u000e\u0007\u0000\u00af\u00b0\u0005U\u0000\u0000\u00b0\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b7"+
		"\u0005c\u0000\u0000\u00b4\u00b6\u0005 \u0000\u0000\u00b5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\r\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bf\u0005\u0012\u0000"+
		"\u0000\u00bb\u00bd\u0003\u0080@\u0000\u00bc\u00be\u0005\"\u0000\u0000"+
		"\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bb\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c7\u0005\u0013\u0000\u0000\u00c4\u00c6\u0005 \u0000\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u000f\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0019\u0000\u0000\u00cb\u00cc\u0003\u0080@\u0000\u00cc\u00cd"+
		"\u0005\u0010\u0000\u0000\u00cd\u00cf\u0005\u0012\u0000\u0000\u00ce\u00d0"+
		"\u0003\u0012\t\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00d3\u0003"+
		"\u0014\n\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d6\u0003\u0016"+
		"\u000b\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0013"+
		"\u0000\u0000\u00d8\u00d9\u0005\u0011\u0000\u0000\u00d9\u0011\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0005Z\u0000\u0000\u00db\u00dc\u0005\u001f\u0000"+
		"\u0000\u00dc\u00dd\u0005c\u0000\u0000\u00dd\u00de\u0005\"\u0000\u0000"+
		"\u00de\u0013\u0001\u0000\u0000\u0000\u00df\u00e0\u0005[\u0000\u0000\u00e0"+
		"\u00e1\u0005\u001f\u0000\u0000\u00e1\u00e2\u0007\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0005\"\u0000\u0000\u00e3\u0015\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0005\\\u0000\u0000\u00e5\u00e6\u0005\u001f\u0000\u0000\u00e6\u00e7\u0005"+
		"d\u0000\u0000\u00e7\u00e8\u0005\"\u0000\u0000\u00e8\u0017\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0005N\u0000\u0000\u00ea\u00eb\u0003h4\u0000"+
		"\u00eb\u00ec\u0005\u0006\u0000\u0000\u00ec\u00f0\u00036\u001b\u0000\u00ed"+
		"\u00ef\u0005 \u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u0019\u0001\u0000\u0000\u0000\u00f2\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005L\u0000\u0000\u00f4\u00f7\u0003"+
		"h4\u0000\u00f5\u00f6\u0005\u0006\u0000\u0000\u00f6\u00f8\u00036\u001b"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fc\u0001\u0000\u0000\u0000\u00f9\u00fb\u0005 \u0000\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u001b\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0005M\u0000\u0000\u0100\u0103\u0003h4\u0000\u0101\u0102"+
		"\u0005\u0006\u0000\u0000\u0102\u0104\u00036\u001b\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0108\u0001"+
		"\u0000\u0000\u0000\u0105\u0107\u0005 \u0000\u0000\u0106\u0105\u0001\u0000"+
		"\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u001d\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010c\u0005N\u0000"+
		"\u0000\u010c\u0112\u0005\u0014\u0000\u0000\u010d\u010e\u0003\u0080@\u0000"+
		"\u010e\u010f\u0005\"\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110"+
		"\u010d\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113"+
		"\u0115\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005\u0015\u0000\u0000\u0116\u011d\u0005\u0006\u0000\u0000\u0117"+
		"\u011e\u0005c\u0000\u0000\u0118\u011e\u0003\u0080@\u0000\u0119\u011a\u0005"+
		"\u0010\u0000\u0000\u011a\u011b\u0005c\u0000\u0000\u011b\u011e\u0005\u0011"+
		"\u0000\u0000\u011c\u011e\u0003(\u0014\u0000\u011d\u0117\u0001\u0000\u0000"+
		"\u0000\u011d\u0118\u0001\u0000\u0000\u0000\u011d\u0119\u0001\u0000\u0000"+
		"\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0122\u0001\u0000\u0000"+
		"\u0000\u011f\u0121\u0005 \u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000"+
		"\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u001f\u0001\u0000\u0000\u0000"+
		"\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0126\u0005L\u0000\u0000\u0126"+
		"\u012c\u0005\u0014\u0000\u0000\u0127\u0128\u0003\u0080@\u0000\u0128\u0129"+
		"\u0005\"\u0000\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0127\u0001"+
		"\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"\u0015\u0000\u0000\u0130\u0137\u0005\u0006\u0000\u0000\u0131\u0138\u0005"+
		"c\u0000\u0000\u0132\u0138\u0003\u0080@\u0000\u0133\u0134\u0005\u0010\u0000"+
		"\u0000\u0134\u0135\u0005c\u0000\u0000\u0135\u0138\u0005\u0011\u0000\u0000"+
		"\u0136\u0138\u0003(\u0014\u0000\u0137\u0131\u0001\u0000\u0000\u0000\u0137"+
		"\u0132\u0001\u0000\u0000\u0000\u0137\u0133\u0001\u0000\u0000\u0000\u0137"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u013c\u0001\u0000\u0000\u0000\u0139"+
		"\u013b\u0005 \u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b\u013e"+
		"\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0001\u0000\u0000\u0000\u013d!\u0001\u0000\u0000\u0000\u013e\u013c\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0005M\u0000\u0000\u0140\u0146\u0005\u0014"+
		"\u0000\u0000\u0141\u0142\u0003\u0080@\u0000\u0142\u0143\u0005\"\u0000"+
		"\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0141\u0001\u0000\u0000"+
		"\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0149\u0001\u0000\u0000"+
		"\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0015\u0000"+
		"\u0000\u014a\u0151\u0005\u0006\u0000\u0000\u014b\u0152\u0005c\u0000\u0000"+
		"\u014c\u0152\u0003\u0080@\u0000\u014d\u014e\u0005\u0010\u0000\u0000\u014e"+
		"\u014f\u0005c\u0000\u0000\u014f\u0152\u0005\u0011\u0000\u0000\u0150\u0152"+
		"\u0003(\u0014\u0000\u0151\u014b\u0001\u0000\u0000\u0000\u0151\u014c\u0001"+
		"\u0000\u0000\u0000\u0151\u014d\u0001\u0000\u0000\u0000\u0151\u0150\u0001"+
		"\u0000\u0000\u0000\u0152\u0156\u0001\u0000\u0000\u0000\u0153\u0155\u0005"+
		" \u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000"+
		"\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157#\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0159\u015c\u0003H$\u0000\u015a\u015c\u0003\u0080@\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0001\u0000\u0000\u0000\u015d\u0162\u0005\u001f\u0000\u0000\u015e"+
		"\u0163\u0003H$\u0000\u015f\u0160\u0003J%\u0000\u0160\u0161\u0003|>\u0000"+
		"\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u015e\u0001\u0000\u0000\u0000"+
		"\u0162\u015f\u0001\u0000\u0000\u0000\u0163\u0167\u0001\u0000\u0000\u0000"+
		"\u0164\u0166\u0005 \u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166"+
		"\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u0168%\u0001\u0000\u0000\u0000\u0169\u0167"+
		"\u0001\u0000\u0000\u0000\u016a\u0171\u0005\u0012\u0000\u0000\u016b\u016c"+
		"\u0003\u0080@\u0000\u016c\u016d\u0005\"\u0000\u0000\u016d\u0170\u0001"+
		"\u0000\u0000\u0000\u016e\u0170\u0003$\u0012\u0000\u016f\u016b\u0001\u0000"+
		"\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0005\u0013\u0000\u0000\u0175\'\u0001\u0000\u0000"+
		"\u0000\u0176\u017c\u0005\u0014\u0000\u0000\u0177\u0178\u00036\u001b\u0000"+
		"\u0178\u0179\u0005\"\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a"+
		"\u0177\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c"+
		"\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d"+
		"\u017f\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f"+
		"\u0183\u0005\u0015\u0000\u0000\u0180\u0182\u0005 \u0000\u0000\u0181\u0180"+
		"\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184)\u0001"+
		"\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u018f\u0005"+
		"\u0012\u0000\u0000\u0187\u0189\u00036\u001b\u0000\u0188\u018a\u0005 \u0000"+
		"\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000"+
		"\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u0187\u0001\u0000\u0000"+
		"\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000"+
		"\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0196\u0005\u0013\u0000"+
		"\u0000\u0193\u0195\u0005 \u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000"+
		"\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0001\u0000\u0000\u0000\u0197+\u0001\u0000\u0000\u0000\u0198"+
		"\u0196\u0001\u0000\u0000\u0000\u0199\u019a\u0003\u0080@\u0000\u019a\u019b"+
		"\u0005\u0006\u0000\u0000\u019b\u019c\u00036\u001b\u0000\u019c\u01a5\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0003\u0080@\u0000\u019e\u019f\u0007\u0001"+
		"\u0000\u0000\u019f\u01a5\u0001\u0000\u0000\u0000\u01a0\u01a3\u0003.\u0017"+
		"\u0000\u01a1\u01a3\u00030\u0018\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a4\u0199\u0001\u0000\u0000\u0000\u01a4\u019d\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a8\u0005 \u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8"+
		"\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0001\u0000\u0000\u0000\u01aa-\u0001\u0000\u0000\u0000\u01ab\u01a9"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0003\u0080@\u0000\u01ad\u01ae\u0005"+
		"\u000b\u0000\u0000\u01ae\u01af\u00036\u001b\u0000\u01af/\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0003\u0080@\u0000\u01b1\u01b2\u0005\b\u0000\u0000"+
		"\u01b2\u01b3\u00036\u001b\u0000\u01b31\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0005*\u0000\u0000\u01b5\u01b6\u0005\u0010\u0000\u0000\u01b6\u01b7\u0003"+
		"6\u001b\u0000\u01b7\u01b8\u0005\u0011\u0000\u0000\u01b8\u01b9\u0003v;"+
		"\u0000\u01b93\u0001\u0000\u0000\u0000\u01ba\u01bb\u00050\u0000\u0000\u01bb"+
		"\u01bc\u0005\u0010\u0000\u0000\u01bc\u01bd\u00036\u001b\u0000\u01bd\u01be"+
		"\u0005\u0011\u0000\u0000\u01be\u01bf\u0003v;\u0000\u01bf5\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u00038\u001c\u0000\u01c17\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c7\u0003:\u001d\u0000\u01c3\u01c4\u0007\u0002\u0000\u0000\u01c4"+
		"\u01c6\u0003:\u001d\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c89\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cf\u0003<\u001e\u0000\u01cb\u01cc\u0007\u0003"+
		"\u0000\u0000\u01cc\u01ce\u0003<\u001e\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0;\u0001\u0000\u0000\u0000"+
		"\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d7\u0003>\u001f\u0000\u01d3"+
		"\u01d4\u0007\u0004\u0000\u0000\u01d4\u01d6\u0003>\u001f\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8=\u0001"+
		"\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01df\u0003"+
		"@ \u0000\u01db\u01dc\u0007\u0005\u0000\u0000\u01dc\u01de\u0003@ \u0000"+
		"\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000"+
		"\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e0?\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2"+
		"\u01ea\u0003F#\u0000\u01e3\u01ea\u0003H$\u0000\u01e4\u01ea\u0003\u0080"+
		"@\u0000\u01e5\u01e6\u0005&\u0000\u0000\u01e6\u01ea\u0003\u0080@\u0000"+
		"\u01e7\u01ea\u0003B!\u0000\u01e8\u01ea\u0003D\"\u0000\u01e9\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e9\u01e3\u0001\u0000\u0000\u0000\u01e9\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e9\u01e5\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01eaA\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ef\u0003N\'\u0000\u01ec\u01ef\u0003L&\u0000\u01ed"+
		"\u01ef\u0003J%\u0000\u01ee\u01eb\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01efC\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f3\u0003&\u0013\u0000\u01f1\u01f3\u0003(\u0014\u0000"+
		"\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f3E\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005\u0010\u0000\u0000\u01f5"+
		"\u01f6\u00036\u001b\u0000\u01f6\u01f7\u0005\u0011\u0000\u0000\u01f7G\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f9\u0007\u0006\u0000\u0000\u01f9I\u0001\u0000"+
		"\u0000\u0000\u01fa\u0201\u0003\u0080@\u0000\u01fb\u01fc\u0005!\u0000\u0000"+
		"\u01fc\u0200\u0003\u0080@\u0000\u01fd\u01fe\u0005!\u0000\u0000\u01fe\u0200"+
		"\u0003N\'\u0000\u01ff\u01fb\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001"+
		"\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201\u01ff\u0001"+
		"\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202K\u0001\u0000"+
		"\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204\u0205\u0003\u0080"+
		"@\u0000\u0205\u0206\u0005!\u0000\u0000\u0206\u0207\u0003N\'\u0000\u0207"+
		"M\u0001\u0000\u0000\u0000\u0208\u0209\u0003\u0080@\u0000\u0209\u020a\u0003"+
		"|>\u0000\u020aO\u0001\u0000\u0000\u0000\u020b\u020c\u0005X\u0000\u0000"+
		"\u020c\u020d\u0005!\u0000\u0000\u020d\u020e\u0005Y\u0000\u0000\u020e\u0212"+
		"\u0003|>\u0000\u020f\u0211\u0005 \u0000\u0000\u0210\u020f\u0001\u0000"+
		"\u0000\u0000\u0211\u0214\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213Q\u0001\u0000\u0000"+
		"\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0215\u021a\u0003T*\u0000\u0216"+
		"\u021a\u0003V+\u0000\u0217\u021a\u0003X,\u0000\u0218\u021a\u0003Z-\u0000"+
		"\u0219\u0215\u0001\u0000\u0000\u0000\u0219\u0216\u0001\u0000\u0000\u0000"+
		"\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u0218\u0001\u0000\u0000\u0000"+
		"\u021aS\u0001\u0000\u0000\u0000\u021b\u021c\u0005]\u0000\u0000\u021c\u021e"+
		"\u0003|>\u0000\u021d\u021f\u0003l6\u0000\u021e\u021d\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000"+
		"\u0000\u0220\u0221\u0003z=\u0000\u0221U\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u0005^\u0000\u0000\u0223\u0225\u0003|>\u0000\u0224\u0226\u0003"+
		"l6\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000"+
		"\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0003z=\u0000\u0228"+
		"W\u0001\u0000\u0000\u0000\u0229\u022a\u0005_\u0000\u0000\u022a\u022c\u0003"+
		"|>\u0000\u022b\u022d\u0003l6\u0000\u022c\u022b\u0001\u0000\u0000\u0000"+
		"\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0003z=\u0000\u022fY\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0005`\u0000\u0000\u0231\u0233\u0003|>\u0000\u0232\u0234\u0003l6\u0000"+
		"\u0233\u0232\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000"+
		"\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0003z=\u0000\u0236["+
		"\u0001\u0000\u0000\u0000\u0237\u0239\u0005W\u0000\u0000\u0238\u0237\u0001"+
		"\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0005Q\u0000\u0000\u023b\u023e\u0003\u0080"+
		"@\u0000\u023c\u023d\u0007\u0007\u0000\u0000\u023d\u023f\u0003\u0080@\u0000"+
		"\u023e\u023c\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000"+
		"\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0241\u0003^/\u0000\u0241]"+
		"\u0001\u0000\u0000\u0000\u0242\u0248\u0005\u0012\u0000\u0000\u0243\u0247"+
		"\u0003`0\u0000\u0244\u0247\u0003b1\u0000\u0245\u0247\u0003R)\u0000\u0246"+
		"\u0243\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0246"+
		"\u0245\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248"+
		"\u0246\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249"+
		"\u024b\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0005\u0013\u0000\u0000\u024c_\u0001\u0000\u0000\u0000\u024d\u024f"+
		"\u0003d2\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000"+
		"\u0000\u0000\u024f\u0251\u0001\u0000\u0000\u0000\u0250\u0252\u0005H\u0000"+
		"\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0255\u0003h4\u0000\u0254"+
		"\u0256\u0005 \u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0256\u0257"+
		"\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0001\u0000\u0000\u0000\u0258a\u0001\u0000\u0000\u0000\u0259\u025b\u0003"+
		"d2\u0000\u025a\u0259\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000"+
		"\u0000\u025b\u025d\u0001\u0000\u0000\u0000\u025c\u025e\u0005H\u0000\u0000"+
		"\u025d\u025c\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0260\u0003f3\u0000\u0260c"+
		"\u0001\u0000\u0000\u0000\u0261\u0262\u0007\b\u0000\u0000\u0262e\u0001"+
		"\u0000\u0000\u0000\u0263\u0264\u0003\u0080@\u0000\u0264\u0266\u0003|>"+
		"\u0000\u0265\u0267\u0003l6\u0000\u0266\u0265\u0001\u0000\u0000\u0000\u0266"+
		"\u0267\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268"+
		"\u0269\u0003z=\u0000\u0269g\u0001\u0000\u0000\u0000\u026a\u026b\u0003"+
		"j5\u0000\u026bi\u0001\u0000\u0000\u0000\u026c\u026e\u0003\u0080@\u0000"+
		"\u026d\u026f\u0003l6\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0001\u0000\u0000\u0000\u026f\u0275\u0001\u0000\u0000\u0000\u0270\u0273"+
		"\u0005\u0006\u0000\u0000\u0271\u0274\u00036\u001b\u0000\u0272\u0274\u0003"+
		"t:\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0272\u0001\u0000\u0000"+
		"\u0000\u0274\u0276\u0001\u0000\u0000\u0000\u0275\u0270\u0001\u0000\u0000"+
		"\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u027a\u0001\u0000\u0000"+
		"\u0000\u0277\u0279\u0005 \u0000\u0000\u0278\u0277\u0001\u0000\u0000\u0000"+
		"\u0279\u027c\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0001\u0000\u0000\u0000\u027bk\u0001\u0000\u0000\u0000\u027c"+
		"\u027a\u0001\u0000\u0000\u0000\u027d\u027e\u0005\u001f\u0000\u0000\u027e"+
		"\u027f\u0003n7\u0000\u027fm\u0001\u0000\u0000\u0000\u0280\u0283\u0003"+
		"p8\u0000\u0281\u0283\u0003r9\u0000\u0282\u0280\u0001\u0000\u0000\u0000"+
		"\u0282\u0281\u0001\u0000\u0000\u0000\u0283o\u0001\u0000\u0000\u0000\u0284"+
		"\u0285\u0007\t\u0000\u0000\u0285q\u0001\u0000\u0000\u0000\u0286\u0287"+
		"\u0005D\u0000\u0000\u0287\u0288\u0005\u001c\u0000\u0000\u0288\u0289\u0003"+
		"n7\u0000\u0289\u028a\u0005\u001d\u0000\u0000\u028a\u029a\u0001\u0000\u0000"+
		"\u0000\u028b\u028c\u0005F\u0000\u0000\u028c\u028d\u0005\u001c\u0000\u0000"+
		"\u028d\u028e\u0003n7\u0000\u028e\u028f\u0005\"\u0000\u0000\u028f\u0290"+
		"\u0003n7\u0000\u0290\u0291\u0005\u001d\u0000\u0000\u0291\u029a\u0001\u0000"+
		"\u0000\u0000\u0292\u0293\u0005E\u0000\u0000\u0293\u0294\u0005\u001c\u0000"+
		"\u0000\u0294\u0295\u0003n7\u0000\u0295\u0296\u0005\"\u0000\u0000\u0296"+
		"\u0297\u0003n7\u0000\u0297\u0298\u0005\u001d\u0000\u0000\u0298\u029a\u0001"+
		"\u0000\u0000\u0000\u0299\u0286\u0001\u0000\u0000\u0000\u0299\u028b\u0001"+
		"\u0000\u0000\u0000\u0299\u0292\u0001\u0000\u0000\u0000\u029as\u0001\u0000"+
		"\u0000\u0000\u029b\u029c\u0005;\u0000\u0000\u029c\u029d\u0003r9\u0000"+
		"\u029d\u029e\u0003|>\u0000\u029eu\u0001\u0000\u0000\u0000\u029f\u02a3"+
		"\u0005\u0012\u0000\u0000\u02a0\u02a2\u0003\u0002\u0001\u0000\u02a1\u02a0"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a5\u0001\u0000\u0000\u0000\u02a3\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a6"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a7"+
		"\u0005\u0013\u0000\u0000\u02a7w\u0001\u0000\u0000\u0000\u02a8\u02aa\u0005"+
		"W\u0000\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000"+
		"\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ac\u0005P\u0000"+
		"\u0000\u02ac\u02ad\u0003\u0080@\u0000\u02ad\u02af\u0003|>\u0000\u02ae"+
		"\u02b0\u0003l6\u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02af\u02b0\u0001"+
		"\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b2\u0003"+
		"z=\u0000\u02b2y\u0001\u0000\u0000\u0000\u02b3\u02b7\u0005\u0012\u0000"+
		"\u0000\u02b4\u02b6\u0003\u0002\u0001\u0000\u02b5\u02b4\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b9\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02bb\u0001\u0000\u0000"+
		"\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02ba\u02bc\u0003~?\u0000\u02bb"+
		"\u02ba\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bd\u02be\u0005\u0013\u0000\u0000\u02be"+
		"{\u0001\u0000\u0000\u0000\u02bf\u02d0\u0005\u0010\u0000\u0000\u02c0\u02cb"+
		"\u0003H$\u0000\u02c1\u02cb\u0003&\u0013\u0000\u02c2\u02cb\u0003(\u0014"+
		"\u0000\u02c3\u02c4\u0003\u0080@\u0000\u02c4\u02c7\u0005\u001f\u0000\u0000"+
		"\u02c5\u02c8\u0003H$\u0000\u02c6\u02c8\u0003\n\u0005\u0000\u02c7\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8\u02cb"+
		"\u0001\u0000\u0000\u0000\u02c9\u02cb\u0003J%\u0000\u02ca\u02c0\u0001\u0000"+
		"\u0000\u0000\u02ca\u02c1\u0001\u0000\u0000\u0000\u02ca\u02c2\u0001\u0000"+
		"\u0000\u0000\u02ca\u02c3\u0001\u0000\u0000\u0000\u02ca\u02c9\u0001\u0000"+
		"\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005\"\u0000"+
		"\u0000\u02cd\u02cf\u0001\u0000\u0000\u0000\u02ce\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cf\u02d2\u0001\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d3\u02d4\u0005\u0011\u0000"+
		"\u0000\u02d4}\u0001\u0000\u0000\u0000\u02d5\u02d7\u0005O\u0000\u0000\u02d6"+
		"\u02d8\u00036\u001b\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d7\u02d8"+
		"\u0001\u0000\u0000\u0000\u02d8\u02dc\u0001\u0000\u0000\u0000\u02d9\u02db"+
		"\u0005 \u0000\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02db\u02de\u0001"+
		"\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001"+
		"\u0000\u0000\u0000\u02dd\u007f\u0001\u0000\u0000\u0000\u02de\u02dc\u0001"+
		"\u0000\u0000\u0000\u02df\u02e0\u0005b\u0000\u0000\u02e0\u0081\u0001\u0000"+
		"\u0000\u0000S\u0085\u008f\u0097\u009b\u009f\u00a5\u00ab\u00b1\u00b7\u00bd"+
		"\u00c1\u00c7\u00cf\u00d2\u00d5\u00f0\u00f7\u00fc\u0103\u0108\u0112\u011d"+
		"\u0122\u012c\u0137\u013c\u0146\u0151\u0156\u015b\u0162\u0167\u016f\u0171"+
		"\u017c\u0183\u018b\u018f\u0196\u01a2\u01a4\u01a9\u01c7\u01cf\u01d7\u01df"+
		"\u01e9\u01ee\u01f2\u01ff\u0201\u0212\u0219\u021e\u0225\u022c\u0233\u0238"+
		"\u023e\u0246\u0248\u024e\u0251\u0257\u025a\u025d\u0266\u026e\u0273\u0275"+
		"\u027a\u0282\u0299\u02a3\u02a9\u02af\u02b7\u02bb\u02c7\u02ca\u02d0\u02d7"+
		"\u02dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}