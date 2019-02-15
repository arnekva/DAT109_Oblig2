
package test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import spill.Kopp;
import spill.Spiller;
import spill.Terning;
import spill.Terningspill;

/**
 * @author arnekvaleberg
 *
 */
class spillTest {

	Terningspill terningspill = new Terningspill(1);
	Kopp kopp = new Kopp(1, 0);
	Spiller spiller = new Spiller("Erna");
	ArrayList<Terning> terninger = new ArrayList<Terning>();
	
	
	/**
	 * Tester at terninger blir trillet og verdier blir lagret.
	 */
	@Test
	void trillTest() {
		kopp.trill();
		Assert.assertNotNull(kopp.getTerninger());
	}
	
	/**
	 *  tester at spillere blir korrekt lagt til.
	 */
	@Test
	void leggTilSpillerTest() {
		terningspill.leggTilSpiller("Siv");
		Assert.assertNotNull(terningspill.getSpillere().get(0));
		Assert.assertTrue(terningspill.getSpillere().get(0).getNavn().equals("Siv"));
		
	}
	/**
	 * Tester at verdien til spillere blir korrekt lagt til gjennom spillet.
	 */
	@Test
	void verdiTest() {
		terningspill.leggTilSpiller("Knut-Arild");
		terningspill.spill();
		Assert.assertTrue(terningspill.getSpillere().get(0).getVerdi()>1 && terningspill.getSpillere().get(0).getVerdi()<13);
	}
	/**
	 * Passer på at summeringen skjer korrekt, at verdien blir mellom eller lik 2 og 12.
	 */
	@Test
	void sumTest() {
		kopp.trill();

		spiller.setVerdi(kopp.getSum());
		Assert.assertTrue(spiller.getVerdi() > 1 && spiller.getVerdi()<13);
	}

}
