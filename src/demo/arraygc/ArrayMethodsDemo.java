package demo.arraygc;

import java.util.Arrays;

public class ArrayMethodsDemo {

	public static void main(String[] args) {
		double[] prices = {4.44, 3.33, 2.22, 1.99};

		System.out.println(Arrays.toString(prices));
//		Arrays.fill(prices, 4.99); // changes all values
//		Arrays.fill(prices, 0, 2, 4.99); // changes values within a range the end index is exclusive
//		System.out.println(Arrays.toString(prices));
		
		double[] prices2 = {4.44, 3.33, 2.22, 1.99};
		
		// because arrays are reference types we should never use == to check equality
		// this will return false
		System.out.println(prices == prices2);
		
		// we need to use the equals method to check for equality
		System.out.println(Arrays.equals(prices,  prices2));
		
		String[] students = {"Victoria", "Nick", "Luke", "Finny"};
		// change the names
		
		// be careful!!!! this is dangerous both variables(or identifiers) are pointing to the same memory location
		// changing one will change the other, this is usually not what you want when making a copy
		String[] professionals = students; 
		
		System.out.println(Arrays.toString(students));
		System.out.println(Arrays.toString(professionals));
		students[0] = "Alayna";
		professionals[2] = "Rohit";
		System.out.println(Arrays.toString(students));
		System.out.println(Arrays.toString(professionals));
		
		// to make a true copy that wont be hurt by changes to one or the other use the copyOf method
		String[] realPros = Arrays.copyOf(students, 2);
		// we used a copyOf static method of that class
		realPros[0] = "Nikki";
		System.out.println("copyOf Method: ");
		System.out.println(Arrays.toString(students));
		System.out.println(Arrays.toString(realPros));
		
		// parallel arrays -- series of arrays that match two different indexes for different things
		// they typically have the same amount of items but may be different types
		// that use the indices to reference things that go together
		
		String[] players = {"Nick", "Adam", "Devosha", "Stassi"};
		int[] jerseyNums = {3, 15, 2, 14};
		String[] teamName = {"Arsenal", "Chelsea", "Cookie Love", "Lit"};
		// to print out player name and the number
		// in for loop it doesnt matter which one to use
		
		for(int i = 0; i < players.length; i++) {
			System.out.println(jerseyNums[i] + " " + players[i] + " " + teamName[i]);
		}
		
		// this will be an int[] and we want to see the details
				// we need a sysout because 
		int[] jerseyNums2 = {3, 15, 14, 67, 89, 32};
		int jerseySum =  sumArray(jerseyNums2);
		System.out.println(jerseySum);
		
		
		// assigned to a variable for readability
		String[] testFood = getFoodArray("fruit");
		System.out.println(Arrays.toString(getFoodArray("Fruit")));
		
		
	}
	
	public static int sumArray(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static String[] getFoodArray(String food) { // now if we want to add another item to foods -- string -- set food 
		// creating string array
		String[] foods = {"Cookie", "Salad", "hand pies", "buffalo chicken dip"};
		// now return the entire array
		// what do we need to put in? the name which is foods\
		foods[3] = food;
		return foods;
		
	}

}
