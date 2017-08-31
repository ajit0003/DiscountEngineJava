package POS;

public class POSProduct {
	int product_ID;
	String product_Name;
	double product_price;
	
	
	public POSProduct(int id, String name, double price) {
		// TODO Auto-generated constructor stub
		this.product_ID= id;
		this.product_Name = name;
		this.product_price = price;
	}

	public double getPrice(int id){
		
		return this.product_price;
				
	}
	
	public int getId(){
		
		return this.product_ID;
				
	}

}
