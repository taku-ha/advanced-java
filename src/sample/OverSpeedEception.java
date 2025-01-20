package sample;

public class OverSpeedEception extends Exception{

    private static final long serialVersionUID = 1L;

    public OverSpeedEception() {

    }

    public OverSpeedEception(String message) {
        super(message);
    }

    public OverSpeedEception(Throwable cause) {
        super(cause);
    }

    public OverSpeedEception(String message, Throwable cause) {
        super(message, cause);
    }



}
