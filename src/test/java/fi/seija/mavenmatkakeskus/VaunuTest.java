package fi.seija.mavenmatkakeskus;

import static org.junit.Assert.*;

import org.junit.Test;

public class VaunuTest {

	@Test
	public void testVaunu() {
				
		Vaunu vaunu = new Vaunu(1, 4);
		Matkustaja matkustaja = new Matkustaja ("Ville", "Vallaton", "Oulu");
		Lippu lippu = new Lippu(matkustaja);
		
		assertEquals(1, vaunu.getVaununNumero());
		assertEquals(4, vaunu.vapaatPaikat());
		assertEquals(4, vaunu.getMatkustajienMaxMaara());
		vaunu.lisaaMatkustaja(lippu);
	
		assertEquals(3, vaunu.vapaatPaikat());
		assertEquals(1, vaunu.getMatkustajienMaara());
		
	}
	
	@Test
	public void testMatkustajaMaxMaara() {
		Vaunu vaunu = new Vaunu(1,4);
		Matkustaja matkustaja = new Matkustaja ("Ville", "Vallaton", "Oulu");
		Lippu lippu = new Lippu(matkustaja);

		vaunu.lisaaMatkustaja(lippu);
		vaunu.lisaaMatkustaja(lippu);
		vaunu.lisaaMatkustaja(lippu);
		vaunu.lisaaMatkustaja(lippu);
		vaunu.lisaaMatkustaja(lippu);

		assertEquals(vaunu.getMatkustajienMaara(), 4);
		assertEquals(vaunu.vapaatPaikat(), 0);	
	}
	
	@Test
	public void testVaunuKonstruktorit() {
				
		Vaunu vaunu = new Vaunu();
		Matkustaja matkustaja = new Matkustaja ("Ville", "Vallaton", "Oulu");
		Lippu lippu = new Lippu(matkustaja);
		vaunu.lisaaMatkustaja(lippu);
	
		assertEquals(9, vaunu.vapaatPaikat());
		assertEquals(10, vaunu.getMatkustajienMaxMaara());
	}
}
