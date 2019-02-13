package spill;

import java.util.ArrayList;

public class Terningspill {
	
	private int id;
	private Spiller spiller;
	ArrayList<Spiller> spillere = new ArrayList<Spiller>();
	Kopp kopp = new Kopp(1,0);
	
	public Terningspill(int id) {
		this.id = id;
	}
	
	public void leggTilSpiller(String navn) {
		Spiller spiller = new Spiller(navn);
		spillere.add(spiller);
	}
	
	public void spill() {
		for(int i = 0; i<spillere.size();i++) {
			spillere.get(i).spill(kopp);
			kopp.getTerninger().clear();
		}
	}
	
	public void test() {
		for(int i = 0; i<spillere.size();i++) {
			System.out.println(spillere.get(i).getNavn() + " scoret " + spillere.get(i).getVerdi() );
		}
	}

}
