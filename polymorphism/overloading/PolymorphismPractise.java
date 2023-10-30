package com.polymorphism.overloading;

public class PolymorphismPractise {

	
//	public void Addition(int a, int b)
//	{
//		System.out.println("Addition is primitive "+(a+b));
//	}
	
	public void Addition(long a, long b)
	{
		System.out.println("Addition is implicit promotion "+(a+b));
	}
//	public void Addition(long a, int b)
//	{
//		System.out.println("Addition is  minimum implicit promotion "+(a+b));
//	}
	
	public void Addition(Integer a, Integer  b)
	{
		System.out.println("Addition is wrapper Autoboxing "+(a+b));
	}
	
	public void Addition(Long a, Long b)
	{
		System.out.println("Addition is "+(a+b));
	}
	
	public static void main(String[] args) {
		
		Integer a=10;
		Integer b=40;
		PolymorphismPractise p=new PolymorphismPractise();
		p.Addition(10, 50);
	}
	
}
