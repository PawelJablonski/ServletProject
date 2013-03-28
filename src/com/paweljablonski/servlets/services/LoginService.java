package com.paweljablonski.servlets.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.paweljablonski.servlets.hibernatemapclasses.Users;
import com.paweljablonski.servlets.management.SessionFactoryManager;

public class LoginService {
	String login, password;
	public LoginService(String login, String password)
	{
		this.login = login;
		this.password = password;
	}
	
	public boolean checkUser()
	{
		Session session = new SessionFactoryManager().openSession();
		
		List<Users> users = (List<Users>) session.get(Users.class, login);
		
		boolean correct = false;
		
		for(Users u : users)
		{
			if (u.getLogin().equals(login) && u.getPassword().equals(password))
			{
				correct = true;
			}
		}
		if(correct)
		{
			
			return true;
		}
		return false;
	}
}
