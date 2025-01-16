package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Config.Myconfig;
import com.Entity.Employee;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Myconfig.class);
		Employee e=context.getBean(Employee.class);
		System.out.println(e);
	
	}
	

}
