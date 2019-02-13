package spill;

public class Observator {

	public static void main(String[] args) {
		Terningspill spill = new Terningspill(1);
		
		spill.leggTilSpiller("Are");
		spill.leggTilSpiller("Marcus");
		spill.spill();
		spill.test();
	}

}
