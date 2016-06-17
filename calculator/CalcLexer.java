// Generated from C:\Users\Calton\Desktop\����ԭ��γ����\������\Calc\Calc.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COS=1, SIN=2, TAN=3, ACOS=4, ASIN=5, ATAN=6, LN=7, LOG=8, LPAREN=9, RPAREN=10, 
		PLUS=11, MINUS=12, TIMES=13, DIV=14, POW=15, DIGIT=16, SEMI=17, SET=18, 
		EQ=19, ID=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'cos'", "'sin'", "'tan'", "'acos'", "'asin'", "'atan'", "'ln'", "'log'", 
		"'('", "')'", "'+'", "'-'", "'*'", "'/'", "'^'", "DIGIT", "';'", "'SET'", 
		"'='", "ID", "WS"
	};
	public static final String[] ruleNames = {
		"COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", "LPAREN", "RPAREN", 
		"PLUS", "MINUS", "TIMES", "DIV", "POW", "DIGIT", "SEMI", "SET", "EQ", 
		"ID", "WS"
	};


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\27\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21_\n\21\r\21\16\21`\3\21"+
		"\3\21\6\21e\n\21\r\21\16\21f\5\21i\n\21\5\21k\n\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\6\25v\n\25\r\25\16\25w\3\26\6\26{\n\26\r\26"+
		"\16\26|\3\26\3\26\2\27\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21"+
		"\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1"+
		"%\24\1\'\25\1)\26\1+\27\2\3\2\5\3\2\62;\3\2c|\5\2\13\f\17\17\"\"\u0085"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\61\3\2"+
		"\2\2\7\65\3\2\2\2\t9\3\2\2\2\13>\3\2\2\2\rC\3\2\2\2\17H\3\2\2\2\21K\3"+
		"\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35"+
		"Y\3\2\2\2\37[\3\2\2\2!^\3\2\2\2#l\3\2\2\2%n\3\2\2\2\'r\3\2\2\2)u\3\2\2"+
		"\2+z\3\2\2\2-.\7e\2\2./\7q\2\2/\60\7u\2\2\60\4\3\2\2\2\61\62\7u\2\2\62"+
		"\63\7k\2\2\63\64\7p\2\2\64\6\3\2\2\2\65\66\7v\2\2\66\67\7c\2\2\678\7p"+
		"\2\28\b\3\2\2\29:\7c\2\2:;\7e\2\2;<\7q\2\2<=\7u\2\2=\n\3\2\2\2>?\7c\2"+
		"\2?@\7u\2\2@A\7k\2\2AB\7p\2\2B\f\3\2\2\2CD\7c\2\2DE\7v\2\2EF\7c\2\2FG"+
		"\7p\2\2G\16\3\2\2\2HI\7n\2\2IJ\7p\2\2J\20\3\2\2\2KL\7n\2\2LM\7q\2\2MN"+
		"\7i\2\2N\22\3\2\2\2OP\7*\2\2P\24\3\2\2\2QR\7+\2\2R\26\3\2\2\2ST\7-\2\2"+
		"T\30\3\2\2\2UV\7/\2\2V\32\3\2\2\2WX\7,\2\2X\34\3\2\2\2YZ\7\61\2\2Z\36"+
		"\3\2\2\2[\\\7`\2\2\\ \3\2\2\2]_\t\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2"+
		"`a\3\2\2\2aj\3\2\2\2bh\7\60\2\2ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2"+
		"\2fg\3\2\2\2gi\3\2\2\2hd\3\2\2\2hi\3\2\2\2ik\3\2\2\2jb\3\2\2\2jk\3\2\2"+
		"\2k\"\3\2\2\2lm\7=\2\2m$\3\2\2\2no\7U\2\2op\7G\2\2pq\7V\2\2q&\3\2\2\2"+
		"rs\7?\2\2s(\3\2\2\2tv\t\3\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2"+
		"x*\3\2\2\2y{\t\4\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2"+
		"~\177\b\26\2\2\177,\3\2\2\2\t\2`fhjw|";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}