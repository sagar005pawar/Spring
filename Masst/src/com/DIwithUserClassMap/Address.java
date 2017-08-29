package com.DIwithUserClassMap;

public class Address {

	private String city;

	public Address() {	//Default constructor is must define with parameterise constructor
		super();
		this.city = null;
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
}
