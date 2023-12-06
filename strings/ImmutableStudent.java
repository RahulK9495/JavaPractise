package com.strings;

public final class ImmutableStudent {
	
	private final int roll;
	private final String name;
	private final Address address;
	
	public ImmutableStudent() {
		super();
		this.roll = 0;
		this.name = "";
		this.address = null;
		}

	public ImmutableStudent(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		Address addrCopy=new Address();
		addrCopy.setPin(address.getPin());
		addrCopy.setCity(address.getCity());
		addrCopy.setCountry(address.getCountry());
		
		this.address = addrCopy;
	}

	public int getRoll() {
		return roll;
	}

	
	
	
	public String getName() {
		return name;
	}

	
	
	
	public Address getAddress() {
		
		Address addr=new Address();
		addr.setPin(this.address.getPin());
		addr.setCity(this.address.getCity());
		addr.setCountry(this.address.getCountry());
		return addr;
	}

	
	
	@Override
	public String toString() {
		return "ImmutableStudent [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
