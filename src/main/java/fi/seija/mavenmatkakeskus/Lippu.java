package fi.seija.mavenmatkakeskus;

import java.util.Date;

public class Lippu {
	
	Matkustaja matkustaja ;
	String kulkuneuvo;

	double paikanHinta= 0.0;
	String lahtoPaikka;
	String maaranpaa;
	int paikkaNumero=0;
	Date lahtoaika;
	
	
	public String getLahtoPaikka() {
		return lahtoPaikka;
	}


	public void setLahtoPaikka(String lahtoPaikka) {
 		this.lahtoPaikka = lahtoPaikka;
	}


	public String getMaaranpaa() {
		return maaranpaa;
	}


	public void setMaaranpaa(String maaranpaa) {
		this.maaranpaa = maaranpaa;
	}


	public Date getLahtoaika() {
		return lahtoaika;
	}


	public Matkustaja getMatkustaja() {
		return matkustaja;
	}


	public void setMatkustaja(Matkustaja matkustaja) {
		this.matkustaja = matkustaja;
	}


	public String getKulkuneuvo() {
		return kulkuneuvo;
	}


	public void setKulkuneuvo(String kulkuneuvo) {
		this.kulkuneuvo = kulkuneuvo;
	}

	public int getPaikkaNumero() {
		return paikkaNumero;
	}


	public void setPaikkaNumero(int paikkaNumero) {
		this.paikkaNumero = paikkaNumero;
	}


	public void setLahtoaika(Date lahtoaika) {
		this.lahtoaika = lahtoaika;
	}


	public Lippu(Matkustaja m){
		this.matkustaja = m;
		
	}

	public double getPaikanHinta() {
		return paikanHinta;
	}

	public void setPaikanHinta(double hinta) {
		this.paikanHinta = hinta;
	}
	
	public double annaAlennettuHinta(int alennusprosentti) {
		return this.paikanHinta*(100-alennusprosentti)/100;
	}
	

}
