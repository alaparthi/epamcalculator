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
	void testadd() {
		assertEquals(6.0, c.calculate(3,3,"add"));
	}

}
