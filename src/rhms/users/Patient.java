package rhms.users;

public class Patient extends User {
    private int age;
    private String condition;
    private String bloodType;

    public Patient(String patientId, String name, String email, int age, String condition, String bloodType) {
        super(patientId, name, email); 
        this.age = age;
        this.condition = condition;
        this.bloodType = bloodType;
    }

    public int getAge() {
        return age;
    }

    public String getCondition() {
        return condition;
    }

    public String getBloodType() {
        return bloodType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Patient: " + name + " | Age: " + age + 
                          " | Condition: " + condition + " | Blood Type: " + bloodType);
    }

    public void showInfo() {
        displayInfo(); 
    }
}