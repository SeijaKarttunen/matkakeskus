package fi.seija.mavenmatkakeskus;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BussiTest.class, JunaTest.class, KulkuneuvoTest.class, LippuTest.class, MatkustajaTest.class,
		VaunuTest.class })
public class MatkakeskusTestit {

}
