package com.engine.search;
import java.util.Date;


public class Document {

	private String name;
	private int id;
	private String Author ; 
	private String decription ;
	private String path ;
	private Date published;
	private boolean status;

	public Document(String name, int id, String author, String decription, String path, Date published) {
		super();
		this.name = name;
		this.id = id;
		this.Author = author;
		this.decription = decription;
		this.setPath(path);
		this.published = published;
		this.status = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "Document [name=" + name + ", id=" + id + ", Author=" + Author
				+ ", decription=" + decription + ", published=" + published
				+ ", status=" + status + "]";
	}
}
