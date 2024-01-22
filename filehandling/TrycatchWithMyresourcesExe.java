package com.filehandling;

public class TrycatchWithMyresourcesExe {

	public static void main(String[] args) {

		
	
		try(MyResource mr=new MyResource(); )
		{
			System.out.println("Inside try blockl");
			throw new NullPointerException();
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
		}
	}

}
