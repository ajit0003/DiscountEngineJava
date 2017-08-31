package POS;

import java.util.ArrayList;


public class Catalog {

	private ArrayList <POSProduct> products;
	
	public Catalog(){
		
		products = new ArrayList<POSProduct>();
		
		POSProduct p1 = new POSProduct(10001, "Apple", 0.30);
		products.add(p1);
		
		
		POSProduct p2 = new POSProduct(10002, "Orange", 0.40);
		products.add(p2);
		
		POSProduct p3 = new POSProduct(10003, "Pear", 0.35);
		products.add(p3);
		
		POSProduct p4 = new POSProduct(10004, "Watermelon", 5.50);
		products.add(p4);
		
		POSProduct p5 = new POSProduct(10005, "Durian", 10.30);
		products.add(p5);
		
		POSProduct p6 = new POSProduct(10006, "Mango", 2.30);
		products.add(p6);
		
		POSProduct p7 = new POSProduct(10007, "cherry", 5.00);
		products.add(p7);
		
		POSProduct p8 = new POSProduct(10008, "Strawberry", 4.80);
		products.add(p8);
		
		POSProduct p9 = new POSProduct(10009, "grape", 3.80);
		products.add(p9);
		
		POSProduct p10 = new POSProduct(10010, "jackfruit", 6.10);
		products.add(p10);
		
	}
	
}
