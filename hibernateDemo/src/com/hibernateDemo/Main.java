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
			// hibernate query Languages
			//select * from ogrenciler
			//from Ogrenciler o where o.cinsiyet='E' AND o.ogrenci_ismi LİKE 'M%'
			//from Ogrenciler o where o.sinif='11'
			// ASC - Ascending
			// DESC - Descending
			//from Ogrenciler o  ORDER BY o.ogrenci_ismi desc
			List<Ogrenciler> ogrenciler=session.createQuery("from Ogrenciler").getResultList();
			
			for(Ogrenciler ogrenci:ogrenciler) {
				
				System.out.println(ogrenci.getOgrenci_ismi()+" "+ogrenci.getOkul_no() );
				
			}
			
			
			session.getTransaction().commit();	
		}finally {
			factory.close();
			
		}
		
		
		
	}

}
