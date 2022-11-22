package com.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
    SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Ogrenciler.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			Ogrenciler ogrenci=session.get(Ogrenciler.class, 120);
			//System.out.println(ogrenci.getOgrenci_ismi());
			ogrenci.setOgrenci_ismi("isim degistirildi");
			session.save(ogrenci);
			
			session.getTransaction().commit();	
			System.out.println("ogrenci guncellendi");
		}finally {
			factory.close();
			
		}
		
	}
}
