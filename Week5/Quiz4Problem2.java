import java.util.Scanner;

/*
 * Write a complete java program that asks to user to enter a string, then print out the user-entered string in all caps. Replace all "w"s with "v"s for both upper case and lower case.
 Example:
 "I want to watch this movie"      ->     "I VANT TO VATCH THIS MOVIE"
 * 
 * */

public class Quiz4Problem2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userInput = scanner.nextLine();
		userInput = userInput.toUpperCase();
		userInput = userInput.replace('W', 'V');
		System.out.println(userInput);
		scanner.close();
	}

}
