package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.Ogrenciler;

public interface IOgrencilerService {
	
	
	List<Ogrenciler> getAll();

	void add(Ogrenciler ogrenci);
	void update(Ogrenciler ogrenci);
	void delete(Ogrenciler ogrenci);
	Ogrenciler getByNO(int no);
	

}
