package com.user;


import java.util.Date;
import java.util.List;

import com.address.Address;

public class User {
	
	private String name;
	private String lastName;
	private String email;
	private String password;
	private String job;
	private int age;
	private Date lastLogin;
	private List<Address> address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public String showUserInfo() {
		
		
		
		return "...:::User Information:::...\nName: " + name + " 	LastName: " + lastName + "\nEmail: " + email + "	 Job: " + job 
				+ "\nAge: " + age + "	 LastLogin: " + lastLogin + "\nAddress: " + address ;
	}
	
	

}
