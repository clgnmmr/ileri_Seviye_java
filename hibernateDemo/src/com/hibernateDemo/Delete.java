package com.hibernateDemo;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Delete {
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Ogrenciler.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			Ogrenciler ogrenci=session.get(Ogrenciler.class, 126);
			session.delete(ogrenci);
			
			session.getTransaction().commit();	
			System.out.println("veri silindi");
		}finally {
			factory.close();
			
		}
		
	}

}
