package com.lhn.formssi.entity;

public class Questionnaire {
	private int questionNumber = 0;
	private String questionType;
	private String questionTitle;
	private String questionOption;
	private String version;
	
	public int getQuestionNumber() {
		return questionNumber;
	}
	public void setQuestionNumber(int questionNumber) {
		this.questionNumber += 1;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getQuestionOption() {
		return questionOption;
	}
	public void setQuestionOption(String questionOption) {
		this.questionOption = questionOption;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Questionnaire [questionType=" + questionType + ", questionTitle=" + questionTitle + ", questionOption="
				+ questionOption + ", version=" + version + "]";
	}
	
	
}
