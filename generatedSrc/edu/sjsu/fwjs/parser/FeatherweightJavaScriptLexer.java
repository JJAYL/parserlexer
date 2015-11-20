// Generated from FeatherweightJavaScript.g4 by ANTLR 4.5.1
 package edu.sjsu.fwjs.parser; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FeatherweightJavaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, NEWLINE=8, BLOCK_COMMENT=9, 
		LINE_COMMENT=10, WS=11, IF=12, ELSE=13, WHILE=14, FUNCTION=15, VAR=16, 
		PRINT=17, INT=18, BOOL=19, NULL=20, MUL=21, DIV=22, ADD=23, SUB=24, MOD=25, 
		GT=26, GE=27, LT=28, LE=29, EQ=30, SEPARATOR=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "ID", "NEWLINE", "BLOCK_COMMENT", 
		"LINE_COMMENT", "WS", "IF", "ELSE", "WHILE", "FUNCTION", "VAR", "PRINT", 
		"INT", "BOOL", "NULL", "MUL", "DIV", "ADD", "SUB", "MOD", "GT", "GE", 
		"LT", "LE", "EQ", "SEPARATOR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "'{'", "'}'", "','", null, null, null, null, 
		null, "'if'", "'else'", "'while'", "'function'", "'var'", "'print'", null, 
		null, "'null'", "'*'", "'/'", "'+'", "'-'", "'%'", "'>'", "'>='", "'<'", 
		"'<='", "'=='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "ID", "NEWLINE", "BLOCK_COMMENT", 
		"LINE_COMMENT", "WS", "IF", "ELSE", "WHILE", "FUNCTION", "VAR", "PRINT", 
		"INT", "BOOL", "NULL", "MUL", "DIV", "ADD", "SUB", "MOD", "GT", "GE", 
		"LT", "LE", "EQ", "SEPARATOR"
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


	public FeatherweightJavaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FeatherweightJavaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00cf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\bP\n\b\f\b\16\b"+
		"S\13\b\3\t\5\tV\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n`\n\n\f\n\16\n"+
		"c\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13n\n\13\f\13\16\13q"+
		"\13\13\3\13\3\13\3\f\6\fv\n\f\r\f\16\fw\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\7\23\u009f\n\23\f\23\16\23\u00a2\13\23\3\23\5\23\u00a5\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b0\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3a"+
		"\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\3"+
		"\2\63;\3\2\62;\u00d6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2"+
		"\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21U\3\2\2\2"+
		"\23[\3\2\2\2\25i\3\2\2\2\27u\3\2\2\2\31{\3\2\2\2\33~\3\2\2\2\35\u0083"+
		"\3\2\2\2\37\u0089\3\2\2\2!\u0092\3\2\2\2#\u0096\3\2\2\2%\u00a4\3\2\2\2"+
		"\'\u00af\3\2\2\2)\u00b1\3\2\2\2+\u00b6\3\2\2\2-\u00b8\3\2\2\2/\u00ba\3"+
		"\2\2\2\61\u00bc\3\2\2\2\63\u00be\3\2\2\2\65\u00c0\3\2\2\2\67\u00c2\3\2"+
		"\2\29\u00c5\3\2\2\2;\u00c7\3\2\2\2=\u00ca\3\2\2\2?\u00cd\3\2\2\2AB\7*"+
		"\2\2B\4\3\2\2\2CD\7+\2\2D\6\3\2\2\2EF\7?\2\2F\b\3\2\2\2GH\7}\2\2H\n\3"+
		"\2\2\2IJ\7\177\2\2J\f\3\2\2\2KL\7.\2\2L\16\3\2\2\2MQ\t\2\2\2NP\t\3\2\2"+
		"ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\20\3\2\2\2SQ\3\2\2\2TV\7\17"+
		"\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\f\2\2XY\3\2\2\2YZ\b\t\2\2Z\22\3"+
		"\2\2\2[\\\7\61\2\2\\]\7,\2\2]a\3\2\2\2^`\13\2\2\2_^\3\2\2\2`c\3\2\2\2"+
		"ab\3\2\2\2a_\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7,\2\2ef\7\61\2\2fg\3\2\2\2"+
		"gh\b\n\2\2h\24\3\2\2\2ij\7\61\2\2jk\7\61\2\2ko\3\2\2\2ln\n\4\2\2ml\3\2"+
		"\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\b\13\2\2s\26"+
		"\3\2\2\2tv\t\5\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2y"+
		"z\b\f\2\2z\30\3\2\2\2{|\7k\2\2|}\7h\2\2}\32\3\2\2\2~\177\7g\2\2\177\u0080"+
		"\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\34\3\2\2\2\u0083\u0084"+
		"\7y\2\2\u0084\u0085\7j\2\2\u0085\u0086\7k\2\2\u0086\u0087\7n\2\2\u0087"+
		"\u0088\7g\2\2\u0088\36\3\2\2\2\u0089\u008a\7h\2\2\u008a\u008b\7w\2\2\u008b"+
		"\u008c\7p\2\2\u008c\u008d\7e\2\2\u008d\u008e\7v\2\2\u008e\u008f\7k\2\2"+
		"\u008f\u0090\7q\2\2\u0090\u0091\7p\2\2\u0091 \3\2\2\2\u0092\u0093\7x\2"+
		"\2\u0093\u0094\7c\2\2\u0094\u0095\7t\2\2\u0095\"\3\2\2\2\u0096\u0097\7"+
		"r\2\2\u0097\u0098\7t\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b"+
		"\7v\2\2\u009b$\3\2\2\2\u009c\u00a0\t\6\2\2\u009d\u009f\t\7\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a5\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\62\2\2\u00a4\u009c\3"+
		"\2\2\2\u00a4\u00a3\3\2\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8"+
		"\7t\2\2\u00a8\u00a9\7w\2\2\u00a9\u00b0\7g\2\2\u00aa\u00ab\7h\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00b0\7g\2\2"+
		"\u00af\u00a6\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7"+
		"p\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7n\2\2\u00b5*"+
		"\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9"+
		".\3\2\2\2\u00ba\u00bb\7-\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd"+
		"\62\3\2\2\2\u00be\u00bf\7\'\2\2\u00bf\64\3\2\2\2\u00c0\u00c1\7@\2\2\u00c1"+
		"\66\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3\u00c4\7?\2\2\u00c48\3\2\2\2\u00c5"+
		"\u00c6\7>\2\2\u00c6:\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8\u00c9\7?\2\2\u00c9"+
		"<\3\2\2\2\u00ca\u00cb\7?\2\2\u00cb\u00cc\7?\2\2\u00cc>\3\2\2\2\u00cd\u00ce"+
		"\7=\2\2\u00ce@\3\2\2\2\13\2QUaow\u00a0\u00a4\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}