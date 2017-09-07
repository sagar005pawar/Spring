package com.FirstSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {

//		Resource resource=new ClassPathResource("firstSpring.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/FirstSpring/firstSpring.xml");
		
		Student student = (Student)context.getBean("studentbean");
				
		System.out.println(student);
		
	}
}
