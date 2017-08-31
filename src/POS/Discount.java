package POS;

import java.util.ArrayList;

public class Discount {
	ArrayList<Integer> SKU;
	

	Discount(){
		this.SKU = new ArrayList<Integer>();
		this.init();
	}
	void addItem(int i) {
		this.SKU.add(i); 
	}

	double calculate() {
		return 0.0;
	}
	public void init() {
		this.SKU.clear();
	}
}
