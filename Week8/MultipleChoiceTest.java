import java.util.Random;

public class MultipleChoiceTest {

	public static void main(String[] args) {
		/*
		 * Make a two dimensional array, with the row being the response for the
		 * test from a particular student, and the columns being the studnet's
		 * response to a particular question
		 */
		char[][] studentResponses = new char[8][10];

		/* Randomly generate the student responses */
		for (int i = 0; i < studentResponses.length; i++) {
			for (int j = 0; j < studentResponses[i].length; j++) {
				studentResponses[i][j] = generateRandomTestAnswer();
			}
		}
		/* Randomly generated answer keys */
		char[] answerKey = new char[10];
		for (int i = 0; i < answerKey.length; i++) {
			answerKey[i] = generateRandomTestAnswer();
		}
		/* Grading time */
		for (int i = 0; i < studentResponses.length; i++) {
			int studentGrade = 0;
			
			for (int j = 0; j < studentResponses[i].length; j++) {
				char studentResponseForQuestion = studentResponses[i][j];
				char correctResponse = answerKey[j];
				if (studentResponseForQuestion == correctResponse) {
					studentGrade++;
				}

			}
			System.out.println("Student#"+i+" got "+studentGrade+" out of 10 right!");
			
		}

	}

	/* a character between A and E inclusive */
	public static char generateRandomTestAnswer() {
		// Upper case A is 65
		// Upper case E is 69
		Random rand = new Random();
		return (char) (rand.nextInt((69 - 65) + 1) + 65);
	}

}
