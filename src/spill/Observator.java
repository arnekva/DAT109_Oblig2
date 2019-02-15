package spill;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Obl 2 Gruppe 10
 *
 */
public class Observator {

	/**
	 * Starter spiller med å spørre etter antall deltakere og navn gjennom scanner
	 * input Kjører spiller og printer resultatet på slutten.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Terningspill spill = new Terningspill(1);
		Scanner tast = new Scanner(System.in);
		int runde = 1;
		boolean ferdig = false;
		boolean nyeDeltakere = true;
		int antall = 0;
		while (!ferdig) {
			if (nyeDeltakere) {
				spill = new Terningspill(1);

				System.out.println("Hvor mange spillere skal spille: ");
				try {
					antall = tast.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Du har skrevet inn et ugyldig tall. Antall prøv på ny.");
					tast.nextLine();
				}
				tast.nextLine();

				for (int i = 1; i <= antall; i++) {
					System.out.println("\nSkriv navn på spiller " + i + ": ");
					spill.leggTilSpiller(tast.nextLine());
				}

			}
			if (antall > 0) {
				spill.spill();

				ArrayList<Spiller> spillere = spill.getSpillere();

				System.out.println("\n*** RESULTATER *** \n");
				spillere.stream().forEach(x -> System.out.println(x.toString()));

				Spiller vinner = spillere.stream().max(Comparator.comparing(Spiller::getVerdi))
						.orElseThrow(NoSuchElementException::new);

				List<Spiller> vinnere = spillere.stream().filter(x -> x.getVerdi() == vinner.getVerdi())
						.collect(Collectors.toList());

				if (vinnere.size() > 1) {
					System.out.println("\nDet er flere vinnere! Gratulerer til: ");
					for (int d = 0; d < vinnere.size(); d++) {
						System.out.print(vinnere.get(d).getNavn());
						if (d < vinnere.size() - 2) {
							System.out.print(", ");
						} else if (d < vinnere.size() - 1) {
							System.out.print(" og ");
						} else {
							System.out.print("!");
						}
					}
				} else {
					System.out.println("\nVinneren er " + vinner.getNavn() + "!");
				}

				/*
				 * Her ligger det litt kode for å gi brukeren muligheten til å spille flere
				 * runder, med case for nye eller samme deltakere.
				 */
				System.out.println(
						"\nØnsker du å spille en runde til? Skriv 'like' for å spille med samme deltakere eller 'nye' for å skrive inn nye deltakere. Trykk enter for å avslutte.");

				runde++;

				String svar = tast.nextLine();
				switch (svar) {

				case ("like"):
					System.out.println("\nSpiller runde " + runde + "!");
					nyeDeltakere = false;

					break;
				case ("nye"):
					System.out.println("\nSpiller runde " + runde + "!");
					nyeDeltakere = true;

					break;
				default:
					ferdig = true;
					System.out.println("\nSpillet avsluttes!");
					tast.close();
					break;
				}
			}
		}
	}

}