package fi.seija.mavenmatkakeskus;

public class Bussi {
	Lippu[] liput;
	int bussiNumero;
	int matkustajienMaara=0;
	int matkustajienMaxMaara=0;
	
	public Bussi(){		
		matkustajienMaxMaara=10;
		liput = new Lippu[matkustajienMaxMaara];
	}
	
	public Bussi(int bussiNumero, int matkustajieMaxMaara){		
		this.bussiNumero = bussiNumero;
		this.matkustajienMaxMaara=matkustajieMaxMaara;
		liput = new Lippu[matkustajienMaxMaara];
	}


	public int getBussiNumero() {
		return bussiNumero;
	}

	public void setBussiNumero(int bussiNumero) {
		this.bussiNumero= bussiNumero;
	}

	public int getMatkustajienMaara() {
		return matkustajienMaara;
	}
	
	public int getMatkustajienMaxMaara() {
		return matkustajienMaxMaara;
	}
	public void setMatkustajienMaara(int matkustajienMaara) {
		this.matkustajienMaara = matkustajienMaara;
	}
	

	public void lisaaMatkustaja ( Lippu uusiLippu) throws MatkustajaMaaraPoikkeus {
		if (matkustajienMaara < matkustajienMaxMaara){
			this.liput[matkustajienMaara] = uusiLippu;
			this.matkustajienMaara++;
		}
		else{
			throw new MatkustajaMaaraPoikkeus("Bussi täynnä");
			//System.out.println("Bussi täynnä, ei mahdu lisää matkustajia");
		}
	}
	
	public Lippu[] getMatkustajat(){
		return liput;
	}
	
	public void poistaViimeinenMatkustaja(){
		this.liput[matkustajienMaara-1] = null;
		this.matkustajienMaara--;
	}
	
	public int vapaatPaikat(){
		return matkustajienMaxMaara-matkustajienMaara;
	}
	
	public String toString(){
		String s = "";
		s+=("Matkustajien maara "+matkustajienMaara+"\n");
		for (int i = 0 ;i<matkustajienMaara;i++){
			s+=liput[i].toString()+"\n";
		}
	
		return s;
		
	}
	
	public double yhteishinta(){
		double yhteishinta = 0;
		
		for (int i = 0 ;i<matkustajienMaara;i++){
			yhteishinta+=liput[i].getPaikanHinta();
		}
	
		return yhteishinta;		
	}
	
}
