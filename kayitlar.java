package application;


public class Kayitlar {
	private int idm;
	private String adm;
	private String soyadm;
	private String telnom;
	private String adresm;
	private Double maasm;
	
	Kayitlar(){
		this.idm=0;
	}
	 Kayitlar(int idm, String adm, String soyadm, String telnom, String adresm, Double maasm) {
		
		this.idm = idm;
		this.adm = adm;
		this.soyadm = soyadm;
		this.telnom = telnom;
		this.adresm = adresm;
		this.maasm = maasm;
	}
	public int getId() {
		return idm;
	}
	public void setId(int id) {
		this.idm = id;
	}
	public String getAd() {
		return adm;
	}
	public void setAd(String ad) {
		this.adm = ad;
	}
	public String getSoyad() {
		return soyadm;
	}
	public void setSoyad(String soyad) {
		this.soyadm = soyad;
	}
	public String getTelno() {
		return telnom;
	}
	public void setTelno(String telno) {
		this.telnom = telno;
	}
	public String getAdres() {
		return adresm;
	}
	public void setAdres(String adres) {
		this.adresm = adres;
	}
	public Double getMaas() {
		return maasm;
	}
	public void setMaas(Double maas) {
		this.maasm = maas;
	}
    

}
