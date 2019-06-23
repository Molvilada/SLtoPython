// Generated from C:/Users/laura/Documentos/Laura/Universidad/2019-1/Lenguajes/Laboratorios/Lab_3/SLtoPython/grammar\LenguajeSL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ASIGNACION=2, BRAC_DER=3, BRAC_IZQ=4, COMA=5, COMILLAS=6, DIFERENTE=7, 
		DIV=8, DOS_PUNTOS=9, IGUAL=10, LLAVE_DER=11, LLAVE_IZQ=12, MAYOR=13, MAYOR_IGUAL=14, 
		MENOR=15, MENOR_IGUAL=16, MOD=17, MULT=18, OR=19, PAR_DER=20, PAR_IZQ=21, 
		POW=22, PUNTO=23, PUNTO_COMA=24, SUMA=25, CASO=26, CADENA=27, CONST=28, 
		DESDE=29, EVAL=30, FALSE=31, FIN=32, HASTA=33, INICIO=34, LOGICO=35, MIENTRAS=36, 
		MATRIZ=37, NOT=38, NUMERICO=39, SI=40, SINO=41, SINO_SI=42, PASO=43, PROGRAMA=44, 
		REF=45, REGISTRO=46, REPETIR=47, RETORNA=48, SUBRUTINA=49, TIPOS=50, TRUE=51, 
		VAR=52, VECTOR=53, ID=54, NUMERO=55, CADENA_L=56, WS=57, COMMENT=58, BLOCK_COMMENT=59;
	public static final int
		RULE_programa = 0, RULE_nombre_programa = 1, RULE_subrutina = 2, RULE_lista_argumentos = 3, 
		RULE_tipo_var_argumentos = 4, RULE_retorna_s = 5, RULE_listas = 6, RULE_tipos = 7, 
		RULE_constantes = 8, RULE_variables = 9, RULE_programa_principal = 10, 
		RULE_tipo = 11, RULE_constante = 12, RULE_tipo_var = 13, RULE_tipo_id = 14, 
		RULE_registro = 15, RULE_vector = 16, RULE_matriz = 17, RULE_sentencia = 18, 
		RULE_si = 19, RULE_mientras = 20, RULE_repetir = 21, RULE_eval = 22, RULE_desde = 23, 
		RULE_funcion = 24, RULE_asignacion = 25, RULE_sino_si = 26, RULE_sino = 27, 
		RULE_caso = 28, RULE_condicion = 29, RULE_logico = 30, RULE_e = 31, RULE_paso = 32, 
		RULE_parametros = 33, RULE_expresion = 34, RULE_lista_llaves = 35, RULE_llave = 36, 
		RULE_retorna = 37, RULE_id_complejo = 38, RULE_llamada_funcion = 39, RULE_a_comas = 40, 
		RULE_id_puntos = 41, RULE_id_comas = 42, RULE_lista_tamano = 43, RULE_tamano = 44, 
		RULE_a = 45, RULE_p = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "nombre_programa", "subrutina", "lista_argumentos", "tipo_var_argumentos", 
			"retorna_s", "listas", "tipos", "constantes", "variables", "programa_principal", 
			"tipo", "constante", "tipo_var", "tipo_id", "registro", "vector", "matriz", 
			"sentencia", "si", "mientras", "repetir", "eval", "desde", "funcion", 
			"asignacion", "sino_si", "sino", "caso", "condicion", "logico", "e", 
			"paso", "parametros", "expresion", "lista_llaves", "llave", "retorna", 
			"id_complejo", "llamada_funcion", "a_comas", "id_puntos", "id_comas", 
			"lista_tamano", "tamano", "a", "p"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "']'", "'['", "','", null, "'<>'", "'/'", "':'", "'=='", 
			"'}'", "'{'", "'>'", "'>='", "'<'", "'<='", "'%'", "'*'", null, "')'", 
			"'('", "'^'", "'.'", "';'", null, "'caso'", "'cadena'", "'const'", "'desde'", 
			"'eval'", null, "'fin'", "'hasta'", "'inicio'", "'logico'", "'mientras'", 
			"'matriz'", "'not'", "'numerico'", "'si'", "'sino'", "'sino si'", "'paso'", 
			"'programa'", "'ref'", "'registro'", "'repetir'", "'retorna'", "'subrutina'", 
			"'tipos'", null, "'var'", "'vector'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "ASIGNACION", "BRAC_DER", "BRAC_IZQ", "COMA", "COMILLAS", 
			"DIFERENTE", "DIV", "DOS_PUNTOS", "IGUAL", "LLAVE_DER", "LLAVE_IZQ", 
			"MAYOR", "MAYOR_IGUAL", "MENOR", "MENOR_IGUAL", "MOD", "MULT", "OR", 
			"PAR_DER", "PAR_IZQ", "POW", "PUNTO", "PUNTO_COMA", "SUMA", "CASO", "CADENA", 
			"CONST", "DESDE", "EVAL", "FALSE", "FIN", "HASTA", "INICIO", "LOGICO", 
			"MIENTRAS", "MATRIZ", "NOT", "NUMERICO", "SI", "SINO", "SINO_SI", "PASO", 
			"PROGRAMA", "REF", "REGISTRO", "REPETIR", "RETORNA", "SUBRUTINA", "TIPOS", 
			"TRUE", "VAR", "VECTOR", "ID", "NUMERO", "CADENA_L", "WS", "COMMENT", 
			"BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "LenguajeSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public Programa_principalContext programa_principal() {
			return getRuleContext(Programa_principalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LenguajeSLParser.EOF, 0); }
		public Nombre_programaContext nombre_programa() {
			return getRuleContext(Nombre_programaContext.class,0);
		}
		public List<ListasContext> listas() {
			return getRuleContexts(ListasContext.class);
		}
		public ListasContext listas(int i) {
			return getRuleContext(ListasContext.class,i);
		}
		public List<SubrutinaContext> subrutina() {
			return getRuleContexts(SubrutinaContext.class);
		}
		public SubrutinaContext subrutina(int i) {
			return getRuleContext(SubrutinaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAMA) {
				{
				setState(94);
				nombre_programa();
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << TIPOS) | (1L << VAR))) != 0)) {
				{
				{
				setState(97);
				listas();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			programa_principal();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUBRUTINA) {
				{
				{
				setState(104);
				subrutina();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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

	public static class Nombre_programaContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(LenguajeSLParser.PROGRAMA, 0); }
		public TerminalNode ID() { return getToken(LenguajeSLParser.ID, 0); }
		public Nombre_programaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterNombre_programa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitNombre_programa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitNombre_programa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nombre_programaContext nombre_programa() throws RecognitionException {
		Nombre_programaContext _localctx = new Nombre_programaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nombre_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PROGRAMA);
			setState(113);
			match(ID);
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

	public static class SubrutinaContext extends ParserRuleContext {
		public TerminalNode SUBRUTINA() { return getToken(LenguajeSLParser.SUBRUTINA, 0); }
		public TerminalNode ID() { return getToken(LenguajeSLParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(LenguajeSLParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(LenguajeSLParser.PAR_DER, 0); }
		public Programa_principalContext programa_principal() {
			return getRuleContext(Programa_principalContext.class,0);
		}
		public Lista_argumentosContext lista_argumentos() {
			return getRuleContext(Lista_argumentosContext.class,0);
		}
		public Retorna_sContext retorna_s() {
			return getRuleContext(Retorna_sContext.class,0);
		}
		public List<ListasContext> listas() {
			return getRuleContexts(ListasContext.class);
		}
		public ListasContext listas(int i) {
			return getRuleContext(ListasContext.class,i);
		}
		public SubrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrutina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterSubrutina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitSubrutina(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitSubrutina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrutinaContext subrutina() throws RecognitionException {
		SubrutinaContext _localctx = new SubrutinaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subrutina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(SUBRUTINA);
			setState(116);
			match(ID);
			setState(117);
			match(PAR_IZQ);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF || _la==ID) {
				{
				setState(118);
				lista_argumentos();
				}
			}

			setState(121);
			match(PAR_DER);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETORNA) {
				{
				setState(122);
				retorna_s();
				}
			}

			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << TIPOS) | (1L << VAR))) != 0)) {
				{
				{
				setState(125);
				listas();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			programa_principal();
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

	public static class Lista_argumentosContext extends ParserRuleContext {
		public Tipo_var_argumentosContext tipo_var_argumentos() {
			return getRuleContext(Tipo_var_argumentosContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(LenguajeSLParser.PUNTO_COMA, 0); }
		public Lista_argumentosContext lista_argumentos() {
			return getRuleContext(Lista_argumentosContext.class,0);
		}
		public Lista_argumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterLista_argumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitLista_argumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitLista_argumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_argumentosContext lista_argumentos() throws RecognitionException {
		Lista_argumentosContext _localctx = new Lista_argumentosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lista_argumentos);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				tipo_var_argumentos();
				setState(134);
				match(PUNTO_COMA);
				setState(135);
				lista_argumentos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				tipo_var_argumentos();
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

	public static class Tipo_var_argumentosContext extends ParserRuleContext {
		public Id_comasContext id_comas() {
			return getRuleContext(Id_comasContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(LenguajeSLParser.DOS_PUNTOS, 0); }
		public Tipo_idContext tipo_id() {
			return getRuleContext(Tipo_idContext.class,0);
		}
		public TerminalNode REF() { return getToken(LenguajeSLParser.REF, 0); }
		public Tipo_var_argumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_var_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterTipo_var_argumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitTipo_var_argumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitTipo_var_argumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_var_argumentosContext tipo_var_argumentos() throws RecognitionException {
		Tipo_var_argumentosContext _localctx = new Tipo_var_argumentosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_var_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(140);
				match(REF);
				}
			}

			setState(143);
			id_comas();
			setState(144);
			match(DOS_PUNTOS);
			setState(145);
			tipo_id();
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

	public static class Retorna_sContext extends ParserRuleContext {
		public TerminalNode RETORNA() { return getToken(LenguajeSLParser.RETORNA, 0); }
		public Tipo_idContext tipo_id() {
			return getRuleContext(Tipo_idContext.class,0);
		}
		public Retorna_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorna_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterRetorna_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitRetorna_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitRetorna_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Retorna_sContext retorna_s() throws RecognitionException {
		Retorna_sContext _localctx = new Retorna_sContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_retorna_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(RETORNA);
			setState(148);
			tipo_id();
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

	public static class ListasContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public ListasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterListas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitListas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitListas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListasContext listas() throws RecognitionException {
		ListasContext _localctx = new ListasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listas);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				tipos();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				constantes();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				variables();
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

	public static class TiposContext extends ParserRuleContext {
		public TerminalNode TIPOS() { return getToken(LenguajeSLParser.TIPOS, 0); }
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(LenguajeSLParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(LenguajeSLParser.PUNTO_COMA, i);
		}
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(TIPOS);
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				tipo();
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA) {
					{
					setState(157);
					match(PUNTO_COMA);
					}
				}

				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class ConstantesContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(LenguajeSLParser.CONST, 0); }
		public List<ConstanteContext> constante() {
			return getRuleContexts(ConstanteContext.class);
		}
		public ConstanteContext constante(int i) {
			return getRuleContext(ConstanteContext.class,i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(LenguajeSLParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(LenguajeSLParser.PUNTO_COMA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(CONST);
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				constante();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA) {
					{
					setState(166);
					match(PUNTO_COMA);
					}
				}

				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LenguajeSLParser.VAR, 0); }
		public List<Tipo_varContext> tipo_var() {
			return getRuleContexts(Tipo_varContext.class);
		}
		public Tipo_varContext tipo_var(int i) {
			return getRuleContext(Tipo_varContext.class,i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(LenguajeSLParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(LenguajeSLParser.PUNTO_COMA, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(VAR);
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174);
				tipo_var();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA) {
					{
					setState(175);
					match(PUNTO_COMA);
					}
				}

				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class Programa_principalContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(LenguajeSLParser.INICIO, 0); }
		public TerminalNode FIN() { return getToken(LenguajeSLParser.FIN, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(LenguajeSLParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(LenguajeSLParser.PUNTO_COMA, i);
		}
		public Programa_principalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterPrograma_principal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitPrograma_principal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitPrograma_principal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Programa_principalContext programa_principal() throws RecognitionException {
		Programa_principalContext _localctx = new Programa_principalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_programa_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(INICIO);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESDE) | (1L << EVAL) | (1L << MIENTRAS) | (1L << SI) | (1L << REPETIR) | (1L << RETORNA) | (1L << ID))) != 0)) {
				{
				{
				setState(183);
				sentencia(0);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNTO_COMA) {
					{
					setState(184);
					match(PUNTO_COMA);
					}
				}

				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(FIN);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeSLParser.ID, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(LenguajeSLParser.DOS_PUNTOS, 0); }
		public Tipo_idContext tipo_id() {
			return getRuleContext(Tipo_idContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			setState(195);
			match(DOS_PUNTOS);
			setState(196);
			tipo_id();
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

	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeSLParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(LenguajeSLParser.ASIGNACION, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ID);
			setState(199);
			match(ASIGNACION);
			setState(200);
			a(0);
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

	public static class Tipo_varContext extends ParserRuleContext {
		public Id_comasContext id_comas() {
			return getRuleContext(Id_comasContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(LenguajeSLParser.DOS_PUNTOS, 0); }
		public Tipo_idContext tipo_id() {
			return getRuleContext(Tipo_idContext.class,0);
		}
		public Tipo_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterTipo_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitTipo_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitTipo_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_varContext tipo_var() throws RecognitionException {
		Tipo_varContext _localctx = new Tipo_varContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			id_comas();
			setState(203);
			match(DOS_PUNTOS);
			setState(204);
			tipo_id();
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

	public static class Tipo_idContext extends ParserRuleContext {
		public TerminalNode NUMERICO() { return getToken(LenguajeSLParser.NUMERICO, 0); }
		public TerminalNode CADENA() { return getToken(LenguajeSLParser.CADENA, 0); }
		public TerminalNode LOGICO() { return getToken(LenguajeSLParser.LOGICO, 0); }
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public MatrizContext matriz() {
			return getRuleContext(MatrizContext.class,0);
		}
		public TerminalNode ID() { return getToken(LenguajeSLParser.ID, 0); }
		public Tipo_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterTipo_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitTipo_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitTipo_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_idContext tipo_id() throws RecognitionException {
		Tipo_idContext _localctx = new Tipo_idContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_id);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(NUMERICO);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(CADENA);
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(LOGICO);
				}
				break;
			case REGISTRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				registro();
				}
				break;
			case VECTOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				vector();
				}
				break;
			case MATRIZ:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				matriz();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				match(ID);
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

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(LenguajeSLParser.REGISTRO, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(LenguajeSLParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(LenguajeSLParser.LLAVE_DER, 0); }
		public List<Tipo_varContext> tipo_var() {
			return getRuleContexts(Tipo_varContext.class);
		}
		public Tipo_varContext tipo_var(int i) {
			return getRuleContext(Tipo_varContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(REGISTRO);
			setState(216);
			match(LLAVE_IZQ);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				tipo_var();
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(222);
			match(LLAVE_DER);
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

	public static class VectorContext extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(LenguajeSLParser.VECTOR, 0); }
		public TerminalNode BRAC_IZQ() { return getToken(LenguajeSLParser.BRAC_IZQ, 0); }
		public TamanoContext tamano() {
			return getRuleContext(TamanoContext.class,0);
		}
		public TerminalNode BRAC_DER() { return getToken(LenguajeSLParser.BRAC_DER, 0); }
		public Tipo_idContext tipo_id() {
			return getRuleContext(Tipo_idContext.class,0);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(VECTOR);
			setState(225);
			match(BRAC_IZQ);
			setState(226);
			tamano();
			setState(227);
			match(BRAC_DER);
			setState(228);
			tipo_id();
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

	public static class MatrizContext extends ParserRuleContext {
		public TerminalNode MATRIZ() { return getToken(LenguajeSLParser.MATRIZ, 0); }
		public TerminalNode BRAC_IZQ() { return getToken(LenguajeSLParser.BRAC_IZQ, 0); }
		public Lista_tamanoContext lista_tamano() {
			return getRuleContext(Lista_tamanoContext.class,0);
		}
		public TerminalNode BRAC_DER() { return getToken(LenguajeSLParser.BRAC_DER, 0); }
		public Tipo_idContext tipo_id() {
			return getRuleContext(Tipo_idContext.class,0);
		}
		public MatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matriz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterMatriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitMatriz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrizContext matriz() throws RecognitionException {
		MatrizContext _localctx = new MatrizContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_matriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(MATRIZ);
			setState(231);
			match(BRAC_IZQ);
			setState(232);
			lista_tamano();
			setState(233);
			match(BRAC_DER);
			setState(234);
			tipo_id();
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

	public static class SentenciaContext extends ParserRuleContext {
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public EvalContext eval() {
			return getRuleContext(EvalContext.class,0);
		}
		public DesdeContext desde() {
			return getRuleContext(DesdeContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public RetornaContext retorna() {
			return getRuleContext(RetornaContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(LenguajeSLParser.PUNTO_COMA, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		return sentencia(0);
	}

	private SentenciaContext sentencia(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SentenciaContext _localctx = new SentenciaContext(_ctx, _parentState);
		SentenciaContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_sentencia, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(237);
				si();
				}
				break;
			case 2:
				{
				setState(238);
				mientras();
				}
				break;
			case 3:
				{
				setState(239);
				repetir();
				}
				break;
			case 4:
				{
				setState(240);
				eval();
				}
				break;
			case 5:
				{
				setState(241);
				desde();
				}
				break;
			case 6:
				{
				setState(242);
				funcion();
				}
				break;
			case 7:
				{
				setState(243);
				retorna();
				}
				break;
			case 8:
				{
				setState(244);
				asignacion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SentenciaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sentencia);
					setState(247);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(248);
					match(PUNTO_COMA);
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(LenguajeSLParser.SI, 0); }
		public TerminalNode PAR_IZQ() { return getToken(LenguajeSLParser.PAR_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(LenguajeSLParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(LenguajeSLParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(LenguajeSLParser.LLAVE_DER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<Sino_siContext> sino_si() {
			return getRuleContexts(Sino_siContext.class);
		}
		public Sino_siContext sino_si(int i) {
			return getRuleContext(Sino_siContext.class,i);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(SI);
			setState(255);
			match(PAR_IZQ);
			setState(256);
			condicion(0);
			setState(257);
			match(PAR_DER);
			setState(258);
			match(LLAVE_IZQ);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESDE) | (1L << EVAL) | (1L << MIENTRAS) | (1L << SI) | (1L << REPETIR) | (1L << RETORNA) | (1L << ID))) != 0)) {
				{
				{
				setState(259);
				sentencia(0);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINO_SI) {
				{
				{
				setState(265);
				sino_si();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(271);
				sino();
				}
			}

			setState(274);
			match(LLAVE_DER);
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(LenguajeSLParser.MIENTRAS, 0); }
		public TerminalNode PAR_IZQ() { return getToken(LenguajeSLParser.PAR_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(LenguajeSLParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(LenguajeSLParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(LenguajeSLParser.LLAVE_DER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(MIENTRAS);
			setState(277);
			match(PAR_IZQ);
			setState(278);
			condicion(0);
			setState(279);
			match(PAR_DER);
			setState(280);
			match(LLAVE_IZQ);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESDE) | (1L << EVAL) | (1L << MIENTRAS) | (1L << SI) | (1L << REPETIR) | (1L << RETORNA) | (1L << ID))) != 0)) {
				{
				{
				setState(281);
				sentencia(0);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(LLAVE_DER);
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

	public static class RepetirContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(LenguajeSLParser.REPETIR, 0); }
		public TerminalNode HASTA() { return getToken(LenguajeSLParser.HASTA, 0); }
		public TerminalNode PAR_IZQ() { return getToken(LenguajeSLParser.PAR_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(LenguajeSLParser.PAR_DER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitRepetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitRepetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(REPETIR);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESDE) | (1L << EVAL) | (1L << MIENTRAS) | (1L << SI) | (1L << REPETIR) | (1L << RETORNA) | (1L << ID))) != 0)) {
				{
				{
				setState(290);
				sentencia(0);
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(HASTA);
			setState(297);
			match(PAR_IZQ);
			setState(298);
			condicion(0);
			setState(299);
			match(PAR_DER);
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

	public static class EvalContext extends ParserRuleContext {
		public TerminalNode EVAL() { return getToken(LenguajeSLParser.EVAL, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(LenguajeSLParser.LLAVE_IZQ, 0); }
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(LenguajeSLParser.LLAVE_DER, 0); }
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(EVAL);
			setState(302);
			match(LLAVE_IZQ);
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303);
				caso();
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASO );
			setState(308);
			sino();
			setState(309);
			match(LLAVE_DER);
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

	public static class DesdeContext extends ParserRuleContext {
		public TerminalNode DESDE() { return getToken(LenguajeSLParser.DESDE, 0); }
		public TerminalNode ID() { return getToken(LenguajeSLParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(LenguajeSLParser.ASIGNACION, 0); }
		public List<AContext> a() {
			return getRuleContexts(AContext.class);
		}
		public AContext a(int i) {
			return getRuleContext(AContext.class,i);
		}
		public TerminalNode HASTA() { return getToken(LenguajeSLParser.HASTA, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(LenguajeSLParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(LenguajeSLParser.LLAVE_DER, 0); }
		public PasoContext paso() {
			return getRuleContext(PasoContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public DesdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterDesde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitDesde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitDesde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesdeContext desde() throws RecognitionException {
		DesdeContext _localctx = new DesdeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_desde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(DESDE);
			setState(312);
			match(ID);
			setState(313);
			match(ASIGNACION);
			setState(314);
			a(0);
			setState(315);
			match(HASTA);
			setState(316);
			a(0);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASO) {
				{
				setState(317);
				paso();
				}
			}

			setState(320);
			match(LLAVE_IZQ);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESDE) | (1L << EVAL) | (1L << MIENTRAS) | (1L << SI) | (1L << REPETIR) | (1L << RETORNA) | (1L << ID))) != 0)) {
				{
				{
				setState(321);
				sentencia(0);
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(LLAVE_DER);
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeSLParser.ID, 0); }
		public TerminalNode PAR_IZQ() { return getToken(LenguajeSLParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(LenguajeSLParser.PAR_DER, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(ID);
			setState(330);
			match(PAR_IZQ);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLAVE_IZQ) | (1L << PAR_IZQ) | (1L << SUMA) | (1L << ID) | (1L << NUMERO) | (1L << CADENA_L))) != 0)) {
				{
				setState(331);
				parametros();
				}
			}

			setState(334);
			match(PAR_DER);
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

	public static class AsignacionContext extends ParserRuleContext {
		public Id_complejoContext id_complejo() {
			return getRuleContext(Id_complejoContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(LenguajeSLParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			id_complejo();
			setState(337);
			match(ASIGNACION);
			setState(338);
			expresion();
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

	public static class Sino_siContext extends ParserRuleContext {
		public TerminalNode SINO_SI() { return getToken(LenguajeSLParser.SINO_SI, 0); }
		public TerminalNode PAR_IZQ() { return getToken(LenguajeSLParser.PAR_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(LenguajeSLParser.PAR_DER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Sino_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterSino_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitSino_si(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitSino_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sino_siContext sino_si() throws RecognitionException {
		Sino_siContext _localctx = new Sino_siContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sino_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(SINO_SI);
			setState(341);
			match(PAR_IZQ);
			setState(342);
			condicion(0);
			setState(343);
			match(PAR_DER);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESDE) | (1L << EVAL) | (1L << MIENTRAS) | (1L << SI) | (1L << REPETIR) | (1L << RETORNA) | (1L << ID))) != 0)) {
				{
				{
				setState(344);
				sentencia(0);
				}
				}
				setState(349);
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

	public static class SinoContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(LenguajeSLParser.SINO, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(SINO);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESDE) | (1L << EVAL) | (1L << MIENTRAS) | (1L << SI) | (1L << REPETIR) | (1L << RETORNA) | (1L << ID))) != 0)) {
				{
				{
				setState(351);
				sentencia(0);
				}
				}
				setState(356);
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

	public static class CasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(LenguajeSLParser.CASO, 0); }
		public TerminalNode PAR_IZQ() { return getToken(LenguajeSLParser.PAR_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(LenguajeSLParser.PAR_DER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(CASO);
			setState(358);
			match(PAR_IZQ);
			setState(359);
			condicion(0);
			setState(360);
			match(PAR_DER);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESDE) | (1L << EVAL) | (1L << MIENTRAS) | (1L << SI) | (1L << REPETIR) | (1L << RETORNA) | (1L << ID))) != 0)) {
				{
				{
				setState(361);
				sentencia(0);
				}
				}
				setState(366);
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(LenguajeSLParser.NOT, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public TerminalNode AND() { return getToken(LenguajeSLParser.AND, 0); }
		public TerminalNode OR() { return getToken(LenguajeSLParser.OR, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_condicion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(368);
				match(NOT);
				setState(369);
				condicion(2);
				}
				break;
			case PAR_IZQ:
			case SUMA:
			case FALSE:
			case TRUE:
			case ID:
			case NUMERO:
			case CADENA_L:
				{
				setState(370);
				logico();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(379);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new CondicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(373);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(374);
						match(AND);
						setState(375);
						logico();
						}
						break;
					case 2:
						{
						_localctx = new CondicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(376);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(377);
						match(OR);
						setState(378);
						logico();
						}
						break;
					}
					} 
				}
				setState(383);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicoContext extends ParserRuleContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public TerminalNode MENOR() { return getToken(LenguajeSLParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(LenguajeSLParser.MAYOR, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajeSLParser.IGUAL, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(LenguajeSLParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(LenguajeSLParser.MENOR_IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(LenguajeSLParser.DIFERENTE, 0); }
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_logico);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				e();
				setState(385);
				match(MENOR);
				setState(386);
				e();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				e();
				setState(389);
				match(MAYOR);
				setState(390);
				e();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				e();
				setState(393);
				match(IGUAL);
				setState(394);
				e();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				e();
				setState(397);
				match(MAYOR_IGUAL);
				setState(398);
				e();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(400);
				e();
				setState(401);
				match(MENOR_IGUAL);
				setState(402);
				e();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(404);
				e();
				setState(405);
				match(DIFERENTE);
				setState(406);
				e();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(408);
				e();
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

	public static class EContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(LenguajeSLParser.PAR_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(LenguajeSLParser.PAR_DER, 0); }
		public TerminalNode TRUE() { return getToken(LenguajeSLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LenguajeSLParser.FALSE, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_e);
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				a(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(PAR_IZQ);
				setState(413);
				condicion(0);
				setState(414);
				match(PAR_DER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				match(FALSE);
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

	public static class PasoContext extends ParserRuleContext {
		public TerminalNode PASO() { return getToken(LenguajeSLParser.PASO, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterPaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitPaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitPaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_paso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(PASO);
			setState(421);
			a(0);
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

	public static class ParametrosContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(LenguajeSLParser.COMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parametros);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				expresion();
				setState(424);
				match(COMA);
				setState(425);
				parametros();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				expresion();
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

	public static class ExpresionContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public Id_complejoContext id_complejo() {
			return getRuleContext(Id_complejoContext.class,0);
		}
		public TerminalNode LLAVE_IZQ() { return getToken(LenguajeSLParser.LLAVE_IZQ, 0); }
		public Lista_llavesContext lista_llaves() {
			return getRuleContext(Lista_llavesContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(LenguajeSLParser.LLAVE_DER, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expresion);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				a(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				id_complejo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(LLAVE_IZQ);
				setState(433);
				lista_llaves();
				setState(434);
				match(LLAVE_DER);
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

	public static class Lista_llavesContext extends ParserRuleContext {
		public LlaveContext llave() {
			return getRuleContext(LlaveContext.class,0);
		}
		public TerminalNode COMA() { return getToken(LenguajeSLParser.COMA, 0); }
		public Lista_llavesContext lista_llaves() {
			return getRuleContext(Lista_llavesContext.class,0);
		}
		public Lista_llavesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_llaves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterLista_llaves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitLista_llaves(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitLista_llaves(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_llavesContext lista_llaves() throws RecognitionException {
		Lista_llavesContext _localctx = new Lista_llavesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lista_llaves);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				llave();
				setState(439);
				match(COMA);
				setState(440);
				lista_llaves();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				llave();
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

	public static class LlaveContext extends ParserRuleContext {
		public TerminalNode LLAVE_IZQ() { return getToken(LenguajeSLParser.LLAVE_IZQ, 0); }
		public LlaveContext llave() {
			return getRuleContext(LlaveContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(LenguajeSLParser.LLAVE_DER, 0); }
		public A_comasContext a_comas() {
			return getRuleContext(A_comasContext.class,0);
		}
		public LlaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterLlave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitLlave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitLlave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlaveContext llave() throws RecognitionException {
		LlaveContext _localctx = new LlaveContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_llave);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLAVE_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(LLAVE_IZQ);
				setState(446);
				llave();
				setState(447);
				match(LLAVE_DER);
				}
				break;
			case PAR_IZQ:
			case SUMA:
			case ID:
			case NUMERO:
			case CADENA_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				a_comas();
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

	public static class RetornaContext extends ParserRuleContext {
		public TerminalNode RETORNA() { return getToken(LenguajeSLParser.RETORNA, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(LenguajeSLParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(LenguajeSLParser.PAR_DER, 0); }
		public RetornaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterRetorna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitRetorna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitRetorna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornaContext retorna() throws RecognitionException {
		RetornaContext _localctx = new RetornaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_retorna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(RETORNA);
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(453);
				match(PAR_IZQ);
				}
				break;
			}
			setState(456);
			a(0);
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(457);
				match(PAR_DER);
				}
				break;
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

	public static class Id_complejoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeSLParser.ID, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(LenguajeSLParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(LenguajeSLParser.PAR_DER, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Id_puntosContext id_puntos() {
			return getRuleContext(Id_puntosContext.class,0);
		}
		public Id_complejoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_complejo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterId_complejo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitId_complejo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitId_complejo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_complejoContext id_complejo() throws RecognitionException {
		Id_complejoContext _localctx = new Id_complejoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_id_complejo);
		int _la;
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				llamada_funcion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				match(ID);
				setState(463);
				match(PAR_IZQ);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLAVE_IZQ) | (1L << PAR_IZQ) | (1L << SUMA) | (1L << ID) | (1L << NUMERO) | (1L << CADENA_L))) != 0)) {
					{
					setState(464);
					parametros();
					}
				}

				setState(467);
				match(PAR_DER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				id_puntos();
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

	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeSLParser.ID, 0); }
		public TerminalNode BRAC_IZQ() { return getToken(LenguajeSLParser.BRAC_IZQ, 0); }
		public A_comasContext a_comas() {
			return getRuleContext(A_comasContext.class,0);
		}
		public TerminalNode BRAC_DER() { return getToken(LenguajeSLParser.BRAC_DER, 0); }
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitLlamada_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitLlamada_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_llamada_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(ID);
			setState(472);
			match(BRAC_IZQ);
			setState(473);
			a_comas();
			setState(474);
			match(BRAC_DER);
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

	public static class A_comasContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode COMA() { return getToken(LenguajeSLParser.COMA, 0); }
		public A_comasContext a_comas() {
			return getRuleContext(A_comasContext.class,0);
		}
		public A_comasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_comas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterA_comas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitA_comas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitA_comas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_comasContext a_comas() throws RecognitionException {
		A_comasContext _localctx = new A_comasContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_a_comas);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				a(0);
				setState(477);
				match(COMA);
				setState(478);
				a_comas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				a(0);
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

	public static class Id_puntosContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeSLParser.ID, 0); }
		public TerminalNode PUNTO() { return getToken(LenguajeSLParser.PUNTO, 0); }
		public Id_puntosContext id_puntos() {
			return getRuleContext(Id_puntosContext.class,0);
		}
		public TerminalNode BRAC_IZQ() { return getToken(LenguajeSLParser.BRAC_IZQ, 0); }
		public Id_comasContext id_comas() {
			return getRuleContext(Id_comasContext.class,0);
		}
		public TerminalNode BRAC_DER() { return getToken(LenguajeSLParser.BRAC_DER, 0); }
		public Id_puntosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_puntos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterId_puntos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitId_puntos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitId_puntos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_puntosContext id_puntos() throws RecognitionException {
		Id_puntosContext _localctx = new Id_puntosContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_id_puntos);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(ID);
				setState(484);
				match(PUNTO);
				setState(485);
				id_puntos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(ID);
				setState(487);
				match(BRAC_IZQ);
				setState(488);
				id_comas();
				setState(489);
				match(BRAC_DER);
				setState(490);
				match(PUNTO);
				setState(491);
				id_puntos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(ID);
				setState(494);
				match(BRAC_IZQ);
				setState(495);
				id_comas();
				setState(496);
				match(BRAC_DER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				match(ID);
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

	public static class Id_comasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeSLParser.ID, 0); }
		public TerminalNode COMA() { return getToken(LenguajeSLParser.COMA, 0); }
		public Id_comasContext id_comas() {
			return getRuleContext(Id_comasContext.class,0);
		}
		public Id_comasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_comas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterId_comas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitId_comas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitId_comas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_comasContext id_comas() throws RecognitionException {
		Id_comasContext _localctx = new Id_comasContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_id_comas);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(ID);
				setState(502);
				match(COMA);
				setState(503);
				id_comas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(ID);
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

	public static class Lista_tamanoContext extends ParserRuleContext {
		public TamanoContext tamano() {
			return getRuleContext(TamanoContext.class,0);
		}
		public TerminalNode COMA() { return getToken(LenguajeSLParser.COMA, 0); }
		public Lista_tamanoContext lista_tamano() {
			return getRuleContext(Lista_tamanoContext.class,0);
		}
		public Lista_tamanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_tamano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterLista_tamano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitLista_tamano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitLista_tamano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_tamanoContext lista_tamano() throws RecognitionException {
		Lista_tamanoContext _localctx = new Lista_tamanoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lista_tamano);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				tamano();
				setState(508);
				match(COMA);
				setState(509);
				lista_tamano();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				tamano();
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

	public static class TamanoContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode MULT() { return getToken(LenguajeSLParser.MULT, 0); }
		public TamanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tamano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterTamano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitTamano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitTamano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TamanoContext tamano() throws RecognitionException {
		TamanoContext _localctx = new TamanoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tamano);
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_IZQ:
			case SUMA:
			case ID:
			case NUMERO:
			case CADENA_L:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				a(0);
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(MULT);
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

	public static class AContext extends ParserRuleContext {
		public TerminalNode PAR_IZQ() { return getToken(LenguajeSLParser.PAR_IZQ, 0); }
		public List<AContext> a() {
			return getRuleContexts(AContext.class);
		}
		public AContext a(int i) {
			return getRuleContext(AContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(LenguajeSLParser.PAR_DER, 0); }
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public List<TerminalNode> SUMA() { return getTokens(LenguajeSLParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(LenguajeSLParser.SUMA, i);
		}
		public TerminalNode MULT() { return getToken(LenguajeSLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LenguajeSLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LenguajeSLParser.MOD, 0); }
		public TerminalNode POW() { return getToken(LenguajeSLParser.POW, 0); }
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		return a(0);
	}

	private AContext a(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AContext _localctx = new AContext(_ctx, _parentState);
		AContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_a, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_IZQ:
				{
				setState(519);
				match(PAR_IZQ);
				setState(520);
				a(0);
				setState(521);
				match(PAR_DER);
				}
				break;
			case SUMA:
			case ID:
			case NUMERO:
			case CADENA_L:
				{
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUMA) {
					{
					{
					setState(523);
					match(SUMA);
					}
					}
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(529);
				p();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(541);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new AContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_a);
						setState(532);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(533);
						match(SUMA);
						setState(534);
						a(6);
						}
						break;
					case 2:
						{
						_localctx = new AContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_a);
						setState(535);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(536);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << MULT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(537);
						a(5);
						}
						break;
					case 3:
						{
						_localctx = new AContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_a);
						setState(538);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(539);
						match(POW);
						setState(540);
						a(4);
						}
						break;
					}
					} 
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class PContext extends ParserRuleContext {
		public Id_complejoContext id_complejo() {
			return getRuleContext(Id_complejoContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(LenguajeSLParser.NUMERO, 0); }
		public TerminalNode CADENA_L() { return getToken(LenguajeSLParser.CADENA_L, 0); }
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeSLListener ) ((LenguajeSLListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeSLVisitor ) return ((LenguajeSLVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_p);
		try {
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				id_complejo();
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(NUMERO);
				}
				break;
			case CADENA_L:
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
				match(CADENA_L);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return sentencia_sempred((SentenciaContext)_localctx, predIndex);
		case 29:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		case 45:
			return a_sempred((AContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sentencia_sempred(SentenciaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean a_sempred(AContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u022a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\5\2b\n\2\3\2\7\2e\n\2\f\2\16\2h\13"+
		"\2\3\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\5\4z\n\4\3\4\3\4\5\4~\n\4\3\4\7\4\u0081\n\4\f\4\16\4\u0084\13\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\5\5\u008d\n\5\3\6\5\6\u0090\n\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u009c\n\b\3\t\3\t\3\t\5\t\u00a1\n\t\6\t\u00a3"+
		"\n\t\r\t\16\t\u00a4\3\n\3\n\3\n\5\n\u00aa\n\n\6\n\u00ac\n\n\r\n\16\n\u00ad"+
		"\3\13\3\13\3\13\5\13\u00b3\n\13\6\13\u00b5\n\13\r\13\16\13\u00b6\3\f\3"+
		"\f\3\f\5\f\u00bc\n\f\7\f\u00be\n\f\f\f\16\f\u00c1\13\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00d8\n\20\3\21\3\21\3\21\6\21\u00dd\n\21\r\21\16\21"+
		"\u00de\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f8\n\24\3\24"+
		"\3\24\7\24\u00fc\n\24\f\24\16\24\u00ff\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0107\n\25\f\25\16\25\u010a\13\25\3\25\7\25\u010d\n\25\f\25"+
		"\16\25\u0110\13\25\3\25\5\25\u0113\n\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u011d\n\26\f\26\16\26\u0120\13\26\3\26\3\26\3\27\3\27"+
		"\7\27\u0126\n\27\f\27\16\27\u0129\13\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\6\30\u0133\n\30\r\30\16\30\u0134\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u0141\n\31\3\31\3\31\7\31\u0145\n\31\f\31"+
		"\16\31\u0148\13\31\3\31\3\31\3\32\3\32\3\32\5\32\u014f\n\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u015c\n\34\f\34\16"+
		"\34\u015f\13\34\3\35\3\35\7\35\u0163\n\35\f\35\16\35\u0166\13\35\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u016d\n\36\f\36\16\36\u0170\13\36\3\37\3\37"+
		"\3\37\3\37\5\37\u0176\n\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u017e\n"+
		"\37\f\37\16\37\u0181\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u019c\n \3!\3!\3!\3!\3!\3!\3!\5!\u01a5"+
		"\n!\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u01af\n#\3$\3$\3$\3$\3$\3$\5$\u01b7"+
		"\n$\3%\3%\3%\3%\3%\5%\u01be\n%\3&\3&\3&\3&\3&\5&\u01c5\n&\3\'\3\'\5\'"+
		"\u01c9\n\'\3\'\3\'\5\'\u01cd\n\'\3(\3(\3(\3(\3(\5(\u01d4\n(\3(\3(\5(\u01d8"+
		"\n(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\5*\u01e4\n*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01f6\n+\3,\3,\3,\3,\5,\u01fc\n,\3-\3-\3-"+
		"\3-\3-\5-\u0203\n-\3.\3.\5.\u0207\n.\3/\3/\3/\3/\3/\3/\7/\u020f\n/\f/"+
		"\16/\u0212\13/\3/\5/\u0215\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0220\n/\f"+
		"/\16/\u0223\13/\3\60\3\60\3\60\5\60\u0228\n\60\3\60\2\5&<\\\61\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^\2\3\4\2\n\n\23\24\2\u024c\2a\3\2\2\2\4r\3\2\2\2\6u\3\2\2\2\b\u008c"+
		"\3\2\2\2\n\u008f\3\2\2\2\f\u0095\3\2\2\2\16\u009b\3\2\2\2\20\u009d\3\2"+
		"\2\2\22\u00a6\3\2\2\2\24\u00af\3\2\2\2\26\u00b8\3\2\2\2\30\u00c4\3\2\2"+
		"\2\32\u00c8\3\2\2\2\34\u00cc\3\2\2\2\36\u00d7\3\2\2\2 \u00d9\3\2\2\2\""+
		"\u00e2\3\2\2\2$\u00e8\3\2\2\2&\u00f7\3\2\2\2(\u0100\3\2\2\2*\u0116\3\2"+
		"\2\2,\u0123\3\2\2\2.\u012f\3\2\2\2\60\u0139\3\2\2\2\62\u014b\3\2\2\2\64"+
		"\u0152\3\2\2\2\66\u0156\3\2\2\28\u0160\3\2\2\2:\u0167\3\2\2\2<\u0175\3"+
		"\2\2\2>\u019b\3\2\2\2@\u01a4\3\2\2\2B\u01a6\3\2\2\2D\u01ae\3\2\2\2F\u01b6"+
		"\3\2\2\2H\u01bd\3\2\2\2J\u01c4\3\2\2\2L\u01c6\3\2\2\2N\u01d7\3\2\2\2P"+
		"\u01d9\3\2\2\2R\u01e3\3\2\2\2T\u01f5\3\2\2\2V\u01fb\3\2\2\2X\u0202\3\2"+
		"\2\2Z\u0206\3\2\2\2\\\u0214\3\2\2\2^\u0227\3\2\2\2`b\5\4\3\2a`\3\2\2\2"+
		"ab\3\2\2\2bf\3\2\2\2ce\5\16\b\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2gi\3\2\2\2hf\3\2\2\2im\5\26\f\2jl\5\6\4\2kj\3\2\2\2lo\3\2\2\2mk\3\2"+
		"\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\2\2\3q\3\3\2\2\2rs\7.\2\2st\78"+
		"\2\2t\5\3\2\2\2uv\7\63\2\2vw\78\2\2wy\7\27\2\2xz\5\b\5\2yx\3\2\2\2yz\3"+
		"\2\2\2z{\3\2\2\2{}\7\26\2\2|~\5\f\7\2}|\3\2\2\2}~\3\2\2\2~\u0082\3\2\2"+
		"\2\177\u0081\5\16\b\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\5\26\f\2\u0086\7\3\2\2\2\u0087\u0088\5\n\6\2\u0088\u0089\7\32\2"+
		"\2\u0089\u008a\5\b\5\2\u008a\u008d\3\2\2\2\u008b\u008d\5\n\6\2\u008c\u0087"+
		"\3\2\2\2\u008c\u008b\3\2\2\2\u008d\t\3\2\2\2\u008e\u0090\7/\2\2\u008f"+
		"\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\5V"+
		",\2\u0092\u0093\7\13\2\2\u0093\u0094\5\36\20\2\u0094\13\3\2\2\2\u0095"+
		"\u0096\7\62\2\2\u0096\u0097\5\36\20\2\u0097\r\3\2\2\2\u0098\u009c\5\20"+
		"\t\2\u0099\u009c\5\22\n\2\u009a\u009c\5\24\13\2\u009b\u0098\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\17\3\2\2\2\u009d\u00a2\7\64\2"+
		"\2\u009e\u00a0\5\30\r\2\u009f\u00a1\7\32\2\2\u00a0\u009f\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\21\3\2\2\2\u00a6\u00ab"+
		"\7\36\2\2\u00a7\u00a9\5\32\16\2\u00a8\u00aa\7\32\2\2\u00a9\u00a8\3\2\2"+
		"\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\23\3\2\2\2\u00af"+
		"\u00b4\7\66\2\2\u00b0\u00b2\5\34\17\2\u00b1\u00b3\7\32\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\25\3\2\2"+
		"\2\u00b8\u00bf\7$\2\2\u00b9\u00bb\5&\24\2\u00ba\u00bc\7\32\2\2\u00bb\u00ba"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\"\2\2\u00c3\27\3\2\2\2\u00c4\u00c5"+
		"\78\2\2\u00c5\u00c6\7\13\2\2\u00c6\u00c7\5\36\20\2\u00c7\31\3\2\2\2\u00c8"+
		"\u00c9\78\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\5\\/\2\u00cb\33\3\2\2\2"+
		"\u00cc\u00cd\5V,\2\u00cd\u00ce\7\13\2\2\u00ce\u00cf\5\36\20\2\u00cf\35"+
		"\3\2\2\2\u00d0\u00d8\7)\2\2\u00d1\u00d8\7\35\2\2\u00d2\u00d8\7%\2\2\u00d3"+
		"\u00d8\5 \21\2\u00d4\u00d8\5\"\22\2\u00d5\u00d8\5$\23\2\u00d6\u00d8\7"+
		"8\2\2\u00d7\u00d0\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7"+
		"\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\37\3\2\2\2\u00d9\u00da\7\60\2\2\u00da\u00dc\7\16\2\2\u00db"+
		"\u00dd\5\34\17\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\r\2\2\u00e1"+
		"!\3\2\2\2\u00e2\u00e3\7\67\2\2\u00e3\u00e4\7\6\2\2\u00e4\u00e5\5Z.\2\u00e5"+
		"\u00e6\7\5\2\2\u00e6\u00e7\5\36\20\2\u00e7#\3\2\2\2\u00e8\u00e9\7\'\2"+
		"\2\u00e9\u00ea\7\6\2\2\u00ea\u00eb\5X-\2\u00eb\u00ec\7\5\2\2\u00ec\u00ed"+
		"\5\36\20\2\u00ed%\3\2\2\2\u00ee\u00ef\b\24\1\2\u00ef\u00f8\5(\25\2\u00f0"+
		"\u00f8\5*\26\2\u00f1\u00f8\5,\27\2\u00f2\u00f8\5.\30\2\u00f3\u00f8\5\60"+
		"\31\2\u00f4\u00f8\5\62\32\2\u00f5\u00f8\5L\'\2\u00f6\u00f8\5\64\33\2\u00f7"+
		"\u00ee\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f2\3\2"+
		"\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00fd\3\2\2\2\u00f9\u00fa\f\3\2\2\u00fa\u00fc\7\32"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\'\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7*\2\2"+
		"\u0101\u0102\7\27\2\2\u0102\u0103\5<\37\2\u0103\u0104\7\26\2\2\u0104\u0108"+
		"\7\16\2\2\u0105\u0107\5&\24\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010e\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010b\u010d\5\66\34\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2"+
		"\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0111\u0113\58\35\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\7\r\2\2\u0115)\3\2\2\2\u0116\u0117\7&\2\2\u0117"+
		"\u0118\7\27\2\2\u0118\u0119\5<\37\2\u0119\u011a\7\26\2\2\u011a\u011e\7"+
		"\16\2\2\u011b\u011d\5&\24\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0122\7\r\2\2\u0122+\3\2\2\2\u0123\u0127\7\61\2\2\u0124\u0126"+
		"\5&\24\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7#"+
		"\2\2\u012b\u012c\7\27\2\2\u012c\u012d\5<\37\2\u012d\u012e\7\26\2\2\u012e"+
		"-\3\2\2\2\u012f\u0130\7 \2\2\u0130\u0132\7\16\2\2\u0131\u0133\5:\36\2"+
		"\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\58\35\2\u0137\u0138\7\r\2\2\u0138"+
		"/\3\2\2\2\u0139\u013a\7\37\2\2\u013a\u013b\78\2\2\u013b\u013c\7\4\2\2"+
		"\u013c\u013d\5\\/\2\u013d\u013e\7#\2\2\u013e\u0140\5\\/\2\u013f\u0141"+
		"\5B\"\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0146\7\16\2\2\u0143\u0145\5&\24\2\u0144\u0143\3\2\2\2\u0145\u0148\3"+
		"\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014a\7\r\2\2\u014a\61\3\2\2\2\u014b\u014c\78\2\2"+
		"\u014c\u014e\7\27\2\2\u014d\u014f\5D#\2\u014e\u014d\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7\26\2\2\u0151\63\3\2\2\2\u0152"+
		"\u0153\5N(\2\u0153\u0154\7\4\2\2\u0154\u0155\5F$\2\u0155\65\3\2\2\2\u0156"+
		"\u0157\7,\2\2\u0157\u0158\7\27\2\2\u0158\u0159\5<\37\2\u0159\u015d\7\26"+
		"\2\2\u015a\u015c\5&\24\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\67\3\2\2\2\u015f\u015d\3\2\2"+
		"\2\u0160\u0164\7+\2\2\u0161\u0163\5&\24\2\u0162\u0161\3\2\2\2\u0163\u0166"+
		"\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u01659\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\u0168\7\34\2\2\u0168\u0169\7\27\2\2\u0169\u016a\5"+
		"<\37\2\u016a\u016e\7\26\2\2\u016b\u016d\5&\24\2\u016c\u016b\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f;\3\2\2\2"+
		"\u0170\u016e\3\2\2\2\u0171\u0172\b\37\1\2\u0172\u0173\7(\2\2\u0173\u0176"+
		"\5<\37\4\u0174\u0176\5> \2\u0175\u0171\3\2\2\2\u0175\u0174\3\2\2\2\u0176"+
		"\u017f\3\2\2\2\u0177\u0178\f\6\2\2\u0178\u0179\7\3\2\2\u0179\u017e\5>"+
		" \2\u017a\u017b\f\5\2\2\u017b\u017c\7\25\2\2\u017c\u017e\5> \2\u017d\u0177"+
		"\3\2\2\2\u017d\u017a\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180=\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\5@!\2\u0183"+
		"\u0184\7\21\2\2\u0184\u0185\5@!\2\u0185\u019c\3\2\2\2\u0186\u0187\5@!"+
		"\2\u0187\u0188\7\17\2\2\u0188\u0189\5@!\2\u0189\u019c\3\2\2\2\u018a\u018b"+
		"\5@!\2\u018b\u018c\7\f\2\2\u018c\u018d\5@!\2\u018d\u019c\3\2\2\2\u018e"+
		"\u018f\5@!\2\u018f\u0190\7\20\2\2\u0190\u0191\5@!\2\u0191\u019c\3\2\2"+
		"\2\u0192\u0193\5@!\2\u0193\u0194\7\22\2\2\u0194\u0195\5@!\2\u0195\u019c"+
		"\3\2\2\2\u0196\u0197\5@!\2\u0197\u0198\7\t\2\2\u0198\u0199\5@!\2\u0199"+
		"\u019c\3\2\2\2\u019a\u019c\5@!\2\u019b\u0182\3\2\2\2\u019b\u0186\3\2\2"+
		"\2\u019b\u018a\3\2\2\2\u019b\u018e\3\2\2\2\u019b\u0192\3\2\2\2\u019b\u0196"+
		"\3\2\2\2\u019b\u019a\3\2\2\2\u019c?\3\2\2\2\u019d\u01a5\5\\/\2\u019e\u019f"+
		"\7\27\2\2\u019f\u01a0\5<\37\2\u01a0\u01a1\7\26\2\2\u01a1\u01a5\3\2\2\2"+
		"\u01a2\u01a5\7\65\2\2\u01a3\u01a5\7!\2\2\u01a4\u019d\3\2\2\2\u01a4\u019e"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5A\3\2\2\2\u01a6"+
		"\u01a7\7-\2\2\u01a7\u01a8\5\\/\2\u01a8C\3\2\2\2\u01a9\u01aa\5F$\2\u01aa"+
		"\u01ab\7\7\2\2\u01ab\u01ac\5D#\2\u01ac\u01af\3\2\2\2\u01ad\u01af\5F$\2"+
		"\u01ae\u01a9\3\2\2\2\u01ae\u01ad\3\2\2\2\u01afE\3\2\2\2\u01b0\u01b7\5"+
		"\\/\2\u01b1\u01b7\5N(\2\u01b2\u01b3\7\16\2\2\u01b3\u01b4\5H%\2\u01b4\u01b5"+
		"\7\r\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b0\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b6"+
		"\u01b2\3\2\2\2\u01b7G\3\2\2\2\u01b8\u01b9\5J&\2\u01b9\u01ba\7\7\2\2\u01ba"+
		"\u01bb\5H%\2\u01bb\u01be\3\2\2\2\u01bc\u01be\5J&\2\u01bd\u01b8\3\2\2\2"+
		"\u01bd\u01bc\3\2\2\2\u01beI\3\2\2\2\u01bf\u01c0\7\16\2\2\u01c0\u01c1\5"+
		"J&\2\u01c1\u01c2\7\r\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c5\5R*\2\u01c4\u01bf"+
		"\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5K\3\2\2\2\u01c6\u01c8\7\62\2\2\u01c7"+
		"\u01c9\7\27\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3"+
		"\2\2\2\u01ca\u01cc\5\\/\2\u01cb\u01cd\7\26\2\2\u01cc\u01cb\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cdM\3\2\2\2\u01ce\u01d8\78\2\2\u01cf\u01d8\5P)\2\u01d0"+
		"\u01d1\78\2\2\u01d1\u01d3\7\27\2\2\u01d2\u01d4\5D#\2\u01d3\u01d2\3\2\2"+
		"\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\7\26\2\2\u01d6"+
		"\u01d8\5T+\2\u01d7\u01ce\3\2\2\2\u01d7\u01cf\3\2\2\2\u01d7\u01d0\3\2\2"+
		"\2\u01d7\u01d6\3\2\2\2\u01d8O\3\2\2\2\u01d9\u01da\78\2\2\u01da\u01db\7"+
		"\6\2\2\u01db\u01dc\5R*\2\u01dc\u01dd\7\5\2\2\u01ddQ\3\2\2\2\u01de\u01df"+
		"\5\\/\2\u01df\u01e0\7\7\2\2\u01e0\u01e1\5R*\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e4\5\\/\2\u01e3\u01de\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4S\3\2\2\2\u01e5"+
		"\u01e6\78\2\2\u01e6\u01e7\7\31\2\2\u01e7\u01f6\5T+\2\u01e8\u01e9\78\2"+
		"\2\u01e9\u01ea\7\6\2\2\u01ea\u01eb\5V,\2\u01eb\u01ec\7\5\2\2\u01ec\u01ed"+
		"\7\31\2\2\u01ed\u01ee\5T+\2\u01ee\u01f6\3\2\2\2\u01ef\u01f0\78\2\2\u01f0"+
		"\u01f1\7\6\2\2\u01f1\u01f2\5V,\2\u01f2\u01f3\7\5\2\2\u01f3\u01f6\3\2\2"+
		"\2\u01f4\u01f6\78\2\2\u01f5\u01e5\3\2\2\2\u01f5\u01e8\3\2\2\2\u01f5\u01ef"+
		"\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6U\3\2\2\2\u01f7\u01f8\78\2\2\u01f8\u01f9"+
		"\7\7\2\2\u01f9\u01fc\5V,\2\u01fa\u01fc\78\2\2\u01fb\u01f7\3\2\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fcW\3\2\2\2\u01fd\u01fe\5Z.\2\u01fe\u01ff\7\7\2\2\u01ff"+
		"\u0200\5X-\2\u0200\u0203\3\2\2\2\u0201\u0203\5Z.\2\u0202\u01fd\3\2\2\2"+
		"\u0202\u0201\3\2\2\2\u0203Y\3\2\2\2\u0204\u0207\5\\/\2\u0205\u0207\7\24"+
		"\2\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207[\3\2\2\2\u0208\u0209"+
		"\b/\1\2\u0209\u020a\7\27\2\2\u020a\u020b\5\\/\2\u020b\u020c\7\26\2\2\u020c"+
		"\u0215\3\2\2\2\u020d\u020f\7\33\2\2\u020e\u020d\3\2\2\2\u020f\u0212\3"+
		"\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0215\5^\60\2\u0214\u0208\3\2\2\2\u0214\u0210\3\2"+
		"\2\2\u0215\u0221\3\2\2\2\u0216\u0217\f\7\2\2\u0217\u0218\7\33\2\2\u0218"+
		"\u0220\5\\/\b\u0219\u021a\f\6\2\2\u021a\u021b\t\2\2\2\u021b\u0220\5\\"+
		"/\7\u021c\u021d\f\5\2\2\u021d\u021e\7\30\2\2\u021e\u0220\5\\/\6\u021f"+
		"\u0216\3\2\2\2\u021f\u0219\3\2\2\2\u021f\u021c\3\2\2\2\u0220\u0223\3\2"+
		"\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222]\3\2\2\2\u0223\u0221"+
		"\3\2\2\2\u0224\u0228\5N(\2\u0225\u0228\79\2\2\u0226\u0228\7:\2\2\u0227"+
		"\u0224\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228_\3\2\2\2"+
		":afmy}\u0082\u008c\u008f\u009b\u00a0\u00a4\u00a9\u00ad\u00b2\u00b6\u00bb"+
		"\u00bf\u00d7\u00de\u00f7\u00fd\u0108\u010e\u0112\u011e\u0127\u0134\u0140"+
		"\u0146\u014e\u015d\u0164\u016e\u0175\u017d\u017f\u019b\u01a4\u01ae\u01b6"+
		"\u01bd\u01c4\u01c8\u01cc\u01d3\u01d7\u01e3\u01f5\u01fb\u0202\u0206\u0210"+
		"\u0214\u021f\u0221\u0227";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}