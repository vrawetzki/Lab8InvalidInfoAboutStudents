package demo.arraygc;

import java.util.Arrays;
import java.util.Scanner;



public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a size for the array: ");
		int size = scan.nextInt();
		scan.nextLine(); //garbage line to clean out my scanner to take input for the cars
		size = 43;
		
		
		// arrays must always be declared with a size
		// if we dont assign values when we create an array
		// they will return their default value
		
		// we have methods available to us if we dont know the size
		int [] arr = new int[size]; // the number means it has three boxes available to it
								// the index is starting at 0 -- so 0,1,2
		arr[1] = 5; // this is assigning the element at index 1 to 5, his is modifying the element at index 1 to 5
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		// declaring and initializing in one line
		String[] names = { "Laura", "Alex", "Mary", "Chan" };
		System.out.println("Names: " + names.length);
	
		names[2] = "linmei"; // by writing the number 2, which is mary, were now replacing her with linmei
		
		System.out.println(Arrays.toString(names));
		//System.out.println(names[5]); will cause an ArrayINdexOutOfBoundsException
		// if we only want to see a few names, use a for loop
		// initialize; boolean exp; update
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		// now to remove chan, at the last place -- change for(int i = 0; i < names.length; i++) tp for(int i = 0; i < names.length - 1; i++) 
		}
		
		// declare boolean array
		// if no value is assigned it'll take the default values for that type
		// so in this case -- boolean = false
		boolean[] boolTest = new boolean[4];
		// to assign values to indexes out of order, see the two boolTest
		boolTest[3] = true;
		boolTest[1] = true;
		System.out.println(Arrays.toString(boolTest));
		
		//declaring and initalizing in 2 steps
		// i can put an int 
		double[] arr2;
		arr2 = new double[6];
		arr2[4] = 56; // remember ints can be assigned to doubles they are implicitly casted
		System.out.println(Arrays.toString(arr2));
		
		final int ARR_SIZE = 5; // this is a constant -- all caps usually signifies it will never change
		String[] cars = new String[ARR_SIZE];
		
		// to automate this process, how?
		// prompt the user for individual options
		
		for (int i = 0; i < cars.length; i++) {
		System.out.println("Please enter car #: " + (i + 1));
		// we dont want it to start at 0
		// now we want to consume the line, but since its a string we'll need
		// to use the scanner
		// if you change the i=0 to i=1 and remove the - 1, the first element will
		// come back as 0
		// (int i = 1; i < cars.length; i++) {system.out.println("Please enter car#: " + i)}
		String car = scan.nextLine();
		cars[i] = car;
		}
		
		System.out.println(Arrays.toString(cars));
		
		System.out.println("Printing the array in reverse order");
		
		// code that prints teh values in reverse
		for (int i = cars.length - 1; i >= 0; i--) {
			// printing i just to see the index location
			System.out.println(i + " " + cars[i]);
		}
		
		
		double[] prices = {5.5, 4.39, 2.25, 9.99};
		double sum = 0;
		// we want to loop through the prices
		// this is an enchanced for loop (aka, foreach)
		// allows me to process / traverse through data structures
		// but we cant access the index directly with this loop
		
		
		
		
		for(double p: prices) {
				System.out.println(p); // therefore we only need to use the variable reference to see teh values
				if (p == 5.55) {
					// then do this stuff
				}
		}
		
		
		for (double p: prices) {
			sum = sum + p; // can also use the += operator sum += p;
		}
		System.out.println("Average: " + sum/prices.length);
		
		
	// this examples shows what you cant do with a foreach loop
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
			if (i == 2 || prices[i] == 5.55) {
				// we could not access the index with the foreach loop above
				// we have an or statement to show flexibitly
				System.out.println("You found the second index 2: ");
			}
		}
	}
}
