public class LexerException extends Exception {
    private int position;
    private String message;

    public LexerException(String message, int position) {
        this.position = position;
        this.message = message;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String getMessage() {
        return message;
    }
}