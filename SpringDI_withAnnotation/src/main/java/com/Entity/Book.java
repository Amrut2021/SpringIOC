package com.Entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
	@Value("201")
	private int b_id;
	@Value("C++")
	private String b_name;
	
	
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	@Override
	public String toString() {
		return "Book [b_id=" + b_id + ", b_name=" + b_name + "]";
	}
	
	

}
