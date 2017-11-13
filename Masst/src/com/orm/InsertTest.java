package com.orm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsertTest {
	
//	public static final Logger logger = Logger.getLogger(InsertTest.class);
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("/com/orm/applicationContext.xml");  
		
		EmployeeDao dao=(EmployeeDao)factory.getBean("d");

		//dao.saveEmployee(new Employee("PRAVIN",75000));		

		//System.out.println(dao.getEmployee(1));
		
		//dao.updateEmployee(e);
		
		//dao.deleteEmployee(dao.getEmployee(6));

		dao.getEmployees().forEach(System.out::println);

		
		
/*		
		List<Employee> list = new ArrayList<Employee>();
		list.addAll(dao.getEmployees());
//		list.sort(Comparator.comparing(Employee::getSalary));
//		Collections.sort(list, (p1, p2)->p1.getName().compareToIgnoreCase(p2.getName()));		
		list.forEach(System.out::println);
		
*/		
/*		
		Employee e1 = new Employee(2, "Vijay", 1200.0f);
		Employee e2 = new Employee(3, "Ajaay", 2500.0f);
		Employee e3 = new Employee(1, "Sujay", 3200.0f);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

*/		
		
//		Collections.sort(list);  				/* by Comparable sort on ID */
//		Collections.sort(list, new SalaryComparator());		
//		Collections.sort(list, new NameComparator());		
//		Collections.sort(list, (p1, p2)-> p1.getId()- p2.getId());	/* by Comparable sort on ID using lambda expression*/
//		Collections.sort(list, (p3, p4)-> p3.getName().compareTo(p4.getName()));

//		list.sort(new SalaryComparator());
//		list.sort(new NameComparator());		
//		list.sort(Comparator.comparing(Employee::getSalary));
//		list.sort(Comparator.comparing(Employee::getName));
//		list.sort(Comparator.comparing(Employee::getId));
		
//		list.forEach(System.out::println);

		
		
/*		
		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee employee = (Employee) itr.next();
			System.out.println(employee);
		}
		
*/		
/*
		PropertyConfigurator.configure("C:\\Users\\sagar\\git\\Spring\\Masst\\src\\log4j.properties");
		
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("ERROR");
		logger.fatal("FATAL");
*/
		
		/*		
		<property name="hibernateProperties">
			<props>
				<prop key="hibernate.dialect">org.hibernate.dialect.Oracle9Dialect</prop>
				<prop key="hibernate.hbm2ddl.auto">update</prop>
				<prop key="hibernate.show_sql">true</prop>		
			</props>
		</property>
*/		

/*		
	<property name="configLocation">
		<value>classpath:hibernate.cfg.xml</value>
	</property>		

*/		
	}
}