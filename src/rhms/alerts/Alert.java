package rhms.alerts;

import rhms.users.Doctor;
import rhms.users.Patient;

public class Alert {
    private String message;
    private String severity;
    
    public Alert(String message) {
        this.message = message;
        this.severity = "MEDIUM";
    }
    
    public Alert(String message, String severity) {
        this.message = message;
        this.severity = severity;
    }

    public void sendToDoctor() {
        System.out.println("ALERT [" + severity + "]: " + message);
    }
    
    public void sendToSpecificDoctor(Doctor doctor, Patient patient) {
        System.out.println("ALERT to " + doctor.getName() + 
                          " for patient " + patient.getName() + ": " + message);
    }
}