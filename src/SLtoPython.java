import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.xml.bind.SchemaOutputResolver;

public class SLtoPython extends LenguajeSLBaseListener {

    private static int tabs = 0;
    private static int tabs_si = 0;
    private static int caso = 0;

//    @Override public void enterSentencia(LenguajeSLParser.SentenciaContext ctx) {
//
//    }
    @Override public void enterConstantes(LenguajeSLParser.ConstantesContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override public void enterAsignacion(LenguajeSLParser.AsignacionContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        System.out.println(ctx.getText());
    }


    @Override public void enterSi(LenguajeSLParser.SiContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        String condicion = ctx.condicion().getText();
        System.out.println("if " + condicion + ":");
        tabs_si = tabs;
        tabs++;


    }

    @Override public void exitSi(LenguajeSLParser.SiContext ctx) {
        tabs--;

    }

    @Override public void enterSino_si(LenguajeSLParser.Sino_siContext ctx) {
        for (int i = 0; i < tabs_si; i++) System.out.print("\t");
        String condicion = ctx.condicion().getText();
        System.out.println("elif " + condicion + ":");
        tabs_si++;
    }

    @Override public void exitSino_si(LenguajeSLParser.Sino_siContext ctx) {
        tabs_si--;
    }

    @Override public void enterSino(LenguajeSLParser.SinoContext ctx) {
        for (int i = 0; i < tabs_si; i++) System.out.print("\t");
        System.out.println("else:");
        tabs_si++;
    }

    @Override public void exitSino(LenguajeSLParser.SinoContext ctx) {
        tabs_si--;
    }

    @Override public void enterMientras(LenguajeSLParser.MientrasContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        String condicion = ctx.condicion().getText();
        System.out.println("while " + condicion + ":");
        tabs++;
    }

    @Override public void exitMientras(LenguajeSLParser.MientrasContext ctx) {
        tabs--;
    }

    @Override public void enterRepetir(LenguajeSLParser.RepetirContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        System.out.println("while True:");
        tabs++;
    }

    @Override public void exitRepetir(LenguajeSLParser.RepetirContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        String condicion = ctx.condicion().getText();
        System.out.println("if " + condicion + ":");
        for (int i = 0; i < tabs + 1; i++) System.out.print("\t");
        System.out.println("break");
        tabs--;
    }

    @Override public void enterFuncion(LenguajeSLParser.FuncionContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        String id  = ctx.ID().getText();
        String parametros;
        if (ctx.parametros() != null){
            parametros = ctx.parametros().getText();
        }else{
            parametros = " ";
        }
        if (id.equals("imprimir")){
            System.out.println("print(" + parametros + ")");
        }
        else if (id.equals("leer")){
            System.out.println(parametros + "=input()");
        }
    }

    @Override public void enterEval(LenguajeSLParser.EvalContext ctx) {

    }

    @Override public void exitEval(LenguajeSLParser.EvalContext ctx) {
        caso = 0;
        tabs--;
    }

    @Override public void enterCaso(LenguajeSLParser.CasoContext ctx) {
        for (int i = 0; i < tabs_si; i++) System.out.print("\t");
        String condicion = ctx.condicion().getText();
        if (caso == 0){
            System.out.println("if " + condicion + ":");
            tabs_si = tabs;
            tabs++;
        }else{
            System.out.println("elif " + condicion + ":");
            tabs_si++;
        }


    }

    @Override public void exitCaso(LenguajeSLParser.CasoContext ctx) {

        caso++;
        tabs_si--;
    }


}



