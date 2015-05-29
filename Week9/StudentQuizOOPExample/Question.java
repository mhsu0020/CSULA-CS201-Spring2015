public class Question {

	private String questionText;
	private String[] choices = new String[4];
	private int indexOfCorrectAnswer;
	private boolean didStudentGetItRight;
	private int points;

	public Question(String questionText, int indexOfCorrectAnswer,
			String[] choices, int points) {
		this.questionText = questionText;
		this.indexOfCorrectAnswer = indexOfCorrectAnswer;
		this.choices = choices;
		this.didStudentGetItRight = false;
		this.points = points;

	}
	
	/*
	 * Getters (Accessors)
	 * 
	 * */

	public String getQuestionText() {
		return questionText;
	}

	public String[] getChoices() {
		return choices;
	}
	
	public int getPoints()
	{
		return this.points;
	}

	public int getIndexOfCorrectAnswer() {
		return indexOfCorrectAnswer;
	}

	public boolean didStudentGetItRight() {
		return didStudentGetItRight;
	}
	
	/*
	 * 
	 * Setters (Mutators)
	 * 
	 * */

	public void setDidStudentGetItRight(boolean rightOrWrong) {
		this.didStudentGetItRight = rightOrWrong;

	}

}
