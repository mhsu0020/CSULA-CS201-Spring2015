public class BMICalculator {

	public static void main(String[] args) {

		double bmi = 0;
		double weight = 100;
		double height = 1.83;

		bmi = weight / (height * height);

		/*
		 * 18.5, 25, 30
		 */

		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if ((18.5 <= bmi) && (bmi < 25)) {
			System.out.println("normal weight");

			// Works the same way without parenthesis
		} else if (25 <= bmi && bmi < 30) {
			System.out.println("overweight");

		} else {
			// BMI >= 30, only possible case
			System.out.println("obese");

		}

		// using mutiple expression, not related to the BMI problem
		if ((bmi >= 100 && bmi <= 200) || (bmi % 2 == 0))

		{

		}

	}

}
