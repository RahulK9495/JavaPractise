package com.polymorphism.overloading;

public class OverloadingWithVararg {

//	public void m1(char c)
//	{
//		System.out.println("m1(char c)");
//	}
	
	public void m1(char[]c)
	{
		System.out.println("m1(char[]c)");
	}
	
//	public void m1(int[]c)
//	{
//		System.out.println("m1(int[]c)");
//	}
//	
	public void m1(int...i)
	{
		System.out.println("m1(int...i)");
	}
	
//	public void m1(int i)
//	{
//		System.out.println("m1(int i)");
//	}
//	
	public void m1(Character i)
	{
		System.out.println("m1(Character i)");
	}
	
	public static void main(String[] args) {
		
		OverloadingWithVararg obj=new OverloadingWithVararg();
		obj.m1(1);
		char c='a';
		
		obj.m1(c);
	}
}
