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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		SYSTEMFUNC=46, BOOL=47, IDENTIFIER=48, NUMBER=49, FLOAT=50, WHITESPACE=51, 
		STRING=52, COMMENT=53, LINECOMMENT=54;
	public static final int
		RULE_program = 0, RULE_importList = 1, RULE_compilerSwitch = 2, RULE_switchStatement = 3, 
		RULE_path = 4, RULE_programPart = 5, RULE_statement = 6, RULE_branch = 7, 
		RULE_javaNative = 8, RULE_invokeNative = 9, RULE_inlineCommand = 10, RULE_getNative = 11, 
		RULE_push = 12, RULE_setTOS = 13, RULE_stringGiver = 14, RULE_loop = 15, 
		RULE_block = 16, RULE_expression = 17, RULE_varDeclaration = 18, RULE_assignmentList = 19, 
		RULE_assignment = 20, RULE_typeFieldAssignment = 21, RULE_println = 22, 
		RULE_print = 23, RULE_functionDefinition = 24, RULE_typeDeclaration = 25, 
		RULE_typeParameterDeclaration = 26, RULE_parameterDeclaration = 27, RULE_statementList = 28, 
		RULE_systemCall = 29, RULE_functionCall = 30, RULE_importFunctionCall = 31, 
		RULE_expressionList = 32, RULE_constructorCall = 33, RULE_object = 34, 
		RULE_primitive = 35;
	public static final String[] ruleNames = {
		"program", "importList", "compilerSwitch", "switchStatement", "path", 
		"programPart", "statement", "branch", "javaNative", "invokeNative", "inlineCommand", 
		"getNative", "push", "setTOS", "stringGiver", "loop", "block", "expression", 
		"varDeclaration", "assignmentList", "assignment", "typeFieldAssignment", 
		"println", "print", "functionDefinition", "typeDeclaration", "typeParameterDeclaration", 
		"parameterDeclaration", "statementList", "systemCall", "functionCall", 
		"importFunctionCall", "expressionList", "constructorCall", "object", "primitive"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import:'", "','", "'{'", "'}'", "'noMain'", "'.'", "';'", "'if'", 
		"'('", "')'", "'else'", "'invoke'", "'inline'", "'new'", "'pushToStack'", 
		"'setTOS'", "'while'", "'/'", "'*'", "'-'", "'+'", "'<<'", "'>>'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'<>'", "'&&'", "'||'", "'['", "']'", "'tos'", 
		"'='", "'print('", "'out('", "'return'", "'type'", "':'", "'[]'", "'int'", 
		"'float'", "'void'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "SYSTEMFUNC", 
		"BOOL", "IDENTIFIER", "NUMBER", "FLOAT", "WHITESPACE", "STRING", "COMMENT", 
		"LINECOMMENT"
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
		public CompilerSwitchContext compilerSwitch;
		public List<CompilerSwitchContext> noRun = new ArrayList<CompilerSwitchContext>();
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
		public List<CompilerSwitchContext> compilerSwitch() {
			return getRuleContexts(CompilerSwitchContext.class);
		}
		public CompilerSwitchContext compilerSwitch(int i) {
			return getRuleContext(CompilerSwitchContext.class,i);
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(72);
				((ProgramContext)_localctx).importList = importList();
				((ProgramContext)_localctx).imports.add(((ProgramContext)_localctx).importList);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(78);
				((ProgramContext)_localctx).compilerSwitch = compilerSwitch();
				((ProgramContext)_localctx).noRun.add(((ProgramContext)_localctx).compilerSwitch);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				programPart();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << SYSTEMFUNC) | (1L << IDENTIFIER))) != 0) );
			setState(89);
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
			setState(91);
			match(T__0);
			setState(93); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(92);
					((ImportListContext)_localctx).path = path();
					((ImportListContext)_localctx).importedFiles.add(((ImportListContext)_localctx).path);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(95); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(97);
				match(T__1);
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(98);
						((ImportListContext)_localctx).path = path();
						((ImportListContext)_localctx).importedFiles.add(((ImportListContext)_localctx).path);
						}
						} 
					}
					setState(103);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				}
				setState(108);
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

	public static class CompilerSwitchContext extends ParserRuleContext {
		public SwitchStatementContext statementName;
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public CompilerSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerSwitch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitCompilerSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilerSwitchContext compilerSwitch() throws RecognitionException {
		CompilerSwitchContext _localctx = new CompilerSwitchContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compilerSwitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__2);
			setState(110);
			((CompilerSwitchContext)_localctx).statementName = switchStatement();
			setState(111);
			match(T__3);
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__4);
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
		enterRule(_localctx, 8, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IDENTIFIER);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(116);
				match(T__5);
				setState(117);
				match(IDENTIFIER);
				}
				}
				setState(122);
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
		enterRule(_localctx, 10, RULE_programPart);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new MainStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				statement();
				}
				break;
			case 2:
				_localctx = new ProgPartFunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				functionDefinition();
				}
				break;
			case 3:
				_localctx = new ClassDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
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
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				javaNative();
				setState(129);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				print();
				setState(132);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				println();
				setState(135);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				systemCall();
				setState(138);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				functionCall();
				setState(141);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				varDeclaration();
				setState(144);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				assignment();
				setState(147);
				match(T__6);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(149);
				branch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(150);
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
		enterRule(_localctx, 14, RULE_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__7);
			setState(154);
			match(T__8);
			setState(155);
			((BranchContext)_localctx).condition = expression(0);
			setState(156);
			match(T__9);
			setState(157);
			((BranchContext)_localctx).onTrue = block();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(158);
				match(T__10);
				setState(159);
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
		public InlineCommandContext inlineCommand() {
			return getRuleContext(InlineCommandContext.class,0);
		}
		public GetNativeContext getNative() {
			return getRuleContext(GetNativeContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public SetTOSContext setTOS() {
			return getRuleContext(SetTOSContext.class,0);
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
		enterRule(_localctx, 16, RULE_javaNative);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				invokeNative();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				inlineCommand();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				getNative();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				push();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				setTOS();
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
		enterRule(_localctx, 18, RULE_invokeNative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__11);
			setState(170);
			((InvokeNativeContext)_localctx).kind = match(STRING);
			setState(171);
			((InvokeNativeContext)_localctx).name = match(STRING);
			setState(172);
			match(T__8);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(173);
				((InvokeNativeContext)_localctx).stringGiver = stringGiver();
				((InvokeNativeContext)_localctx).giveTypes.add(((InvokeNativeContext)_localctx).stringGiver);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(T__9);
			setState(180);
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

	public static class InlineCommandContext extends ParserRuleContext {
		public Token text;
		public TerminalNode STRING() { return getToken(DemoParser.STRING, 0); }
		public InlineCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineCommand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitInlineCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineCommandContext inlineCommand() throws RecognitionException {
		InlineCommandContext _localctx = new InlineCommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inlineCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__12);
			setState(183);
			match(T__2);
			setState(184);
			((InlineCommandContext)_localctx).text = match(STRING);
			setState(185);
			match(T__3);
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
		enterRule(_localctx, 22, RULE_getNative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__13);
			setState(188);
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
		enterRule(_localctx, 24, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__14);
			setState(191);
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

	public static class SetTOSContext extends ParserRuleContext {
		public Token type;
		public TerminalNode STRING() { return getToken(DemoParser.STRING, 0); }
		public SetTOSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTOS; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitSetTOS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTOSContext setTOS() throws RecognitionException {
		SetTOSContext _localctx = new SetTOSContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_setTOS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__15);
			setState(194);
			((SetTOSContext)_localctx).type = match(STRING);
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
		enterRule(_localctx, 28, RULE_stringGiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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
		enterRule(_localctx, 30, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__16);
			setState(199);
			match(T__8);
			setState(200);
			((LoopContext)_localctx).condition = expression(0);
			setState(201);
			match(T__9);
			setState(202);
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
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__2);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__35) | (1L << T__36) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << SYSTEMFUNC) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(205);
				statement();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(T__3);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(214);
				((ArrayElementContext)_localctx).varName = match(IDENTIFIER);
				setState(215);
				match(T__31);
				setState(216);
				((ArrayElementContext)_localctx).index = expression(0);
				setState(217);
				match(T__32);
				}
				break;
			case 2:
				{
				_localctx = new TypeElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				((TypeElementContext)_localctx).typeName = match(IDENTIFIER);
				setState(220);
				match(T__5);
				setState(221);
				((TypeElementContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 3:
				{
				_localctx = new TypeArrayFieldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				((TypeArrayFieldContext)_localctx).typeName = match(IDENTIFIER);
				setState(223);
				match(T__5);
				setState(224);
				((TypeArrayFieldContext)_localctx).varName = match(IDENTIFIER);
				setState(225);
				match(T__31);
				setState(226);
				((TypeArrayFieldContext)_localctx).index = expression(0);
				setState(227);
				match(T__32);
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				((NumberContext)_localctx).number = match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				((FloatContext)_localctx).number = match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				((BooleanContext)_localctx).bool = match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				((StringContext)_localctx).txt = match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				((VariableContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 9:
				{
				_localctx = new ConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				constructorCall();
				}
				break;
			case 10:
				{
				_localctx = new SystemFunctionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				systemCall();
				}
				break;
			case 11:
				{
				_localctx = new FuncCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				functionCall();
				}
				break;
			case 12:
				{
				_localctx = new ImportFuncExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				importFunctionCall();
				}
				break;
			case 13:
				{
				_localctx = new TopOfStackContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(T__33);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(268);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						((DivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(242);
						match(T__17);
						setState(243);
						((DivContext)_localctx).right = expression(23);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						((MultContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(245);
						match(T__18);
						setState(246);
						((MultContext)_localctx).right = expression(22);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(248);
						match(T__19);
						setState(249);
						((MinusContext)_localctx).right = expression(21);
						}
						break;
					case 4:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(251);
						match(T__20);
						setState(252);
						((PlusContext)_localctx).right = expression(20);
						}
						break;
					case 5:
						{
						_localctx = new LeftShiftContext(new ExpressionContext(_parentctx, _parentState));
						((LeftShiftContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(254);
						match(T__21);
						setState(255);
						((LeftShiftContext)_localctx).right = expression(19);
						}
						break;
					case 6:
						{
						_localctx = new RightShiftContext(new ExpressionContext(_parentctx, _parentState));
						((RightShiftContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(257);
						match(T__22);
						setState(258);
						((RightShiftContext)_localctx).right = expression(18);
						}
						break;
					case 7:
						{
						_localctx = new RelationalContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(259);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(260);
						((RelationalContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
							((RelationalContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(261);
						((RelationalContext)_localctx).right = expression(17);
						}
						break;
					case 8:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(263);
						match(T__29);
						setState(264);
						((AndContext)_localctx).right = expression(16);
						}
						break;
					case 9:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(266);
						match(T__30);
						setState(267);
						((OrContext)_localctx).right = expression(15);
						}
						break;
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 36, RULE_varDeclaration);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				((VarDeclarationContext)_localctx).type = object();
				setState(274);
				((VarDeclarationContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				((VarDeclarationContext)_localctx).type = object();
				setState(277);
				((VarDeclarationContext)_localctx).varName = match(IDENTIFIER);
				setState(278);
				match(T__34);
				setState(279);
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
		enterRule(_localctx, 38, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			((AssignmentListContext)_localctx).expression = expression(0);
			((AssignmentListContext)_localctx).assignments.add(((AssignmentListContext)_localctx).expression);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(284);
				match(T__1);
				setState(285);
				((AssignmentListContext)_localctx).expression = expression(0);
				((AssignmentListContext)_localctx).assignments.add(((AssignmentListContext)_localctx).expression);
				}
				}
				setState(290);
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
		enterRule(_localctx, 40, RULE_assignment);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				((AssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(292);
				match(T__31);
				setState(293);
				((AssignmentContext)_localctx).index = expression(0);
				setState(294);
				match(T__32);
				setState(295);
				match(T__34);
				setState(296);
				((AssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				((AssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(299);
				match(T__34);
				setState(300);
				((AssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
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
		enterRule(_localctx, 42, RULE_typeFieldAssignment);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				((TypeFieldAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(305);
				match(T__5);
				setState(306);
				((TypeFieldAssignmentContext)_localctx).typeVarName = match(IDENTIFIER);
				setState(307);
				match(T__34);
				setState(308);
				((TypeFieldAssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				((TypeFieldAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(310);
				match(T__5);
				setState(311);
				((TypeFieldAssignmentContext)_localctx).typeVarName = match(IDENTIFIER);
				setState(312);
				match(T__31);
				setState(313);
				((TypeFieldAssignmentContext)_localctx).index = expression(0);
				setState(314);
				match(T__32);
				setState(315);
				match(T__34);
				setState(316);
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
		enterRule(_localctx, 44, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__35);
			setState(321);
			((PrintlnContext)_localctx).argument = expression(0);
			setState(322);
			match(T__9);
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
		enterRule(_localctx, 46, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__36);
			setState(325);
			((PrintContext)_localctx).argument = expression(0);
			setState(326);
			match(T__9);
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
		enterRule(_localctx, 48, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			((FunctionDefinitionContext)_localctx).type = object();
			setState(329);
			((FunctionDefinitionContext)_localctx).funcName = match(IDENTIFIER);
			setState(330);
			match(T__8);
			setState(331);
			((FunctionDefinitionContext)_localctx).params = parameterDeclaration();
			setState(332);
			match(T__9);
			setState(333);
			match(T__2);
			setState(334);
			((FunctionDefinitionContext)_localctx).statements = statementList();
			setState(335);
			match(T__37);
			setState(336);
			((FunctionDefinitionContext)_localctx).returnValue = expression(0);
			setState(337);
			match(T__6);
			setState(338);
			match(T__3);
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
		enterRule(_localctx, 50, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__38);
			setState(341);
			((TypeDeclarationContext)_localctx).typeName = match(IDENTIFIER);
			setState(342);
			match(T__2);
			setState(343);
			((TypeDeclarationContext)_localctx).declarations = typeParameterDeclaration();
			setState(344);
			match(T__3);
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
		enterRule(_localctx, 52, RULE_typeParameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(346);
				((TypeParameterDeclarationContext)_localctx).varDeclaration = varDeclaration();
				((TypeParameterDeclarationContext)_localctx).declarations.add(((TypeParameterDeclarationContext)_localctx).varDeclaration);
				setState(347);
				match(T__6);
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << IDENTIFIER))) != 0) );
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
		enterRule(_localctx, 54, RULE_parameterDeclaration);
		int _la;
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				((ParameterDeclarationContext)_localctx).varDeclaration = varDeclaration();
				((ParameterDeclarationContext)_localctx).declarations.add(((ParameterDeclarationContext)_localctx).varDeclaration);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(354);
					match(T__1);
					setState(355);
					((ParameterDeclarationContext)_localctx).varDeclaration = varDeclaration();
					((ParameterDeclarationContext)_localctx).declarations.add(((ParameterDeclarationContext)_localctx).varDeclaration);
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
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
		enterRule(_localctx, 56, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__35) | (1L << T__36) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << SYSTEMFUNC) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(364);
				statement();
				}
				}
				setState(369);
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
		enterRule(_localctx, 58, RULE_systemCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			((SystemCallContext)_localctx).funcName = match(SYSTEMFUNC);
			setState(371);
			match(T__8);
			setState(372);
			((SystemCallContext)_localctx).arguments = expressionList();
			setState(373);
			match(T__9);
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
		enterRule(_localctx, 60, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			((FunctionCallContext)_localctx).funcName = match(IDENTIFIER);
			setState(376);
			match(T__8);
			setState(377);
			((FunctionCallContext)_localctx).arguments = expressionList();
			setState(378);
			match(T__9);
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
		enterRule(_localctx, 62, RULE_importFunctionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			((ImportFunctionCallContext)_localctx).ident = object();
			setState(381);
			match(T__39);
			setState(382);
			((ImportFunctionCallContext)_localctx).importDir = match(IDENTIFIER);
			setState(383);
			match(T__5);
			setState(384);
			((ImportFunctionCallContext)_localctx).funcName = match(IDENTIFIER);
			setState(385);
			match(T__8);
			setState(386);
			((ImportFunctionCallContext)_localctx).arguments = expressionList();
			setState(387);
			match(T__9);
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
		enterRule(_localctx, 64, RULE_expressionList);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__33:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case SYSTEMFUNC:
			case BOOL:
			case IDENTIFIER:
			case NUMBER:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				((ExpressionListContext)_localctx).expression = expression(0);
				((ExpressionListContext)_localctx).expressions.add(((ExpressionListContext)_localctx).expression);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(390);
					match(T__1);
					setState(391);
					((ExpressionListContext)_localctx).expression = expression(0);
					((ExpressionListContext)_localctx).expressions.add(((ExpressionListContext)_localctx).expression);
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
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
		enterRule(_localctx, 66, RULE_constructorCall);
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(T__13);
				setState(401);
				((ConstructorCallContext)_localctx).ident = object();
				setState(402);
				match(T__8);
				setState(403);
				((ConstructorCallContext)_localctx).arguments = assignmentList();
				setState(404);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(T__13);
				setState(407);
				((ConstructorCallContext)_localctx).type = primitive();
				setState(408);
				match(T__31);
				setState(409);
				((ConstructorCallContext)_localctx).size = expression(0);
				setState(410);
				match(T__32);
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
		enterRule(_localctx, 68, RULE_object);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				primitive();
				setState(415);
				match(T__40);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				primitive();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				match(IDENTIFIER);
				setState(419);
				match(T__40);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
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
		enterRule(_localctx, 70, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
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
		case 17:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u01ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\7\2R\n\2"+
		"\f\2\16\2U\13\2\3\2\6\2X\n\2\r\2\16\2Y\3\2\3\2\3\3\3\3\6\3`\n\3\r\3\16"+
		"\3a\3\3\3\3\7\3f\n\3\f\3\16\3i\13\3\7\3k\n\3\f\3\16\3n\13\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\7\3\7\3\7\5\7\u0081"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00a3\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00aa\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u00b1\n\13\f\13\16\13\u00b4\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\7\22\u00d1\n\22\f\22\16\22\u00d4\13\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00f2\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u010f\n\23\f\23\16\23\u0112\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u011c\n\24\3\25\3\25\3\25\7\25\u0121\n\25\f\25\16"+
		"\25\u0124\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0131\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0141\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\6\34\u0160\n\34\r\34\16\34\u0161\3"+
		"\35\3\35\3\35\7\35\u0167\n\35\f\35\16\35\u016a\13\35\3\35\5\35\u016d\n"+
		"\35\3\36\7\36\u0170\n\36\f\36\16\36\u0173\13\36\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\7\"\u018b\n"+
		"\"\f\"\16\"\u018e\13\"\3\"\5\"\u0191\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u019f\n#\3$\3$\3$\3$\3$\3$\3$\5$\u01a8\n$\3%\3%\3%\2\3$&\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2"+
		"\4\3\2\32\37\3\2,/\u01c3\2M\3\2\2\2\4]\3\2\2\2\6o\3\2\2\2\bs\3\2\2\2\n"+
		"u\3\2\2\2\f\u0080\3\2\2\2\16\u0099\3\2\2\2\20\u009b\3\2\2\2\22\u00a9\3"+
		"\2\2\2\24\u00ab\3\2\2\2\26\u00b8\3\2\2\2\30\u00bd\3\2\2\2\32\u00c0\3\2"+
		"\2\2\34\u00c3\3\2\2\2\36\u00c6\3\2\2\2 \u00c8\3\2\2\2\"\u00ce\3\2\2\2"+
		"$\u00f1\3\2\2\2&\u011b\3\2\2\2(\u011d\3\2\2\2*\u0130\3\2\2\2,\u0140\3"+
		"\2\2\2.\u0142\3\2\2\2\60\u0146\3\2\2\2\62\u014a\3\2\2\2\64\u0156\3\2\2"+
		"\2\66\u015f\3\2\2\28\u016c\3\2\2\2:\u0171\3\2\2\2<\u0174\3\2\2\2>\u0179"+
		"\3\2\2\2@\u017e\3\2\2\2B\u0190\3\2\2\2D\u019e\3\2\2\2F\u01a7\3\2\2\2H"+
		"\u01a9\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2"+
		"\2\2OM\3\2\2\2PR\5\6\4\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2"+
		"\2\2US\3\2\2\2VX\5\f\7\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2"+
		"\2\2[\\\7\2\2\3\\\3\3\2\2\2]_\7\3\2\2^`\5\n\6\2_^\3\2\2\2`a\3\2\2\2a_"+
		"\3\2\2\2ab\3\2\2\2bl\3\2\2\2cg\7\4\2\2df\5\n\6\2ed\3\2\2\2fi\3\2\2\2g"+
		"e\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jc\3\2\2\2kn\3\2\2\2lj\3\2\2\2"+
		"lm\3\2\2\2m\5\3\2\2\2nl\3\2\2\2op\7\5\2\2pq\5\b\5\2qr\7\6\2\2r\7\3\2\2"+
		"\2st\7\7\2\2t\t\3\2\2\2uz\7\62\2\2vw\7\b\2\2wy\7\62\2\2xv\3\2\2\2y|\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{\13\3\2\2\2|z\3\2\2\2}\u0081\5\16\b\2~\u0081"+
		"\5\62\32\2\177\u0081\5\64\33\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\r\3\2\2\2\u0082\u0083\5\22\n\2\u0083\u0084\7\t\2\2\u0084"+
		"\u009a\3\2\2\2\u0085\u0086\5\60\31\2\u0086\u0087\7\t\2\2\u0087\u009a\3"+
		"\2\2\2\u0088\u0089\5.\30\2\u0089\u008a\7\t\2\2\u008a\u009a\3\2\2\2\u008b"+
		"\u008c\5<\37\2\u008c\u008d\7\t\2\2\u008d\u009a\3\2\2\2\u008e\u008f\5>"+
		" \2\u008f\u0090\7\t\2\2\u0090\u009a\3\2\2\2\u0091\u0092\5&\24\2\u0092"+
		"\u0093\7\t\2\2\u0093\u009a\3\2\2\2\u0094\u0095\5*\26\2\u0095\u0096\7\t"+
		"\2\2\u0096\u009a\3\2\2\2\u0097\u009a\5\20\t\2\u0098\u009a\5 \21\2\u0099"+
		"\u0082\3\2\2\2\u0099\u0085\3\2\2\2\u0099\u0088\3\2\2\2\u0099\u008b\3\2"+
		"\2\2\u0099\u008e\3\2\2\2\u0099\u0091\3\2\2\2\u0099\u0094\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\17\3\2\2\2\u009b\u009c\7\n\2"+
		"\2\u009c\u009d\7\13\2\2\u009d\u009e\5$\23\2\u009e\u009f\7\f\2\2\u009f"+
		"\u00a2\5\"\22\2\u00a0\u00a1\7\r\2\2\u00a1\u00a3\5\"\22\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\21\3\2\2\2\u00a4\u00aa\5\24\13\2\u00a5"+
		"\u00aa\5\26\f\2\u00a6\u00aa\5\30\r\2\u00a7\u00aa\5\32\16\2\u00a8\u00aa"+
		"\5\34\17\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\23\3\2\2\2\u00ab\u00ac"+
		"\7\16\2\2\u00ac\u00ad\7\66\2\2\u00ad\u00ae\7\66\2\2\u00ae\u00b2\7\13\2"+
		"\2\u00af\u00b1\5\36\20\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\7\66\2\2\u00b7\25\3\2\2\2\u00b8\u00b9"+
		"\7\17\2\2\u00b9\u00ba\7\5\2\2\u00ba\u00bb\7\66\2\2\u00bb\u00bc\7\6\2\2"+
		"\u00bc\27\3\2\2\2\u00bd\u00be\7\20\2\2\u00be\u00bf\7\66\2\2\u00bf\31\3"+
		"\2\2\2\u00c0\u00c1\7\21\2\2\u00c1\u00c2\5$\23\2\u00c2\33\3\2\2\2\u00c3"+
		"\u00c4\7\22\2\2\u00c4\u00c5\7\66\2\2\u00c5\35\3\2\2\2\u00c6\u00c7\7\66"+
		"\2\2\u00c7\37\3\2\2\2\u00c8\u00c9\7\23\2\2\u00c9\u00ca\7\13\2\2\u00ca"+
		"\u00cb\5$\23\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd\5\"\22\2\u00cd!\3\2\2\2"+
		"\u00ce\u00d2\7\5\2\2\u00cf\u00d1\5\16\b\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7\6\2\2\u00d6#\3\2\2\2\u00d7\u00d8\b\23\1\2"+
		"\u00d8\u00d9\7\62\2\2\u00d9\u00da\7\"\2\2\u00da\u00db\5$\23\2\u00db\u00dc"+
		"\7#\2\2\u00dc\u00f2\3\2\2\2\u00dd\u00de\7\62\2\2\u00de\u00df\7\b\2\2\u00df"+
		"\u00f2\7\62\2\2\u00e0\u00e1\7\62\2\2\u00e1\u00e2\7\b\2\2\u00e2\u00e3\7"+
		"\62\2\2\u00e3\u00e4\7\"\2\2\u00e4\u00e5\5$\23\2\u00e5\u00e6\7#\2\2\u00e6"+
		"\u00f2\3\2\2\2\u00e7\u00f2\7\63\2\2\u00e8\u00f2\7\64\2\2\u00e9\u00f2\7"+
		"\61\2\2\u00ea\u00f2\7\66\2\2\u00eb\u00f2\7\62\2\2\u00ec\u00f2\5D#\2\u00ed"+
		"\u00f2\5<\37\2\u00ee\u00f2\5> \2\u00ef\u00f2\5@!\2\u00f0\u00f2\7$\2\2"+
		"\u00f1\u00d7\3\2\2\2\u00f1\u00dd\3\2\2\2\u00f1\u00e0\3\2\2\2\u00f1\u00e7"+
		"\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1"+
		"\u00eb\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u0110\3\2\2\2\u00f3"+
		"\u00f4\f\30\2\2\u00f4\u00f5\7\24\2\2\u00f5\u010f\5$\23\31\u00f6\u00f7"+
		"\f\27\2\2\u00f7\u00f8\7\25\2\2\u00f8\u010f\5$\23\30\u00f9\u00fa\f\26\2"+
		"\2\u00fa\u00fb\7\26\2\2\u00fb\u010f\5$\23\27\u00fc\u00fd\f\25\2\2\u00fd"+
		"\u00fe\7\27\2\2\u00fe\u010f\5$\23\26\u00ff\u0100\f\24\2\2\u0100\u0101"+
		"\7\30\2\2\u0101\u010f\5$\23\25\u0102\u0103\f\23\2\2\u0103\u0104\7\31\2"+
		"\2\u0104\u010f\5$\23\24\u0105\u0106\f\22\2\2\u0106\u0107\t\2\2\2\u0107"+
		"\u010f\5$\23\23\u0108\u0109\f\21\2\2\u0109\u010a\7 \2\2\u010a\u010f\5"+
		"$\23\22\u010b\u010c\f\20\2\2\u010c\u010d\7!\2\2\u010d\u010f\5$\23\21\u010e"+
		"\u00f3\3\2\2\2\u010e\u00f6\3\2\2\2\u010e\u00f9\3\2\2\2\u010e\u00fc\3\2"+
		"\2\2\u010e\u00ff\3\2\2\2\u010e\u0102\3\2\2\2\u010e\u0105\3\2\2\2\u010e"+
		"\u0108\3\2\2\2\u010e\u010b\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111%\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114"+
		"\5F$\2\u0114\u0115\7\62\2\2\u0115\u011c\3\2\2\2\u0116\u0117\5F$\2\u0117"+
		"\u0118\7\62\2\2\u0118\u0119\7%\2\2\u0119\u011a\5$\23\2\u011a\u011c\3\2"+
		"\2\2\u011b\u0113\3\2\2\2\u011b\u0116\3\2\2\2\u011c\'\3\2\2\2\u011d\u0122"+
		"\5$\23\2\u011e\u011f\7\4\2\2\u011f\u0121\5$\23\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123)\3\2\2\2"+
		"\u0124\u0122\3\2\2\2\u0125\u0126\7\62\2\2\u0126\u0127\7\"\2\2\u0127\u0128"+
		"\5$\23\2\u0128\u0129\7#\2\2\u0129\u012a\7%\2\2\u012a\u012b\5$\23\2\u012b"+
		"\u0131\3\2\2\2\u012c\u012d\7\62\2\2\u012d\u012e\7%\2\2\u012e\u0131\5$"+
		"\23\2\u012f\u0131\5,\27\2\u0130\u0125\3\2\2\2\u0130\u012c\3\2\2\2\u0130"+
		"\u012f\3\2\2\2\u0131+\3\2\2\2\u0132\u0133\7\62\2\2\u0133\u0134\7\b\2\2"+
		"\u0134\u0135\7\62\2\2\u0135\u0136\7%\2\2\u0136\u0141\5$\23\2\u0137\u0138"+
		"\7\62\2\2\u0138\u0139\7\b\2\2\u0139\u013a\7\62\2\2\u013a\u013b\7\"\2\2"+
		"\u013b\u013c\5$\23\2\u013c\u013d\7#\2\2\u013d\u013e\7%\2\2\u013e\u013f"+
		"\5$\23\2\u013f\u0141\3\2\2\2\u0140\u0132\3\2\2\2\u0140\u0137\3\2\2\2\u0141"+
		"-\3\2\2\2\u0142\u0143\7&\2\2\u0143\u0144\5$\23\2\u0144\u0145\7\f\2\2\u0145"+
		"/\3\2\2\2\u0146\u0147\7\'\2\2\u0147\u0148\5$\23\2\u0148\u0149\7\f\2\2"+
		"\u0149\61\3\2\2\2\u014a\u014b\5F$\2\u014b\u014c\7\62\2\2\u014c\u014d\7"+
		"\13\2\2\u014d\u014e\58\35\2\u014e\u014f\7\f\2\2\u014f\u0150\7\5\2\2\u0150"+
		"\u0151\5:\36\2\u0151\u0152\7(\2\2\u0152\u0153\5$\23\2\u0153\u0154\7\t"+
		"\2\2\u0154\u0155\7\6\2\2\u0155\63\3\2\2\2\u0156\u0157\7)\2\2\u0157\u0158"+
		"\7\62\2\2\u0158\u0159\7\5\2\2\u0159\u015a\5\66\34\2\u015a\u015b\7\6\2"+
		"\2\u015b\65\3\2\2\2\u015c\u015d\5&\24\2\u015d\u015e\7\t\2\2\u015e\u0160"+
		"\3\2\2\2\u015f\u015c\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\67\3\2\2\2\u0163\u0168\5&\24\2\u0164\u0165\7\4\2"+
		"\2\u0165\u0167\5&\24\2\u0166\u0164\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016d\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u016d\3\2\2\2\u016c\u0163\3\2\2\2\u016c\u016b\3\2\2\2\u016d9\3\2\2\2"+
		"\u016e\u0170\5\16\b\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172;\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0175\7\60\2\2\u0175\u0176\7\13\2\2\u0176\u0177\5B\"\2\u0177\u0178\7"+
		"\f\2\2\u0178=\3\2\2\2\u0179\u017a\7\62\2\2\u017a\u017b\7\13\2\2\u017b"+
		"\u017c\5B\"\2\u017c\u017d\7\f\2\2\u017d?\3\2\2\2\u017e\u017f\5F$\2\u017f"+
		"\u0180\7*\2\2\u0180\u0181\7\62\2\2\u0181\u0182\7\b\2\2\u0182\u0183\7\62"+
		"\2\2\u0183\u0184\7\13\2\2\u0184\u0185\5B\"\2\u0185\u0186\7\f\2\2\u0186"+
		"A\3\2\2\2\u0187\u018c\5$\23\2\u0188\u0189\7\4\2\2\u0189\u018b\5$\23\2"+
		"\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u0191\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u0187\3\2\2\2\u0190\u018f\3\2\2\2\u0191C\3\2\2\2\u0192\u0193\7\20\2\2"+
		"\u0193\u0194\5F$\2\u0194\u0195\7\13\2\2\u0195\u0196\5(\25\2\u0196\u0197"+
		"\7\f\2\2\u0197\u019f\3\2\2\2\u0198\u0199\7\20\2\2\u0199\u019a\5H%\2\u019a"+
		"\u019b\7\"\2\2\u019b\u019c\5$\23\2\u019c\u019d\7#\2\2\u019d\u019f\3\2"+
		"\2\2\u019e\u0192\3\2\2\2\u019e\u0198\3\2\2\2\u019fE\3\2\2\2\u01a0\u01a1"+
		"\5H%\2\u01a1\u01a2\7+\2\2\u01a2\u01a8\3\2\2\2\u01a3\u01a8\5H%\2\u01a4"+
		"\u01a5\7\62\2\2\u01a5\u01a8\7+\2\2\u01a6\u01a8\7\62\2\2\u01a7\u01a0\3"+
		"\2\2\2\u01a7\u01a3\3\2\2\2\u01a7\u01a4\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"G\3\2\2\2\u01a9\u01aa\t\3\2\2\u01aaI\3\2\2\2\36MSYaglz\u0080\u0099\u00a2"+
		"\u00a9\u00b2\u00d2\u00f1\u010e\u0110\u011b\u0122\u0130\u0140\u0161\u0168"+
		"\u016c\u0171\u018c\u0190\u019e\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}