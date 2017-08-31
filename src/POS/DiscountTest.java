package POS;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscountTest {

	Discount d = new MultiItemDiscount();
	
	@Test
    public void testZeroItem() {
        // TODO review the generated test code and remove the default call to fail.
        d.init();
        
        double discount = d.calculate();
        double expected = 0;
        
        assertEquals(expected, discount, 0);
    }
    
    @Test
    public void testOneItem() {
        // TODO review the generated test code and remove the default call to fail.
    	d.init();
    	
        d.addItem(10001, 10.00);
        double discount = d.calculate();
        double expected = 10;
        
        assertEquals(expected, discount, 0);
    }
    
    @Test
    public void testTwoItems_Identical() {
    	d.init();
    	
        d.addItem(10001, 10.00);
        d.addItem(10001, 10.00);
        double discount = d.calculate();
        double expected = 17;
        
        assertEquals(expected, discount, 0);
    }
    
    @Test
    public void testTwoItems_Similar() {
    	d.init();
    	
        d.addItem(10001, 10.00);
        d.addItem(10002, 10.00);
        double discount = d.calculate();
        double expected = 17;
        
        assertEquals(expected, discount, 0);
    }
    
    @Test
    public void testTwoItems_Different() {
    	d.init();
    	
        d.addItem(10001, 10.00);
        d.addItem(20002, 11.00);
        double discount = d.calculate();
        double expected = 21;
        
        assertEquals(expected, discount, 0);
    }
    
    @Test
    public void testMoreThanTwo_Identical() {
        for (int i=3; i<10; i++){
			
        	d.init();
        	
            for (int j=0; j<i; j++){
                d.addItem(10001, 10.00);
            }
            double result = d.calculate();

            double expected = 0;

            switch (i){
                case 3: expected = 27.00; break;
                case 4: expected = 34.00; break;
                case 5: expected = 44.00; break;
                case 6: expected = 51.00; break;
                case 7: expected = 61.00; break;
                case 8: expected = 68.00; break;
                case 9: expected = 78.00; break;
            }

            assertEquals(expected, result, 0);
        }
    }
    
    @Test
    public void testMoreThanTwo_Different() {
        for (int i=3; i<10; i++){
			
        	d.init();
        	
            for (int j=0; j<i; j++){
                d.addItem(10000*(j+1), 10.00);
            }
            double result = d.calculate();

            double expected = i * 10.0;

            assertEquals(expected, result, 0);
        }
    }
    
    @Test
    public void testMoreThanTwo_Mixed() {
        for (int i=3; i<10; i++){
			
        	d.init();
        	
            for (int j=0; j<i; j++){
                if (j % 2 == 0){    
                    d.addItem(10000+j, 10.00);
                }else{
                    d.addItem(20000+j, 100.00);
                }
            }
            double result = d.calculate();

            double expected = 0;

            switch (i){
                case 3: expected = 117.00; break;
                case 4: expected = 187.00; break;
                case 5: expected = 197.00; break;
                case 6: expected = 297.00; break;
                case 7: expected = 304.00; break;
                case 8: expected = 374.00; break;
                case 9: expected = 384.00; break;
            }

            assertEquals(expected, result, 0);
        }
    }

}
