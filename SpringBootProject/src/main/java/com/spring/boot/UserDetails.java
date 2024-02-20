package com.spring.boot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDetails {

	@Id
	public int id;
	public String name;
	public String email;
	public String pass;
	
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass + "]";
	}
	
	
	
}
