package rhms.users;

public class Doctor extends User {
    private String specialty;
    private String licenseNumber;

    public Doctor(String doctorId, String name, String email, String specialty, String licenseNumber) {
        super(doctorId, name, email);
        this.specialty = specialty;
        this.licenseNumber = licenseNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor: " + name + " | Specialty: " + specialty + 
                          " | License: " + licenseNumber + " | Email: " + email);
    }

    public void reviewAlert(String alertMessage) {
        System.out.println("Dr. " + name + " reviewing alert: " + alertMessage);
    }

    public void prescribeMedication(String medication, Patient patient) {
        System.out.println("Dr. " + name + " prescribed " + medication + " to " + patient.getName());
    }
}