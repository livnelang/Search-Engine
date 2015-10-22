package com.engine.search;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ParseException {
		
		Manager manager= new Manager();
		manager.parseDocuments();
		manager.getClass();
		
		
		
		/* A metoed for creating terms and inserting them to dictionary*/
		/* TO DO: put it in the correct class */
		// TO DO: should be for all files - i did it - but check it, i didnt check 
		// TO DO: should be in manager class
		// TO DO: should be after initialize Library
		Vector <String> words;
		String pathname = "C:/Users/user/Desktop/test.txt";
		BufferedReader br = new BufferedReader(new FileReader(pathname));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine(); // Take the first line
			while (line != null) {
				sb.append(line); // Add line
				sb.append("\n");
				String[] word = line.split("[\\W]"); // split words to array of string from the current line
				for(int i=0; i<word.length;i++) {
					word[i] = word[i].toLowerCase();
					System.out.println(word[i]);
					/* TO DO: Count byets */ 
					/* TO DO: Add offset */ 
					/* TO DO: create Term for each word (word[i]) */ 
					/* TO DO: insert Term to map */ 
				}
				line = br.readLine(); // Take the next line
			}
		} finally {
			br.close();
		}
		/*		Library lib = new Library();
		String str = "llllllppppppaaaaaaaaaavvvvvvvv";
		Soundex soundex = new Soundex(str);*/

	}
}