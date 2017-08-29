package com.DIwithWrapperMap;

import java.util.Map;

public class Student {
	private String name;
	private Map<Integer, String> address;

	public Student() {
		super();
		this.name = null;
		this.address = null;
	}

	public Student(String name, Map<Integer, String> address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, String> getAddress() {
		return address;
	}

	public void setAddress(Map<Integer, String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
}
