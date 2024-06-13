package AbstractSmartDevice;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartHomeController controller = new SmartHomeController(2);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Add Device");
            System.out.println("2. Remove Device");
            System.out.println("3. Turn All Devices On");
            System.out.println("4. Turn All Devices Off");
            System.out.println("5. Display Devices");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline

            switch (choice) {
                case 1:
                    System.out.println("Select Device Type:");
                    System.out.println("1. Smart Light");
                    System.out.println("2. Smart Thermostat");
                    System.out.println("3. Smart Camera");
                    int deviceType = scanner.nextInt();
                    scanner.nextLine();  // consume the newline

                    System.out.print("Enter Device ID: ");
                    String deviceId = scanner.nextLine();
                    System.out.print("Enter Device Name: ");
                    String deviceName = scanner.nextLine();

                    switch (deviceType) {
                        case 1:
                            System.out.print("Enter Initial Brightness: ");
                            int brightness = scanner.nextInt();
                            scanner.nextLine();  // consume the newline
                            System.out.print("Enter Initial Color: ");
                            String color = scanner.nextLine();
                            SmartLight light = new SmartLight(deviceId, deviceName);
                            light.setBrightness(brightness);
                            light.setColor(color);
                            controller.addDevice(light);
                            break;
                        case 2:
                            System.out.print("Enter Initial Temperature: ");
                            double temperature = scanner.nextDouble();
                            scanner.nextLine();  // consume the newline
                            SmartThermostat thermostat = new SmartThermostat(deviceId, deviceName);
                            thermostat.setTemperature(temperature);
                            controller.addDevice(thermostat);
                            break;
                        case 3:
                            SmartCamera camera = new SmartCamera(deviceId, deviceName);
                            controller.addDevice(camera);
                            break;
                        default:
                            System.out.println("Invalid device type.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Device ID to remove: ");
                    String removeId = scanner.nextLine();
                    controller.removeDevice(removeId);
                    break;
                case 3:
                    controller.turnAllDevicesOn();
                    break;
                case 4:
                    controller.turnAllDevicesOff();
                    break;
                case 5:
                    controller.displayDevices();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}


