package AbstractSmartDevice;



public interface ISmartLight {

	void turnOn();
    
	void turnOff();
    
	void setBrightness(int level);
    
	void setColor(String color);
}
