package spill;

/**
 * @author arnekvaleberg
 *
 */
public class Spiller {

	String navn;
	int verdi;

	public Spiller(String navn) {
		super();
		this.navn = navn;

	}

	/**
	 * @param kopp
	 */
	public void spill(Kopp kopp) {
		
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
	
	
	
}
