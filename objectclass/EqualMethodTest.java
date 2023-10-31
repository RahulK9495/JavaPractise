package com.objectclass;

public class EqualMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1=new Employee(102,"Ram");
		Employee emp2=new Employee(102,"Ram");
		
		System.out.println(emp1==emp2);
		
		System.out.println(emp1.equals(emp2));
	}

}
