package spill;

import java.util.ArrayList;

/**
 * @author Obl 2 Gruppe 10
 *
 */
public class Terningspill {

	private int id;
	private ArrayList<Spiller> spillere = new ArrayList<Spiller>();
	private Kopp kopp = new Kopp(1, 0);

	public Terningspill(int id) {
		this.id = id;
	}

	/**
	 * Oppretter et spiller-objekt og legger det til i arraylisten av spillere
	 * 
	 * @param navn - Navnet på spilleren
	 */
	public void leggTilSpiller(String navn) {
		spillere.add(new Spiller(navn));
	}

	/**
	 * Går gjennom spillerlisten i en løkke og triller terningene. Clearer
	 * terninglisten i hver gjennomgang og printer resultatet i konsollen.
	 */
	public void spill() {
		for (int i = 0; i < spillere.size(); i++) {
			spillere.get(i).spill(kopp);
			kopp.getTerninger().clear();

			// her ligger det en liten juksebit
			if (spillere.get(i).getNavn().toLowerCase().equals("arne")) {
				spillere.get(i).setVerdi(12);

			}
			// cheat end
		}
	}

	public ArrayList<Spiller> getSpillere() {
		return spillere;
	}

	public int getId() {
		return id;
	}

}
