public class Quiz4 {

	/*
	 * Write a static Java boolean method with the name surpriseRKO that solves
	 * the following question: Given a string, if the string contains the string
	 * "RKO" (case sensitive) somewhere, but not at the beginning or the end,
	 * return true, otherwise return false.
	 * 
	 * surpriseRKO("RKO") → false surpriseRKO("kickkickRKODDT") → true
	 * surpriseRKO("blueTimes") → false
	 */

	public static boolean surpriseRKO(String input) {
		return input.contains("RKO") && !(input.indexOf("RKO") == 0)
				&& !input.endsWith("RKO");

	}

	public int rollDiceForDnD(String input) {
		// input: "d"+number
		int maximumNumber = Integer.parseInt(input.substring(1));

		return generateRandomNumbers(1, maximumNumber);

	}

	public static int generateRandomNumbers(int startingNumber, int endingNumber) {

		int randomNumber = 0;
		randomNumber = (int) (startingNumber + Math.random() * endingNumber);
		return randomNumber;

	}

	public static void main(String[] args) {

	}
}
