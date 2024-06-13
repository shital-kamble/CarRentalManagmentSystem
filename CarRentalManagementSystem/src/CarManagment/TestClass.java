package CarManagment;

import java.time.LocalDate;

public class TestClass {
    
	public static void main(String[] args) {
        
		// Create some car instances
    
		Car Car1 = new Car("ABC123", "Model S", "Tesla", 2020);
        
		Car Car2 = new Car("XYZ789", "Civic", "Honda", 2018);
		
		Car Car3 = new Car("XYZ722", "Civi", "SUZUKA", 2024);

        // Create some customer instances
       
		Customers customer1 = new Customers("CUST001", "John Doe", "john.doe@example.com");
        
		Customers customer2 = new Customers("CUST002", "Jane Smith", "jane.smith@example.com");

        // Create some rental instances		1
        Rental rental1 = new Rental(Car1, customer1, LocalDate.of(2024, 6, 1));
       
        System.out.println("Car1 rented by Customer1 on " + rental1.getRentalDate());

        // Return car1
        rental1.returnCar(LocalDate.of(2024, 6, 10));

        System.out.println("Car1 returned by Customer1 on " + rental1.getReturnDate());

        // Try to rent car1 again
        Rental rental2 = new Rental(Car1, customer2, LocalDate.of(2024, 6, 11));
        
        System.out.println("Car1 rented by Customer2 on " + rental2.getRentalDate());

        
        // Demonstrate validation (uncomment to test)
        // Car carInvalid = new Car("", "Model X", "Tesla", 2021); // Invalid license plate
        // Customer customerInvalid = new Customer("CUST003", "Alice", "aliceexample.com"); // Invalid email
        // Rental rentalInvalidDate = new Rental(car2, customer2, LocalDate.of(2025, 6, 1)); // Rental date in the future
        // rental1.returnCar(LocalDate.of(2024, 5, 1)); // Return date before rental date
    }
}
