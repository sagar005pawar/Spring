package com.JAXB;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="employee")  			//@XmlRootElement
public class Employee {  
	private int id;  
	private String name;  
	private float salary;  
	  
	@XmlAttribute(name="id")  				//@XmlAttribute
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	@XmlElement(name="name")  				//@XmlElement
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	@XmlElement(name="salary")  
	public float getSalary() {  
	    return salary;  
	}  
	public void setSalary(float salary) {  
	    this.salary = salary;  
	}  
} 