package POS;

public class ItemDiscount {
	
	private int productId;
	private double discount;
	private int itemNumber;
	
	public ItemDiscount(int productId, double discount, int itemNumber){
		
		this.productId = productId;
		this.discount = discount;
		this.itemNumber = itemNumber;
	}
	
	public double getDiscount(){
		return this.discount;
	}
	
	public int getItemNumber(){
		return this.itemNumber;
	}
	
	public int getProductId(){
		return this.productId;
	}
}
