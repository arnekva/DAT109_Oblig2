package spill;

import java.util.Scanner;

/**
 * @author Obl 2 Gruppe 10
 *
 */
public class Observator {

	public static void main(String[] args) {
		Terningspill spill = new Terningspill(1);

		Scanner tast = new Scanner(System.in);
		spill.leggTilSpiller("Are");
		spill.leggTilSpiller("Marcus");
		spill.spill();

	}

}
