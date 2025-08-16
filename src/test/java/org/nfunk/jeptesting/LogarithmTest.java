package org.nfunk.jeptesting;

import org.nfunk.jep.ParseException;
import org.nfunk.jep.function.Logarithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogarithmTest {

	/**
	 * Test method for 'org.nfunk.jep.function.Logarithm.run(Stack)'
	 * Tests the return value of log(NaN). This is a test for bug #1177557
	 */
	@Test
	public void testLogarithm() {
		Logarithm logFunction = new Logarithm();
		java.util.Stack stack = new java.util.Stack();
		stack.push(Double.valueOf(Double.NaN));
		try {
			logFunction.run(stack);
		} catch (ParseException e) {
			Assertions.fail();
		}
		Object returnValue = stack.pop();

		if (returnValue instanceof Double) {
			Assertions.assertTrue(Double.isNaN(((Double)returnValue).doubleValue()));
		} else {
			Assertions.fail();
		}
	}

}
