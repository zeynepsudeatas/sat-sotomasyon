package application;

public class kayitlar_satıs {
	private int idm;
	private String kategorim;
	private String urunadim;
	private Double bedenm;
	private String renkm;
	private Double fiyatm;
	private Double adetm;
	private String aciklamam;
	public kayitlar_satıs(int idm, String kategorim, String urunadim, Double bedenm, String renkm, Double fiyatm, Double adetm,
			String aciklamam) {
		
		this.idm = idm;
		this.kategorim = kategorim;
		this.urunadim = urunadim;
		this.bedenm = bedenm;
		this.renkm = renkm;
		this.fiyatm = fiyatm;
		this.adetm = adetm;
		this.aciklamam = aciklamam;
	}
	public int getId() {
		return idm;
	}
	public void setId(int id) {
		this.idm = id;
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
	public Double getBeden() {
		return bedenm;
	}
	public void setBeden(Double beden) {
		this.bedenm = beden;
	}
	public String getRenk() {
		return renkm;
	}
	public void setRenk(String renk) {
		this.renkm = renk;
	}
	public Double getFiyat() {
		return fiyatm;
	}
	public void setFiyat(Double fiyat) {
		this.fiyatm = fiyat;
	}
	public Double getAdet() {
		return adetm;
	}
	public void setAdet(Double adet) {
		this.adetm = adet;
	}
	public String getAciklama() {
		return aciklamam;
	}
	public void setAciklama(String aciklama) {
		this.aciklamam = aciklama;
	}

}
