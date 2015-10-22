package com.engine.search;

public class OffSet {
	private int idDoc;
	private byte byte_offset;
	
	public OffSet(int idDoc, byte byte_offset) {
		super();
		this.idDoc = idDoc;
		this.byte_offset = byte_offset;
	}
	
	public int getIdDoc() {
		return idDoc;
	}
	
	public void setIdDoc(int idDoc) {
		this.idDoc = idDoc;
	}

	public byte getByte_offset() {
		return byte_offset;
	}
	
	public void setByte_offset(byte byte_offset) {
		this.byte_offset = byte_offset;
	}
	
	@Override
	public String toString() {
		return "OffSet [idDoc=" + idDoc + ", byte_offset=" + byte_offset + "]";
	}
}
