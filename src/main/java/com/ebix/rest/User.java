package com.ebix.rest;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 7911702765805253223L;
	
	private String name;
	private String email;
	private String phone;
	private String password;
	
	public User() {
		super();
	}
	public User(String name, String email, String phone, String password) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password + "]";
	}
	
	
}
