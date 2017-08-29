package com.DIwithUserClassMap2;

public class Subject {
	
	private String sname;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Subject [sname=" + sname + "]";
	}

	public Subject() {
		super();
		this.sname = null;
	}
	
	public Subject(String sname) {
		super();
		this.sname = sname;
	}	

}
