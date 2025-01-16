package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Entity.Employee;

public class MainClass { 

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Employee.class);
		Employee e=context.getBean(Employee.class);
		
//		
//		e.setId(1);
//		e.setName("Amruta");
//		e.setSalary(30000);
		System.out.println(e);
		
		
		
		
	}

}
