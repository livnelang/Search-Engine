package com.engine.search;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;
import java.util.Vector;

public class Manager {
	private Library library;         // Hold All Documents
	private Dictionary dictionary;	// Hold Our Dictionary Of Terms

	/*
	 * Manager Constructor 
	 */
	public Manager() throws IOException, ParseException {
		super();
		dictionary = new Dictionary();
		library = new Library();
	}


	/*
	 * Get Dictionary Of Terms
	 */
	public Dictionary getDictionary() {
		return dictionary;
	}

	/*
	 * Set Dictionary Of Terms
	 */
	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}

	/* A scan all documents 
	 * in one time and take word by word to Dictionary
	 */
	public void parseDocuments() throws IOException {
		/* A method for creating terms and inserting them to dictionary*/
		/* TO DO: put it in the correct class */
		//Vector <String> words = new Vector<String>();
		int i = 0;
		while( i < this.library.getDocuments().size())
		{
			/*
			 * put the path of documents[i] in new FileReader
			 */
			BufferedReader br = new BufferedReader(new FileReader(this.library.getDocuments().get(i).getPath()));
			try {
				StringBuilder sb = new StringBuilder();
				String line = br.readLine(); // Take the first line
				while (line != null) {
					sb.append(line); // Add line
					sb.append("\n");
					String[] word = line.split("[\\W]"); // split words to array of string from the current line
					for(int j=0; j<word.length;j++) {
						word[j] = word[j].toLowerCase();
						//System.out.println(word[j]);
						/* TO DO: Count byets */
						/* TO DO: Add offset */
						/* create Term for each word (word[i]) */
						Term term = new Term(word[j], 1,new Soundex(word[j]),true,i);
						//System.out.println(word[j]);
						/*  insert Term to map -----   i am not sure its ok this line, check it*/
						this.dictionary.getTerms().put(word[j], term);
						}
					line = br.readLine(); // Take the next line
					}
				} 	
					catch(Exception e) {
						System.out.println(e.toString() + "trace: " + e.getCause());
						e.printStackTrace();
					}
					finally {
						br.close();
					}
			i++;
		}
	}
}
