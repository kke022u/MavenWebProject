package gdu.co.kr;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calc ;
	int a = 5;
	int b = 3;
	
	@Before
	public void before() {
		calc = new Calculator();
		System.out.println("before()");
		a = 2;
		b = 6;
	}
	
	@Test
	public void test() {
		System.out.println("test()");
		int add = calc.add(a, b);	//2 + 6 = 8
		int sub = calc.subtract(add, b);	// 8 - 6 = 2
		int mul = calc.multiply(sub, a);	// 2 * 2 = 4
		int div = calc.divide(mul, a);	// 4 / 2 = 2
		
		assertEquals(2, div);
		
	}
	
	@After
	public void after() {
		System.out.println("after()");
	}

}
