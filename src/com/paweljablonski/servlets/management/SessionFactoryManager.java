package com.paweljablonski.servlets.management;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class SessionFactoryManager {
	SessionFactory factory;
	@SuppressWarnings("deprecation")
	public SessionFactoryManager()
	{
		factory = new Configuration().configure().buildSessionFactory();	
	}
	public Session openSession()
	{
		Session session = factory.openSession();
		return session;
	}
	public void closeSession()
	{
		factory.close();
	}
}
