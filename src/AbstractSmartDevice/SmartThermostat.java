package AbstractSmartDevice;


public class SmartThermostat extends AbstractSmartDevice implements ISmartThermostat {
    private double temperature;

    public SmartThermostat(String deviceId, String deviceName) {
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
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println(getDeviceName() + " temperature set to " + temperature);
    }
}
