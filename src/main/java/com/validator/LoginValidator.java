package com.validator;

public class LoginValidator {

	String uname, pass, error = "";

	public LoginValidator(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}

	public Boolean validate() {

		if (uname.equals("") || uname.equals(null))
			error += "Please provide a valid username";
		if (pass.equals("") || pass.equals(null))
			error += "Input correct password";

		if (error.equals(""))
			return true;
		else
			return false;
	}

	public String getError() {
		return error;
	}

	
	
	

}
