import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
public class PizzaTest {

	Pizza Order1;

	@Before
	public void setUp() throws Exception {
		Order1=new Pizza("Indian Pizza",3,250);
	}
	@Test
	public void testGetName() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetQuantity() {
		//fail("Not yet implemented");
		assertEquals(3,Order1.getQuantity());
	}

	@Test
	public void testGetPrice() {
		//fail("Not yet implemented");
	
		
	}

	@Test
	public void testPrintDetail() {
		//fail("Not yet implemented");
	}

	@Test
	public void testFindPrice() {
		//fail("Not yet implemented");
		assertEquals(750,Order1.FindPrice());
	}

}
