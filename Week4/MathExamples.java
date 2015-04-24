public class MathExamples {

	public static double solveTriangle(double side1, double side2) {

		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

		
	}

	public static int generateRandomNumbers(int startingNumber, int endingNumber) {

		int randomNumber = 0;

		randomNumber = (int) (startingNumber + Math.random() * endingNumber);

		return randomNumber;

	}

	public static void main(String[] args) {

		System.out.println(MathExamples.generateRandomNumbers(1, 10));
		System.out.println(MathExamples.solveTriangle(3, 4));
	
		
	}

}
