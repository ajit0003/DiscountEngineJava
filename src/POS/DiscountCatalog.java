package POS;

import java.util.ArrayList;
import java.util.List;

public class DiscountCatalog {

	private List<ItemDiscount> discountList;
	private static DiscountCatalog discountCatalog = null;
	
	private DiscountCatalog(){
		
		discountList = new ArrayList<ItemDiscount>();
		discountList.add(new ItemDiscount(10001, 10, 3));
		discountList.add(new ItemDiscount(10002, 15, 5));
		discountList.add(new ItemDiscount(10003, 20, 6));
		discountList.add(new ItemDiscount(10009, 10, 3));
	
	}
	
	public static DiscountCatalog getInstance(){
		
		if(discountCatalog == null)
			discountCatalog = new DiscountCatalog();
		
		return discountCatalog;
	}
	
	public ItemDiscount getDiscountItem(int productId){
		
		for(ItemDiscount i : discountList){
			if(i.getProductId() == productId)
				return i;
		}
		
		return null;
	}
}
