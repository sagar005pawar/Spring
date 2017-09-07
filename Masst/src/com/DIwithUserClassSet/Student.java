package com.DIwithUserClassSet;

import java.util.Set;

public class Student {
	
	private String name;
	private Set<Address> address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	
	public Student(String name, Set<Address> address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Student() {
		super();
		this.name = null;
		this.address = null;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}

}

