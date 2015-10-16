package fi.seija.mavenmatkakeskus;

import static org.junit.Assert.*;

import org.junit.Test;


public class MatkustajaTest {

	@Test
	public void test() {
		String etunimi = "Ville";
		String sukunimi = "Vallaton";
		Matkustaja matkustaja = new Matkustaja (etunimi, sukunimi, "Opiskelija");
		
		assertEquals("Ville Vallaton", matkustaja.getEtunimi()+" "+matkustaja.getSukunimi());
		assertEquals("Opiskelija", matkustaja.getAlennusRyhma());
		assertEquals(20, matkustaja.annaAlennusProsentti());	
	}

}
