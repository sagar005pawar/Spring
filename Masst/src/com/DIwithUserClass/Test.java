package com.DIwithUserClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext factory = new ClassPathXmlApplicationContext("/com/DIwithUserClass/DIwithUseDefineClass.xml");
		
		Student student=(Student)factory.getBean("studentbean");
				
		System.out.println(student);
		
	}
}
