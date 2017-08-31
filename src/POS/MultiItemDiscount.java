package POS;

import java.util.HashMap;

public class MultiItemDiscount extends Discount {
	
	public MultiItemDiscount() {
		super();
		// TODO Auto-generated constructor stub
	}

	double calculate() {
        // TODO Auto-generated method stub
        double total_price = 0;
        
        DiscountCatalog DC = DiscountCatalog.getInstance();
        Catalog CAT = new Catalog();
        
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < this.SKU.size(); i++){
            Integer curr_item;
            Integer check_item;
        	curr_item = SKU.get(i);
            check_item = curr_item;// / 10;
            
            if (count.containsKey(check_item)){
            	count.put(check_item, count.get(check_item) + 1);
            }else{
            	count.put(check_item, 1);
            }
        }
        
        for (Integer curr_item2: count.keySet()) {
             Integer curr_count2=count.get(curr_item2);
             
             ItemDiscount ItemD = DC.getDiscountItem(curr_item2);
             
             Integer dis_count = curr_count2 / ItemD.getItemNumber();
             curr_count2 = curr_count2 - dis_count;
             
             Double curr_price = CAT.getPrice(curr_item2);
             
             total_price += curr_count2 * curr_price;
             total_price += dis_count * ((100-ItemD.getDiscount())/100) * curr_price;
             
        } 
        return total_price;
    }
	
}
