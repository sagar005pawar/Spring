package com.spring;

public class Student {

	   private Integer age;
	   private String name;
	   
	   public Student(){
		   System.out.println("Student Constructor");
	   }

	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   public Integer getAge() {
	      return age;
	   }
	   
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }
	
}
