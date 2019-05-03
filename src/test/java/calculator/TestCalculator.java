package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {

	Calculator c;
	@BeforeEach
	void init() {
		c = new Calculator();
	}

	@Test
	void testAdd() {
		assertEquals("6", c.calculate(3,3,"add"));
	}
	@Test
	void testAddReal() {
		assertEquals("6.1", c.calculate(3.1,3,"add"));
	}
	@Test
	void testAddNegative() {
		assertEquals("-6", c.calculate(-3,-3,"add"));
	}
	@Test
	void testAddPositiveNegative() {
		assertEquals("-6", c.calculate(3,-9,"add"));
	}
	@Test
	void testSub() {
		assertEquals("0", c.calculate(3,3,"sub"));
	}
	@Test
	void testSubdNegative() {
		assertEquals("0", c.calculate(-3,-3,"sub"));
	}
	@Test
	void testSubPositiveNegative() {
		assertEquals("12", c.calculate(3,-9,"sub"));
	}
	@Test
	void testMul() {
		assertEquals("9", c.calculate(3,3,"mul"));
	}
	@Test
	void testMulPositiveNegative() {
		assertEquals("-9", c.calculate(3,-3,"mul"));
	}
	@Test
	void testMulNegative() {
		assertEquals("9", c.calculate(-3,-3,"mul"));
	}
	@Test
	void testDiv() {
		assertEquals("1", c.calculate(3,3,"div"));
	}
	@Test
	void testDiv1() {
		assertEquals("0.6666666666666666", c.calculate(2,3,"div"));
	}
	@Test
	void testDivZeroByZero() {
		assertEquals("NaN", c.calculate(0,0,"div"));
	}
	@Test
	void testDivByZero() {
		assertEquals("Infinity", c.calculate(2,0,"div"));
	}
}
