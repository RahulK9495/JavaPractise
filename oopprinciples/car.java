package com.oopprinciples;

public class car implements Vehicle{
	
	car c;
	
	public void deleteCar()
	{
		if(this instanceof Vehicle)
		System.out.println("The car is deleted !!!!");
		else
			{
			throw new RuntimeException("method is not deletable ..!!");
			}
	}

	
}
