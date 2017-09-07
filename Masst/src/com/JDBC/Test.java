package com.JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/JDBC/applicationContext.xml");
		EmployeeDao dao = (EmployeeDao)ctx.getBean("edao");
		
		dao.getEmployees().forEach(System.out::println);
		
	}
}

