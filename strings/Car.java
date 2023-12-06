package com.strings;

public final class Car {



	private final int model;
	private final String CompanyName;
	private final Engine engine;
	
	
	public Car() {
		super();
		this.model = 0;
		this.CompanyName = "";
		this.engine = new Engine();
		
	}

	public Car(int model, String companyName, Engine engine) {
		super();
		this.model = model;
		this.CompanyName = companyName;
		
		Engine en2=new Engine();
		en2.setName(engine.getName());
		en2.setCapacity(engine.getCapacity());
		
		this.engine = en2;
	}
	
	public int getModel() {
		return model;
	}
	
	public String getCompanyName() {
		return CompanyName;
	}
	
	public Engine getEngine() {
		
		Engine en3=new Engine();
		en3.setCapacity(this.engine.getCapacity());
		en3.setName(this.engine.getName());
		return en3;
	}
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", CompanyName=" + CompanyName + ", engine=" + engine + "]";
	}
}
