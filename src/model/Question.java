package model;

public class Question {
	private String Question;
	private String OptionA;
	private String OptionB;
	private String OptionC;
	private String OptionD;
	private String CorrectOp;
	
	
	//setter and getter function for set and fetch Question data
	
	public String getQuestion() {
		return Question;
		
	}
	public void setQuestion(String question) {
		Question = question;
		System.out.println("Question of Model is set- "+question);
	}
	public String getOptionA() {
		return OptionA;
	}
	public void setOptionA(String optionA) {
		OptionA = optionA;
		System.out.println("OptionA of Model is set- "+optionA);
	}
	public String getOptionB() {
		return OptionB;
	}
	public void setOptionB(String optionB) {
		OptionB = optionB;
		System.out.println("OptionB of Model is set- "+optionB);
	}
	public String getOptionC() {
		return OptionC;
	}
	public void setOptionC(String optionC) {
		OptionC = optionC;
		System.out.println("OptionC of Model is set- "+optionC);
	
	}
	public String getOptionD() {
		return OptionD;
	}
	public void setOptionD(String optionD) {
		OptionD = optionD;
		System.out.println("OptionD of Model is set- "+optionD);
	}
	public String getCorrectOp() {
		return CorrectOp;
	}
	public void setCorrectOp(String correctOp) {
		CorrectOp = correctOp;
		System.out.println("CorrectOp of Model is set- "+correctOp);
	}
	

}
