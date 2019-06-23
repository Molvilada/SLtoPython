// Generated from A:/Semestre VIII/Lenguajes de programación/SLtoPython/grammar\LenguajeSL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LenguajeSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LenguajeSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LenguajeSLParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#nombre_programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre_programa(LenguajeSLParser.Nombre_programaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#subrutina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrutina(LenguajeSLParser.SubrutinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#lista_argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_argumentos(LenguajeSLParser.Lista_argumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#tipo_var_argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_var_argumentos(LenguajeSLParser.Tipo_var_argumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#retorna_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorna_s(LenguajeSLParser.Retorna_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#listas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListas(LenguajeSLParser.ListasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(LenguajeSLParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(LenguajeSLParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(LenguajeSLParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#programa_principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma_principal(LenguajeSLParser.Programa_principalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LenguajeSLParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(LenguajeSLParser.ConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#tipo_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_var(LenguajeSLParser.Tipo_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#tipo_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_id(LenguajeSLParser.Tipo_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(LenguajeSLParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(LenguajeSLParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#matriz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatriz(LenguajeSLParser.MatrizContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(LenguajeSLParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(LenguajeSLParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(LenguajeSLParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#repetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetir(LenguajeSLParser.RepetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(LenguajeSLParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#desde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesde(LenguajeSLParser.DesdeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(LenguajeSLParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LenguajeSLParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#sino_si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino_si(LenguajeSLParser.Sino_siContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(LenguajeSLParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(LenguajeSLParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(LenguajeSLParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico(LenguajeSLParser.LogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(LenguajeSLParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#paso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaso(LenguajeSLParser.PasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(LenguajeSLParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(LenguajeSLParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#lista_llaves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_llaves(LenguajeSLParser.Lista_llavesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#llave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlave(LenguajeSLParser.LlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#retorna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorna(LenguajeSLParser.RetornaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#id_complejo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_complejo(LenguajeSLParser.Id_complejoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(LenguajeSLParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#a_comas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_comas(LenguajeSLParser.A_comasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#id_puntos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_puntos(LenguajeSLParser.Id_puntosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#id_comas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_comas(LenguajeSLParser.Id_comasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#lista_tamano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_tamano(LenguajeSLParser.Lista_tamanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#tamano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTamano(LenguajeSLParser.TamanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(LenguajeSLParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeSLParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(LenguajeSLParser.PContext ctx);
}