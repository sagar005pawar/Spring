package com.DIwithWrapperSet;

import java.util.Set;

public class Student {
	private String name;
	private Set<String> address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Student() {
		super();
		this.name = null;
		this.address = null;
	}

	public Student(String name, Set<String> address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
}
