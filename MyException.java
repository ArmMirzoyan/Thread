public class MyException extends Exception{
    public MyException() {

    }

    public MyException(String message) {
        super("My exception: thread is interrupted");
    }

    @Override
    public String toString() {
        return "MyException [ "
                + "message = " + getMessage()
                + "] ";
    }
}
