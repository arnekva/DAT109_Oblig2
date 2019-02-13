package spill;

import java.util.ArrayList;

public class Terningspill {
	private int id;
	private Spiller spiller;
	ArrayList<Spiller> spillere = new ArrayList<Spiller>();
	
	public Terningspill(int id) {
		this.id = id;
	}
	
	public void leggTilSpiller(String navn, int verdi) {
		Spiller spiller = new Spiller(navn, verdi);
	}
	
	public void spill() {
		
	}
	
	

}
