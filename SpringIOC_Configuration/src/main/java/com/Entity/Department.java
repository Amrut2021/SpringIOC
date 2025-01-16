package com.Entity;

import org.springframework.beans.factory.annotation.Value;

public class Department {
	@Value("11")
	private int d_id;
	@Value("Java Devloper")
	private String D_name;
	
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return D_name;
	}
	public void setD_name(String d_name) {
		D_name = d_name;
	}
	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", D_name=" + D_name + "]";
	}
	
	

}
