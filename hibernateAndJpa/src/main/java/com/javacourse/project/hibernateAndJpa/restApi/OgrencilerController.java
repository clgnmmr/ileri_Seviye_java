package com.javacourse.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.project.hibernateAndJpa.Business.IOgrencilerService;
import com.javacourse.project.hibernateAndJpa.Entities.Ogrenciler;

@RestController
@RequestMapping("/api")
public class OgrencilerController {
	private IOgrencilerService ogrenciService;

	@Autowired
	public OgrencilerController(IOgrencilerService ogrenciService) {
		this.ogrenciService = ogrenciService;
	}
	
	@GetMapping("/ogrenciler")
	public List<Ogrenciler> get(){
		
		return ogrenciService.getAll();
	}
	@PostMapping("/add")
	public void add(@RequestBody Ogrenciler ogrenci){
		this.ogrenciService.add(ogrenci);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Ogrenciler ogrenci){
		this.ogrenciService.update(ogrenci);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Ogrenciler ogrenci){
		this.ogrenciService.delete(ogrenci);
	}
	
	@GetMapping("/ogrenciler/{no}")
	public Ogrenciler getById(@PathVariable int  no){
		
		return ogrenciService.getByNO(no);
	}
	

}
