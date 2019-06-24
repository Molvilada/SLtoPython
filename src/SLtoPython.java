import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Hashtable;
import java.util.Stack;

public class SLtoPython extends LenguajeSLBaseListener {

    private static int tabs = 0;
    private static int tabs_si = 0;
    private static int caso = 0;
    public static Hashtable<String, String> variables2 = new Hashtable<String, String>();

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
        char [] aux_char = condicion.toCharArray();
        String imprimir = "";
        for(int i =0; i < condicion.length(); i++){
            if(i+3 <aux_char.length && aux_char[i] == 'a' && aux_char[i+1] == 'n' && aux_char[i+2] == 'd'){
                imprimir += " && ";
                i = i+2;
            }else if(i+2 < aux_char.length && aux_char[i] == 'o' && aux_char[i+1] == 'r'){
                imprimir += " || ";
                i = i+1;
            }else if(i+2 < aux_char.length && aux_char[i] == '|' && aux_char[i+1] == '|'){
                imprimir += " || ";
                i = i+1;
            }else if(i+2 < aux_char.length && aux_char[i] == '&' && aux_char[i+1] == '&'){
                imprimir += " && ";
                i = i+1;
            }else{
                imprimir += aux_char[i];
            }
        }
        System.out.println("if " + imprimir + ":");
        tabs_si = tabs;
        tabs++;
    }

    @Override public void exitSi(LenguajeSLParser.SiContext ctx) {
        tabs--;

    }

    @Override public void enterSino_si(LenguajeSLParser.Sino_siContext ctx) {
        for (int i = 0; i < tabs_si; i++) System.out.print("\t");
        String condicion = ctx.condicion().getText();
        char [] aux_char = condicion.toCharArray();
        String imprimir = "";
        for(int i =0; i < condicion.length(); i++){
            if(i+3 <aux_char.length && aux_char[i] == 'a' && aux_char[i+1] == 'n' && aux_char[i+2] == 'd'){
                imprimir += " && ";
                i = i+2;
            }else if(i+2 < aux_char.length && aux_char[i] == 'o' && aux_char[i+1] == 'r'){
                imprimir += " || ";
                i = i+1;
            }else if(i+2 < aux_char.length && aux_char[i] == '|' && aux_char[i+1] == '|'){
                imprimir += " || ";
                i = i+1;
            }else if(i+2 < aux_char.length && aux_char[i] == '&' && aux_char[i+1] == '&'){
                imprimir += " && ";
                i = i+1;
            }else{
                imprimir += aux_char[i];
            }
        }
        System.out.println("elif " + imprimir + ":");
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
        char [] aux_char = condicion.toCharArray();
        String imprimir = "";
        for(int i =0; i < condicion.length(); i++){
            if(i+3 <aux_char.length && aux_char[i] == 'a' && aux_char[i+1] == 'n' && aux_char[i+2] == 'd'){
                imprimir += " && ";
                i = i+2;
            }else if(i+2 < aux_char.length && aux_char[i] == 'o' && aux_char[i+1] == 'r'){
                imprimir += " || ";
                i = i+1;
            }else if(i+2 < aux_char.length && aux_char[i] == '|' && aux_char[i+1] == '|'){
                imprimir += " || ";
                i = i+1;
            }else if(i+2 < aux_char.length && aux_char[i] == '&' && aux_char[i+1] == '&'){
                imprimir += " && ";
                i = i+1;
            }else{
                imprimir += aux_char[i];
            }
        }
        System.out.println("while " + imprimir + ":");
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
        char [] aux_char = condicion.toCharArray();
        String imprimir = "";
        for(int i =0; i < condicion.length(); i++){
            if(i+3 <aux_char.length && aux_char[i] == 'a' && aux_char[i+1] == 'n' && aux_char[i+2] == 'd'){
                imprimir += " && ";
                i = i+2;
            }else if(i+2 < aux_char.length && aux_char[i] == 'o' && aux_char[i+1] == 'r'){
                imprimir += " || ";
                i = i+1;
            }else if(i+2 < aux_char.length && aux_char[i] == '|' && aux_char[i+1] == '|'){
                imprimir += " || ";
                i = i+1;
            }else if(i+2 < aux_char.length && aux_char[i] == '&' && aux_char[i+1] == '&'){
                imprimir += " && ";
                i = i+1;
            }else{
                imprimir += aux_char[i];
            }
        }
        System.out.println("if " + imprimir + ":");
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
            String tipo = variables2.get(parametros);
            if(tipo == "numerico"){
                System.out.println(parametros + " = int(input())");
            }else{
                System.out.println(parametros + " = input()");
            }
        }else{
            System.out.println(id + "(" + parametros + ")");
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
        char [] aux_char = condicion.toCharArray();
        String imprimir = "";
        for(int i =0; i < condicion.length(); i++){
            if(i+3 <aux_char.length && aux_char[i] == 'a' && aux_char[i+1] == 'n' && aux_char[i+2] == 'd'){
                imprimir += " && ";
                i = i+2;
            }else if(i+2 < aux_char.length && aux_char[i] == 'o' && aux_char[i+1] == 'r'){
                imprimir += " || ";
                i = i+1;
            }else if(i+2 < aux_char.length && aux_char[i] == '|' && aux_char[i+1] == '|'){
                imprimir += " || ";
                i = i+1;
            }else if(i+2 < aux_char.length && aux_char[i] == '&' && aux_char[i+1] == '&'){
                imprimir += " && ";
                i = i+1;
            }else{
                imprimir += aux_char[i];
            }
        }
        if (caso == 0){
            System.out.println("if " + imprimir + ":");
            tabs_si = tabs;
            tabs++;
        }else{
            System.out.println("elif " + imprimir + ":");
            tabs_si++;
        }


    }

    @Override public void exitCaso(LenguajeSLParser.CasoContext ctx) {
        caso++;
        tabs_si--;
    }

    @Override public void enterId_complejo(LenguajeSLParser.Id_complejoContext ctx) {
//        if(ctx.a_comas().a().p().NUMERO() != null){
//            String numero = ctx.a_comas().a().p().NUMERO().getText();
//            int numero_n = Integer.parseInt(numero) - 1;
//            System.out.println("[" + numero + "]");
//        }
    }

    @Override public void enterLlamada_funcion(LenguajeSLParser.Llamada_funcionContext ctx) {
        if(ctx.a_comas().a().p().NUMERO() != null){
            String numero = ctx.a_comas().a().p().NUMERO().getText();
            int numero_n = Integer.parseInt(numero) - 1;
            System.out.println("[" + numero_n + "]");
        }
    }

    @Override
    public void enterDesde(LenguajeSLParser.DesdeContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        System.out.print("for ");
        if (ctx.paso()!= null){
            System.out.println(ctx.ID().getText()+" in range(" + ctx.a().get(0).getText()+ "," + ctx.a().get(1).getText() + "," + ctx.paso().a().getText() + "):");
        }else{
            System.out.println(ctx.ID().getText()+" in range(" + ctx.a().get(0).getText()+ "," + ctx.a().get(1).getText() + "):");
        }
        tabs++;
    }

    @Override
    public void exitDesde(LenguajeSLParser.DesdeContext ctx) {
        tabs--;
    }

    @Override
    public void enterRetorna(LenguajeSLParser.RetornaContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        if(ctx.PAR_IZQ()!=null){
            System.out.println("return" +ctx.PAR_IZQ() + ctx.a().getText() + ctx.PAR_DER());
        }else {
            System.out.println("return " + ctx.a().getText());
        }
    }

    @Override
    public void enterSubrutina(LenguajeSLParser.SubrutinaContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        if(ctx.lista_argumentos()!=null){
            String aux = ctx.ID().getText() + "(" + ctx.lista_argumentos().getText();
            char [] copia_aux = aux.toCharArray();
            String imprimir = "";
            boolean bandera = true;
            for(int i = 0; i<copia_aux.length;i++) {
                if (copia_aux[i] == ':') {
                    bandera = false;
                } else if (copia_aux[i] == ';') {
                    bandera = true;
                    copia_aux[i] = ',';
                }if (bandera) {
                    imprimir += copia_aux[i];
                }
            }
            System.out.print("def " + ctx.ID().getText() + "(" + imprimir + "):");
        }else{
            System.out.println("def " + ctx.ID().getText() + "():");
        }
        tabs++;
    }

    @Override
    public void enterVariables(LenguajeSLParser.VariablesContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        String variables = ctx.getText();
        System.out.println(variables);
        char [] aux = variables.toCharArray();
        System.out.println(variables);
        String imprimir = "";
        int global = 3;
        String number = "";

        for(int i = 3; i<aux.length;i++){
            if(aux[i]==':') {
                for (int j = global; j < i; j++) {
                    imprimir += aux[j];
                    global = j;
                }
                if(aux[i+1]=='n'){
                    variables2.put(imprimir,"numerico");
                    global = global+10;
                    imprimir="";
                }else if(aux[i+1]=='c'){
                    variables2.put(imprimir,"cadena");
                    global = global+8;
                    imprimir="";
                }else if (aux[i+1]=='l'){
                    variables2.put(imprimir,"logico");
                    global = global+8;
                    imprimir="";
                }else if(aux[i+1]=='r'){
                    variables2.put(imprimir, "registro");
                    System.out.println("class" + imprimir + ":");
                    tabs++;
                }else if(aux[i+1]=='v'){
                    String tipo = "";
                    for(int f = i+8;f<aux.length;f++){
                        if(aux[f]!=']'){
                            number += aux[f];
                        }else{
                            if(aux[f+1]=='c'){
                                tipo = "cadena";
                            }else if(aux[f+1]=='n'){
                                tipo = "numerico";
                            }else if(aux[f+1]=='l'){
                                tipo = "logico";
                            }
                            break;
                        }
                    }
                    switch (tipo){
                        case "cadena":
                            System.out.println(imprimir +" = []");
                            System.out.println("for i in range(" + number +")");
                            System.out.println("    " + imprimir + "[i] = " + '"' + '"');
                            global = global+ 16 + number.length();;
                            break;
                        case "numerico":
                            System.out.println(imprimir +" = []");
                            System.out.println("for i in range(" + number +")");
                            System.out.println("    " + imprimir + "[i] = 0");
                            global = global+ 18 + number.length();;
                            break;
                        case "logico":
                            System.out.println(imprimir +" = []");
                            System.out.println("for i in range(" + number +")");
                            System.out.println("    " + imprimir + "[i] = True");
                            global = global + 16 + number.length();
                            break;
                            default:
                                break;
                    }
                    imprimir = "";
                    number = "";
                }
            }
        }
    }


}



