// Generated from Demo.g4 by ANTLR 4.6
package de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, SYSTEMFUNC=35, IDENTIFIER=36, NUMBER=37, 
		COMMENT=38, LINECOMMENT=39, WHITESPACE=40, STRING=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "SYSTEMFUNC", "IDENTIFIER", "NUMBER", "COMMENT", "LINECOMMENT", 
		"WHITESPACE", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'if'", "'('", "')'", "'else'", "'while'", "'{'", "'}'", 
		"'/'", "'*'", "'-'", "'+'", "'<'", "'<='", "'>'", "'>='", "'=='", "'<>'", 
		"'&&'", "'||'", "'['", "']'", "'.'", "'='", "','", "'print('", "'out('", 
		"'return'", "'type'", "'new'", "'[]'", "'int'", "'void'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "SYSTEMFUNC", 
		"IDENTIFIER", "NUMBER", "COMMENT", "LINECOMMENT", "WHITESPACE", "STRING"
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


	public DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u0116\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\5$\u00de\n$\3%\3%\7%\u00e2\n%\f%\16%\u00e5\13%\3&\6&\u00e8\n&\r&\16"+
		"&\u00e9\3\'\3\'\3\'\3\'\7\'\u00f0\n\'\f\'\16\'\u00f3\13\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\7(\u00fe\n(\f(\16(\u0101\13(\3(\3(\3(\3(\3)\6)\u0108"+
		"\n)\r)\16)\u0109\3)\3)\3*\3*\7*\u0110\n*\f*\16*\u0113\13*\3*\3*\5\u00f1"+
		"\u00ff\u0111\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\6\4\2C\\c|\5\2\62;C\\"+
		"c|\3\2\62;\5\2\13\f\17\17\"\"\u011e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Z\3\2\2\2\t\\"+
		"\3\2\2\2\13^\3\2\2\2\rc\3\2\2\2\17i\3\2\2\2\21k\3\2\2\2\23m\3\2\2\2\25"+
		"o\3\2\2\2\27q\3\2\2\2\31s\3\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37z\3\2\2\2"+
		"!|\3\2\2\2#\177\3\2\2\2%\u0082\3\2\2\2\'\u0085\3\2\2\2)\u0088\3\2\2\2"+
		"+\u008b\3\2\2\2-\u008d\3\2\2\2/\u008f\3\2\2\2\61\u0091\3\2\2\2\63\u0093"+
		"\3\2\2\2\65\u0095\3\2\2\2\67\u009c\3\2\2\29\u00a1\3\2\2\2;\u00a8\3\2\2"+
		"\2=\u00ad\3\2\2\2?\u00b1\3\2\2\2A\u00b4\3\2\2\2C\u00b8\3\2\2\2E\u00bd"+
		"\3\2\2\2G\u00dd\3\2\2\2I\u00df\3\2\2\2K\u00e7\3\2\2\2M\u00eb\3\2\2\2O"+
		"\u00f9\3\2\2\2Q\u0107\3\2\2\2S\u010d\3\2\2\2UV\7=\2\2V\4\3\2\2\2WX\7k"+
		"\2\2XY\7h\2\2Y\6\3\2\2\2Z[\7*\2\2[\b\3\2\2\2\\]\7+\2\2]\n\3\2\2\2^_\7"+
		"g\2\2_`\7n\2\2`a\7u\2\2ab\7g\2\2b\f\3\2\2\2cd\7y\2\2de\7j\2\2ef\7k\2\2"+
		"fg\7n\2\2gh\7g\2\2h\16\3\2\2\2ij\7}\2\2j\20\3\2\2\2kl\7\177\2\2l\22\3"+
		"\2\2\2mn\7\61\2\2n\24\3\2\2\2op\7,\2\2p\26\3\2\2\2qr\7/\2\2r\30\3\2\2"+
		"\2st\7-\2\2t\32\3\2\2\2uv\7>\2\2v\34\3\2\2\2wx\7>\2\2xy\7?\2\2y\36\3\2"+
		"\2\2z{\7@\2\2{ \3\2\2\2|}\7@\2\2}~\7?\2\2~\"\3\2\2\2\177\u0080\7?\2\2"+
		"\u0080\u0081\7?\2\2\u0081$\3\2\2\2\u0082\u0083\7>\2\2\u0083\u0084\7@\2"+
		"\2\u0084&\3\2\2\2\u0085\u0086\7(\2\2\u0086\u0087\7(\2\2\u0087(\3\2\2\2"+
		"\u0088\u0089\7~\2\2\u0089\u008a\7~\2\2\u008a*\3\2\2\2\u008b\u008c\7]\2"+
		"\2\u008c,\3\2\2\2\u008d\u008e\7_\2\2\u008e.\3\2\2\2\u008f\u0090\7\60\2"+
		"\2\u0090\60\3\2\2\2\u0091\u0092\7?\2\2\u0092\62\3\2\2\2\u0093\u0094\7"+
		".\2\2\u0094\64\3\2\2\2\u0095\u0096\7r\2\2\u0096\u0097\7t\2\2\u0097\u0098"+
		"\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a\u009b\7*\2\2\u009b"+
		"\66\3\2\2\2\u009c\u009d\7q\2\2\u009d\u009e\7w\2\2\u009e\u009f\7v\2\2\u009f"+
		"\u00a0\7*\2\2\u00a08\3\2\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7p\2\2"+
		"\u00a7:\3\2\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7{\2\2\u00aa\u00ab\7r\2"+
		"\2\u00ab\u00ac\7g\2\2\u00ac<\3\2\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7"+
		"g\2\2\u00af\u00b0\7y\2\2\u00b0>\3\2\2\2\u00b1\u00b2\7]\2\2\u00b2\u00b3"+
		"\7_\2\2\u00b3@\3\2\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7"+
		"\7v\2\2\u00b7B\3\2\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7f\2\2\u00bcD\3\2\2\2\u00bd\u00be\7u\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2"+
		"\u00c3\7i\2\2\u00c3F\3\2\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7q\2\2\u00c6"+
		"\u00c7\7U\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7k\2\2"+
		"\u00ca\u00cb\7p\2\2\u00cb\u00de\7i\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7K\2\2\u00cf\u00d0\7p\2\2\u00d0\u00de\7v\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5\u00d6\7p\2\2\u00d6\u00de\7f\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9"+
		"\7g\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7i\2\2\u00db\u00dc\7v\2\2\u00dc"+
		"\u00de\7j\2\2\u00dd\u00c4\3\2\2\2\u00dd\u00cc\3\2\2\2\u00dd\u00d1\3\2"+
		"\2\2\u00dd\u00d7\3\2\2\2\u00deH\3\2\2\2\u00df\u00e3\t\2\2\2\u00e0\u00e2"+
		"\t\3\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4J\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\t\4\2\2"+
		"\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00eaL\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00ed\7,\2\2\u00ed"+
		"\u00f1\3\2\2\2\u00ee\u00f0\13\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f5\7,\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\b\'\2\2\u00f8N\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb"+
		"\7\61\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe\13\2\2\2\u00fd\u00fc\3\2\2\2"+
		"\u00fe\u0101\3\2\2\2\u00ff\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\f\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\b(\2\2\u0105P\3\2\2\2\u0106\u0108\t\5\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010c\b)\2\2\u010cR\3\2\2\2\u010d\u0111\7$\2\2\u010e\u0110"+
		"\13\2\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u0112\3\2\2\2"+
		"\u0111\u010f\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115"+
		"\7$\2\2\u0115T\3\2\2\2\n\2\u00dd\u00e3\u00e9\u00f1\u00ff\u0109\u0111\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}