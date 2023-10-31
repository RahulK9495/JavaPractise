package com.objectclass;

import java.util.Objects;

public class Employee {
	
	int empId;
	String name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(empId, name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return empId == other.empId && Objects.equals(name, other.name);
//	}
	
//	public boolean equals(Object obj)
//	{
//		Employee other=(Employee) obj;
//		Boolean res= false;
//		if(this.empId==other.empId && this.name.equals(other.name))
//			res=true;
//		return res;
//	}
	

}
