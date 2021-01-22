package com.lhn.formssi.entity;

public class Customer {
	private int customerId;
	private int userId;
	private String questionnaireVersion;
	private String answer;
	private String answerTime;
	private String grade;
	private String dueDate;
	
	private String userName;
	private String userNumber;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getQuestionnaireVersion() {
		return questionnaireVersion;
	}
	public void setQuestionnaireVersion(String questionnaireVersion) {
		this.questionnaireVersion = questionnaireVersion;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswerTime() {
		return answerTime;
	}
	public void setAnswerTime(String answerTime) {
		this.answerTime = answerTime;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", userId=" + userId + ", questionnaireVersion="
				+ questionnaireVersion + ", answer=" + answer + ", answerTime=" + answerTime + ", grade=" + grade
				+ ", dueDate=" + dueDate + ", userName=" + userName + ", userNumber=" + userNumber + "]";
	}
	
}



