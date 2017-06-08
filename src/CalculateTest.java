import static org.junit.Assert.*;

import org.junit.Test;

/**
 * test
 * @author Grace
 *
 */
public class CalculateTest {
	
	Calculate calculation = new Calculate();
	int sum = calculation.sum(2,5);
	int testSum = 7;
	
	int subtract = calculation.subtract(10, 9);
	int testSubtract = 1;
	
	
	/**
	 * a test case follows @test
	 * if result is ok, 
	 * I can refactor this tested block 
	 * to make it clearer and more efficient 
	 * and then test it again
	 */
	@Test
	public void testSum(){
		System.out.println();
		System.out.println("@Test sum: " + sum + "=" + testSum);
		assertEquals(sum, testSum);
	}
	
	/**
	 * test subtract(op1,op2)
	 */
	@Test
	public void testSubtract(){
		System.out.println();
		System.out.println("@Test subtract:" + subtract + "=" + testSubtract);
		assertEquals(subtract, testSubtract);
	}
	
}
