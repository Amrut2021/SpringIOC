package com.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Entity.Department;
import com.Entity.Employee;

@Configuration
public class Myconfig {
	@Bean
	public Employee empObj() {
		return new Employee();
	}
	
	@Bean Department depObj() {
		return new Department();
	}

}
