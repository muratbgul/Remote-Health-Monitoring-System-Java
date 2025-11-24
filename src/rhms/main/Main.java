package rhms.main;

import rhms.devices.WearableDevice;
import rhms.models.VitalSigns;
import rhms.alerts.Alert;

public class Main {
    public static void main(String[] args) {

        WearableDevice device = new WearableDevice("DEV-001");

        VitalSigns signs = device.collectData();

        System.out.println("Collected Data -> " + signs);

        if (signs.isAbnormal()) {
            Alert alert = new Alert("Abnormal vital signs detected! " + signs.toString());
            alert.sendToDoctor();
        } else {
            System.out.println("Values normal. No alert.");
        }
    }
}
