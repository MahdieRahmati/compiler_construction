public enum 	TokenType {

	WHITESPACE,
	TAB,
	NEWLINE,

	PLUS,
	MINUS,
	MULTIPLY,
	DIVIDE,
    REMAINDER,

	AND,
	OR,
	NOT,
	
	EQUAL,
	ASSIGN,
	NOTEQUAL,
	Greater,
	Lower,
    GE,
    LE,

	INTEGER,
	FLOAT,
    STRING,
    BOOL,

	IF,
	ElSE,
    ELIF,

    LOOP,
    WHILE,

    BREAK,
    CONTINUE,

	SEMICOLON,
	COMMA,

	IDENTIFIER,

    PRINT;


	public boolean isAuxiliary() {
		return this == NEWLINE || this == TAB
				|| this == WHITESPACE;
	}
}