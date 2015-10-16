package fi.seija.mavenmatkakeskus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class JunaTest {

	@Test
	public void test() {
		Juna juna = new Juna(10,4);
		Vaunu vaunu1 = new Vaunu(1,4);
		Vaunu vaunu2 = new Vaunu(2,4);
		Vaunu vaunu3 = new Vaunu(3,4);
		juna.lisaaVaunu(vaunu1);
		juna.lisaaVaunu(vaunu2);
		juna.lisaaVaunu(vaunu3);
		
		assertEquals(10, juna.getJunanNumero());
		assertEquals(4, juna.getVaunujenMaxMaara());
		assertEquals(3, juna.getVaunujenMaara());		
		assertTrue(juna.getVaunu(0).equals(vaunu1));
		assertTrue(juna.getVaunu(1).equals(vaunu2));
		assertTrue(juna.getVaunu(2).equals(vaunu3));
	}

}
