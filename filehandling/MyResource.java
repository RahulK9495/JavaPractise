package com.filehandling;

public class MyResource implements AutoCloseable {

	@Override
	public void close() throws Exception {

		System.out.println("Close method envoked ....");
	}

}
