package fi.seija.mavenmatkakeskus;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BussiTest {

	@Test
	public void testBussi() {
		
		Bussi bussi = new Bussi(66,4);
		Matkustaja matkustaja = new Matkustaja ("Ville", "Vallaton", "Oulu");
		Lippu lippu = new Lippu(matkustaja);
		
		assertEquals(bussi.getBussiNumero(), 66);
		assertEquals(bussi.vapaatPaikat(), 4);
		assertEquals(bussi.getMatkustajienMaxMaara(), 4);
		try{
			bussi.lisaaMatkustaja(lippu);
		} catch (Exception e){}
		
		assertEquals(bussi.vapaatPaikat(), 3);
		assertEquals(bussi.getMatkustajienMaara(), 1);
		
	}
	
	@Test
	public void testMatkustajaMaxMaara() {
		Bussi bussi = new Bussi(66,4);
		Matkustaja matkustaja = new Matkustaja ("Ville", "Vallaton", "Oulu");
		Lippu lippu = new Lippu(matkustaja);
		try{
			bussi.lisaaMatkustaja(lippu);
			bussi.lisaaMatkustaja(lippu);
			bussi.lisaaMatkustaja(lippu);
			bussi.lisaaMatkustaja(lippu);
			bussi.lisaaMatkustaja(lippu);
		}catch ( MatkustajaMaaraPoikkeus m){
			assertEquals("Bussi täynnä",m.getMessage());
		}
	
		assertEquals(bussi.getMatkustajienMaara(), 4);
		assertEquals(bussi.vapaatPaikat(), 0);	
	}
	
	@Test (expected = MatkustajaMaaraPoikkeus.class )
	public void testMatkustajaMaaraPoikkeus() throws MatkustajaMaaraPoikkeus {
		Bussi bussi = new Bussi(66,4);
		Matkustaja matkustaja = new Matkustaja ("Ville", "Vallaton", "Oulu");
		Lippu lippu = new Lippu(matkustaja);

		bussi.lisaaMatkustaja(lippu);
		bussi.lisaaMatkustaja(lippu);
		bussi.lisaaMatkustaja(lippu);
		bussi.lisaaMatkustaja(lippu);
		bussi.lisaaMatkustaja(lippu);
		// kommitointi automaatibuildausta varten
	
	}
	
}
