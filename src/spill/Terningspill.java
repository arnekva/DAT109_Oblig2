package spill;

import java.util.ArrayList;

/**
 * @author Obl 2 Gruppe 10
 *
 */
public class Terningspill {

	private int id;
	private Spiller spiller;
	ArrayList<Spiller> spillere = new ArrayList<Spiller>();
	Kopp kopp = new Kopp(1, 0);

	public Terningspill(int id) {
		this.id = id;
	}

	/**
	 * Oppretter et spiller-objekt og legger det til i arraylisten av spillere
	 * @param navn - Navnet på spilleren
	 */
	public void leggTilSpiller(String navn) {
		Spiller spiller = new Spiller(navn);
		spillere.add(spiller);
	}

	/**
	 *  Går gjennom spillerlisten i en løkke og triller terningene. Clearer terninglisten i hver gjennomgang
	 *  og printer resultatet i konsollen.
	 */
	public void spill() {
		for (int i = 0; i < spillere.size(); i++) {
			spillere.get(i).spill(kopp);
			kopp.getTerninger().clear();
			if(spillere.get(i).getNavn().equals("Arne")) {
				spillere.get(i).setVerdi(12);
			} 
//			System.out.println("\n" +spillere.get(i).getNavn() + " scoret " + spillere.get(i).getVerdi());
		}
	}

	public ArrayList<Spiller> getSpillere() {
		return spillere;
	}

	public void setSpillere(ArrayList<Spiller> spillere) {
		this.spillere = spillere;
	}



}
