package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Department;
import com.Entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		Employee e= context.getBean("emp",Employee.class);
		Department d =context.getBean("d",Department.class);
		System.out.println(e);
	}

}
