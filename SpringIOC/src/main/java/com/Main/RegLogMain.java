package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Login;
import com.Entity.Registration;

public class RegLogMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		Registration r=context.getBean( "reg",Registration.class);
		Login l=context.getBean("lg",Login.class);
		System.out.println(r);
	}

}
