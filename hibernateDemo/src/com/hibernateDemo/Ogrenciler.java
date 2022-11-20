package com.hibernateDemo;

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
	
	

}
