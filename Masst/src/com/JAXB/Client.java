package com.JAXB;

import java.io.FileWriter;  
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamResult;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.oxm.Marshaller; 

public class Client {
	
	public static void main(String[] args)throws IOException {  
		  //Java Architecture for XML Binding (JAXB)
		  ApplicationContext context = new ClassPathXmlApplicationContext("/com/JAXB/beansJAXB.xml");  

		  Marshaller marshaller = (Marshaller)context.getBean("jaxbMarshallerBean");  
		          
		  Employee employee=new Employee();  
		  employee.setId(101);  
		  employee.setName("Sagar Pawar");  
		  employee.setSalary(100000);  
		          
		  marshaller.marshal(employee, new StreamResult(new FileWriter("employee.xml")));  
		    
		  System.out.println("XML Created Sucessfully");  
		 }  
}
