package com.strings;

public class TestImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address=new Address(1019, "Pune", "India");

		ImmutableStudent s=new ImmutableStudent(10, "Ram", address);
		
		System.out.println("Before modification "+ s);
		
		//s.address="Mumbai";
		s.getAddress().setCity("Mumabi");
		
		System.out.println("After Modification :"+ s);
		
		Engine en =new Engine("petrol", 2.4f);
		
		
		Car c=new Car(2021, "Maruti", en);
		System.out.println("Before modification "+c);
		
		c.getEngine().setCapacity(8.9f);
		//c.engine="Horizontal";
		System.out.println("After Modification :"+c);
	}

}
