package spill;

public class Kopp {
	private int id;
	private int sum;
	private Terning terning;

	
	public Kopp(int id, int sum) {
		super();
		this.id = id;
		this.sum = sum;
	}
	
	public void trill() {
		for(int i = 1; i <= 2; i++) {
			Integer verdi = (int)((Math.random() * 6) + 1);
			terning = new Terning(i, verdi);
		}
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public Terning getTerning() {
		return terning;
	}


	public void setTerning(Terning terning) {
		this.terning = terning;
	}
	
	

}
