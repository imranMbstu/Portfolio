package com.portfolio.data;

public class UserInfo {
	
	private String name = "";
	private String emailId = "";
	private String mobileNumber = "";
	
	public UserInfo(){
		this.name = "";
		this.emailId = "";
		this.mobileNumber = "";
	}
	
	public UserInfo(String name, String emailId, String mobileNumber) {
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public void showUserInformation(UserInfo oUserInfo){
		System.out.print("User Information");
		System.out.print("\nName : "+oUserInfo.getName());
		System.out.print("\nEmailId : "+oUserInfo.getEmailId());
		System.out.print("\nMobile Number : "+oUserInfo.getMobileNumber());
		System.out.print("\n***** Thank You *****");
	}
	
}
