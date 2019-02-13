package spill;

/**
 * @author arnekvaleberg
 *
 */
public class Terningspill {
	private int id;

	public Terningspill(int id) {
	
		this.id = id;
	}
	
	
	/**
	 * Legg til en ny spiller
	 * @param navn - Navnet på spilleren (String)
	 */
	public void leggTilSpiller(String navn) {
		Spiller spiller = new Spiller(navn);
	}
	
	/**
	 * 
	 */
	public void spill() {
		
	}
}
