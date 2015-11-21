grammar FeatherweightJavaScript;

@header { package edu.sjsu.fwjs.parser; }

//lexer rules


// Whitespace and comments
NEWLINE       : '\r'? '\n' -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT  : '//' ~[\n\r]* -> skip ;
WS            : [ \t]+ -> skip ; // ignore whitespace


// Reserved words
IF        : 'if' ;
ELSE      : 'else' ;
WHILE     : 'while' ;
FUNCTION  : 'function' ;
PRINT     : 'print' ;
VAR       : 'var'; 

// Literals
INT       : [1-9][0-9]* | '0' ;
BOOL      : 'true' | 'false' ;
NULL      : 'null' ;

// Symbols
MUL       : '*' ;
DIV       : '/' ;
ADD       : '+' ;
SUB       : '-' ;
MOD       : '%' ;
GT        : '>' ;
GE        : '>=' ;
LT        : '<' ;
LE        : '<=' ;
EQ        : '==' ;
SEPARATOR : ';' ;

//Identifiers
ID        :[a-zA-Z_][a-zA-Z0-9_]* ; 

// ***Paring rules ***

/** The start rule */
prog: stat+ ;

stat: expr SEPARATOR                                    # bareExpr
    | IF '(' expr ')' block ELSE block                  # ifThenElse
    | IF '(' expr ')' block                             # ifThen
    | WHILE '(' expr ')' block                          # while
    | PRINT '(' expr ')' SEPARATOR                      # printExpr
    | SEPARATOR                                         # blank
    ;

expr: expr op=( '*' | '/' | '%' ) expr                  # MulDivMod
    | expr op=( '+' | '-' ) expr                        # AddSub
    | expr op=( '<' | '<=' | '>' | '>=' | '==' ) expr   # Comparison
    | FUNCTION parameters block                         # functiondecl
    | VAR ID '=' expr                                   # variabledecl
    | expr arguments                                    # functionappl
    | ID                                                # varref
    | ID '=' expr                                       # assign
    | INT                                               # int
    | BOOL                                              # bool
    | NULL                                              # null
    | '(' expr ')'                                      # parens
    ;

block: '{' stat* '}'                                    # fullBlock
     | stat                                             # simpBlock
     ;

parameters: '(' ID (',' ID)* ')'                        #param
          | '(' ')'                                     #noparam
          ;

arguments: '(' expr (',' expr)* ')'                     #args
         | '(' ')'                                      #noargs
         ;
