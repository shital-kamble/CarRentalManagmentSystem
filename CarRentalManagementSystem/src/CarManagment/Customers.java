package CarManagment;

import java.util.Arrays;

public class Customers {
    
	private String customerId;
    
	private String name;
    
	private String email;
    
	private Car[] rentedCars;
    
	private int rentedCarCount;

    private static final int MAX_RENTED_CARS = 10;

    public Customers(String customerId, String name, String email) {
        if (customerId == null || customerId.isEmpty()) {
            throw new IllegalArgumentException("Customer ID cannot be null or empty");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email must contain '@' symbol");
        }

        this.customerId = customerId;
    
        this.name = name;
        
        this.email = email;
        
        this.rentedCars = new Car[MAX_RENTED_CARS];
        
        this.rentedCarCount = 0;
        
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Car[] getRentedCars() {
        return Arrays.copyOf(rentedCars, rentedCarCount);
    }

    public void addRentedCar(Car car) {
    
    	if (rentedCarCount >= MAX_RENTED_CARS) {
        
    		throw new IllegalStateException("Customer cannot rent more than " + MAX_RENTED_CARS + " cars");
        }
        
    	for (int i = 0; i < rentedCarCount; i++) {
        
    		if (rentedCars[i].equals(car)) {
            
    			throw new IllegalArgumentException("Car is already rented by this customer");
            }
        }
        rentedCars[rentedCarCount++] = car;
    }

    public void removeRentedCar(Car car) {
        
    	boolean found = false;
        
    	for (int i = 0; i < rentedCarCount; i++) {
        
    		if (rentedCars[i].equals(car)) {
                rentedCars[i] = rentedCars[--rentedCarCount];
                rentedCars[rentedCarCount] = null;
                found = true;
                break;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("Car is not rented by this customer");
        }
    }
}
