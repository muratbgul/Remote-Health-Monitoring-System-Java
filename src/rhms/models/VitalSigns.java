package rhms.models;

public class VitalSigns {

    private double heartRate;
    private double bloodPressure;
    private double temperature;

    public VitalSigns(double heartRate, double bloodPressure, double temperature) {
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
    }

    public boolean isAbnormal() {
        return (heartRate > 120 || bloodPressure > 140 || temperature > 38);
    }

    @Override
    public String toString() {
        return "HR: " + heartRate + ", BP: " + bloodPressure + ", Temp: " + temperature;
    }
}
