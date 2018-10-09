package week5;

public class SLLEmptyException extends Exception {
    private String message;

    public SLLEmptyException(String message) {
        this.message = message;
    }

    public SLLEmptyException() {
        this.message = "SLL Empty.";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
