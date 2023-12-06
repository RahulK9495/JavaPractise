package com.oopprinciples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email="abcdK@gefefamilc2o&#*&#^Lm";
		
		if(validateEmail(email))
			System.out.println("Valid email");
		else
			System.out.println("Invalid email");
	}

	public static boolean validateEmail(String inputemail) {
		
		String emailregex ="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@\" + \"[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		
		Pattern p= Pattern.compile(emailregex);
		
		Matcher m= p.matcher(inputemail);
		
		return m.matches();
	}

}
