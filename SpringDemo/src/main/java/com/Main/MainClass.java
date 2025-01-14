package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Country;
import com.Entity.Students;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("springbeans.xml");
		
		Students s= context.getBean("std",Students.class);
		Country c=context.getBean("c",Country.class);
		
		System.out.println(s);
		
		
	}

}
