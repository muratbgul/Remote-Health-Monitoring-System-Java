package rhms.main;

import rhms.devices.WearableDevice;
import rhms.models.VitalSigns;
import rhms.alerts.Alert;
import rhms.users.Doctor;
import rhms.users.Patient;
import rhms.users.User;

public class Main {
    public static void main(String[] args) {
        
        User doctor = new Doctor("DOC-001", "Dr. Smith", "smith@hospital.com", "Cardiology", "MED12345");
        User patient = new Patient("PAT-001", "John Doe", "john@email.com", 45, "Hypertension", "O+");
        
        doctor.displayInfo();
        patient.displayInfo();
        
        System.out.println("\n--- Remote Monitoring ---");
        
        WearableDevice device = new WearableDevice("DEV-001");
        VitalSigns signs = device.collectData();

        System.out.println("Collected Data -> " + signs);

        if (signs.isAbnormal()) {
            Alert alert = new Alert("Abnormal vital signs detected! " + signs.toString());
            alert.sendToDoctor();
            
            Doctor cardiologist = (Doctor) doctor;
            cardiologist.reviewAlert("Critical alert for patient: " + patient.getName());
        } else {
            System.out.println("Values normal. No alert.");
        }
        
        doctor.sendNotification("You have new patient data to review");
        patient.sendNotification("Your health data has been updated");
    }
}