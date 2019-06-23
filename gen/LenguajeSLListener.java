// Generated from C:/Users/laura/Documentos/Laura/Universidad/2019-1/Lenguajes/Laboratorios/Lab_3/SLtoPython/grammar\LenguajeSL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LenguajeSLParser}.
 */
public interface LenguajeSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LenguajeSLParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LenguajeSLParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#nombre_programa}.
	 * @param ctx the parse tree
	 */
	void enterNombre_programa(LenguajeSLParser.Nombre_programaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#nombre_programa}.
	 * @param ctx the parse tree
	 */
	void exitNombre_programa(LenguajeSLParser.Nombre_programaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#subrutina}.
	 * @param ctx the parse tree
	 */
	void enterSubrutina(LenguajeSLParser.SubrutinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#subrutina}.
	 * @param ctx the parse tree
	 */
	void exitSubrutina(LenguajeSLParser.SubrutinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#lista_argumentos}.
	 * @param ctx the parse tree
	 */
	void enterLista_argumentos(LenguajeSLParser.Lista_argumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#lista_argumentos}.
	 * @param ctx the parse tree
	 */
	void exitLista_argumentos(LenguajeSLParser.Lista_argumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#tipo_var_argumentos}.
	 * @param ctx the parse tree
	 */
	void enterTipo_var_argumentos(LenguajeSLParser.Tipo_var_argumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#tipo_var_argumentos}.
	 * @param ctx the parse tree
	 */
	void exitTipo_var_argumentos(LenguajeSLParser.Tipo_var_argumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#retorna_s}.
	 * @param ctx the parse tree
	 */
	void enterRetorna_s(LenguajeSLParser.Retorna_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#retorna_s}.
	 * @param ctx the parse tree
	 */
	void exitRetorna_s(LenguajeSLParser.Retorna_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#listas}.
	 * @param ctx the parse tree
	 */
	void enterListas(LenguajeSLParser.ListasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#listas}.
	 * @param ctx the parse tree
	 */
	void exitListas(LenguajeSLParser.ListasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(LenguajeSLParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(LenguajeSLParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(LenguajeSLParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(LenguajeSLParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(LenguajeSLParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(LenguajeSLParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#programa_principal}.
	 * @param ctx the parse tree
	 */
	void enterPrograma_principal(LenguajeSLParser.Programa_principalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#programa_principal}.
	 * @param ctx the parse tree
	 */
	void exitPrograma_principal(LenguajeSLParser.Programa_principalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LenguajeSLParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LenguajeSLParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(LenguajeSLParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(LenguajeSLParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void enterTipo_var(LenguajeSLParser.Tipo_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void exitTipo_var(LenguajeSLParser.Tipo_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#tipo_id}.
	 * @param ctx the parse tree
	 */
	void enterTipo_id(LenguajeSLParser.Tipo_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#tipo_id}.
	 * @param ctx the parse tree
	 */
	void exitTipo_id(LenguajeSLParser.Tipo_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(LenguajeSLParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(LenguajeSLParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(LenguajeSLParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(LenguajeSLParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#matriz}.
	 * @param ctx the parse tree
	 */
	void enterMatriz(LenguajeSLParser.MatrizContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#matriz}.
	 * @param ctx the parse tree
	 */
	void exitMatriz(LenguajeSLParser.MatrizContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(LenguajeSLParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(LenguajeSLParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(LenguajeSLParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(LenguajeSLParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(LenguajeSLParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(LenguajeSLParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#repetir}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(LenguajeSLParser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#repetir}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(LenguajeSLParser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(LenguajeSLParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(LenguajeSLParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#desde}.
	 * @param ctx the parse tree
	 */
	void enterDesde(LenguajeSLParser.DesdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#desde}.
	 * @param ctx the parse tree
	 */
	void exitDesde(LenguajeSLParser.DesdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(LenguajeSLParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(LenguajeSLParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(LenguajeSLParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(LenguajeSLParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#sino_si}.
	 * @param ctx the parse tree
	 */
	void enterSino_si(LenguajeSLParser.Sino_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#sino_si}.
	 * @param ctx the parse tree
	 */
	void exitSino_si(LenguajeSLParser.Sino_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(LenguajeSLParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(LenguajeSLParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(LenguajeSLParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(LenguajeSLParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(LenguajeSLParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(LenguajeSLParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#logico}.
	 * @param ctx the parse tree
	 */
	void enterLogico(LenguajeSLParser.LogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#logico}.
	 * @param ctx the parse tree
	 */
	void exitLogico(LenguajeSLParser.LogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(LenguajeSLParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(LenguajeSLParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#paso}.
	 * @param ctx the parse tree
	 */
	void enterPaso(LenguajeSLParser.PasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#paso}.
	 * @param ctx the parse tree
	 */
	void exitPaso(LenguajeSLParser.PasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(LenguajeSLParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(LenguajeSLParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(LenguajeSLParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(LenguajeSLParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#lista_llaves}.
	 * @param ctx the parse tree
	 */
	void enterLista_llaves(LenguajeSLParser.Lista_llavesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#lista_llaves}.
	 * @param ctx the parse tree
	 */
	void exitLista_llaves(LenguajeSLParser.Lista_llavesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#llave}.
	 * @param ctx the parse tree
	 */
	void enterLlave(LenguajeSLParser.LlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#llave}.
	 * @param ctx the parse tree
	 */
	void exitLlave(LenguajeSLParser.LlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#retorna}.
	 * @param ctx the parse tree
	 */
	void enterRetorna(LenguajeSLParser.RetornaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#retorna}.
	 * @param ctx the parse tree
	 */
	void exitRetorna(LenguajeSLParser.RetornaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#id_complejo}.
	 * @param ctx the parse tree
	 */
	void enterId_complejo(LenguajeSLParser.Id_complejoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#id_complejo}.
	 * @param ctx the parse tree
	 */
	void exitId_complejo(LenguajeSLParser.Id_complejoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(LenguajeSLParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(LenguajeSLParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#a_comas}.
	 * @param ctx the parse tree
	 */
	void enterA_comas(LenguajeSLParser.A_comasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#a_comas}.
	 * @param ctx the parse tree
	 */
	void exitA_comas(LenguajeSLParser.A_comasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#id_puntos}.
	 * @param ctx the parse tree
	 */
	void enterId_puntos(LenguajeSLParser.Id_puntosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#id_puntos}.
	 * @param ctx the parse tree
	 */
	void exitId_puntos(LenguajeSLParser.Id_puntosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#id_comas}.
	 * @param ctx the parse tree
	 */
	void enterId_comas(LenguajeSLParser.Id_comasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#id_comas}.
	 * @param ctx the parse tree
	 */
	void exitId_comas(LenguajeSLParser.Id_comasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#lista_tamano}.
	 * @param ctx the parse tree
	 */
	void enterLista_tamano(LenguajeSLParser.Lista_tamanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#lista_tamano}.
	 * @param ctx the parse tree
	 */
	void exitLista_tamano(LenguajeSLParser.Lista_tamanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#tamano}.
	 * @param ctx the parse tree
	 */
	void enterTamano(LenguajeSLParser.TamanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#tamano}.
	 * @param ctx the parse tree
	 */
	void exitTamano(LenguajeSLParser.TamanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(LenguajeSLParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(LenguajeSLParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeSLParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(LenguajeSLParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeSLParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(LenguajeSLParser.PContext ctx);
}