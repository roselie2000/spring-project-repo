package com.chainsys.sample.validator;

import org.springframework.stereotype.Repository;

@Repository
public class userValidator {

	public boolean checkname(String name) {
		if(name == null || name.equals("") || name.trim().equals("") || name.length() < 3) {
			System.out.println("Please!, enter a valid name");
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean checkpwd(String pwd) {
		if(pwd.length() > 8) {
			return true;
		}
		else {
			return false;
		}
	}
}
