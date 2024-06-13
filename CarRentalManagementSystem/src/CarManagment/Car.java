package CarManagment;

public class Car {

	private String licensePlate;

	private String model;
    
	private String brand;
    
	private int year;
    
	private boolean available;

    public Car(String licensePlate, String model, String brand, int year) {
        
    	if (licensePlate == null || licensePlate.isEmpty()) {
        
    		throw new IllegalArgumentException("License plate cannot be null or empty");
        }
        
    	if (year <= 0) {
        
    		throw new IllegalArgumentException("Year must be a positive number");
        }

        this.licensePlate = licensePlate;
        
        this.model = model;
        
        this.brand = brand;
        
        this.year = year;
        
        this.available = true;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rent() {
        if (!available) {
            throw new IllegalStateException("Car is already rented");
        }
        available = false;
    }

    public void returnCar() {
        if (available) {
            throw new IllegalStateException("Car is already available");
        }
        available = true;
    }
}
