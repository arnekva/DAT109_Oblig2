package spill;

/**
 * @author Marcus
 *
 */
public class Terning {
	int terningId;
	Integer verdi;

	/**
	 * @param terningId
	 * @param verdi
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
