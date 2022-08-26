package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.IronMan;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("./Configurations/config.xml");
//		Student student = (Student) context.getBean("Student");
//		Student student1 = (Student) context.getBean("Student1");
//		Student student2 = (Student) context.getBean("Student2");
//		
//		System.out.println(student);
//		System.out.println(student1);
//		System.out.println(student2);
		
//		Employee emp=(Employee) context.getBean("Employee");
//		System.out.print(emp);
		
//		IronMan ironMan=(IronMan) context.getBean("IronMan");
//		ironMan.suitUp();
//		
//		IronMan ironMan2=(IronMan) context.getBean("ironMan");
//		ironMan2.suitUp();
	}
}
