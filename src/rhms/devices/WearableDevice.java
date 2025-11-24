package rhms.devices;

import rhms.models.VitalSigns;

public class WearableDevice {

    private String deviceId;

    public WearableDevice(String deviceId) {
        this.deviceId = deviceId;
    }

    public VitalSigns collectData() {
        System.out.println("[DEVICE " + deviceId + "] Collecting data...");
        return new VitalSigns(130, 150, 37.5);
    }
}
