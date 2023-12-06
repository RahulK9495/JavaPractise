package com.objectclass;

public class EqualMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1=new Employee(102,"Ram");
		Employee emp2=new Employee(102,"Ram");
		
		System.out.println(emp1==emp2);
		
		System.out.println(emp1.equals(emp2));
		
		int emp1hashcode=emp1.hashCode();
		int emp2hashcode=emp2.hashCode();
		
		System.out.println(emp1hashcode);
		System.out.println(emp2hashcode);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
		System.out.println(emp1.toString());
		
		// below are the two methods by which we call garbage collection in java
		
		emp2=null;
		
		System.gc();
		
		Runtime.getRuntime().gc();
	}

}
