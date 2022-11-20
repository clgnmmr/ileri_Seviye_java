package com.hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Ogrenciler.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			List<Ogrenciler> ogrenciler=session.createQuery("from Ogrenciler").getResultList();
			
			for(Ogrenciler ogrenci:ogrenciler) {
				
				System.out.println(ogrenci.getOgrenci_ismi() );
				
			}
			
			
			session.getTransaction().commit();	
		}finally {
			factory.close();
			
		}
		
		
		
	}

}
