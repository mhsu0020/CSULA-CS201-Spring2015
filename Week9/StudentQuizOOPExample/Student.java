import java.util.Arrays;
import java.util.Scanner;

public class Student {

	private String name;
	private String CIN;
	private int numberOfQuizzesTaken;
	private Quiz[] quizzesTaken = new Quiz[100];

	public Student(String name, String CIN) {
		this.name = name;
		this.CIN = CIN;
		this.numberOfQuizzesTaken = 0;
	}

	public String getName() {
		return name;
	}

	public String getCIN() {
		return CIN;
	}

	public Quiz[] getQuizzesTaken() {
		return quizzesTaken;
	}

	public String getScoreReportString() {

		String scoreReportString = "";
		/*
		 * We have to use numberOfQuizzesTaken because we made a big Quiz array
		 * to store the Quizzes, but we actually only have two quizzes
		 */
		for (int i = 0; i < numberOfQuizzesTaken; i++) {

			double percentage = quizzesTaken[i].getQuizScore();
			scoreReportString += "Quiz #" + (i + 1) + " : " + percentage
					+ "%\n";
		}
		return scoreReportString;
	}

	public void takeQuiz(Quiz quizTaken) {
		// Taking a quiz. Print out each question, ask for student input, and
		// determine if it's right or wrong
		Scanner scanner = new Scanner(System.in);
		for (Question question : quizTaken.getQuestions()) {
			System.out.println(question.getQuestionText());
			System.out.println(Arrays.toString(question.getChoices()));
			System.out.println("Enter the index of the answer: ");
			int choice = scanner.nextInt();

			// get rid of the carriage return
			scanner.nextLine();

			if (choice == question.getIndexOfCorrectAnswer()) {
				// set didStudentGetItRight to True if they get it right
				question.setDidStudentGetItRight(true);
			}
		}
		quizTaken.updateQuizScore();
		quizzesTaken[this.numberOfQuizzesTaken] = quizTaken;
		this.numberOfQuizzesTaken++;
		scanner.close();

	}

}
