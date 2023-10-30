package com.objectclass;

public class Student implements Cloneable {

	int roll;
	String name;
	Add address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, Add address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Add ad = new Add(416215, "Pune");
		ad.City = "Mumbai";

		Student s1 = new Student(3, "Ram", ad);

		Student s2 = (Student) s1.clone();

		System.out.println(s1 == s2);

		System.out.println(s1.address == s2.address);
		System.out.println(s1.roll == s2.roll);

		System.out.println("=========S1==========");
		s2.address.City = "dubai";
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.address.pin);
		System.out.println(s1.address.City);

		System.out.println("=========s2==========");
		System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.address.pin);
		System.out.println(s2.address.City);
	}

}
