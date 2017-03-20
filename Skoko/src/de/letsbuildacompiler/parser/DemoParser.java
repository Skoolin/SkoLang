// Generated from Demo.g4 by ANTLR 4.6
package de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, SYSTEMFUNC=43, BOOL=44, IDENTIFIER=45, 
		NUMBER=46, FLOAT=47, WHITESPACE=48, STRING=49, COMMENT=50, LINECOMMENT=51;
	public static final int
		RULE_program = 0, RULE_importList = 1, RULE_path = 2, RULE_programPart = 3, 
		RULE_statement = 4, RULE_branch = 5, RULE_javaNative = 6, RULE_invokeNative = 7, 
		RULE_getNative = 8, RULE_push = 9, RULE_stringGiver = 10, RULE_loop = 11, 
		RULE_block = 12, RULE_expression = 13, RULE_varDeclaration = 14, RULE_assignmentList = 15, 
		RULE_assignment = 16, RULE_typeFieldAssignment = 17, RULE_println = 18, 
		RULE_print = 19, RULE_functionDefinition = 20, RULE_typeDeclaration = 21, 
		RULE_typeParameterDeclaration = 22, RULE_parameterDeclaration = 23, RULE_statementList = 24, 
		RULE_systemCall = 25, RULE_functionCall = 26, RULE_importFunctionCall = 27, 
		RULE_expressionList = 28, RULE_constructorCall = 29, RULE_object = 30, 
		RULE_primitive = 31;
	public static final String[] ruleNames = {
		"program", "importList", "path", "programPart", "statement", "branch", 
		"javaNative", "invokeNative", "getNative", "push", "stringGiver", "loop", 
		"block", "expression", "varDeclaration", "assignmentList", "assignment", 
		"typeFieldAssignment", "println", "print", "functionDefinition", "typeDeclaration", 
		"typeParameterDeclaration", "parameterDeclaration", "statementList", "systemCall", 
		"functionCall", "importFunctionCall", "expressionList", "constructorCall", 
		"object", "primitive"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import:'", "','", "'.'", "';'", "'if'", "'('", "')'", "'else'", 
		"'invoke'", "'new'", "'pushToStack'", "'while'", "'{'", "'}'", "'/'", 
		"'*'", "'-'", "'+'", "'<<'", "'>>'", "'<'", "'<='", "'>'", "'>='", "'=='", 
		"'<>'", "'&&'", "'||'", "'['", "']'", "'tos'", "'='", "'print('", "'out('", 
		"'return'", "'type'", "':'", "'[]'", "'int'", "'float'", "'void'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "SYSTEMFUNC", "BOOL", "IDENTIFIER", 
		"NUMBER", "FLOAT", "WHITESPACE", "STRING", "COMMENT", "LINECOMMENT"
	};
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
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DemoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ImportListContext importList;
		public List<ImportListContext> imports = new ArrayList<ImportListContext>();
		public TerminalNode EOF() { return getToken(DemoParser.EOF, 0); }
		public List<ProgramPartContext> programPart() {
			return getRuleContexts(ProgramPartContext.class);
		}
		public ProgramPartContext programPart(int i) {
			return getRuleContext(ProgramPartContext.class,i);
		}
		public List<ImportListContext> importList() {
			return getRuleContexts(ImportListContext.class);
		}
		public ImportListContext importList(int i) {
			return getRuleContext(ImportListContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(64);
				((ProgramContext)_localctx).importList = importList();
				((ProgramContext)_localctx).imports.add(((ProgramContext)_localctx).importList);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				programPart();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << SYSTEMFUNC) | (1L << IDENTIFIER))) != 0) );
			setState(75);
			match(EOF);
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

	public static class ImportListContext extends ParserRuleContext {
		public PathContext path;
		public List<PathContext> importedFiles = new ArrayList<PathContext>();
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__0);
			setState(79); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(78);
					((ImportListContext)_localctx).path = path();
					((ImportListContext)_localctx).importedFiles.add(((ImportListContext)_localctx).path);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(83);
				match(T__1);
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(84);
						((ImportListContext)_localctx).path = path();
						((ImportListContext)_localctx).importedFiles.add(((ImportListContext)_localctx).path);
						}
						} 
					}
					setState(89);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				}
				setState(94);
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

	public static class PathContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DemoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DemoParser.IDENTIFIER, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IDENTIFIER);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(96);
				match(T__2);
				setState(97);
				match(IDENTIFIER);
				}
				}
				setState(102);
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

	public static class ProgramPartContext extends ParserRuleContext {
		public ProgramPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programPart; }
	 
		public ProgramPartContext() { }
		public void copyFrom(ProgramPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDeclarationContext extends ProgramPartContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ProgramPartContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MainStatementContext extends ProgramPartContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainStatementContext(ProgramPartContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitMainStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProgPartFunctionDefinitionContext extends ProgramPartContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ProgPartFunctionDefinitionContext(ProgramPartContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitProgPartFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramPartContext programPart() throws RecognitionException {
		ProgramPartContext _localctx = new ProgramPartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programPart);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MainStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				statement();
				}
				break;
			case 2:
				_localctx = new ProgPartFunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				functionDefinition();
				}
				break;
			case 3:
				_localctx = new ClassDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				typeDeclaration();
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

	public static class StatementContext extends ParserRuleContext {
		public JavaNativeContext javaNative() {
			return getRuleContext(JavaNativeContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public SystemCallContext systemCall() {
			return getRuleContext(SystemCallContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				javaNative();
				setState(109);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				print();
				setState(112);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				println();
				setState(115);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				systemCall();
				setState(118);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				functionCall();
				setState(121);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				varDeclaration();
				setState(124);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				assignment();
				setState(127);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				branch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				loop();
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

	public static class BranchContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext onTrue;
		public BlockContext onFalse;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__4);
			setState(134);
			match(T__5);
			setState(135);
			((BranchContext)_localctx).condition = expression(0);
			setState(136);
			match(T__6);
			setState(137);
			((BranchContext)_localctx).onTrue = block();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(138);
				match(T__7);
				setState(139);
				((BranchContext)_localctx).onFalse = block();
				}
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

	public static class JavaNativeContext extends ParserRuleContext {
		public InvokeNativeContext invokeNative() {
			return getRuleContext(InvokeNativeContext.class,0);
		}
		public GetNativeContext getNative() {
			return getRuleContext(GetNativeContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public JavaNativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaNative; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitJavaNative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaNativeContext javaNative() throws RecognitionException {
		JavaNativeContext _localctx = new JavaNativeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_javaNative);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				invokeNative();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				getNative();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				push();
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

	public static class InvokeNativeContext extends ParserRuleContext {
		public Token kind;
		public Token name;
		public StringGiverContext stringGiver;
		public List<StringGiverContext> giveTypes = new ArrayList<StringGiverContext>();
		public Token returnType;
		public List<TerminalNode> STRING() { return getTokens(DemoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DemoParser.STRING, i);
		}
		public List<StringGiverContext> stringGiver() {
			return getRuleContexts(StringGiverContext.class);
		}
		public StringGiverContext stringGiver(int i) {
			return getRuleContext(StringGiverContext.class,i);
		}
		public InvokeNativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeNative; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitInvokeNative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeNativeContext invokeNative() throws RecognitionException {
		InvokeNativeContext _localctx = new InvokeNativeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_invokeNative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__8);
			setState(148);
			((InvokeNativeContext)_localctx).kind = match(STRING);
			setState(149);
			((InvokeNativeContext)_localctx).name = match(STRING);
			setState(150);
			match(T__5);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(151);
				((InvokeNativeContext)_localctx).stringGiver = stringGiver();
				((InvokeNativeContext)_localctx).giveTypes.add(((InvokeNativeContext)_localctx).stringGiver);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(T__6);
			setState(158);
			((InvokeNativeContext)_localctx).returnType = match(STRING);
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

	public static class GetNativeContext extends ParserRuleContext {
		public Token type;
		public TerminalNode STRING() { return getToken(DemoParser.STRING, 0); }
		public GetNativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getNative; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitGetNative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetNativeContext getNative() throws RecognitionException {
		GetNativeContext _localctx = new GetNativeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_getNative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__9);
			setState(161);
			((GetNativeContext)_localctx).type = match(STRING);
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

	public static class PushContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__10);
			setState(164);
			expression(0);
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

	public static class StringGiverContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DemoParser.STRING, 0); }
		public StringGiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringGiver; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitStringGiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringGiverContext stringGiver() throws RecognitionException {
		StringGiverContext _localctx = new StringGiverContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stringGiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(STRING);
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

	public static class LoopContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext body;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__11);
			setState(169);
			match(T__5);
			setState(170);
			((LoopContext)_localctx).condition = expression(0);
			setState(171);
			match(T__6);
			setState(172);
			((LoopContext)_localctx).body = block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__12);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__32) | (1L << T__33) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << SYSTEMFUNC) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(175);
				statement();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(T__13);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFuncCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeElementContext extends ExpressionContext {
		public Token typeName;
		public Token varName;
		public List<TerminalNode> IDENTIFIER() { return getTokens(DemoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DemoParser.IDENTIFIER, i);
		}
		public TypeElementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitTypeElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstructorContext extends ExpressionContext {
		public ConstructorCallContext constructorCall() {
			return getRuleContext(ConstructorCallContext.class,0);
		}
		public ConstructorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportFuncExpressionContext extends ExpressionContext {
		public ImportFunctionCallContext importFunctionCall() {
			return getRuleContext(ImportFunctionCallContext.class,0);
		}
		public ImportFuncExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitImportFuncExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public Token txt;
		public TerminalNode STRING() { return getToken(DemoParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightShiftContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RightShiftContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitRightShift(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftShiftContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LeftShiftContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitLeftShift(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SystemFunctionsContext extends ExpressionContext {
		public SystemCallContext systemCall() {
			return getRuleContext(SystemCallContext.class,0);
		}
		public SystemFunctionsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitSystemFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ExpressionContext {
		public Token number;
		public TerminalNode FLOAT() { return getToken(DemoParser.FLOAT, 0); }
		public FloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public Token number;
		public TerminalNode NUMBER() { return getToken(DemoParser.NUMBER, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeArrayFieldContext extends ExpressionContext {
		public Token typeName;
		public Token varName;
		public ExpressionContext index;
		public List<TerminalNode> IDENTIFIER() { return getTokens(DemoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DemoParser.IDENTIFIER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeArrayFieldContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitTypeArrayField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TopOfStackContext extends ExpressionContext {
		public TopOfStackContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitTopOfStack(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends ExpressionContext {
		public Token bool;
		public TerminalNode BOOL() { return getToken(DemoParser.BOOL, 0); }
		public BooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayElementContext extends ExpressionContext {
		public Token varName;
		public ExpressionContext index;
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayElementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(184);
				((ArrayElementContext)_localctx).varName = match(IDENTIFIER);
				setState(185);
				match(T__28);
				setState(186);
				((ArrayElementContext)_localctx).index = expression(0);
				setState(187);
				match(T__29);
				}
				break;
			case 2:
				{
				_localctx = new TypeElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				((TypeElementContext)_localctx).typeName = match(IDENTIFIER);
				setState(190);
				match(T__2);
				setState(191);
				((TypeElementContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 3:
				{
				_localctx = new TypeArrayFieldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				((TypeArrayFieldContext)_localctx).typeName = match(IDENTIFIER);
				setState(193);
				match(T__2);
				setState(194);
				((TypeArrayFieldContext)_localctx).varName = match(IDENTIFIER);
				setState(195);
				match(T__28);
				setState(196);
				((TypeArrayFieldContext)_localctx).index = expression(0);
				setState(197);
				match(T__29);
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				((NumberContext)_localctx).number = match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				((FloatContext)_localctx).number = match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				((BooleanContext)_localctx).bool = match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				((StringContext)_localctx).txt = match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				((VariableContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 9:
				{
				_localctx = new ConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				constructorCall();
				}
				break;
			case 10:
				{
				_localctx = new SystemFunctionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				systemCall();
				}
				break;
			case 11:
				{
				_localctx = new FuncCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				functionCall();
				}
				break;
			case 12:
				{
				_localctx = new ImportFuncExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				importFunctionCall();
				}
				break;
			case 13:
				{
				_localctx = new TopOfStackContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(T__30);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(238);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						((DivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(212);
						match(T__14);
						setState(213);
						((DivContext)_localctx).right = expression(23);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						((MultContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(215);
						match(T__15);
						setState(216);
						((MultContext)_localctx).right = expression(22);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(218);
						match(T__16);
						setState(219);
						((MinusContext)_localctx).right = expression(21);
						}
						break;
					case 4:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(221);
						match(T__17);
						setState(222);
						((PlusContext)_localctx).right = expression(20);
						}
						break;
					case 5:
						{
						_localctx = new LeftShiftContext(new ExpressionContext(_parentctx, _parentState));
						((LeftShiftContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(224);
						match(T__18);
						setState(225);
						((LeftShiftContext)_localctx).right = expression(19);
						}
						break;
					case 6:
						{
						_localctx = new RightShiftContext(new ExpressionContext(_parentctx, _parentState));
						((RightShiftContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(227);
						match(T__19);
						setState(228);
						((RightShiftContext)_localctx).right = expression(18);
						}
						break;
					case 7:
						{
						_localctx = new RelationalContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(229);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(230);
						((RelationalContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
							((RelationalContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(231);
						((RelationalContext)_localctx).right = expression(17);
						}
						break;
					case 8:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(233);
						match(T__26);
						setState(234);
						((AndContext)_localctx).right = expression(16);
						}
						break;
					case 9:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(236);
						match(T__27);
						setState(237);
						((OrContext)_localctx).right = expression(15);
						}
						break;
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public ObjectContext type;
		public Token varName;
		public ExpressionContext expr;
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varDeclaration);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				((VarDeclarationContext)_localctx).type = object();
				setState(244);
				((VarDeclarationContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				((VarDeclarationContext)_localctx).type = object();
				setState(247);
				((VarDeclarationContext)_localctx).varName = match(IDENTIFIER);
				setState(248);
				match(T__31);
				setState(249);
				((VarDeclarationContext)_localctx).expr = expression(0);
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

	public static class AssignmentListContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> assignments = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			((AssignmentListContext)_localctx).expression = expression(0);
			((AssignmentListContext)_localctx).assignments.add(((AssignmentListContext)_localctx).expression);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(254);
				match(T__1);
				setState(255);
				((AssignmentListContext)_localctx).expression = expression(0);
				((AssignmentListContext)_localctx).assignments.add(((AssignmentListContext)_localctx).expression);
				}
				}
				setState(260);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Token varName;
		public ExpressionContext index;
		public ExpressionContext expr;
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeFieldAssignmentContext typeFieldAssignment() {
			return getRuleContext(TypeFieldAssignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				((AssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(262);
				match(T__28);
				setState(263);
				((AssignmentContext)_localctx).index = expression(0);
				setState(264);
				match(T__29);
				setState(265);
				match(T__31);
				setState(266);
				((AssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				((AssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(269);
				match(T__31);
				setState(270);
				((AssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				typeFieldAssignment();
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

	public static class TypeFieldAssignmentContext extends ParserRuleContext {
		public Token varName;
		public Token typeVarName;
		public ExpressionContext expr;
		public ExpressionContext index;
		public List<TerminalNode> IDENTIFIER() { return getTokens(DemoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DemoParser.IDENTIFIER, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeFieldAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFieldAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitTypeFieldAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFieldAssignmentContext typeFieldAssignment() throws RecognitionException {
		TypeFieldAssignmentContext _localctx = new TypeFieldAssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeFieldAssignment);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				((TypeFieldAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(275);
				match(T__2);
				setState(276);
				((TypeFieldAssignmentContext)_localctx).typeVarName = match(IDENTIFIER);
				setState(277);
				match(T__31);
				setState(278);
				((TypeFieldAssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				((TypeFieldAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(280);
				match(T__2);
				setState(281);
				((TypeFieldAssignmentContext)_localctx).typeVarName = match(IDENTIFIER);
				setState(282);
				match(T__28);
				setState(283);
				((TypeFieldAssignmentContext)_localctx).index = expression(0);
				setState(284);
				match(T__29);
				setState(285);
				match(T__31);
				setState(286);
				((TypeFieldAssignmentContext)_localctx).expr = expression(0);
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

	public static class PrintlnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__32);
			setState(291);
			((PrintlnContext)_localctx).argument = expression(0);
			setState(292);
			match(T__6);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__33);
			setState(295);
			((PrintContext)_localctx).argument = expression(0);
			setState(296);
			match(T__6);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ObjectContext type;
		public Token funcName;
		public ParameterDeclarationContext params;
		public StatementListContext statements;
		public ExpressionContext returnValue;
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((FunctionDefinitionContext)_localctx).type = object();
			setState(299);
			((FunctionDefinitionContext)_localctx).funcName = match(IDENTIFIER);
			setState(300);
			match(T__5);
			setState(301);
			((FunctionDefinitionContext)_localctx).params = parameterDeclaration();
			setState(302);
			match(T__6);
			setState(303);
			match(T__12);
			setState(304);
			((FunctionDefinitionContext)_localctx).statements = statementList();
			setState(305);
			match(T__34);
			setState(306);
			((FunctionDefinitionContext)_localctx).returnValue = expression(0);
			setState(307);
			match(T__3);
			setState(308);
			match(T__13);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public Token typeName;
		public TypeParameterDeclarationContext declarations;
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public TypeParameterDeclarationContext typeParameterDeclaration() {
			return getRuleContext(TypeParameterDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__35);
			setState(311);
			((TypeDeclarationContext)_localctx).typeName = match(IDENTIFIER);
			setState(312);
			match(T__12);
			setState(313);
			((TypeDeclarationContext)_localctx).declarations = typeParameterDeclaration();
			setState(314);
			match(T__13);
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

	public static class TypeParameterDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration;
		public List<VarDeclarationContext> declarations = new ArrayList<VarDeclarationContext>();
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public TypeParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitTypeParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterDeclarationContext typeParameterDeclaration() throws RecognitionException {
		TypeParameterDeclarationContext _localctx = new TypeParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeParameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(316);
				((TypeParameterDeclarationContext)_localctx).varDeclaration = varDeclaration();
				((TypeParameterDeclarationContext)_localctx).declarations.add(((TypeParameterDeclarationContext)_localctx).varDeclaration);
				setState(317);
				match(T__3);
				}
				}
				setState(321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << IDENTIFIER))) != 0) );
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration;
		public List<VarDeclarationContext> declarations = new ArrayList<VarDeclarationContext>();
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parameterDeclaration);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				((ParameterDeclarationContext)_localctx).varDeclaration = varDeclaration();
				((ParameterDeclarationContext)_localctx).declarations.add(((ParameterDeclarationContext)_localctx).varDeclaration);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(324);
					match(T__1);
					setState(325);
					((ParameterDeclarationContext)_localctx).varDeclaration = varDeclaration();
					((ParameterDeclarationContext)_localctx).declarations.add(((ParameterDeclarationContext)_localctx).varDeclaration);
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__32) | (1L << T__33) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << SYSTEMFUNC) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(334);
				statement();
				}
				}
				setState(339);
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

	public static class SystemCallContext extends ParserRuleContext {
		public Token funcName;
		public ExpressionListContext arguments;
		public TerminalNode SYSTEMFUNC() { return getToken(DemoParser.SYSTEMFUNC, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SystemCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitSystemCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemCallContext systemCall() throws RecognitionException {
		SystemCallContext _localctx = new SystemCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_systemCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			((SystemCallContext)_localctx).funcName = match(SYSTEMFUNC);
			setState(341);
			match(T__5);
			setState(342);
			((SystemCallContext)_localctx).arguments = expressionList();
			setState(343);
			match(T__6);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public Token funcName;
		public ExpressionListContext arguments;
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			((FunctionCallContext)_localctx).funcName = match(IDENTIFIER);
			setState(346);
			match(T__5);
			setState(347);
			((FunctionCallContext)_localctx).arguments = expressionList();
			setState(348);
			match(T__6);
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

	public static class ImportFunctionCallContext extends ParserRuleContext {
		public ObjectContext ident;
		public Token importDir;
		public Token funcName;
		public ExpressionListContext arguments;
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(DemoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DemoParser.IDENTIFIER, i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ImportFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFunctionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitImportFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFunctionCallContext importFunctionCall() throws RecognitionException {
		ImportFunctionCallContext _localctx = new ImportFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_importFunctionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			((ImportFunctionCallContext)_localctx).ident = object();
			setState(351);
			match(T__36);
			setState(352);
			((ImportFunctionCallContext)_localctx).importDir = match(IDENTIFIER);
			setState(353);
			match(T__2);
			setState(354);
			((ImportFunctionCallContext)_localctx).funcName = match(IDENTIFIER);
			setState(355);
			match(T__5);
			setState(356);
			((ImportFunctionCallContext)_localctx).arguments = expressionList();
			setState(357);
			match(T__6);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> expressions = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionList);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__30:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case SYSTEMFUNC:
			case BOOL:
			case IDENTIFIER:
			case NUMBER:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				((ExpressionListContext)_localctx).expression = expression(0);
				((ExpressionListContext)_localctx).expressions.add(((ExpressionListContext)_localctx).expression);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(360);
					match(T__1);
					setState(361);
					((ExpressionListContext)_localctx).expression = expression(0);
					((ExpressionListContext)_localctx).expressions.add(((ExpressionListContext)_localctx).expression);
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ConstructorCallContext extends ParserRuleContext {
		public ObjectContext ident;
		public AssignmentListContext arguments;
		public PrimitiveContext type;
		public ExpressionContext size;
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorCallContext constructorCall() throws RecognitionException {
		ConstructorCallContext _localctx = new ConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constructorCall);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(T__9);
				setState(371);
				((ConstructorCallContext)_localctx).ident = object();
				setState(372);
				match(T__5);
				setState(373);
				((ConstructorCallContext)_localctx).arguments = assignmentList();
				setState(374);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(T__9);
				setState(377);
				((ConstructorCallContext)_localctx).type = primitive();
				setState(378);
				match(T__28);
				setState(379);
				((ConstructorCallContext)_localctx).size = expression(0);
				setState(380);
				match(T__29);
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

	public static class ObjectContext extends ParserRuleContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_object);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				primitive();
				setState(385);
				match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				primitive();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(IDENTIFIER);
				setState(389);
				match(T__37);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				match(IDENTIFIER);
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

	public static class PrimitiveContext extends ParserRuleContext {
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u018e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\6\2J\n\2\r\2\16\2K\3\2\3\2\3\3\3\3"+
		"\6\3R\n\3\r\3\16\3S\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\7\3]\n\3\f\3\16\3"+
		"`\13\3\3\4\3\4\3\4\7\4e\n\4\f\4\16\4h\13\4\3\5\3\5\3\5\5\5m\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u0086\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008f\n"+
		"\7\3\b\3\b\3\b\5\b\u0094\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u009b\n\t\f\t\16"+
		"\t\u009e\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\7\16\u00b3\n\16\f\16\16\16\u00b6\13\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d4"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00f1\n\17\f\17\16\17\u00f4\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00fe\n\20\3\21\3\21\3\21\7\21\u0103\n\21\f\21\16\21\u0106"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0113"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0123\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\6\30\u0142\n\30\r\30\16\30\u0143\3\31\3\31\3"+
		"\31\7\31\u0149\n\31\f\31\16\31\u014c\13\31\3\31\5\31\u014f\n\31\3\32\7"+
		"\32\u0152\n\32\f\32\16\32\u0155\13\32\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\7\36\u016d\n\36\f\36\16\36\u0170\13\36\3\36\5\36\u0173\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0181"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u018a\n \3!\3!\3!\2\3\34\"\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\4\3\2\27\34\3\2)"+
		",\u01a6\2E\3\2\2\2\4O\3\2\2\2\6a\3\2\2\2\bl\3\2\2\2\n\u0085\3\2\2\2\f"+
		"\u0087\3\2\2\2\16\u0093\3\2\2\2\20\u0095\3\2\2\2\22\u00a2\3\2\2\2\24\u00a5"+
		"\3\2\2\2\26\u00a8\3\2\2\2\30\u00aa\3\2\2\2\32\u00b0\3\2\2\2\34\u00d3\3"+
		"\2\2\2\36\u00fd\3\2\2\2 \u00ff\3\2\2\2\"\u0112\3\2\2\2$\u0122\3\2\2\2"+
		"&\u0124\3\2\2\2(\u0128\3\2\2\2*\u012c\3\2\2\2,\u0138\3\2\2\2.\u0141\3"+
		"\2\2\2\60\u014e\3\2\2\2\62\u0153\3\2\2\2\64\u0156\3\2\2\2\66\u015b\3\2"+
		"\2\28\u0160\3\2\2\2:\u0172\3\2\2\2<\u0180\3\2\2\2>\u0189\3\2\2\2@\u018b"+
		"\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2G"+
		"E\3\2\2\2HJ\5\b\5\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2"+
		"MN\7\2\2\3N\3\3\2\2\2OQ\7\3\2\2PR\5\6\4\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2"+
		"\2ST\3\2\2\2T^\3\2\2\2UY\7\4\2\2VX\5\6\4\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2"+
		"\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\U\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2"+
		"\2\2_\5\3\2\2\2`^\3\2\2\2af\7/\2\2bc\7\5\2\2ce\7/\2\2db\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2g\7\3\2\2\2hf\3\2\2\2im\5\n\6\2jm\5*\26\2km\5"+
		",\27\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\t\3\2\2\2no\5\16\b\2op\7\6\2\2p"+
		"\u0086\3\2\2\2qr\5(\25\2rs\7\6\2\2s\u0086\3\2\2\2tu\5&\24\2uv\7\6\2\2"+
		"v\u0086\3\2\2\2wx\5\64\33\2xy\7\6\2\2y\u0086\3\2\2\2z{\5\66\34\2{|\7\6"+
		"\2\2|\u0086\3\2\2\2}~\5\36\20\2~\177\7\6\2\2\177\u0086\3\2\2\2\u0080\u0081"+
		"\5\"\22\2\u0081\u0082\7\6\2\2\u0082\u0086\3\2\2\2\u0083\u0086\5\f\7\2"+
		"\u0084\u0086\5\30\r\2\u0085n\3\2\2\2\u0085q\3\2\2\2\u0085t\3\2\2\2\u0085"+
		"w\3\2\2\2\u0085z\3\2\2\2\u0085}\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0084\3\2\2\2\u0086\13\3\2\2\2\u0087\u0088\7\7\2\2\u0088"+
		"\u0089\7\b\2\2\u0089\u008a\5\34\17\2\u008a\u008b\7\t\2\2\u008b\u008e\5"+
		"\32\16\2\u008c\u008d\7\n\2\2\u008d\u008f\5\32\16\2\u008e\u008c\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\r\3\2\2\2\u0090\u0094\5\20\t\2\u0091\u0094"+
		"\5\22\n\2\u0092\u0094\5\24\13\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2"+
		"\2\u0093\u0092\3\2\2\2\u0094\17\3\2\2\2\u0095\u0096\7\13\2\2\u0096\u0097"+
		"\7\63\2\2\u0097\u0098\7\63\2\2\u0098\u009c\7\b\2\2\u0099\u009b\5\26\f"+
		"\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\t\2\2\u00a0"+
		"\u00a1\7\63\2\2\u00a1\21\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\7\63"+
		"\2\2\u00a4\23\3\2\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a7\5\34\17\2\u00a7"+
		"\25\3\2\2\2\u00a8\u00a9\7\63\2\2\u00a9\27\3\2\2\2\u00aa\u00ab\7\16\2\2"+
		"\u00ab\u00ac\7\b\2\2\u00ac\u00ad\5\34\17\2\u00ad\u00ae\7\t\2\2\u00ae\u00af"+
		"\5\32\16\2\u00af\31\3\2\2\2\u00b0\u00b4\7\17\2\2\u00b1\u00b3\5\n\6\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\20\2\2\u00b8"+
		"\33\3\2\2\2\u00b9\u00ba\b\17\1\2\u00ba\u00bb\7/\2\2\u00bb\u00bc\7\37\2"+
		"\2\u00bc\u00bd\5\34\17\2\u00bd\u00be\7 \2\2\u00be\u00d4\3\2\2\2\u00bf"+
		"\u00c0\7/\2\2\u00c0\u00c1\7\5\2\2\u00c1\u00d4\7/\2\2\u00c2\u00c3\7/\2"+
		"\2\u00c3\u00c4\7\5\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6\7\37\2\2\u00c6\u00c7"+
		"\5\34\17\2\u00c7\u00c8\7 \2\2\u00c8\u00d4\3\2\2\2\u00c9\u00d4\7\60\2\2"+
		"\u00ca\u00d4\7\61\2\2\u00cb\u00d4\7.\2\2\u00cc\u00d4\7\63\2\2\u00cd\u00d4"+
		"\7/\2\2\u00ce\u00d4\5<\37\2\u00cf\u00d4\5\64\33\2\u00d0\u00d4\5\66\34"+
		"\2\u00d1\u00d4\58\35\2\u00d2\u00d4\7!\2\2\u00d3\u00b9\3\2\2\2\u00d3\u00bf"+
		"\3\2\2\2\u00d3\u00c2\3\2\2\2\u00d3\u00c9\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d3"+
		"\u00cb\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00ce\3\2"+
		"\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00f2\3\2\2\2\u00d5\u00d6\f\30\2\2\u00d6\u00d7\7"+
		"\21\2\2\u00d7\u00f1\5\34\17\31\u00d8\u00d9\f\27\2\2\u00d9\u00da\7\22\2"+
		"\2\u00da\u00f1\5\34\17\30\u00db\u00dc\f\26\2\2\u00dc\u00dd\7\23\2\2\u00dd"+
		"\u00f1\5\34\17\27\u00de\u00df\f\25\2\2\u00df\u00e0\7\24\2\2\u00e0\u00f1"+
		"\5\34\17\26\u00e1\u00e2\f\24\2\2\u00e2\u00e3\7\25\2\2\u00e3\u00f1\5\34"+
		"\17\25\u00e4\u00e5\f\23\2\2\u00e5\u00e6\7\26\2\2\u00e6\u00f1\5\34\17\24"+
		"\u00e7\u00e8\f\22\2\2\u00e8\u00e9\t\2\2\2\u00e9\u00f1\5\34\17\23\u00ea"+
		"\u00eb\f\21\2\2\u00eb\u00ec\7\35\2\2\u00ec\u00f1\5\34\17\22\u00ed\u00ee"+
		"\f\20\2\2\u00ee\u00ef\7\36\2\2\u00ef\u00f1\5\34\17\21\u00f0\u00d5\3\2"+
		"\2\2\u00f0\u00d8\3\2\2\2\u00f0\u00db\3\2\2\2\u00f0\u00de\3\2\2\2\u00f0"+
		"\u00e1\3\2\2\2\u00f0\u00e4\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f0\u00ea\3\2"+
		"\2\2\u00f0\u00ed\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\35\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\5> \2"+
		"\u00f6\u00f7\7/\2\2\u00f7\u00fe\3\2\2\2\u00f8\u00f9\5> \2\u00f9\u00fa"+
		"\7/\2\2\u00fa\u00fb\7\"\2\2\u00fb\u00fc\5\34\17\2\u00fc\u00fe\3\2\2\2"+
		"\u00fd\u00f5\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fe\37\3\2\2\2\u00ff\u0104"+
		"\5\34\17\2\u0100\u0101\7\4\2\2\u0101\u0103\5\34\17\2\u0102\u0100\3\2\2"+
		"\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105!"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7/\2\2\u0108\u0109\7\37\2\2\u0109"+
		"\u010a\5\34\17\2\u010a\u010b\7 \2\2\u010b\u010c\7\"\2\2\u010c\u010d\5"+
		"\34\17\2\u010d\u0113\3\2\2\2\u010e\u010f\7/\2\2\u010f\u0110\7\"\2\2\u0110"+
		"\u0113\5\34\17\2\u0111\u0113\5$\23\2\u0112\u0107\3\2\2\2\u0112\u010e\3"+
		"\2\2\2\u0112\u0111\3\2\2\2\u0113#\3\2\2\2\u0114\u0115\7/\2\2\u0115\u0116"+
		"\7\5\2\2\u0116\u0117\7/\2\2\u0117\u0118\7\"\2\2\u0118\u0123\5\34\17\2"+
		"\u0119\u011a\7/\2\2\u011a\u011b\7\5\2\2\u011b\u011c\7/\2\2\u011c\u011d"+
		"\7\37\2\2\u011d\u011e\5\34\17\2\u011e\u011f\7 \2\2\u011f\u0120\7\"\2\2"+
		"\u0120\u0121\5\34\17\2\u0121\u0123\3\2\2\2\u0122\u0114\3\2\2\2\u0122\u0119"+
		"\3\2\2\2\u0123%\3\2\2\2\u0124\u0125\7#\2\2\u0125\u0126\5\34\17\2\u0126"+
		"\u0127\7\t\2\2\u0127\'\3\2\2\2\u0128\u0129\7$\2\2\u0129\u012a\5\34\17"+
		"\2\u012a\u012b\7\t\2\2\u012b)\3\2\2\2\u012c\u012d\5> \2\u012d\u012e\7"+
		"/\2\2\u012e\u012f\7\b\2\2\u012f\u0130\5\60\31\2\u0130\u0131\7\t\2\2\u0131"+
		"\u0132\7\17\2\2\u0132\u0133\5\62\32\2\u0133\u0134\7%\2\2\u0134\u0135\5"+
		"\34\17\2\u0135\u0136\7\6\2\2\u0136\u0137\7\20\2\2\u0137+\3\2\2\2\u0138"+
		"\u0139\7&\2\2\u0139\u013a\7/\2\2\u013a\u013b\7\17\2\2\u013b\u013c\5.\30"+
		"\2\u013c\u013d\7\20\2\2\u013d-\3\2\2\2\u013e\u013f\5\36\20\2\u013f\u0140"+
		"\7\6\2\2\u0140\u0142\3\2\2\2\u0141\u013e\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144/\3\2\2\2\u0145\u014a\5\36\20"+
		"\2\u0146\u0147\7\4\2\2\u0147\u0149\5\36\20\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014f\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0145\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014f\61\3\2\2\2\u0150\u0152\5\n\6\2\u0151\u0150\3\2\2"+
		"\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\63"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7-\2\2\u0157\u0158\7\b\2\2\u0158"+
		"\u0159\5:\36\2\u0159\u015a\7\t\2\2\u015a\65\3\2\2\2\u015b\u015c\7/\2\2"+
		"\u015c\u015d\7\b\2\2\u015d\u015e\5:\36\2\u015e\u015f\7\t\2\2\u015f\67"+
		"\3\2\2\2\u0160\u0161\5> \2\u0161\u0162\7\'\2\2\u0162\u0163\7/\2\2\u0163"+
		"\u0164\7\5\2\2\u0164\u0165\7/\2\2\u0165\u0166\7\b\2\2\u0166\u0167\5:\36"+
		"\2\u0167\u0168\7\t\2\2\u01689\3\2\2\2\u0169\u016e\5\34\17\2\u016a\u016b"+
		"\7\4\2\2\u016b\u016d\5\34\17\2\u016c\u016a\3\2\2\2\u016d\u0170\3\2\2\2"+
		"\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0173\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0169\3\2\2\2\u0172\u0171\3\2\2\2\u0173"+
		";\3\2\2\2\u0174\u0175\7\f\2\2\u0175\u0176\5> \2\u0176\u0177\7\b\2\2\u0177"+
		"\u0178\5 \21\2\u0178\u0179\7\t\2\2\u0179\u0181\3\2\2\2\u017a\u017b\7\f"+
		"\2\2\u017b\u017c\5@!\2\u017c\u017d\7\37\2\2\u017d\u017e\5\34\17\2\u017e"+
		"\u017f\7 \2\2\u017f\u0181\3\2\2\2\u0180\u0174\3\2\2\2\u0180\u017a\3\2"+
		"\2\2\u0181=\3\2\2\2\u0182\u0183\5@!\2\u0183\u0184\7(\2\2\u0184\u018a\3"+
		"\2\2\2\u0185\u018a\5@!\2\u0186\u0187\7/\2\2\u0187\u018a\7(\2\2\u0188\u018a"+
		"\7/\2\2\u0189\u0182\3\2\2\2\u0189\u0185\3\2\2\2\u0189\u0186\3\2\2\2\u0189"+
		"\u0188\3\2\2\2\u018a?\3\2\2\2\u018b\u018c\t\3\2\2\u018cA\3\2\2\2\35EK"+
		"SY^fl\u0085\u008e\u0093\u009c\u00b4\u00d3\u00f0\u00f2\u00fd\u0104\u0112"+
		"\u0122\u0143\u014a\u014e\u0153\u016e\u0172\u0180\u0189";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}