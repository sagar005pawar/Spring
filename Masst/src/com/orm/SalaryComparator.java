package com.orm;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()==o2.getSalary()){
			return 0;			
		} else if(o1.getSalary()>o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}		
	}
}
