package com.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFileInjava {

	public static void main(String[] args) throws IOException {

		String data = "Welcome to the java";
		String data2 = "Welcome";
		WritetoFilebyusingBufferedWriter(data);
		WritetoFilebyusingFileOutputStream(data2);
	}

	public static void WritetoFilebyusingBufferedWriter(String data) throws IOException {

		BufferedWriter br=new BufferedWriter(new FileWriter(new File("xyz.txt")));
		
		//char[] newData=data.toCharArray();
		
		br.write(data);
		br.close();
		System.out.println("Buffermethod excuted");
	}
	public static void WritetoFilebyusingFileOutputStream(String data) throws IOException {
		
		FileOutputStream fos=new FileOutputStream(new File ("pqr.txt"));
		
		byte[] datan =data.getBytes();
		
		fos.write(datan);
		
		fos.close();
		
		System.out.println("Buffermethod excuted");
	}
	public static void WritetoFilebyusingPrintWriter(String data) throws IOException {
		
		FileWriter fl=new FileWriter(new File("pqr.txt"));
		
		PrintWriter pr=new PrintWriter(fl);
		
		pr.print(data);
		pr.close();
		
	}


}
