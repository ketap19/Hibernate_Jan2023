package com.jbk.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jbk.hibernate.entity.Product;

public class HibernateConfig {

	public static SessionFactory getSessionFactory() {
		
		Configuration configuration = new Configuration();
		configuration.configure().addAnnotatedClass(Product.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		return sessionFactory;
		
	}
}
