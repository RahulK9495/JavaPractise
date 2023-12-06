package com.strings;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="hello";
		String s2="world";
		
		String s3=new String("hello");
		String s4=new String("world");
		
		String s5=new String("helloworld");
		String s6="helloworld";
		
		String s7= s1+s2; //concatenation operator always create new string
		
		String s8= s3+s4;  //concatenation operator always create new string
		
		String s9= (s1.concat(s2));  //concatenation operator always create new string
		String s10= (s3.concat(s4));
		
		System.out.println(s7);
		System.out.println(s8);
		
		System.out.println(s6==s7);
		System.out.println(s6==s8);
		System.out.println(s6==s9);
		System.out.println(s6==s10);
		
		
	}

}
