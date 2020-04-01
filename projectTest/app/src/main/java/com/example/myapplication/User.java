package com.example.myapplication;

import android.R.string;

public class User {
	
	private String username; 
	private int age;
	private int url;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getUrl() {
		return url;
	}
	public void setUrl(int url) {
		this.url = url;
	}
	
	public User() {
		
	}
	public User( String username,int age,int url) {
		this.username = username;
		this.age = age;
		this.url = url;
	}
	
	

}
