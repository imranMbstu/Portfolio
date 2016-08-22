package com.portfolio.util;

import com.portfolio.data.UserInfo;

public class User {

	public static void main(String[] args) {
		UserInfo oUserInfo = new UserInfo();
		oUserInfo.setName("Mohammed Imran Hossain");
		oUserInfo.setEmailId("imran09049@gmail.com");
		oUserInfo.setMobileNumber("01745726083");
		oUserInfo.showUserInformation(oUserInfo);
		
	}

}
