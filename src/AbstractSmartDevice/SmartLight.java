package AbstractSmartDevice;



public class SmartLight extends AbstractSmartDevice implements ISmartLight {
    private int brightness;
    private String color;

    public SmartLight(String deviceId, String deviceName) {
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
    public void setBrightness(int level) {
        this.brightness = level;
        System.out.println(getDeviceName() + " brightness set to " + level);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println(getDeviceName() + " color set to " + color);
    }
}

