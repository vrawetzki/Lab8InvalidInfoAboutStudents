package demo.arraygc;

//given an array of ints length 3,
//figure out with is larger
//the first or last element in the array
//and set all the other elements to be that value.
//return the changed array


public class CodeChallengeDay7 {

	public static void main(String[] args) {
		int[] arr = { 98, 43, 22 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max += arr[i];
				}
		}
			System.out.println("The Given Array Elements are: ");
	
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr(i));
			}
			
			System.out.println("From the Given Elements, the largest is: " + max);
			
			return;
	// your method should start here
	// and should be returning an int[]
	// same value in three positions
		
}

	private static char[] arr(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	}

