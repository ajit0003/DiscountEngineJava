package POS;

import java.util.ArrayList;

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
        
        for (int i = 0; i < this.SKU.size(); i++){
            curr_item = SKU.get(i);
            curr_price = price.get(i);
            check_item = curr_item / 10;
            
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
