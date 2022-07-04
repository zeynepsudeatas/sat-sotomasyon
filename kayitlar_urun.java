package application;

public class kayitlar_urun{
	private String kategorim;
	private String urunadim;
	private String bedenm;
	private String renkm;
	private double fiyatm;
	private double adetm;
	private String aciklamam;
	public kayitlar_urun(String kategorim, String urunadim, String bedenm, String renkm, double fiyatm, double adetm,
			String aciklamam) {
		
		this.kategorim = kategorim;
		this.urunadim = urunadim;
		this.bedenm = bedenm;
		this.renkm = renkm;
		this.fiyatm = fiyatm;
		this.adetm = adetm;
		this.aciklamam = aciklamam;
	}
	public kayitlar_urun() {
	
	}
	public String getKategori() {
		return kategorim;
	}
	public void setKategori(String kategori) {
		this.kategorim = kategori;
	}
	public String getUrunadi() {
		return urunadim;
	}
	public void setUrunadi(String urunadi) {
		this.urunadim = urunadi;
	}
	public String getBeden() {
		return bedenm;
	}
	public void setBeden(String beden) {
		this.bedenm = beden;
	}
	public String getRenk() {
		return renkm;
	}
	public void setRenk(String renk) {
		this.renkm = renk;
	}
	public double getFiyat() {
		return fiyatm;
	}
	public void setFiyat(double fiyat) {
		this.fiyatm = fiyat;
	}
	public double getAdet() {
		return adetm;
	}
	public void setAdet(double adet) {
		this.adetm = adet;
	}
	public String getAciklama() {
		return aciklamam;
	}
	public void setAciklama(String aciklama) {
		this.aciklamam = aciklama;
	}
	
	
}
