package com.DIwithWrapper;

import java.util.List;

public class Student {
	private String name;
	private List<String> address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Student() {
		super();
		this.name = null;
		this.address = null;
	}

	public Student(String name, List<String> address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
}
