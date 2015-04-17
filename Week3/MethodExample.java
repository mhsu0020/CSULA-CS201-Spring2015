public class MethodExample {

	/*
	 * Method with no return type, just prints out stuff
	 * */
	public static void printWelcomeMessage() {

		System.out.println("Welcome to CS201");

	}

	/*
	 * takes in a String parameter, then prints that out
	 * */
	public static void printCustomMessage(String message) {

		System.out.println("Custom message: " + message);

	}
	
	/*
	 * Using parameters to do calculation, then return the result
	 * */
	public static double calculateTriangleArea(double base, double height) {

		double area = base * height / 2;
		return area;

	}

	public static void main(String[] args) {

		MethodExample.printWelcomeMessage();

		//The name of the variable you're passing in doesn't have to match the name of the parameter
		String customMessage = "this is message";
		MethodExample.printCustomMessage(customMessage);

		System.out.println(MethodExample.calculateTriangleArea(3, 4));

	}

}
