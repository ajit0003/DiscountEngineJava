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
    public void test1Apple() {
        // TODO review the generated test code and remove the default call to fail.
    	d.init();
    	
        d.addItem(10001);
        double discount = d.calculate();
        double expected = 0.3;
        
        assertEquals(expected, discount, 0);
    }
    
    @Test
    public void test2Apples() {
    	d.init();
    	
        d.addItem(10001);
        d.addItem(10001);
        double discount = d.calculate();
        double expected = 0.6;
        
        assertEquals(expected, discount, 0);
    }
    
    @Test
    public void test3Apples() {
    	d.init();
    	
        d.addItem(10001);
        d.addItem(10001);
        d.addItem(10001);
        double discount = d.calculate();
        double expected = 0.87;
        
        assertEquals(expected, discount, 0);
    }
    
    @Test
    public void test6grapes() {
    	d.init();
    	
        d.addItem(10009);
        d.addItem(10009);
        d.addItem(10009);
        d.addItem(10009);
        d.addItem(10009);
        d.addItem(10009);
        double discount = d.calculate();
        double expected = 22.04;
        
        assertEquals(expected, discount, 0);
    }
    
    @Test
    public void test3apples6grapes() {
    	d.init();
    	
    	d.addItem(10001);
        d.addItem(10001);
        d.addItem(10001);
        d.addItem(10009);
        d.addItem(10009);
        d.addItem(10009);
        d.addItem(10009);
        d.addItem(10009);
        d.addItem(10009);
        double discount = d.calculate();
        double expected = 22.91;
        
        assertEquals(expected, discount, 0);
    }
    

}
