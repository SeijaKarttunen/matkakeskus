package fi.seija.mavenmatkakeskus;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;


public class KulkuneuvoTest {

	@Test
	public void testKulkuneuvo() {
		Date aika = new Date(System.currentTimeMillis());
		Kulkuneuvo k = new Kulkuneuvo("Jyväskylä", "Oulu", aika, aika);
		
		assertEquals("Jyväskylä", k.getLahtoPaikka());	
		assertEquals("Oulu", k.getMaaranpaa());
		assertEquals(aika, k.getLahtoAika());
		assertEquals(aika, k.getSaapumisAika());
		
	}

}
