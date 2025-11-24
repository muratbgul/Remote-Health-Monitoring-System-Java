package rhms.users;

public class Patient {

    private String patientId;
    private String name;
    private int age;
    private String condition;

    public Patient(String patientId, String name, int age, String condition) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.condition = condition;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCondition() {
        return condition;
    }

    public void showInfo() {
        System.out.println("Patient: " + name + " (Condition: " + condition + ")");
    }
}
