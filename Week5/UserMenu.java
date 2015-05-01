import java.util.Scanner;

public class UserMenu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			// Present the users with a menu
			System.out.println("Select from the following: ");
			System.out.println("1: option 1\n2: option 2\n3: quit");

			int input = scanner.nextInt();
			switch (input) {

			case 1:
				System.out.println("option 1");
				break;
			case 2:
				System.out.println("option 2");
				break;
			case 3:
				scanner.close();
				System.exit(0);
				break;

			}

		}

	}

}
