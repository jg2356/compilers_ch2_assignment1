grammar RSS;

prog: (expr NEWLINE)+
    ;
expr: DOUBLE # double
    | '(' RATOR expr expr ')' # operation
    ;
RATOR: '^' | '*' | '/' | '+' | '-' ;
NEWLINE: '\r'?'\n' ;
DOUBLE: [0-9]+ ( '.' [0-9]+)* ;
WS: [ \t] -> skip ;
