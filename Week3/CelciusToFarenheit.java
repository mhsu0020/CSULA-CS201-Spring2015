public class CelciusToFarenheit {

	/*
	 * 
	 * Write a complete Java program that prints out 30 degrees Celcius in
	 * Fahrenheit. Do not use a calculator to calculate the results, use the
	 * math operators in Java to do the math. Use variables for clarity wherever
	 * possible. Do not do the math inside the println. The formula for celcius
	 * to farenheit is: T(°F) = T(°C) × 9/5 + 32 Example output: 30 degrees
	 * Celcius is 86 degrees Farenheit NOTE: You will also be graded on
	 * indentation and naming conventions
	 */

	public static void main(String[] args) {

		double degreesInCelcius = 30;
		double degreesInFarenheit = 0;

		degreesInFarenheit = degreesInCelcius * 9 / 5 + 32;

		System.out.println(degreesInCelcius + " degrees in Celcius is "
				+ degreesInFarenheit + " degrees Farenheit");

	}

}
