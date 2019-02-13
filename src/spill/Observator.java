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
		System.out.println("Hvor mange spillere skal spille: ");
		int antall = tast.nextInt(); tast.nextLine();
		
		System.out.println("Skriv inn navnet på spillerene. Press enter mellom hvert navn!");
		for(int i = 0; i<antall;i++) {

			spill.leggTilSpiller(tast.nextLine());
		}

		spill.spill();
		tast.close();

	}

}
