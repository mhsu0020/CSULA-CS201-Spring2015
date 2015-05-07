import java.util.Scanner;

public class UserMenu {

	public static void printMultiplicationTable() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int maxRowAndColumn = scanner.nextInt();

		for (int rowNumber = 1; rowNumber <= maxRowAndColumn; rowNumber++) {

			for (int columnNumber = 1; columnNumber <= maxRowAndColumn; columnNumber++) {

				System.out.print(" " + rowNumber * columnNumber);
				//
			}
			System.out.println();

		}

	}
	public static void changeOfCases() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scanner.nextLine();

		for (int i = 0; i < input.length(); i++) {

			char character = input.charAt(i);

			// Ascii code for A: 65, Z: 90
			// Ascii code for a: 97, z: 122

			if (Character.isUpperCase(character)) {

				System.out.print(Character.toLowerCase(character));
			}
			// This is lower case
			else {
				System.out.print(Character.toUpperCase(character));
			}
		}

	}

	public static void calculateAverage() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("How many numbers you want to type in?");
		int numberOfInputs = scanner.nextInt();

		int i = numberOfInputs;
		double sum = 0;

		while (i >= 1) {
			int number = scanner.nextInt();
			sum += number;

			i--;
		}

		System.out.println(sum / numberOfInputs);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			// Present the users with a menu
			System.out.println("Select from the following: ");
			System.out
					.println("1: Calculate Average of numbers\n2: change of cases\n3: quit");

			int input = scanner.nextInt();
			switch (input) {

			case 1:
				calculateAverage();
				

				break;
			case 2:

				changeOfCases();
				System.out.println();
				break;
			case 3:
				
				printMultiplicationTable();
				System.out.println();
				break;
				
			case 4:
				scanner.close();
				System.exit(0);
				break;

			}

		}

	}

}
