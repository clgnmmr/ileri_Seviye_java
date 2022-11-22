package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.DataAccess.IOgrencilerDal;
import com.javacourse.project.hibernateAndJpa.Entities.Ogrenciler;


@Service
public class OgrencilerManager implements IOgrencilerService{
	private IOgrencilerDal ogrenciDal;

	@Autowired
	public OgrencilerManager(IOgrencilerDal ogrenciDal) {
		this.ogrenciDal = ogrenciDal;
	}

	@Override
	@Transactional
	public List<Ogrenciler> getAll() {
		
		return this.ogrenciDal.getAll();
	}

	@Override
	@Transactional
	public void add(Ogrenciler ogrenci) {
		this.ogrenciDal.add(ogrenci);
		
	}

	@Override
	@Transactional
	public void update(Ogrenciler ogrenci) {
this.ogrenciDal.update(ogrenci);
		
	}

	@Override
	@Transactional
	public void delete(Ogrenciler ogrenci) {
		this.ogrenciDal.delete(ogrenci);
		
	}

	@Override
	@Transactional
	public Ogrenciler getByNO(int no) {
		
		return this.ogrenciDal.getByNo(no);
	}

}
