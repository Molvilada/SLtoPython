grammar LenguajeSL;

programa
    : nombre_programa? listas* programa_principal subrutina* EOF
    ;

nombre_programa //No lo necesita
    : PROGRAMA ID
    ;

subrutina //Ya
    : SUBRUTINA ID PAR_IZQ lista_argumentos? PAR_DER retorna_s? listas* programa_principal
    ;

lista_argumentos //Ya
    : tipo_var_argumentos PUNTO_COMA lista_argumentos
    | tipo_var_argumentos
    ;

tipo_var_argumentos //Ya
    : REF? id_comas DOS_PUNTOS tipo_id
    ;


retorna_s //No lo necesita
    : RETORNA tipo_id
    ;

listas //Ya
    : tipos
    | constantes
    | variables
    ;

tipos //No lo necesita
    : TIPOS (tipo PUNTO_COMA?)+
    ;

constantes //Ya
    : CONST (constante PUNTO_COMA?)+
    ;

variables
    : VAR (tipo_var PUNTO_COMA?)+
    ;

programa_principal
    : INICIO (sentencia PUNTO_COMA?)* FIN
    ;

tipo
    : ID DOS_PUNTOS tipo_id
    ;

constante //Ya
    : ID ASIGNACION a
    ;

tipo_var
    : id_comas DOS_PUNTOS tipo_id
    ;

tipo_id
    : NUMERICO
    | CADENA
    | LOGICO
    | registro
    | vector
    | matriz
    | ID
    ;

registro //Ya
    : REGISTRO LLAVE_IZQ  tipo_var+ LLAVE_DER
    ;

vector //Ya
    : VECTOR BRAC_IZQ tamano BRAC_DER tipo_id
    ;

matriz
    : MATRIZ BRAC_IZQ lista_tamano BRAC_DER tipo_id
    ;

sentencia
    : si //Ya
    | mientras //Ya
    | repetir //Ya
    | eval //Ya
    | desde //Ya
    | funcion //Ya
    | retorna //Ya
    | asignacion //Ya
    | sentencia PUNTO_COMA //?
    ;

si //Ya
    : SI PAR_IZQ condicion PAR_DER LLAVE_IZQ sentencia* sino_si* sino? LLAVE_DER
    ;

mientras //Ya
    : MIENTRAS PAR_IZQ condicion PAR_DER LLAVE_IZQ sentencia* LLAVE_DER
    ;

repetir //Ya
    : REPETIR sentencia* HASTA PAR_IZQ condicion PAR_DER
    ;

eval //Ya
    : EVAL LLAVE_IZQ caso+ sino LLAVE_DER
    ;

desde //Ya
    : DESDE ID ASIGNACION a HASTA a paso? LLAVE_IZQ sentencia* LLAVE_DER
    ;

funcion //Ya
    : ID PAR_IZQ parametros? PAR_DER
    ;

asignacion //Ya
    : id_complejo ASIGNACION expresion
    ;

sino_si //Ya
    : SINO_SI PAR_IZQ condicion PAR_DER sentencia*
    ;

sino //Ya
    : SINO sentencia*
    ;

caso //Ya
    : CASO PAR_IZQ condicion PAR_DER sentencia*
    ;

condicion //Ya
    : condicion AND logico
    | condicion OR logico
    | NOT condicion
    | logico
    ;

logico //Ya
    : e MENOR e
    | e MAYOR e
    | e IGUAL e
    | e MAYOR_IGUAL e
    | e MENOR_IGUAL e
    | e DIFERENTE e
    | e
    ;

e
    : a
    | PAR_IZQ condicion PAR_DER
    | TRUE
    | FALSE
    ;

paso //Ya
    : PASO a
    ;

parametros
    : expresion COMA parametros
    | expresion
    ;

expresion
    : a
    | id_complejo
    | LLAVE_IZQ lista_llaves LLAVE_DER
    | TRUE
    | FALSE
    | SI
    | NO
    | condicion
    ;

lista_llaves
    : llave COMA lista_llaves
    | llave
    ;

llave
    : LLAVE_IZQ  llave LLAVE_DER
    | a_comas?
    ;

retorna //Ya
    : RETORNA PAR_IZQ? a PAR_DER?
    ;

id_complejo
    : ID
    | llamada_funcion
    | ID PAR_IZQ parametros? PAR_DER
    | id_puntos
    ;

llamada_funcion //Ya
    : ID BRAC_IZQ a_comas BRAC_DER
    ;

a_comas
    : a COMA a_comas
    | a
    ;

id_puntos
    : ID PUNTO id_puntos
    | ID BRAC_IZQ id_comas BRAC_DER PUNTO id_puntos
    | ID BRAC_IZQ id_comas BRAC_DER
    | ID
    ;

id_comas
    : ID COMA id_comas
    | ID
    ;

lista_tamano
    : tamano COMA lista_tamano
    | tamano
    ;

tamano
    : a
    | MULT
    ;

a
    : a SUMA a
    | a (MULT | DIV | MOD) a
    | a POW a
    | PAR_IZQ a PAR_DER
    | (SUMA)* p
    ;
p
    : id_complejo
    | NUMERO
    | CADENA_L
    | TRUE
    | FALSE
    ;

// CARACTERES

AND         : '&&'
            | 'and';
ASIGNACION  : '=';
BRAC_DER    : ']';
BRAC_IZQ    : '[';
COMA        : ',';
COMILLAS    : '"'
            | [\u0027]
            ;
DIFERENTE   : '<>';
DIV         : '/';
DOS_PUNTOS  : ':';
IGUAL       : '==';
LLAVE_DER   : '}';
LLAVE_IZQ   : '{';
MAYOR       : '>';
MAYOR_IGUAL : '>=';
MENOR       : '<';
MENOR_IGUAL : '<=';
MOD         : '%';
MULT        : '*';
OR          : '||'
            | 'or';
PAR_DER     : ')';
PAR_IZQ     : '(';
POW         : '^';
PUNTO       : '.';
PUNTO_COMA  : ';';
SUMA        : '+'
            | '-';

// PALABRAS RESERVADAS

CASO        : 'caso';
CADENA      : 'cadena';
CONST       : 'const';
DESDE       : 'desde';
EVAL        : 'eval';
FALSE       : 'FALSE'
            | 'NO'
            ;
FIN         : 'fin';
HASTA       : 'hasta';
INICIO      : 'inicio';
LOGICO      : 'logico';
MIENTRAS    : 'mientras';
MATRIZ      : 'matriz';
NOT         : 'not';
NUMERICO    : 'numerico';
SI          : 'si';
SINO        : 'sino';
SINO_SI     : 'sino si';
PASO        : 'paso';
PROGRAMA    : 'programa';
REF         : 'ref';
REGISTRO    : 'registro';
REPETIR     : 'repetir';
RETORNA     : 'retorna';
SUBRUTINA   : 'subrutina';
TIPOS       : 'tipos';
TRUE        : 'TRUE'
            | 'SI'
            ;
VAR         : 'var';
VECTOR      : 'vector';


// REGLAS LEXICAS
ID
    :[a-zA-Z_Ã±Ã‘] [a-zA-Z0-9_Ã±Ã‘]*
    ;

NUMERO
    : [0-9]+ ('.' [0-9]+)*
    ;

CADENA_L
    : COMILLAS (~["\r\n] | '""')* COMILLAS
    ;

WS
    : [ \t\r\n] -> skip
    ;

COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;
//COMMENT_BLOCK
//    : '/*' ~[\r]* '*/' -> skip
//    ;