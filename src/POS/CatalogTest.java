package POS;

import static org.junit.Assert.*;

import org.junit.Test;

public class CatalogTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		Catalog c = new Catalog();
		int testID = 10005;
		
		assertTrue(c.getPrice(testID)== 10.30);
		
		POSProduct p= c.getProduct(testID);
		assertTrue(p.getPrice() == 10.30);
	}

}
