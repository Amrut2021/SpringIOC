package com.Entity;

public class Login {
	
	private String email;
	private int password;
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
	}
	public Login(String email, int password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	

}
