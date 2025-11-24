package rhms.users;

public class Doctor {

    private String doctorId;
    private String name;
    private String specialty;

    public Doctor(String doctorId, String name, String specialty) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialty = specialty;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void reviewAlert(String alertMessage) {
        System.out.println("Doctor " + name + " reviewing alert: " + alertMessage);
    }
}

