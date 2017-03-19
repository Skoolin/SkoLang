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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, SYSTEMFUNC=37, BOOL=38, 
		IDENTIFIER=39, NUMBER=40, WHITESPACE=41, STRING=42, COMMENT=43, LINECOMMENT=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "SYSTEMFUNC", "BOOL", "IDENTIFIER", "NUMBER", 
		"WHITESPACE", "STRING", "COMMENT", "LINECOMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import:'", "','", "'.'", "';'", "'if'", "'('", "')'", "'else'", 
		"'while'", "'{'", "'}'", "'/'", "'*'", "'-'", "'+'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'<>'", "'&&'", "'||'", "'['", "']'", "'='", "'print('", 
		"'out('", "'return'", "'type'", "':'", "'new'", "'[]'", "'int'", "'void'", 
		"'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "SYSTEMFUNC", "BOOL", "IDENTIFIER", "NUMBER", "WHITESPACE", "STRING", 
		"COMMENT", "LINECOMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0133\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u00ee\n&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u00f9\n\'\3(\3(\7(\u00fd\n(\f(\16(\u0100"+
		"\13(\3)\6)\u0103\n)\r)\16)\u0104\3*\6*\u0108\n*\r*\16*\u0109\3*\3*\3+"+
		"\3+\7+\u0110\n+\f+\16+\u0113\13+\3+\3+\3,\3,\3,\3,\3,\7,\u011c\n,\f,\16"+
		",\u011f\13,\3,\3,\3,\3,\3,\3-\3-\3-\3-\7-\u012a\n-\f-\16-\u012d\13-\3"+
		"-\5-\u0130\n-\3-\3-\5\u0111\u011d\u012b\2.\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.\3\2\7\4\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\3\3\f\f"+
		"\u013d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5c\3\2\2\2\7e\3\2\2"+
		"\2\tg\3\2\2\2\13i\3\2\2\2\rl\3\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23u\3\2\2"+
		"\2\25{\3\2\2\2\27}\3\2\2\2\31\177\3\2\2\2\33\u0081\3\2\2\2\35\u0083\3"+
		"\2\2\2\37\u0085\3\2\2\2!\u0087\3\2\2\2#\u0089\3\2\2\2%\u008c\3\2\2\2\'"+
		"\u008e\3\2\2\2)\u0091\3\2\2\2+\u0094\3\2\2\2-\u0097\3\2\2\2/\u009a\3\2"+
		"\2\2\61\u009d\3\2\2\2\63\u009f\3\2\2\2\65\u00a1\3\2\2\2\67\u00a3\3\2\2"+
		"\29\u00aa\3\2\2\2;\u00af\3\2\2\2=\u00b6\3\2\2\2?\u00bb\3\2\2\2A\u00bd"+
		"\3\2\2\2C\u00c1\3\2\2\2E\u00c4\3\2\2\2G\u00c8\3\2\2\2I\u00cd\3\2\2\2K"+
		"\u00ed\3\2\2\2M\u00f8\3\2\2\2O\u00fa\3\2\2\2Q\u0102\3\2\2\2S\u0107\3\2"+
		"\2\2U\u010d\3\2\2\2W\u0116\3\2\2\2Y\u0125\3\2\2\2[\\\7k\2\2\\]\7o\2\2"+
		"]^\7r\2\2^_\7q\2\2_`\7t\2\2`a\7v\2\2ab\7<\2\2b\4\3\2\2\2cd\7.\2\2d\6\3"+
		"\2\2\2ef\7\60\2\2f\b\3\2\2\2gh\7=\2\2h\n\3\2\2\2ij\7k\2\2jk\7h\2\2k\f"+
		"\3\2\2\2lm\7*\2\2m\16\3\2\2\2no\7+\2\2o\20\3\2\2\2pq\7g\2\2qr\7n\2\2r"+
		"s\7u\2\2st\7g\2\2t\22\3\2\2\2uv\7y\2\2vw\7j\2\2wx\7k\2\2xy\7n\2\2yz\7"+
		"g\2\2z\24\3\2\2\2{|\7}\2\2|\26\3\2\2\2}~\7\177\2\2~\30\3\2\2\2\177\u0080"+
		"\7\61\2\2\u0080\32\3\2\2\2\u0081\u0082\7,\2\2\u0082\34\3\2\2\2\u0083\u0084"+
		"\7/\2\2\u0084\36\3\2\2\2\u0085\u0086\7-\2\2\u0086 \3\2\2\2\u0087\u0088"+
		"\7>\2\2\u0088\"\3\2\2\2\u0089\u008a\7>\2\2\u008a\u008b\7?\2\2\u008b$\3"+
		"\2\2\2\u008c\u008d\7@\2\2\u008d&\3\2\2\2\u008e\u008f\7@\2\2\u008f\u0090"+
		"\7?\2\2\u0090(\3\2\2\2\u0091\u0092\7?\2\2\u0092\u0093\7?\2\2\u0093*\3"+
		"\2\2\2\u0094\u0095\7>\2\2\u0095\u0096\7@\2\2\u0096,\3\2\2\2\u0097\u0098"+
		"\7(\2\2\u0098\u0099\7(\2\2\u0099.\3\2\2\2\u009a\u009b\7~\2\2\u009b\u009c"+
		"\7~\2\2\u009c\60\3\2\2\2\u009d\u009e\7]\2\2\u009e\62\3\2\2\2\u009f\u00a0"+
		"\7_\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2\66\3\2\2\2\u00a3\u00a4"+
		"\7r\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7"+
		"\u00a8\7v\2\2\u00a8\u00a9\7*\2\2\u00a98\3\2\2\2\u00aa\u00ab\7q\2\2\u00ab"+
		"\u00ac\7w\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7*\2\2\u00ae:\3\2\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7w\2\2"+
		"\u00b3\u00b4\7t\2\2\u00b4\u00b5\7p\2\2\u00b5<\3\2\2\2\u00b6\u00b7\7v\2"+
		"\2\u00b7\u00b8\7{\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7g\2\2\u00ba>\3\2"+
		"\2\2\u00bb\u00bc\7<\2\2\u00bc@\3\2\2\2\u00bd\u00be\7p\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\u00c0\7y\2\2\u00c0B\3\2\2\2\u00c1\u00c2\7]\2\2\u00c2\u00c3"+
		"\7_\2\2\u00c3D\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7"+
		"\7v\2\2\u00c7F\3\2\2\2\u00c8\u00c9\7x\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb"+
		"\7k\2\2\u00cb\u00cc\7f\2\2\u00ccH\3\2\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf"+
		"\7v\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2"+
		"\u00d3\7i\2\2\u00d3J\3\2\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7q\2\2\u00d6"+
		"\u00d7\7U\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7k\2\2"+
		"\u00da\u00db\7p\2\2\u00db\u00ee\7i\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de"+
		"\7q\2\2\u00de\u00df\7K\2\2\u00df\u00e0\7p\2\2\u00e0\u00ee\7v\2\2\u00e1"+
		"\u00e2\7c\2\2\u00e2\u00e3\7r\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7g\2\2"+
		"\u00e5\u00e6\7p\2\2\u00e6\u00ee\7f\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9"+
		"\7g\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7i\2\2\u00eb\u00ec\7v\2\2\u00ec"+
		"\u00ee\7j\2\2\u00ed\u00d4\3\2\2\2\u00ed\u00dc\3\2\2\2\u00ed\u00e1\3\2"+
		"\2\2\u00ed\u00e7\3\2\2\2\u00eeL\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1"+
		"\7t\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f9\7g\2\2\u00f3\u00f4\7h\2\2\u00f4"+
		"\u00f5\7c\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f9\7g\2\2"+
		"\u00f8\u00ef\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f9N\3\2\2\2\u00fa\u00fe\t"+
		"\2\2\2\u00fb\u00fd\t\3\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffP\3\2\2\2\u0100\u00fe\3\2\2\2"+
		"\u0101\u0103\t\4\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105R\3\2\2\2\u0106\u0108\t\5\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b*\2\2\u010cT\3\2\2\2\u010d\u0111"+
		"\7$\2\2\u010e\u0110\13\2\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0115\7$\2\2\u0115V\3\2\2\2\u0116\u0117\7\61\2\2\u0117\u0118"+
		"\7,\2\2\u0118\u011d\3\2\2\2\u0119\u011c\5W,\2\u011a\u011c\13\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0121\7,\2\2\u0121\u0122\7\61\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b,"+
		"\2\2\u0124X\3\2\2\2\u0125\u0126\7\61\2\2\u0126\u0127\7\61\2\2\u0127\u012b"+
		"\3\2\2\2\u0128\u012a\13\2\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b"+
		"\3\2\2\2\u012e\u0130\t\6\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\b-\2\2\u0132Z\3\2\2\2\r\2\u00ed\u00f8\u00fe\u0104\u0109\u0111\u011b"+
		"\u011d\u012b\u012f\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}