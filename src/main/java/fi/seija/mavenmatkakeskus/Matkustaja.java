package fi.seija.mavenmatkakeskus;
public class Matkustaja {
	
	String etunimi;
	String sukunimi;
	String alennusRyhma="";
	
	public Matkustaja (){
		
	}
	
	public Matkustaja(String etunimi, String sukunimi, String alennusRyhma){
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.alennusRyhma = alennusRyhma;
		
	}
	
	public String getEtunimi() {
		return etunimi;
	}

	public void setEtunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}
	
	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}

	public void setAlennusRyhma(String alennusRyhma) {
		this.alennusRyhma = alennusRyhma;
	}

	public String getAlennusRyhma() {
		return alennusRyhma;
	}
	
	public int annaAlennusProsentti() {
		int alennusprosentti=0;
		switch (this.alennusRyhma){
		case "Opiskelija": alennusprosentti = 20;
			break;
		case "Eläkeläinen": alennusprosentti = 15;
			break;
		case "Työtön": alennusprosentti = 10;
			break;
		default: alennusprosentti = 0;
			break;
		}
			
		return alennusprosentti;
	}

	public String toString(){
		return (etunimi+" "+sukunimi);
	}		

	
}
