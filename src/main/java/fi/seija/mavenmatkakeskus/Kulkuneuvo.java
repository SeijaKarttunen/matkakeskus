package fi.seija.mavenmatkakeskus;

import java.util.Date;

public class Kulkuneuvo {
	
	String lahtoPaikka;
	String maaranpaa;
	Date lahtoAika;
	Date saapumisAika;
	
	public Kulkuneuvo(){
		
	}
	
	public Kulkuneuvo(String lahtoPaikka, String maaranpaa, Date lahtoAika, Date saapumisAika){
		this.lahtoPaikka = lahtoPaikka;
		this.maaranpaa = maaranpaa;
		this.lahtoAika = lahtoAika;
		this.saapumisAika = saapumisAika;
		
	}

	public String getLahtoPaikka() {
		return lahtoPaikka;
	}

	public void setLahtoPaikka(String lahtoPaikka) {
		this.lahtoPaikka = lahtoPaikka;
	}

	public String getMaaranpaa() {
		return maaranpaa;
	}

	public void setKohdePaikka(String maaranpaa) {
		this.maaranpaa = maaranpaa;
	}

	public Date getLahtoAika() {
		return lahtoAika;
	}

	public void setLahtoAika(Date lahtoAika) {
		this.lahtoAika = lahtoAika;
	}

	public Date getSaapumisAika() {
		return saapumisAika;
	}

	public void setSaapumisAika(Date saapumisAika) {
		this.saapumisAika = saapumisAika;
	}

}
