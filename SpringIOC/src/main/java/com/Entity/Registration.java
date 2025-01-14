package com.Entity;

public class Registration {
	
	private int id;
	private String name;
	private String city;
	private int age;
	private String gender;
	private double phoneNo;
	
	
	private Login log;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(int id, String name, String city, int age, String gender, double phoneNo, Login log) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.gender = gender;
		this.phoneNo=phoneNo;
		this.log = log;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Login getLog() {
		return log;
	}

	public void setLog(Login log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", gender=" + gender
				+ ", phoneNo=" + phoneNo + ", log=" + log + "]";
	}

	

}
