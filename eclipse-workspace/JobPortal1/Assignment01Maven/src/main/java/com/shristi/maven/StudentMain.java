package com.shristi.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
	@SuppressWarnings("resource")
	ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi");	
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
		
	}
}
