/*****************************************************************************

@header@
@date@
@copyright@
@license@

*****************************************************************************/

package org.nfunk.jeptesting;

import junit.framework.*;

public class AllTests {
	
	public static void main (String[] args) {
		junit.textui.TestRunner.run(suite());
	}
	
	public static Test suite() {
		TestSuite suite = new TestSuite("All JUnit Tests");
		// TODO: Update these when JEPTest is fully migrated to JUnit 5
		// For now, these tests will run directly via JUnit 5 discovery
		// suite.addTest(new JEPTest("testParseExpression"));
		// suite.addTest(new LogarithmTest("testLogarithm"));
		// suite.addTest(new NaturalLogarithmTest("testNaturalLogarithm"));
		return suite;
	}
}
