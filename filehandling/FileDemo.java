package com.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File file=new File ("abc.txt");
		
		if(file.createNewFile())
			System.out.println("file created successfully");
		else
			System.out.println("File already exist....");
		
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		System.out.println(file.lastModified());
		
		
		FileReader fr=new FileReader(file);
		
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
		
		FileWriter fw =new FileWriter(file);
		
		fw.append("India, officially the Republic of India, is a country in South");
		
	}
}
