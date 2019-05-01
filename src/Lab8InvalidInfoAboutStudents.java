import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab8InvalidInfoAboutStudents {
 
	static String[] students = {"Nikki", "Scott", "Christina", "Bootsy", "Fidget", "Stephen"};
	static int[] age = {31, 32, 26, 45, 28, 22};
	static String[] hometown = {"St. Charles", "Plymouth", "Berkley", "Port Huron", "Hazel Park", "Detroit"};
	static List myList = Arrays.asList(students);
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean userWord = true;
		String userInput;
		String choice;
		
		while (userWord) {
			
			System.out.println(myList);
			System.out.println("Welcome to our Java Class. Which student would you like to know more about? ");
			userInput = scan.nextLine();
			
			try {
				if (myList.contains(userInput)) {
					getAge(userInput);
					} else {
						throw new IllegalArgumentException();
					}
			} catch (IllegalArgumentException e) {
				System.out.println("That student does not exist. Please try again.");
			}
			System.out.println("Would you like to enter another student's name? (y/n)");
			 
			choice = scan.nextLine();
			 {
				 System.out.println("Thankyou goodbye!");
				 userWord = false;
			 }
		} 
	}
			private static void getAge(String userInput) {
				for(int i = 0; i < students.length; i++) {
		            if(userInput.equals(students[i])) {
		                System.out.println(userInput + "'s " + "age is " + age[i] + " and they are from " + hometown[i]);
			}
			 
			 
		}
	}
}
			
	
