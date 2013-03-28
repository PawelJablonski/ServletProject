package com.paweljablonski.servlets.services;

public class RegisterUserService {
	private String login, password, name, surname;
	public RegisterUserService(String login, String password, String name, 
			String surname)
	{
		this.login = login;
		this.password = password;
		this.name = name;
		this.surname = surname;
	}
	
	public boolean checkIsLoginFree()
	{
		boolean result = false;
		if(result)
		{
			return true;
		}
		return false;
	}
	
	public void registerUser()
	{
		
	}
}
