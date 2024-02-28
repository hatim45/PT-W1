//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		
		System.out.println("Week 1 Lab");

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight
		int availablePlaneSeats = 10;
		
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfFood = 23.64;

		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'P';


		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = false;	
		
				

		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Timmy";

		
		// 6. Create a variable to hold a street address
		String streetAddress = "1707 LalaLand";

		// 7. Print all variables to the console
		System.out.println("Available Seats left on plane" + availablePlaneSeats);
		System.out.println(costOfFood);
		System.out.println(middleInitial);
		System.out.println(costOfFood);
		System.out.println(isHotOutside);
		System.out.println(customerFirstName);
		System.out.println(streetAddress);
		
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2;
		System.out.println(availablePlaneSeats);
		
				

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'X';
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHotOutside = true;


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = customerFirstName + middleInitial + " Oz" ;
		System.out.println(fullName);		

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

		String customerIntro = "Hello my Name is " + fullName + ". I live at " + streetAddress;
		System.out.println(customerIntro);
				
		
	}
}