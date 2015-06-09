import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {

	public boolean isArraySorted(int[] arrayToCheck) {
		
		int[] sortedArray = new int[arrayToCheck.length];
		System.arraycopy(arrayToCheck, 0, sortedArray, 0, arrayToCheck.length);
		Arrays.sort(sortedArray);

		for (int i = 0; i < arrayToCheck.length; i++) {
			if (arrayToCheck[i] != sortedArray[i]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("How many numbers type in? ");
		int numberOfNumbers = scanner.nextInt();
		int[] userInput = new int[numberOfNumbers];

		System.out.println("Type in the numbers: ");
		for (int i = 0; i < userInput.length; i++) {
			userInput[i] = scanner.nextInt();
		}
		Problem9 problem = new Problem9();
		System.out.println("is array sorted?: "+problem.isArraySorted(userInput));
		// Check if it's sorted

	}

}
