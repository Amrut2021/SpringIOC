package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Config.Myconfig;
import com.Entity.Student;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Myconfig.class);
		Student s=context.getBean(Student.class);
		System.out.println(s);
	}

}
