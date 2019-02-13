package spill;

import java.util.Random;

public class Kopp {
	private int id;
	private int sum;
	private Random random;
	
	private Terning terning1;
	private Terning terning2;

	
	public Kopp(int id, int sum) {
		super();
		this.id = id;
		this.sum = sum;
		
	}
	
	public void trill() {
		terning1 = new Terning(1, random.nextInt(6));
		terning2 = new Terning(2, random.nextInt(6));
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


	public Terning getTerning1() {
		return terning1;
	}
	public Terning getTerning2() {
		return terning2;
	}


	

}
