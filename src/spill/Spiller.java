package spill;

public class Spiller {

	private String navn;
	int verdi;

	public Spiller(String navn) {
		
		this.navn = navn;
		this.verdi = 0;
	}
	
	public void spill(Kopp kopp) {
		kopp.trill();
		verdi = kopp.getSum();
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}

}
