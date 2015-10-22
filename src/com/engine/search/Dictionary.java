package com.engine.search;
import java.util.HashMap;
import java.util.Map;


public class Dictionary {
	
	private Map<String,Term> terms;
	
	public Dictionary() {
		super();
		terms = new HashMap<String,Term>();
	}

	public Map<String,Term> getTerms() {
		return terms;
	}

	public void setTerms(Map<String,Term> terms) {
		this.terms = terms;
	}	
}
