package com.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee", catalog="spring")
public class Employee implements Cloneable, Comparable<Employee> {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", length = 11 )
	private int id;

	@Column(name="name")
	private String name;

	@Column(name="salary")
	private float salary;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return (this.id + "  " + this.name + "  " + this.salary);
	}
	public Employee(String name, float salary) {
		super();
		this.id = 0;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
		this.id = 0;
		this.name = null;
		this.salary = 0.0f;
	}

	public Employee(int i, String string, float f) {
		super();
		this.id = i;
		this.name = string;
		this.salary = f;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		if(this.id==arg0.id){
			return 0;			
		} else if(this.id > arg0.id) {
			return 1;
		} else {
			return -1;
		}		
	}
	
}
