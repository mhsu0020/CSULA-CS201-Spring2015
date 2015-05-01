import java.util.Scanner;

public class SentinelValues {

	/*
	 * Write a program that reads and calculates the sum of an unspecified
	 * number of integers. The input 0 signifies the end of the input.
	 */
	public static void main(String[] args) {

		// making variables outside of the loop
		int sum = 0;
		int userInput = -1;
		Scanner scanner = new Scanner(System.in);
		while (userInput != 0) {
			System.out
					.println("Enter a number that is not zero to add, enter zero to terminate: ");
			userInput = scanner.nextInt();
			sum += userInput;

		}
		System.out.println("sum: " + sum);
		scanner.close();
	}

}
