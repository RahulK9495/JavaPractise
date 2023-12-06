package com.strings;

public class Engine {


	String name;

	float capacity;
	
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Engine(String name, float capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getCapacity() {
		return capacity;
	}
	
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return "Engine [name=" + name + ", capacity=" + capacity + "]";
	}
}
