package com.springJavaMail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/springJavaMail/applicationContext.xml");
		MailMail m=(MailMail)context.getBean("mailMail");  
		String sender="sagar005pawar@gmail.com";//write here sender gmail id  
		String receiver="sunnymore29@gmail.com";//write here receiver id  
		m.sendMail(sender,receiver,"Spring Java Mail","Welcome to Spring Java Mail, Sunny..");  		      
		System.out.println("success");
	}
}
