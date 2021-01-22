package com.lhn.formssi.entity;

public class User {
	private int userId;
	private String userName;
	private String idCard;
	private String sex;
	private int age;
	private String icbcBranchNumber;
	private String accountNumber;
	private String password;
	private String userNumber;
	private String license;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getIcbcBranchNumber() {
		return icbcBranchNumber;
	}
	public void setIcbcBranchNumber(String icbcBranchNumber) {
		this.icbcBranchNumber = icbcBranchNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", idCard=" + idCard + ", sex=" + sex + ", age="
				+ age + ", icbcBranchNumber=" + icbcBranchNumber + ", accountNumber=" + accountNumber + ", password="
				+ password + ", userNumber=" + userNumber + ", license=" + license + "]";
	}
}
