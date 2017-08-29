package com.DIwithUserClass;

import java.util.List;

public class Student {
	private String name;
	private List<Address> address;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Student() {
		super();
		this.name = null;
		this.address = null;
	}
	
	public Student(String name, List<Address> address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}

}
