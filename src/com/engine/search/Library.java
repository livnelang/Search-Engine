package com.engine.search;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* A clss to create a library of documents */
public class Library {
	private Map<Integer,Document> documents = new HashMap<Integer, Document>();
	private static int counter_id = 0;


	public Map<Integer, Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Map<Integer, Document> documents) {
		this.documents = documents;
	}


	public static int getCounter_id() {
		return counter_id;
	}

	public static void setCounter_id(int counter_id) {
		Library.counter_id = counter_id;
	}
	
	/* Library Constructor, Scan all documents
	 *  in folder and insert documents to map 
	 */
	public Library() throws IOException, ParseException {
		String cwd = System.getProperty("user.dir");
		File folder = new File(cwd+"/articles");
		File[] listOfFiles = folder.listFiles();
		String description = "";
		for (File files : listOfFiles) {
			if (files.isFile()) {
				BufferedReader brTest = new BufferedReader(new FileReader(files));
				String  author = "john deer";//brTest .readLine();
				//author = author.substring(8, author.length()); /* Take autor name */
				//String  published = brTest .readLine();			/* Take published date */
				//published = published.substring(11, published.length());				
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				Date date_published = formatter.parse("24/06/1988");

				for(int i = 0; i < 4; i++) /* Take description (The 4 first row in the documents */
				{
					description = description + brTest.readLine();
				}
				Document document = new Document(files.getName(), this.counter_id, author, description, files.getPath(), date_published); /* Create documents */
				/* Print details of the current documents */
				System.out.println(document.getName());
				System.out.println(document.getAuthor());
				System.out.println(document.getId());
				System.out.println(document.getPublished());
				System.out.println(document.getDecription());
				document.toString();
				this.documents.put(this.counter_id, document); /* Add documents to map */
				System.out.println();
				counter_id++;
			}
		}
	}
}
