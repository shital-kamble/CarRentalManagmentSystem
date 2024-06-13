package AbstractSmartDevice;



public class SmartCamera extends AbstractSmartDevice implements ISmartCamera {
    public SmartCamera(String deviceId, String deviceName) {
        super(deviceId, deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println(getDeviceName() + " is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getDeviceName() + " is turned off.");
    }

    @Override
    public void startRecording() {
        System.out.println(getDeviceName() + " started recording.");
    }

    @Override
    public void stopRecording() {
        System.out.println(getDeviceName() + " stopped recording.");
    }
}
