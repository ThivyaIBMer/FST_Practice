package fifthDay;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class UnitTest {

	
	@Test()
	void test() {
		MathOperations math=new MathOperations();
		int val=math.add(2, 5);
		assertEquals(7, val);
		int subVal=math.sub(44, 7);
		assertEquals(37,subVal);
		int mulVal=math.multiply(3, 3);
		assertTrue(mulVal==9);
		int divVAl=math.divide(4,4);
		assertTrue(divVAl==1);
	}

}
