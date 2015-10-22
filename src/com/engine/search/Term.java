package com.engine.search;
import java.util.*;

public class Term {
	//private static final char NULL = 0;
	private String name;
	private int postings;
	private Soundex soundex;
	private boolean stopList;
	private Vector<Integer> offsets;

	public Term(String name, int postings, Soundex soundex, boolean stopList, int doc_id) {
		super();
		this.name = name;
		this.postings = postings;
		this.soundex = soundex;
		this.stopList = stopList;
		offsets = new Vector<Integer>();
		this.offsets.add(doc_id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPostings() {
		return postings;
	}

	public void setPostings(int postings) {
		this.postings = postings;
	}

	/*public int getOffsets() {
		return offsets;
	}

	public void setOffsets(Vector<OffSet> offsets) {
		this.offsets = offsets;
	}*/

	public Soundex getSoundex() {
		return soundex;
	}

	public void setSoundex(Soundex soundex) {
		this.soundex = soundex;
	}

	public boolean isStopList() {
		return stopList;
	}

	public void setStopList(boolean stopList) {
		this.stopList = stopList;
	}

	@Override
	public String toString() {
		return "Term [name=" + name + ", postings=" + postings + ", soundex="
				+ ", offsets=" + offsets + "]";
	}



}
