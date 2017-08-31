package POS;

import java.util.ArrayList;

public class Discount {
	ArrayList<Integer> SKU;
	ArrayList<Double> price;

	Discount(){
		this.SKU = new ArrayList<Integer>();
		this.price = new ArrayList<Double>();
		this.init();

	}
	void addItem(int i, double price) {
		this.SKU.add(i); 
		this.price.add(price);
	}

	double calculate() {
		return 0.0;
	}
	public void init() {
		this.SKU.clear();
		this.price.clear();
	}
}
