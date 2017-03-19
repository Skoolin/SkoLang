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
		T__38=39, SYSTEMFUNC=40, BOOL=41, IDENTIFIER=42, NUMBER=43, FLOAT=44, 
		WHITESPACE=45, STRING=46, COMMENT=47, LINECOMMENT=48;
	public static final int
		RULE_program = 0, RULE_importList = 1, RULE_path = 2, RULE_programPart = 3, 
		RULE_statement = 4, RULE_branch = 5, RULE_loop = 6, RULE_block = 7, RULE_expression = 8, 
		RULE_varDeclaration = 9, RULE_assignmentList = 10, RULE_assignment = 11, 
		RULE_typeFieldAssignment = 12, RULE_println = 13, RULE_print = 14, RULE_functionDefinition = 15, 
		RULE_typeDeclaration = 16, RULE_typeParameterDeclaration = 17, RULE_parameterDeclaration = 18, 
		RULE_statementList = 19, RULE_systemCall = 20, RULE_functionCall = 21, 
		RULE_importFunctionCall = 22, RULE_expressionList = 23, RULE_constructorCall = 24, 
		RULE_object = 25, RULE_primitive = 26;
	public static final String[] ruleNames = {
		"program", "importList", "path", "programPart", "statement", "branch", 
		"loop", "block", "expression", "varDeclaration", "assignmentList", "assignment", 
		"typeFieldAssignment", "println", "print", "functionDefinition", "typeDeclaration", 
		"typeParameterDeclaration", "parameterDeclaration", "statementList", "systemCall", 
		"functionCall", "importFunctionCall", "expressionList", "constructorCall", 
		"object", "primitive"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import:'", "','", "'.'", "';'", "'if'", "'('", "')'", "'else'", 
		"'while'", "'{'", "'}'", "'/'", "'*'", "'-'", "'+'", "'<<'", "'>>'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'<>'", "'&&'", "'||'", "'['", "']'", "'='", 
		"'print('", "'out('", "'return'", "'type'", "':'", "'new'", "'[]'", "'int'", 
		"'float'", "'void'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "SYSTEMFUNC", "BOOL", "IDENTIFIER", "NUMBER", 
		"FLOAT", "WHITESPACE", "STRING", "COMMENT", "LINECOMMENT"
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(54);
				((ProgramContext)_localctx).importList = importList();
				((ProgramContext)_localctx).imports.add(((ProgramContext)_localctx).importList);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				programPart();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << SYSTEMFUNC) | (1L << IDENTIFIER))) != 0) );
			setState(65);
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
			setState(67);
			match(T__0);
			setState(69); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(68);
					((ImportListContext)_localctx).path = path();
					((ImportListContext)_localctx).importedFiles.add(((ImportListContext)_localctx).path);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(73);
				match(T__1);
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(74);
						((ImportListContext)_localctx).path = path();
						((ImportListContext)_localctx).importedFiles.add(((ImportListContext)_localctx).path);
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				}
				setState(84);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(85);
				match(T__2);
				}
			}

			setState(88);
			match(IDENTIFIER);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					match(T__2);
					setState(90);
					match(IDENTIFIER);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new MainStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				statement();
				}
				break;
			case 2:
				_localctx = new ProgPartFunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				functionDefinition();
				}
				break;
			case 3:
				_localctx = new ClassDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				print();
				setState(102);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				println();
				setState(105);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				systemCall();
				setState(108);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				functionCall();
				setState(111);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				varDeclaration();
				setState(114);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				assignment();
				setState(117);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				branch();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(120);
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
			setState(123);
			match(T__4);
			setState(124);
			match(T__5);
			setState(125);
			((BranchContext)_localctx).condition = expression(0);
			setState(126);
			match(T__6);
			setState(127);
			((BranchContext)_localctx).onTrue = block();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(128);
				match(T__7);
				setState(129);
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
		enterRule(_localctx, 12, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__8);
			setState(133);
			match(T__5);
			setState(134);
			((LoopContext)_localctx).condition = expression(0);
			setState(135);
			match(T__6);
			setState(136);
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__9);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__28) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << SYSTEMFUNC) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(139);
				statement();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(T__10);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(148);
				((ArrayElementContext)_localctx).varName = match(IDENTIFIER);
				setState(149);
				match(T__25);
				setState(150);
				((ArrayElementContext)_localctx).index = expression(0);
				setState(151);
				match(T__26);
				}
				break;
			case 2:
				{
				_localctx = new TypeElementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				((TypeElementContext)_localctx).typeName = match(IDENTIFIER);
				setState(154);
				match(T__2);
				setState(155);
				((TypeElementContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 3:
				{
				_localctx = new TypeArrayFieldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				((TypeArrayFieldContext)_localctx).typeName = match(IDENTIFIER);
				setState(157);
				match(T__2);
				setState(158);
				((TypeArrayFieldContext)_localctx).varName = match(IDENTIFIER);
				setState(159);
				match(T__25);
				setState(160);
				((TypeArrayFieldContext)_localctx).index = expression(0);
				setState(161);
				match(T__26);
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				((NumberContext)_localctx).number = match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				((FloatContext)_localctx).number = match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				((BooleanContext)_localctx).bool = match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				((StringContext)_localctx).txt = match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				((VariableContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 9:
				{
				_localctx = new ConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				constructorCall();
				}
				break;
			case 10:
				{
				_localctx = new SystemFunctionsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				systemCall();
				}
				break;
			case 11:
				{
				_localctx = new FuncCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				functionCall();
				}
				break;
			case 12:
				{
				_localctx = new ImportFuncExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				importFunctionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						((DivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(175);
						match(T__11);
						setState(176);
						((DivContext)_localctx).right = expression(22);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						((MultContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(178);
						match(T__12);
						setState(179);
						((MultContext)_localctx).right = expression(21);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(181);
						match(T__13);
						setState(182);
						((MinusContext)_localctx).right = expression(20);
						}
						break;
					case 4:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(184);
						match(T__14);
						setState(185);
						((PlusContext)_localctx).right = expression(19);
						}
						break;
					case 5:
						{
						_localctx = new LeftShiftContext(new ExpressionContext(_parentctx, _parentState));
						((LeftShiftContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(187);
						match(T__15);
						setState(188);
						((LeftShiftContext)_localctx).right = expression(18);
						}
						break;
					case 6:
						{
						_localctx = new RightShiftContext(new ExpressionContext(_parentctx, _parentState));
						((RightShiftContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(190);
						match(T__16);
						setState(191);
						((RightShiftContext)_localctx).right = expression(17);
						}
						break;
					case 7:
						{
						_localctx = new RelationalContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(193);
						((RelationalContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
							((RelationalContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						((RelationalContext)_localctx).right = expression(16);
						}
						break;
					case 8:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(196);
						match(T__23);
						setState(197);
						((AndContext)_localctx).right = expression(15);
						}
						break;
					case 9:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(199);
						match(T__24);
						setState(200);
						((OrContext)_localctx).right = expression(14);
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 18, RULE_varDeclaration);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				((VarDeclarationContext)_localctx).type = object();
				setState(207);
				((VarDeclarationContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				((VarDeclarationContext)_localctx).type = object();
				setState(210);
				((VarDeclarationContext)_localctx).varName = match(IDENTIFIER);
				setState(211);
				match(T__27);
				setState(212);
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
		enterRule(_localctx, 20, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			((AssignmentListContext)_localctx).expression = expression(0);
			((AssignmentListContext)_localctx).assignments.add(((AssignmentListContext)_localctx).expression);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(217);
				match(T__1);
				setState(218);
				((AssignmentListContext)_localctx).expression = expression(0);
				((AssignmentListContext)_localctx).assignments.add(((AssignmentListContext)_localctx).expression);
				}
				}
				setState(223);
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
		enterRule(_localctx, 22, RULE_assignment);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				((AssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(225);
				match(T__25);
				setState(226);
				((AssignmentContext)_localctx).index = expression(0);
				setState(227);
				match(T__26);
				setState(228);
				match(T__27);
				setState(229);
				((AssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				((AssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(232);
				match(T__27);
				setState(233);
				((AssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
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
		enterRule(_localctx, 24, RULE_typeFieldAssignment);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				((TypeFieldAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(238);
				match(T__2);
				setState(239);
				((TypeFieldAssignmentContext)_localctx).typeVarName = match(IDENTIFIER);
				setState(240);
				match(T__27);
				setState(241);
				((TypeFieldAssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				((TypeFieldAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(243);
				match(T__2);
				setState(244);
				((TypeFieldAssignmentContext)_localctx).typeVarName = match(IDENTIFIER);
				setState(245);
				match(T__25);
				setState(246);
				((TypeFieldAssignmentContext)_localctx).index = expression(0);
				setState(247);
				match(T__26);
				setState(248);
				match(T__27);
				setState(249);
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
		enterRule(_localctx, 26, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__28);
			setState(254);
			((PrintlnContext)_localctx).argument = expression(0);
			setState(255);
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
		enterRule(_localctx, 28, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__29);
			setState(258);
			((PrintContext)_localctx).argument = expression(0);
			setState(259);
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
		enterRule(_localctx, 30, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			((FunctionDefinitionContext)_localctx).type = object();
			setState(262);
			((FunctionDefinitionContext)_localctx).funcName = match(IDENTIFIER);
			setState(263);
			match(T__5);
			setState(264);
			((FunctionDefinitionContext)_localctx).params = parameterDeclaration();
			setState(265);
			match(T__6);
			setState(266);
			match(T__9);
			setState(267);
			((FunctionDefinitionContext)_localctx).statements = statementList();
			setState(268);
			match(T__30);
			setState(269);
			((FunctionDefinitionContext)_localctx).returnValue = expression(0);
			setState(270);
			match(T__3);
			setState(271);
			match(T__10);
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
		enterRule(_localctx, 32, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__31);
			setState(274);
			((TypeDeclarationContext)_localctx).typeName = match(IDENTIFIER);
			setState(275);
			match(T__9);
			setState(276);
			((TypeDeclarationContext)_localctx).declarations = typeParameterDeclaration();
			setState(277);
			match(T__10);
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
		enterRule(_localctx, 34, RULE_typeParameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				((TypeParameterDeclarationContext)_localctx).varDeclaration = varDeclaration();
				((TypeParameterDeclarationContext)_localctx).declarations.add(((TypeParameterDeclarationContext)_localctx).varDeclaration);
				setState(280);
				match(T__3);
				}
				}
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << IDENTIFIER))) != 0) );
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
		enterRule(_localctx, 36, RULE_parameterDeclaration);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				((ParameterDeclarationContext)_localctx).varDeclaration = varDeclaration();
				((ParameterDeclarationContext)_localctx).declarations.add(((ParameterDeclarationContext)_localctx).varDeclaration);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(287);
					match(T__1);
					setState(288);
					((ParameterDeclarationContext)_localctx).varDeclaration = varDeclaration();
					((ParameterDeclarationContext)_localctx).declarations.add(((ParameterDeclarationContext)_localctx).varDeclaration);
					}
					}
					setState(293);
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
		enterRule(_localctx, 38, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__28) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << SYSTEMFUNC) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(297);
				statement();
				}
				}
				setState(302);
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
		enterRule(_localctx, 40, RULE_systemCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			((SystemCallContext)_localctx).funcName = match(SYSTEMFUNC);
			setState(304);
			match(T__5);
			setState(305);
			((SystemCallContext)_localctx).arguments = expressionList();
			setState(306);
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
		enterRule(_localctx, 42, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			((FunctionCallContext)_localctx).funcName = match(IDENTIFIER);
			setState(309);
			match(T__5);
			setState(310);
			((FunctionCallContext)_localctx).arguments = expressionList();
			setState(311);
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
		enterRule(_localctx, 44, RULE_importFunctionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((ImportFunctionCallContext)_localctx).ident = object();
			setState(314);
			match(T__32);
			setState(315);
			((ImportFunctionCallContext)_localctx).importDir = match(IDENTIFIER);
			setState(316);
			match(T__2);
			setState(317);
			((ImportFunctionCallContext)_localctx).funcName = match(IDENTIFIER);
			setState(318);
			match(T__5);
			setState(319);
			((ImportFunctionCallContext)_localctx).arguments = expressionList();
			setState(320);
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
		enterRule(_localctx, 46, RULE_expressionList);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case SYSTEMFUNC:
			case BOOL:
			case IDENTIFIER:
			case NUMBER:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				((ExpressionListContext)_localctx).expression = expression(0);
				((ExpressionListContext)_localctx).expressions.add(((ExpressionListContext)_localctx).expression);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(323);
					match(T__1);
					setState(324);
					((ExpressionListContext)_localctx).expression = expression(0);
					((ExpressionListContext)_localctx).expressions.add(((ExpressionListContext)_localctx).expression);
					}
					}
					setState(329);
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
		enterRule(_localctx, 48, RULE_constructorCall);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(T__33);
				setState(334);
				((ConstructorCallContext)_localctx).ident = object();
				setState(335);
				match(T__5);
				setState(336);
				((ConstructorCallContext)_localctx).arguments = assignmentList();
				setState(337);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(T__33);
				setState(340);
				((ConstructorCallContext)_localctx).type = primitive();
				setState(341);
				match(T__25);
				setState(342);
				((ConstructorCallContext)_localctx).size = expression(0);
				setState(343);
				match(T__26);
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
		enterRule(_localctx, 50, RULE_object);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				primitive();
				setState(348);
				match(T__34);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				primitive();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(IDENTIFIER);
				setState(352);
				match(T__34);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
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
		enterRule(_localctx, 52, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u0169\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\6\2@\n"+
		"\2\r\2\16\2A\3\2\3\2\3\3\3\3\6\3H\n\3\r\3\16\3I\3\3\3\3\7\3N\n\3\f\3\16"+
		"\3Q\13\3\7\3S\n\3\f\3\16\3V\13\3\3\4\5\4Y\n\4\3\4\3\4\3\4\7\4^\n\4\f\4"+
		"\16\4a\13\4\3\5\3\5\3\5\5\5f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6|\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u0085\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\t\u008f\n\t"+
		"\f\t\16\t\u0092\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00af\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00cc\n\n\f\n\16\n\u00cf"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d9\n\13\3\f\3\f"+
		"\3\f\7\f\u00de\n\f\f\f\16\f\u00e1\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00ee\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00fe\n\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\6\23\u011d\n\23\r\23\16"+
		"\23\u011e\3\24\3\24\3\24\7\24\u0124\n\24\f\24\16\24\u0127\13\24\3\24\5"+
		"\24\u012a\n\24\3\25\7\25\u012d\n\25\f\25\16\25\u0130\13\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\7\31\u0148\n\31\f\31\16\31\u014b\13\31\3"+
		"\31\5\31\u014e\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u015c\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0165"+
		"\n\33\3\34\3\34\3\34\2\3\22\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\66\2\4\3\2\24\31\3\2&)\u0182\2;\3\2\2\2\4E\3\2\2\2"+
		"\6X\3\2\2\2\be\3\2\2\2\n{\3\2\2\2\f}\3\2\2\2\16\u0086\3\2\2\2\20\u008c"+
		"\3\2\2\2\22\u00ae\3\2\2\2\24\u00d8\3\2\2\2\26\u00da\3\2\2\2\30\u00ed\3"+
		"\2\2\2\32\u00fd\3\2\2\2\34\u00ff\3\2\2\2\36\u0103\3\2\2\2 \u0107\3\2\2"+
		"\2\"\u0113\3\2\2\2$\u011c\3\2\2\2&\u0129\3\2\2\2(\u012e\3\2\2\2*\u0131"+
		"\3\2\2\2,\u0136\3\2\2\2.\u013b\3\2\2\2\60\u014d\3\2\2\2\62\u015b\3\2\2"+
		"\2\64\u0164\3\2\2\2\66\u0166\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3"+
		"\2\2\2;<\3\2\2\2<?\3\2\2\2=;\3\2\2\2>@\5\b\5\2?>\3\2\2\2@A\3\2\2\2A?\3"+
		"\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\2\2\3D\3\3\2\2\2EG\7\3\2\2FH\5\6\4\2GF"+
		"\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JT\3\2\2\2KO\7\4\2\2LN\5\6\4\2M"+
		"L\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RK\3\2\2\2"+
		"SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\5\3\2\2\2VT\3\2\2\2WY\7\5\2\2XW\3\2\2"+
		"\2XY\3\2\2\2YZ\3\2\2\2Z_\7,\2\2[\\\7\5\2\2\\^\7,\2\2][\3\2\2\2^a\3\2\2"+
		"\2_]\3\2\2\2_`\3\2\2\2`\7\3\2\2\2a_\3\2\2\2bf\5\n\6\2cf\5 \21\2df\5\""+
		"\22\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\t\3\2\2\2gh\5\36\20\2hi\7\6\2\2i"+
		"|\3\2\2\2jk\5\34\17\2kl\7\6\2\2l|\3\2\2\2mn\5*\26\2no\7\6\2\2o|\3\2\2"+
		"\2pq\5,\27\2qr\7\6\2\2r|\3\2\2\2st\5\24\13\2tu\7\6\2\2u|\3\2\2\2vw\5\30"+
		"\r\2wx\7\6\2\2x|\3\2\2\2y|\5\f\7\2z|\5\16\b\2{g\3\2\2\2{j\3\2\2\2{m\3"+
		"\2\2\2{p\3\2\2\2{s\3\2\2\2{v\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\13\3\2\2\2}"+
		"~\7\7\2\2~\177\7\b\2\2\177\u0080\5\22\n\2\u0080\u0081\7\t\2\2\u0081\u0084"+
		"\5\20\t\2\u0082\u0083\7\n\2\2\u0083\u0085\5\20\t\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\r\3\2\2\2\u0086\u0087\7\13\2\2\u0087\u0088"+
		"\7\b\2\2\u0088\u0089\5\22\n\2\u0089\u008a\7\t\2\2\u008a\u008b\5\20\t\2"+
		"\u008b\17\3\2\2\2\u008c\u0090\7\f\2\2\u008d\u008f\5\n\6\2\u008e\u008d"+
		"\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\r\2\2\u0094\21\3\2\2"+
		"\2\u0095\u0096\b\n\1\2\u0096\u0097\7,\2\2\u0097\u0098\7\34\2\2\u0098\u0099"+
		"\5\22\n\2\u0099\u009a\7\35\2\2\u009a\u00af\3\2\2\2\u009b\u009c\7,\2\2"+
		"\u009c\u009d\7\5\2\2\u009d\u00af\7,\2\2\u009e\u009f\7,\2\2\u009f\u00a0"+
		"\7\5\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a2\7\34\2\2\u00a2\u00a3\5\22\n\2"+
		"\u00a3\u00a4\7\35\2\2\u00a4\u00af\3\2\2\2\u00a5\u00af\7-\2\2\u00a6\u00af"+
		"\7.\2\2\u00a7\u00af\7+\2\2\u00a8\u00af\7\60\2\2\u00a9\u00af\7,\2\2\u00aa"+
		"\u00af\5\62\32\2\u00ab\u00af\5*\26\2\u00ac\u00af\5,\27\2\u00ad\u00af\5"+
		".\30\2\u00ae\u0095\3\2\2\2\u00ae\u009b\3\2\2\2\u00ae\u009e\3\2\2\2\u00ae"+
		"\u00a5\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00a8\3\2"+
		"\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00cd\3\2\2\2\u00b0\u00b1\f\27"+
		"\2\2\u00b1\u00b2\7\16\2\2\u00b2\u00cc\5\22\n\30\u00b3\u00b4\f\26\2\2\u00b4"+
		"\u00b5\7\17\2\2\u00b5\u00cc\5\22\n\27\u00b6\u00b7\f\25\2\2\u00b7\u00b8"+
		"\7\20\2\2\u00b8\u00cc\5\22\n\26\u00b9\u00ba\f\24\2\2\u00ba\u00bb\7\21"+
		"\2\2\u00bb\u00cc\5\22\n\25\u00bc\u00bd\f\23\2\2\u00bd\u00be\7\22\2\2\u00be"+
		"\u00cc\5\22\n\24\u00bf\u00c0\f\22\2\2\u00c0\u00c1\7\23\2\2\u00c1\u00cc"+
		"\5\22\n\23\u00c2\u00c3\f\21\2\2\u00c3\u00c4\t\2\2\2\u00c4\u00cc\5\22\n"+
		"\22\u00c5\u00c6\f\20\2\2\u00c6\u00c7\7\32\2\2\u00c7\u00cc\5\22\n\21\u00c8"+
		"\u00c9\f\17\2\2\u00c9\u00ca\7\33\2\2\u00ca\u00cc\5\22\n\20\u00cb\u00b0"+
		"\3\2\2\2\u00cb\u00b3\3\2\2\2\u00cb\u00b6\3\2\2\2\u00cb\u00b9\3\2\2\2\u00cb"+
		"\u00bc\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c5\3\2"+
		"\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\23\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\5\64\33"+
		"\2\u00d1\u00d2\7,\2\2\u00d2\u00d9\3\2\2\2\u00d3\u00d4\5\64\33\2\u00d4"+
		"\u00d5\7,\2\2\u00d5\u00d6\7\36\2\2\u00d6\u00d7\5\22\n\2\u00d7\u00d9\3"+
		"\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d9\25\3\2\2\2\u00da"+
		"\u00df\5\22\n\2\u00db\u00dc\7\4\2\2\u00dc\u00de\5\22\n\2\u00dd\u00db\3"+
		"\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\27\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7,\2\2\u00e3\u00e4\7\34\2"+
		"\2\u00e4\u00e5\5\22\n\2\u00e5\u00e6\7\35\2\2\u00e6\u00e7\7\36\2\2\u00e7"+
		"\u00e8\5\22\n\2\u00e8\u00ee\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea\u00eb\7\36"+
		"\2\2\u00eb\u00ee\5\22\n\2\u00ec\u00ee\5\32\16\2\u00ed\u00e2\3\2\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\31\3\2\2\2\u00ef\u00f0\7,\2\2"+
		"\u00f0\u00f1\7\5\2\2\u00f1\u00f2\7,\2\2\u00f2\u00f3\7\36\2\2\u00f3\u00fe"+
		"\5\22\n\2\u00f4\u00f5\7,\2\2\u00f5\u00f6\7\5\2\2\u00f6\u00f7\7,\2\2\u00f7"+
		"\u00f8\7\34\2\2\u00f8\u00f9\5\22\n\2\u00f9\u00fa\7\35\2\2\u00fa\u00fb"+
		"\7\36\2\2\u00fb\u00fc\5\22\n\2\u00fc\u00fe\3\2\2\2\u00fd\u00ef\3\2\2\2"+
		"\u00fd\u00f4\3\2\2\2\u00fe\33\3\2\2\2\u00ff\u0100\7\37\2\2\u0100\u0101"+
		"\5\22\n\2\u0101\u0102\7\t\2\2\u0102\35\3\2\2\2\u0103\u0104\7 \2\2\u0104"+
		"\u0105\5\22\n\2\u0105\u0106\7\t\2\2\u0106\37\3\2\2\2\u0107\u0108\5\64"+
		"\33\2\u0108\u0109\7,\2\2\u0109\u010a\7\b\2\2\u010a\u010b\5&\24\2\u010b"+
		"\u010c\7\t\2\2\u010c\u010d\7\f\2\2\u010d\u010e\5(\25\2\u010e\u010f\7!"+
		"\2\2\u010f\u0110\5\22\n\2\u0110\u0111\7\6\2\2\u0111\u0112\7\r\2\2\u0112"+
		"!\3\2\2\2\u0113\u0114\7\"\2\2\u0114\u0115\7,\2\2\u0115\u0116\7\f\2\2\u0116"+
		"\u0117\5$\23\2\u0117\u0118\7\r\2\2\u0118#\3\2\2\2\u0119\u011a\5\24\13"+
		"\2\u011a\u011b\7\6\2\2\u011b\u011d\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f%\3\2\2\2\u0120"+
		"\u0125\5\24\13\2\u0121\u0122\7\4\2\2\u0122\u0124\5\24\13\2\u0123\u0121"+
		"\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u012a\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0120\3\2"+
		"\2\2\u0129\u0128\3\2\2\2\u012a\'\3\2\2\2\u012b\u012d\5\n\6\2\u012c\u012b"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		")\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7*\2\2\u0132\u0133\7\b\2\2\u0133"+
		"\u0134\5\60\31\2\u0134\u0135\7\t\2\2\u0135+\3\2\2\2\u0136\u0137\7,\2\2"+
		"\u0137\u0138\7\b\2\2\u0138\u0139\5\60\31\2\u0139\u013a\7\t\2\2\u013a-"+
		"\3\2\2\2\u013b\u013c\5\64\33\2\u013c\u013d\7#\2\2\u013d\u013e\7,\2\2\u013e"+
		"\u013f\7\5\2\2\u013f\u0140\7,\2\2\u0140\u0141\7\b\2\2\u0141\u0142\5\60"+
		"\31\2\u0142\u0143\7\t\2\2\u0143/\3\2\2\2\u0144\u0149\5\22\n\2\u0145\u0146"+
		"\7\4\2\2\u0146\u0148\5\22\n\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2"+
		"\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014e\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u0144\3\2\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\61\3\2\2\2\u014f\u0150\7$\2\2\u0150\u0151\5\64\33\2\u0151\u0152\7\b\2"+
		"\2\u0152\u0153\5\26\f\2\u0153\u0154\7\t\2\2\u0154\u015c\3\2\2\2\u0155"+
		"\u0156\7$\2\2\u0156\u0157\5\66\34\2\u0157\u0158\7\34\2\2\u0158\u0159\5"+
		"\22\n\2\u0159\u015a\7\35\2\2\u015a\u015c\3\2\2\2\u015b\u014f\3\2\2\2\u015b"+
		"\u0155\3\2\2\2\u015c\63\3\2\2\2\u015d\u015e\5\66\34\2\u015e\u015f\7%\2"+
		"\2\u015f\u0165\3\2\2\2\u0160\u0165\5\66\34\2\u0161\u0162\7,\2\2\u0162"+
		"\u0165\7%\2\2\u0163\u0165\7,\2\2\u0164\u015d\3\2\2\2\u0164\u0160\3\2\2"+
		"\2\u0164\u0161\3\2\2\2\u0164\u0163\3\2\2\2\u0165\65\3\2\2\2\u0166\u0167"+
		"\t\3\2\2\u0167\67\3\2\2\2\34;AIOTX_e{\u0084\u0090\u00ae\u00cb\u00cd\u00d8"+
		"\u00df\u00ed\u00fd\u011e\u0125\u0129\u012e\u0149\u014d\u015b\u0164";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}