package com.javacourse.project.hibernateAndJpa.Entities;

import javax.persistence.*;
@Entity
@Table(name="ogrenciler")
public class Ogrenciler {
	
	@Id
	@Column(name="okul_no")
	private int okul_no;
	@Column(name="ogrenci_ismi")
	private String ogrenci_ismi;
	@Column(name="sinif")
	private String sinif;
	@Column(name="cinsiyet")
	private String cinsiyet;
	
	public Ogrenciler() {
		
	}
	
	public Ogrenciler(int okul_no, String ogrenci_ismi, String sinif, String cinsiyet) {
		super();
		this.okul_no = okul_no;
		this.ogrenci_ismi = ogrenci_ismi;
		this.sinif = sinif;
		this.cinsiyet = cinsiyet;
	}
	public int getOkul_no() {
		return okul_no;
	}
	public void setOkul_no(int okul_no) {
		this.okul_no = okul_no;
	}
	public String getOgrenci_ismi() {
		return ogrenci_ismi;
	}
	public void setOgrenci_ismi(String ogrenci_ismi) {
		this.ogrenci_ismi = ogrenci_ismi;
	}
	public String getSinif() {
		return sinif;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	
	public void setCinsiyet(String cinsiyet) {
		   this.cinsiyet = cinsiyet;
		
	}
	@Override
	public String toString() {
		return "Ogrenciler [okul_no=" + okul_no + ", ogrenci_ismi=" + ogrenci_ismi + ", sinif=" + sinif + ", cinsiyet="
				+ cinsiyet + "]";
	}
	
	

}
