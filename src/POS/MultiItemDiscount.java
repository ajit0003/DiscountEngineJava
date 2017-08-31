package POS;

import java.util.ArrayList;
import java.util.HashMap;

public class MultiItemDiscount extends Discount {
	
	public MultiItemDiscount() {
		super();
		// TODO Auto-generated constructor stub
	}

	double calculate() {
        // TODO Auto-generated method stub
        double total_price = 0;
        double curr_price = 0;
        int curr_item = 0;
        int check_item;
        ArrayList<Integer> checks = new ArrayList<Integer>();
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        HashMap<Integer, Double> price = new HashMap<Integer, Double>();
        
        for (int i = 0; i < this.SKU.size(); i++){
            curr_item = SKU.get(i);
            curr_price = price.get(i);
            check_item = curr_item / 10;
            
            if (count.containsKey(check_item)){
            	count.put(check_item, count.get(check_item) + 1);
            }else{
            	count.put(check_item, 1);
            	price.put(check_item, curr_price);
            }
            
            if (checks.contains(check_item)){
                total_price += (curr_price * 0.7);
                checks.remove(checks.indexOf(check_item));
            }
            else{
                total_price += curr_price;
                checks.add(check_item);
            }
        }
        return total_price;
    }
	
}
