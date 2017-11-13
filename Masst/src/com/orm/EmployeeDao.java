package com.orm;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao
{

	HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public void saveEmployee(Employee e){
		this.template.saveOrUpdate(e);
	}

	public void updateEmployee(Employee e){
		this.template.update(e);
	}

	public void deleteEmployee(Employee e){
		this.template.delete(e);
	}
	
	public Employee getEmployee(int id){
		return this.template.get(Employee.class, id);
	}

	public List<Employee> getEmployees() {
		return (List<Employee>) this.template.loadAll(Employee.class);
	}
	
}