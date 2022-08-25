package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("./Configurations/config.xml");
		Student student = (Student) context.getBean("Student");
		Student student1 = (Student) context.getBean("Student1");
		Student student2 = (Student) context.getBean("Student2");
		
		System.out.println(student);
		System.out.println(student1);
		System.out.println(student2);
	}
}
