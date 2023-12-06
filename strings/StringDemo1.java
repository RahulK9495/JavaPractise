package com.strings;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] data= {'h','e','l','l','o'};
		
		String s1=new String("hello");
		String s2="hello";
		String s3=new String(data);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		
	
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
		System.out.println("before s1 interned : "+(s1==s2));
		
		s1=s1.intern();
		
		System.out.println("After s1 interned : "+(s1==s2));
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		
	}

}
