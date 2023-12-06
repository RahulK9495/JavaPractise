package com.oopprinciples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexString {

	public static void main(String[] args) {
	
		String inputString="Rabcd@1234";
		
		
		if(ValidatePassword(inputString))
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");

		
	}
	
	public static boolean ValidatePassword(String input)
	{
		String pwdpattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
		
//		Pattern p= Pattern.compile(pwdpattern);
//		
//		Matcher m= p.matcher(input);
//		
//		
//		return m.matches();
//		
		return Pattern.matches(pwdpattern, input);
		
	}
	

}
