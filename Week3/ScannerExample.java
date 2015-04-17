import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		// The identifier doesn't matter, is just need to make sensel
		Scanner scanner = new Scanner(System.in);
		//reading in a number
		System.out.println("Enter a String:");
		
		/*
		 * Example using nextLine to consume end of line character
		 * 
		 * */
		int keyboardInput = scanner.nextInt();
		System.out.println("you typed in " + keyboardInput);
		
		//Consumes carriage return(enter key)
		scanner.nextLine();
		
		//How to read in an entire line?
		System.out.println("Enter a line:");
		String keyboardInputLine = scanner.nextLine();
		System.out.println("You typed in "+keyboardInputLine);
		
		
		/*
		 * Example using nextLine read everything
		 * 
		 * */
		//Reads in entire line
		int keyboardInputTwo = Integer.parseInt(scanner.nextLine());
		System.out.println("you typed in " + keyboardInput);
		
	}

}
