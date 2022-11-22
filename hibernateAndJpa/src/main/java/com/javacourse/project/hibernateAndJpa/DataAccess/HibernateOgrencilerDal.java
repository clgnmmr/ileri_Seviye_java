package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.Ogrenciler;

@Repository
public class HibernateOgrencilerDal implements IOgrencilerDal {
	//JPA   ORM     standart

	private  EntityManager  entityManager;
	
	@Autowired
	public HibernateOgrencilerDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional // aop - Aspect Priented Programming
	public List<Ogrenciler> getAll() {
		Session session=entityManager.unwrap(Session.class);
		
		List<Ogrenciler> ogrenciler=session.createQuery("from Ogrenciler",Ogrenciler.class).getResultList();
	
		
		
		return ogrenciler;
	}

	@Override
	@Transactional
	public void add(Ogrenciler ogrenci) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(ogrenci);
		
	}

	@Override
	@Transactional
	public void update(Ogrenciler ogrenci) {
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(ogrenci);
		
	}

	@Override
	@Transactional
	public void delete(Ogrenciler ogrenci) {
		Session session=entityManager.unwrap(Session.class);
		Ogrenciler ogrencis=session.get(Ogrenciler.class,ogrenci.getOkul_no());
		session.delete(ogrencis);
		
	}

	@Override
	@Transactional
	public Ogrenciler getByNo(int no) {
		Session session=entityManager.unwrap(Session.class);
		Ogrenciler ogrenci=session.get(Ogrenciler.class,no );
		return ogrenci;
	}
	
	
	

}
