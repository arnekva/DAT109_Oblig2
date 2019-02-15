package spill;

/**
 * @author Obl 2 Gruppe 10
 *
 */
public class Spiller {

	private String navn;
	private int verdi;

	public Spiller(String navn) {

		this.navn = navn;
		this.verdi = 0;
	}

	/**
	 * Triller terningene og oppdaterer scoren til spilleren
	 * 
	 * @param kopp - Koppen som skal trilles
	 */
	public void spill(Kopp kopp) {
		kopp.trill();
		verdi = kopp.getSum();
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}

	@Override
	public String toString() {
		return navn + " scoret:\t" + verdi;
	}

}
