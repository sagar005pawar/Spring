package com.FirstSpring;

public class Student {
	private String name;
	private Address address;
	
	public Student(){	//Default constructor is must define with parameterise constructor
		this.name = null;
		this.address = null;		
	}
	
	public Student(String name, Address address) {
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}

}
