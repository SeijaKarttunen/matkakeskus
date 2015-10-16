package fi.seija.mavenmatkakeskus;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Date;

import org.junit.Test;



//@RunWith(MockitoJUnitRunner.class)
public class LippuTest {	

/*	@Mock
	Matkustaja mockMatkustaja;
	
	@Before
	public void setUp(){
		when(mockMatkustaja.getKohde()).thenReturn("Ville Town");
	}*/


	@Test
	public void LippuTesti() {		
		Matkustaja matkustaja = new Matkustaja("Ville", "Vallaton", "Opiskelija");	
		Lippu testiLippu = new Lippu(matkustaja);
		Date aika = new Date(System.currentTimeMillis());
		testiLippu.setLahtoaika(aika);
		testiLippu.setLahtoPaikka("Laukaa");
		testiLippu.setMaaranpaa("Tampere");
		testiLippu.setPaikanHinta(100.0);
		testiLippu.setKulkuneuvo("Bussi");
		
		assertTrue(matkustaja.equals(testiLippu.getMatkustaja()));
		assertEquals(aika, testiLippu.getLahtoaika());
		assertEquals("Laukaa", testiLippu.getLahtoPaikka());
		assertEquals("Tampere", testiLippu.getMaaranpaa());
		assertEquals("Bussi", testiLippu.getKulkuneuvo());
		assertEquals(100.0, testiLippu.getPaikanHinta(),0.0);
	}
	
	
	@Test
	public void LippuAlennusTesti() {	
		Matkustaja matkustaja1 = new Matkustaja("Ville", "Vallaton", "Opiskelija");
		Matkustaja matkustaja2 = new Matkustaja("Elli", "Eläkeläinen", "Eläkeläinen");
		Matkustaja matkustaja3 = new Matkustaja("Tytti", "Työtön", "Työtön");
		Lippu testiLippu1 = new Lippu(matkustaja1);
		Lippu testiLippu2 = new Lippu(matkustaja2);
		Lippu testiLippu3 = new Lippu(matkustaja3);
		testiLippu1.setPaikanHinta(100.0);
		testiLippu2.setPaikanHinta(100.0);
		testiLippu3.setPaikanHinta(100.0);
		
		assertEquals(80.0, testiLippu1.annaAlennettuHinta(matkustaja1.annaAlennusProsentti()), 0.0);
		assertEquals(85.0, testiLippu2.annaAlennettuHinta(matkustaja2.annaAlennusProsentti()), 0.0);
		assertEquals(90.0, testiLippu3.annaAlennettuHinta(matkustaja3.annaAlennusProsentti()), 0.0);
	}
}
