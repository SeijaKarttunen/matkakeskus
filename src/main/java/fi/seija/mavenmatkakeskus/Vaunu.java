package fi.seija.mavenmatkakeskus;;

public class Vaunu {
	
	int vaununNumero;
	Lippu [] liput ;
	int matkustajienMaxMaara=0;
	int matkustajienMaara=0;
	
	public Vaunu(){
		this.matkustajienMaxMaara = 10;
		liput = new Lippu[matkustajienMaxMaara];		
	}
	
	public Vaunu(int vaununNumero, int matkustajienMaxMaara){
		this.vaununNumero = vaununNumero;
		liput = new Lippu[matkustajienMaxMaara];
		this.matkustajienMaxMaara = matkustajienMaxMaara;
		
	}
	
	public int getVaununNumero() {
		return vaununNumero;
	}

	public void setVaununNumero(int vaununNumero) {
		this.vaununNumero = vaununNumero;
	}

	public boolean lisaaMatkustaja(Lippu lippu){
		
		boolean mahtuiko=false;
		if (matkustajienMaara<matkustajienMaxMaara){
				liput[matkustajienMaara] = lippu;
				matkustajienMaara++;
				mahtuiko = true;
		}
		return mahtuiko;
		
	}
	
	public int getMatkustajienMaara(){
		return matkustajienMaara;
	}

	public int getMatkustajienMaxMaara(){
		return matkustajienMaxMaara;
	}
	
	public int vapaatPaikat(){
		return matkustajienMaxMaara-matkustajienMaara;
	}

}
