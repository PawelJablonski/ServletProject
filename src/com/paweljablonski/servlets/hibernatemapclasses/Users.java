package com.paweljablonski.servlets.hibernatemapclasses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	private String name;
	private String password;
	@Id
	private String login;
	private String surname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
