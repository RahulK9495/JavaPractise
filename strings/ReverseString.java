package com.strings;

public class ReverseString {

	public static void main(String[] args) {

		String input="RADAwdwR";
		
		String output = revrserStringbyUsingCharArray(input);
		System.out.println(output);
		
		String palindromeres=isPalindrome(input) ? "Palindrome" :"Not palindrome";
		System.out.println(palindromeres);
		
		String sb=reverseByStringBuffer(input);
		System.out.println(sb);
	}

	public static String revrserStringbyUsingCharArray(String ipString) {
		
		char[]inputArray  =ipString.toCharArray();
		
		char[]reverseArray = new char[inputArray.length];
		
		int counter=0;
		
		for(int i=inputArray.length-1; i>=0; i--)
		{
			reverseArray[counter]=inputArray[i];
			counter++;
		}
		
		return new String(reverseArray);
	}

	public static boolean isPalindrome(String input)
	{
//		String rev=revrserStringbyUsingCharArray(input);
//		
//		if (input.equalsIgnoreCase(rev))
//				return true;
//		else 
//			return false;
		return input.equals(revrserStringbyUsingCharArray(input));
	}
	
	public static String reverseByStringBuffer(String input)
	{
		StringBuffer sb=new StringBuffer(input);
		sb.reverse();
		return new String(sb);
	}
}
