public enum TokenType {

	WhiteSpace,
	Tab,
	NewLine,

	Plus,
	Minus,
	Multiply,
	Divide,
    Remainder,
	
	EqualEqual,
	Equal,
	NotEqual,
	Greater,
	Lower,
    GreaterEqual,
    LowerEqual,

	Int,
	Double,
    String,
    Boolean,

	If,
	Else,
    Elif,

    Loop,
    While,

    Break,
    Continue,

	Semicolon,
	Comma,

	Identifier,

    Print;


	public boolean isAuxiliary() {
		return this == NewLine || this == Tab
				|| this == WhiteSpace;
	}
}