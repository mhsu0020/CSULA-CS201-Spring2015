public class GradeSwitchExample {

	public static void main(String[] args) {
		/*
		 * you can only switch on certain types of data *?:
		 * 
		 * int, char, byte, short
		 */

		// Assume no plus or minus
		char letterGrade = 'A';
		switch (letterGrade) {
		case 'A':
			System.out.println("good job");
			break;
		case 'B':
			System.out.println("ok job for undergrad, barley passing for grad");
			break;
		case 'C':
			System.out.println("barely passing");
			break;
		case 'F':
			System.out.println("see you next quarter");
			break;
		default:
			System.out.println("invalid grade, you probably failed");
			break;
		}

	}

}
