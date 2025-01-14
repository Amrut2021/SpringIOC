package com.Entity;

public class Students {
	
	private int id;
	private String name;
	private String city;
	private int age;
	
	private Country con;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int id, String name, String city, int age, Country con) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.con = con;
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

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", con=" + con + "]";
	}
	
	

}
