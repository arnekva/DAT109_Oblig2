package spill;

import java.util.ArrayList;
import java.util.Random;

public class Kopp {
	private int id;
	private int sum;
	private Random random;

	private Terning terning;
	ArrayList<Terning> terninger = new ArrayList<Terning>();

	public Kopp(int id, int sum) {
		super();
		this.id = id;
		this.sum = sum;

	}

	public void trill() {
		for (int i = 1; i < 3; i++) {
			terning = new Terning(i, (int) ((Math.random() * 6)+1));
			terninger.add(terning);
		}
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSum() {
		sum = 0;
		for(int i = 0; i<terninger.size(); i++) {
			sum += terninger.get(i).getVerdi();
		}
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public ArrayList<Terning> getTerninger() {
		return terninger;
	}

	public void setTerninger(ArrayList<Terning> terninger) {
		this.terninger = terninger;
	}

}
