package com.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile{

	   @Resource(name="student1")
	   private Student student;
	   
	   public Profile(){
	      System.out.println("Profile constructor." );
	   }
	   
	   public void printAge() {
	      System.out.println("Age : " + student.getAge() );
	   }
	   
	   public void printName() {
	      System.out.println("Name : " + student.getName() );
	   }
	
	   @PostConstruct
	   public void init(){
		System.out.println("Init..");
	   }
	
	   @PreDestroy
	   public void destroy(){
		System.out.println("Destroy..");
	   }
}
