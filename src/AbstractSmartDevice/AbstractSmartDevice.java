package AbstractSmartDevice;


public abstract class AbstractSmartDevice {

	private String deviceId;
    
	private String deviceName;

    public AbstractSmartDevice(String deviceId, String deviceName) {
    
    	this.deviceId = deviceId;
        
    	this.deviceName = deviceName;
    }

    public String getDeviceId() {
        
    	return deviceId;
    }

    public String getDeviceName() {
        
    	return deviceName;
    }

    public abstract void turnOn();
    
    public abstract void turnOff();
}
