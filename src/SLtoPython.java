import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;
import java.util.concurrent.locks.Condition;

public class SLtoPython extends LenguajeSLBaseListener {

    private static int tabs = 0;
    private static int tabs_si = 0;
    private static int caso = 0;
    public static Hashtable<String, String> variables2 = new Hashtable<String, String>();

    @Override public void enterConstante(LenguajeSLParser.ConstanteContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override public void enterAsignacion(LenguajeSLParser.AsignacionContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        String contexto = ctx.getText();
        if(ctx.getText().contains(".")){
            String [] puntos_aux = contexto.split("[-+]?[0-9]*\\.[0-9]*");
            if(puntos_aux.length > 1){
                System.out.println(contexto);
            }else {
                String[] aux = contexto.split("=");
                String puntos = aux[0];
                String[] aux2 = puntos.split("[.]");
                String cadena = "";
                for (int i = 1; i < aux2.length; i++) {
                    cadena += "['" + aux2[i] + "']";
                    System.out.printf("r" + cadena);
                    if (i < aux2.length - 1) {
                        System.out.println("= {}");
                    } else {
                        System.out.println("= " + aux[1]);
                    }
                }
            }
        }else if(ctx.expresion().getText().startsWith("{")){
            System.out.print(ctx.id_complejo().getText() + " = ");
        }else{
            System.out.print(contexto);
        }

    }


    @Override
    public void enterTipos(LenguajeSLParser.TiposContext ctx) {
       /* String tipos = ctx.getText();
        tipos = tipos.substring(5);
        String [] tipos_separados = tipos.split(":");
        variables2.put(tipos_separados[0], "tipo");
        System.out.println("class " + tipos_separados[0] + ":");
        System.out.println("    def _init_(self,"+tipos_separados[1]);*/

    }

    public void enterTipo(LenguajeSLParser.TipoContext ctx) {
        System.out.println("class " + ctx.ID().getText() + ":");
        String tipos = ctx.tipo_id().getText();
        String [] tipo = new String[2];
        if (tipos.contains("registro")){
            tipo[0] = "registro";
            tipo[1] = "self.registro = {}";
        }
        else if (tipos.contains("vector")){
            tipo[0] = "vector";
            tipo[1] = "self.vector = []";
        }
        if (tipos.contains("matriz")){
            tipo[0] = "matriz";
            tipo[1] = "self.matriz = []";
        }
        if (tipos.contains("numerico") || tipos.contains("cadena") || tipos.contains("logico")){
            tipo[0] = "variable";
            tipo[1] = "self.variable";
        }
        System.out.println("    def _init_(self,"+ tipo[0] +"):");
        System.out.println("        "+ tipo[1]);
    }

    public void exitTipo(LenguajeSLParser.TipoContext ctx) {
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
            String [] parametros_aux = parametros.split(",");
//            System.out.println(parametros_aux[0]);
            for(int i = 0; i < parametros_aux.length; i++){
                String tipo;
                if(parametros_aux[i].contains("[")){
                    String [] parametros_aux2 = parametros_aux[i].split("\\[");
                    tipo = variables2.get(parametros_aux2[0]);
                }else{
                    tipo = variables2.get(parametros_aux[i]);
                }
                if(tipo == null){
                    System.out.println(parametros_aux[i] + " = input()");
                }else if (tipo.equals("numerico")){
                    System.out.println(parametros_aux[i] + " = int(input())");
                }else{
                    System.out.println(parametros_aux[i] + " = input()");
                }
            }

        }else{
            for(int i = 0; i< parametros.length(); i++){

            }
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
                imprimir += " and ";
                i = i+2;
            }else if(i+2 < aux_char.length && aux_char[i] == 'o' && aux_char[i+1] == 'r'){
                imprimir += " or ";
                i = i+1;
            }else if(i+2 < aux_char.length && aux_char[i] == '|' && aux_char[i+1] == '|'){
                imprimir += " or ";
                i = i+1;
            }else if(i+2 < aux_char.length && aux_char[i] == '&' && aux_char[i+1] == '&'){
                imprimir += " and ";
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
//        if(ctx.a_comas().a().p().NUMERO() != null){
//            String numero = ctx.a_comas().a().p().NUMERO().getText();
//            int numero_n = Integer.parseInt(numero) - 1;
//            System.out.println("[" + numero_n + "]");
//        }
    }

    @Override
    public void enterDesde(LenguajeSLParser.DesdeContext ctx) {
        for (int i = 0; i < tabs; i++) {
            System.out.print("\t");
        }
        if (ctx.paso()!= null){
            System.out.println("for " + ctx.ID().getText()+" in range(" + ctx.a().get(0).getText()+ "," + ctx.a().get(1).getText() + "+1," + ctx.paso().a().getText() + "):");
        }else{
            System.out.println("for " + ctx.ID().getText()+" in range(" + ctx.a().get(0).getText()+ "," + ctx.a().get(1).getText() + "+1):");
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
        if(ctx.lista_argumentos()!=null){
            String aux = ctx.lista_argumentos().getText();
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
            System.out.print("def " + ctx.ID().getText() + "(" + imprimir + "):\n");
        }else{
            System.out.print("def " + ctx.ID().getText() + "():\n");
        }
        tabs++;
    }

    public void exitSubrutina(LenguajeSLParser.SubrutinaContext ctx) {
        tabs--;
    }

    @Override
    public void enterId_puntos(LenguajeSLParser.Id_puntosContext ctx) {
        //String id = ctx.getText();
    }

    @Override
    public void enterVariables(LenguajeSLParser.VariablesContext ctx) {
//        for (int i = 0; i < tabs; i++) System.out.print("\t");
//        String variables = ctx.getText();
//        char [] aux = variables.toCharArray();
//        String imprimir = "";
//        int global = 3;
//        String number = "";
//        for(int i = 3; i<aux.length;i++){
//            if(aux[i]==':') {
//                for (int j = global; j < i; j++) {
//                    imprimir += aux[j];
//                    global = j;
//                }
//                if(aux[i+1]=='n'){
//                    variables2.put(imprimir,"numerico");
//                    global = global+10;
//                    imprimir="";
//                }else if(aux[i+1]=='c'){
//                    variables2.put(imprimir,"cadena");
//                    global = global+8;
//                    imprimir="";
//                }else if (aux[i+1]=='l'){
//                    variables2.put(imprimir,"logico");
//                    global = global+8;
//                    imprimir="";
//                }else if(aux[i+1]=='v'){
//                    String tipo = "";
//                    for(int f = i+8;f<aux.length;f++){
//                        if(aux[f]!=']'){
//                            number += aux[f];
//                        }else{
//                            if(aux[f+1]=='c'){
//                                tipo = "cadena";
//                            }else if(aux[f+1]=='n'){
//                                tipo = "numerico";
//                            }else if(aux[f+1]=='l'){
//                                tipo = "logico";
//                            }
//                            break;
//                        }
//                    }
//                    switch (tipo){
//                        case "cadena":
//                            System.out.println(imprimir +" = []");
//                            System.out.println("for i in range(" + number +"):");
//                            System.out.println("    " + imprimir + ".append('')");
//                            global = global+ 16 + number.length();;
//                            break;
//                        case "numerico":
//                            System.out.println(imprimir +" = []");
//                            System.out.println("for i in range(" + number +"):");
//                            System.out.println("    " + imprimir + ".append(0)");
//                            global = global+ 18 + number.length();;
//                            break;
//                        case "logico":
//                            System.out.println(imprimir +" = []");
//                            System.out.println("for i in range(" + number +"):");
//                            System.out.println("    " + imprimir + ".append(True)");
//                            global = global + 16 + number.length();
//                            break;
//                            default:
//                                break;
//                    }
//                    imprimir = "";
//                    number = "";
//                }else if(aux[i+1]=='m'){
//                    String tipo = "";
//                    ArrayList<String> tamannos = new ArrayList<>();
//                    for(int f=i+8;f<aux.length;f++){
//                        if(aux[f]=='l' ){
//                            tipo = "logico";
//                            break;
//                        }else if(aux[f]==',' || aux[f]==']'){
//                            tamannos.add(number);
//                            number = "";
//                        }else if(aux[f]=='c') {
//                            tipo = "cadena";
//                            break;
//                        }else if(aux[f]=='n'){
//                            tipo = "numerico";
//                            break;
//                        }else if(aux[f]!=','){
//                            number += aux[f];
//                        }
//                    }switch (tipo){
//                        case "cadena":
//                            System.out.println("Contenido de tamannos");
//                            for(int z = 0; z<tamannos.size();z++){
//                                System.out.print(tamannos.get(z)+" ");
//                            }
//                            System.out.println(imprimir +" = []");
//                            for(int k=0;k<tamannos.size();k++){
//                                System.out.println("aux"+k +"= []");
//                            }
//                            System.out.println("for i in range(" + tamannos.get(tamannos.size()-1) +"):");
//                            System.out.println("    " + "aux0" + ".append('')");
//                            for(int k=tamannos.size()-2;k>0;k--){
//                                System.out.println("for i in range(" + tamannos.get(k) +"):");
//                                System.out.println("    " + "aux"+(tamannos.size()-k-1) + ".append(aux" + (tamannos.size()-k-2)+ ")");
//                            }
//                            System.out.println("for i in range(" + tamannos.get(0) +"):");
//                            System.out.println("    " + imprimir + ".append(aux"+(tamannos.size()-2)+")");
//                            global = global+ 16 + number.length();;
//                            break;
//                        case "numerico":
//                            System.out.println("Contenido de tamannos");
//                            for(int z = 0; z<tamannos.size();z++){
//                                System.out.print(tamannos.get(z)+" ");
//                            }
//                            System.out.println(imprimir +" = []");
//                            for(int k=0;k<tamannos.size();k++){
//                                System.out.println("aux"+k +"= []");
//                            }
//                            System.out.println("for i in range(" + tamannos.get(tamannos.size()-1) +"):");
//                            System.out.println("    " + "aux0" + ".append(0)");
//                            for(int k=tamannos.size()-2;k>0;k--){
//                                System.out.println("for i in range(" + tamannos.get(k) +"):");
//                                System.out.println("    " + "aux"+(tamannos.size()-k-1) + ".append(aux" + (tamannos.size()-k-2)+ ")");
//                            }
//                            System.out.println("for i in range(" + tamannos.get(0) +"):");
//                            System.out.println("    " + imprimir + ".append(aux"+(tamannos.size()-2)+")");
//                            global = global+ 16 + number.length();;
//                            break;
//                        case "logico":
//                            System.out.println("Contenido de tamannos");
//                            for(int z = 0; z<tamannos.size();z++){
//                                System.out.print(tamannos.get(z)+" ");
//                            }
//                            System.out.println(imprimir +" = []");
//                            for(int k=0;k<tamannos.size();k++){
//                                System.out.println("aux"+k +"= []");
//                            }
//                            System.out.println("for i in range(" + tamannos.get(tamannos.size()-1) +"):");
//                            System.out.println("    " + "aux0" + ".append(True)");
//                            for(int k=tamannos.size()-2;k>0;k--){
//                                System.out.println("for i in range(" + tamannos.get(k) +"):");
//                                System.out.println("    " + "aux"+(tamannos.size()-k-1) + ".append(aux" + (tamannos.size()-k-2)+ ")");
//                            }
//                            System.out.println("for i in range(" + tamannos.get(0) +"):");
//                            System.out.println("    " + imprimir + ".append(aux"+(tamannos.size()-2)+")");
//                            global = global+ 16 + number.length();
//                            break;
//                        default:
//                            break;
//                    }
//                    imprimir = "";
//                    number = "";
//                }
//            }
//        }
    }

    public void enterTipo_var(LenguajeSLParser.Tipo_varContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        String variables = ctx.id_comas().getText();
        String tipo = ctx.tipo_id().getText();

//        System.out.println("VARIABLES: " +variables);
        if(tipo.contains("registro")){
            tipo = "registro";
        }else if (tipo.contains("vector")){
            tipo = "vector";
        }else if (tipo.contains("matriz")){
            tipo = "matriz";
        }

        String [] v_comas = variables.split(",");
        for(int i = 0; i < v_comas.length; i++){
            String [] tipo_aux = ctx.tipo_id().getText().split("\\].*?");
            String tipo_aux2 = tipo_aux[tipo_aux.length-1];
            if(tipo == "vector"){
                variables2.put(v_comas[i],tipo_aux2);
                String [] number = ctx.tipo_id().getText().split("\\[.*?");
                number = number[1].split("\\].*?");
                System.out.println(v_comas[i] +" = []");
                if (number[0].matches("([a-zA-Z_]+[a-zA-Z0-9_]*|[-+]?[0-9]+\\.?[0-9]*)")){
                    System.out.println("for i in range(" + number[0] +"):");
                    if(ctx.tipo_id().getText().contains("numerico")){
                        System.out.println("    " + v_comas[i] + ".append(0)");
                    }else if (ctx.tipo_id().getText().contains("cadena")){
                        System.out.println("    " + v_comas[i] + ".append('')");
                    }else if  (ctx.tipo_id().getText().contains("logico")){
                        System.out.println("    " + v_comas[i] + ".append(False)");
                    }
                }

            }else if(tipo == "matriz"){
                variables2.put(v_comas[i],tipo_aux2);
                String [] numbers = ctx.tipo_id().getText().split("\\[.*?");
                numbers = numbers[1].split("\\].*?");
                numbers = numbers[0].split(",");
                String append = "";
                String matriz = "aux";
                if(ctx.tipo_id().getText().contains("numerico")){
                    append = ".append(0)";
                }else if (ctx.tipo_id().getText().contains("cadena")){
                    append = ".append('')";
                }else if  (ctx.tipo_id().getText().contains("logico")){
                    append = ".append(False)";
                }
                for(int j = numbers.length-1; j>=0;j--){
                    if (j == 0){
                        matriz = variables;
                    }
                    System.out.println(matriz + " = []");
                    if (numbers[j].matches("([a-zA-Z_]+[a-zA-Z0-9_]*|[-+]?[0-9]+\\.?[0-9]*)")){
                        System.out.println("for i in range(" + numbers[j] +"):");
                        System.out.println("    " + matriz + append);
                    }else{
                        System.out.println(matriz + append);
                    }
                    append = ".append(" + matriz + ")";
                    matriz = "aux" + Integer.toString(j);
                }
            }else{
                variables2.put(v_comas[i],tipo);
            }
        }

//        System.out.println(variables2.toString());
    }

    public void exitTipo_var(LenguajeSLParser.Tipo_varContext ctx) {
    }

    public void enterLlave(LenguajeSLParser.LlaveContext ctx) {
        String [] llaves = ctx.a_comas().getText().split(",");
        System.out.print("[" + llaves[0]);

        for(int i = 1; i < llaves.length; i++){
            System.out.print("," + llaves[i]);
        }

    }
}



