public class Quiz {

	private int numberOfQuestions;
	private double quizScorePercentage;
	private Question[] questions = new Question[100];

	public Quiz(int numberOfQuestions, Question[] questions) {
		this.numberOfQuestions = numberOfQuestions;
		this.questions = questions;

	}
	
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	public double getQuizScore() {
		return quizScorePercentage;
	}

	public Question[] getQuestions() {
		return questions;
	}
	
	public void updateQuizScore() {
		double pointsEarned = 0;
		double pointsAvaiable = 0;
		for (Question question : questions) {
			pointsAvaiable += question.getPoints();
			// Either true or false
			if (question.didStudentGetItRight()) {
				pointsEarned += question.getPoints();
			}
		}
		this.quizScorePercentage = (pointsEarned / pointsAvaiable) * 100;
	}
}
