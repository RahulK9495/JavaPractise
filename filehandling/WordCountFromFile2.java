package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCountFromFile2 {

	public static void main(String[] args) {

		int charcount = 0;
		int wordcount = 0;
		int linecount = 0;
	//	BufferedReader br = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File("abc.txt")));){
			

			String currentline = br.readLine();

			while (currentline != null) {
				linecount++;

				String[] words = currentline.split(" ");

				wordcount += words.length;

				for (String word : words) {
					charcount = charcount + words.length;
				}

				currentline = br.readLine();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
						System.out.println("Finally block executed");
		}

		System.out.println("The total words present in the file " + wordcount);
		System.out.println("The lines words present in the file " + linecount);
		System.out.println("The characters words present in the file " + charcount);
	}

}
