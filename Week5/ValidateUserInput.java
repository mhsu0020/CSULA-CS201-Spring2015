import java.util.Scanner;

public class ValidateUserInput {

	public static void main(String[] args) {

		// ask the user to type in a number that is greater than 0, if less than
		// 0 then we keep asking them

		Scanner scanner = new Scanner(System.in);
		int userInput = 0;
		do {
			System.out.println("Enter a number that is greater than 0");
			userInput = scanner.nextInt();
		} while (userInput <= 0);

		// System.out.println("Enter a number that is greater than 0: ");
		// int userInput = scanner.nextInt();
		// //keeps asking for user input if number is <=0
		// while (userInput <= 0) {
		//
		// System.out.println("Enter a number that is greater than 0: ");
		// userInput = scanner.nextInt();
		//
		// }

	}
}
