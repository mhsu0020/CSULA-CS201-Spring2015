public class StudentQuizRunner {

	public static void main(String[] args) {

		// Create questions, quizzes, and students
		Question questionOne = new Question("What is 1+1?", 1, new String[] {
				"1", "2", "3", "4" }, 50);
		Question questionTwo = new Question("What is 2+2?", 3, new String[] {
				"1", "2", "3", "4" }, 50);
		Quiz quizOne = new Quiz(2, new Question[] { questionOne, questionTwo });
		Question questionThree = new Question("What is 0+1?", 0, new String[] {
				"1", "2", "3", "4" }, 50);
		Question questionFour = new Question("What is 0+2?", 1, new String[] {
				"1", "2", "3", "4" }, 50);
		Quiz quizTwo = new Quiz(2, new Question[] { questionThree, questionFour });
		Student studentOne = new Student("John", "123456789");
		studentOne.takeQuiz(quizOne);
		studentOne.takeQuiz(quizTwo);
		System.out.println(studentOne.getScoreReportString());
		
	}

}
