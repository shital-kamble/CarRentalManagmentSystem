package CarManagment;

import java.time.LocalDate;

public class Rental {
    
	private Car car;
    
	private Customers customers;
    
	private LocalDate rentalDate;
    
	private LocalDate returnDate;

    public Rental(Car car, Customers customers, LocalDate rentalDate) {
        
    	if (rentalDate.isAfter(LocalDate.now())) {
        
    		throw new IllegalArgumentException("Rental date cannot be in the future");
        }

        this.car = car;
       
        this.customers = customers;
        
        this.rentalDate = rentalDate;
        
        this.returnDate = null;

        car.rent();
        customers.addRentedCar(car);
    }

    public Car getCar() {
        return car;
    }


    public Customers getCustomer() {
    
    	return customers;
    }

    public LocalDate getRentalDate() {
        
    	return rentalDate;
    }

    public LocalDate getReturnDate() {
        
    	return returnDate;
    }

    public void returnCar(LocalDate returnDate) {
        
    	if (returnDate.isBefore(rentalDate)) {
        
    		throw new IllegalArgumentException("Return date must be after the rental date");
        }
        this.returnDate = returnDate;
        car.returnCar();
        customers.removeRentedCar(car);
    }
}
