package spill;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Obl 2 Gruppe 10
 *
 */
public class Observator {

	/**
	 * Starter spiller med å spørre etter antall deltakere og navn gjennom scanner input
	 * Kjører spiller og printer resultatet på slutten.
	 * @param args
	 */
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
		
		
		ArrayList<Spiller> spillere = spill.getSpillere();
		System.out.println("\n*** RESULTATER *** \n");
		spillere.stream().forEach(x -> System.out.println(x.toString()));
		Spiller vinner = spillere.stream().max(Comparator.comparing(Spiller::getVerdi)).orElseThrow(NoSuchElementException::new);
	
		System.out.println("\nVinneren er "+ vinner.getNavn() + "!");
	}

}
