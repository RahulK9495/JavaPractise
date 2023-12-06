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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("Finalise method invoked");
		super.finalize();
	}
	
	
	
//	public boolean equals(Object obj)
//	{
//		Employee other=(Employee) obj;
//		Boolean res= false;
//		if(this.empId==other.empId && this.name.equals(other.name))
//			res=true;
//		return res;
//	}
	

}
