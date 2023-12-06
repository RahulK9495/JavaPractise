package com.strings;

public class Address {
	
	int pin;
	String city;
	String Country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pin, String city, String country) {
		super();
		this.pin = pin;
		this.city = city;
		Country = country;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", Country=" + Country + "]";
	}
	
	
	
	
	

}
