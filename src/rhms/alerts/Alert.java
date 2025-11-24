package rhms.alerts;

public class Alert {

    private String message;

    public Alert(String message) {
        this.message = message;
    }

    public void sendToDoctor() {
        System.out.println("ALERT: " + message);
    }
}
