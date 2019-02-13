package spill;

/**
 * @author Obl 2 Gruppe 10
 *
 */
public class Terning {
	int terningId;
	int verdi;

	/**
	 * Kunstruktør for terning
	 * @param terningId - IDen på terningen
	 * @param verdi - Startverdien til terningen
	 */
	public Terning(int terningId, int verdi) {
		this.terningId = terningId;
		this.verdi = verdi;
	}

	/**
	 * @return
	 */
	public int getTerningId() {
		return terningId;
	}

	/**
	 * @param terningId
	 */
	public void setTerningId(int terningId) {
		this.terningId = terningId;
	}

	/**
	 * @return
	 */
	public int getVerdi() {
		return verdi;
	}

	/**
	 * @param verdi
	 */
	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}

}
