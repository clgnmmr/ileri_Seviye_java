package com.hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {
	
	public static void main(String[] args) {
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Ogrenciler.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			Ogrenciler ogrenci=new Ogrenciler();
			ogrenci.setOkul_no(127);
			ogrenci.setOgrenci_ismi("hibernate ile calistim");
			ogrenci.setSinif("11");
			ogrenci.setCinsiyet("E");
			session.save(ogrenci);
			
			session.getTransaction().commit();	
			System.out.println("gerekli bilgi eklendi");
		}finally {
			factory.close();
			
		}
		
	}

}
