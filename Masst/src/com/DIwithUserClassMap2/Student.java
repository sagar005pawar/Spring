package com.DIwithUserClassMap2;

import java.util.Map;

public class Student {
	private String name;
	private Map<Subject, Address> address;

	public Student() {
		super();
		this.name = null;
		this.address = null;
	}

	public Student(String name, Map<Subject, Address> address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Subject, Address> getAddress() {
		return address;
	}

	public void setAddress(Map<Subject, Address> address) {
		this.address = address;
	}
}
