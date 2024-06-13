package AbstractSmartDevice;



import java.util.Arrays;

public class SmartHomeController {
    private AbstractSmartDevice[] devices;
    private int deviceCount;

    public SmartHomeController(int initialCapacity) {
        devices = new AbstractSmartDevice[initialCapacity];
        deviceCount = 0;
    }

    public void addDevice(AbstractSmartDevice device) {
        if (deviceCount == devices.length) {
            resizeArray();
        }
        devices[deviceCount++] = device;
        System.out.println("Device added: " + device.getDeviceName());
    }

    public void removeDevice(String deviceId) {
        int index = -1;
        for (int i = 0; i < deviceCount; i++) {
            if (devices[i].getDeviceId().equals(deviceId)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Device removed: " + devices[index].getDeviceName());
            for (int i = index; i < deviceCount - 1; i++) {
                devices[i] = devices[i + 1];
            }
            devices[--deviceCount] = null;
        } else {
            System.out.println("Device not found.");
        }
    }

    public void turnAllDevicesOn() {
        for (int i = 0; i < deviceCount; i++) {
            devices[i].turnOn();
        }
    }

    public void turnAllDevicesOff() {
        for (int i = 0; i < deviceCount; i++) {
            devices[i].turnOff();
        }
    }

    public void displayDevices() {
        if (deviceCount == 0) {
            System.out.println("No devices to display.");
        } else {
            for (int i = 0; i < deviceCount; i++) {
                System.out.println(devices[i].getDeviceName());
            }
        }
    }

    private void resizeArray() {
        AbstractSmartDevice[] newArray = new AbstractSmartDevice[devices.length * 2];
        System.arraycopy(devices, 0, newArray, 0, devices.length);
        devices = newArray;
    }
}
