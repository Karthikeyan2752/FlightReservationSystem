package com.userlogin;

import com.dto.User;

public interface UserLoginModelCallBack {

	User userLogin(int userID, String password);

	public User userSignin(String name, String email, String qualification, String password, String mobileNumber,
			String skills);

}
