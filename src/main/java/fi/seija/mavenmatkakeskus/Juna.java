package fi.seija.mavenmatkakeskus;

public class Juna {
	
	int junanNumero;
	Vaunu[] vaunut ;
	int vaunujenMaara=0;
	int vaunujenMaxMaara=0;
	
	public Juna(){
		vaunujenMaxMaara=3;
		vaunut = new Vaunu[vaunujenMaxMaara];
		
	}
	
	public Juna(int junanNumero, int vaunujenMaxMaara){
		this.junanNumero=junanNumero;
		if (vaunujenMaxMaara <=12 ){
			this.vaunujenMaxMaara = vaunujenMaxMaara;
		}
		vaunut = new Vaunu[vaunujenMaxMaara];
		
	}

	public int getJunanNumero() {
		return junanNumero;
	}

	public void setJunanNumero(int junanNumero) {
		this.junanNumero = junanNumero;
	}
	
	public int getVaunujenMaara() {
		return vaunujenMaara;
	}

	public void setVaunujenMaara(int vaunujenMaara) {
		this.vaunujenMaara = vaunujenMaara;
	}
	
	public int getVaunujenMaxMaara() {
		return vaunujenMaxMaara;
	}
	
	public void lisaaVaunu(Vaunu vaunu){
		this.vaunut[vaunujenMaara]=vaunu;
		this.vaunujenMaara++;
	}
	
	public Vaunu getVaunu(int vaununNumero){
		return vaunut[vaununNumero];
	}
}

