/*****************************************************************************

@header@
@date@
@copyright@
@license@

*****************************************************************************/

package org.nfunk.jep.type;

import org.nfunk.jep.ParseException;

/**
 * Default class for creating number objects. This class can be replaced by
 * other NumberFactory implementations if other number types are required. This
 * can be done using the 
 */
public class DoubleNumberFactory implements NumberFactory {
	public static Double ZERO = Double.valueOf(0.0);
	public static Double ONE = Double.valueOf(1.0);
	public static Double TWO = Double.valueOf(2.0);
	public static Double MINUSONE = Double.valueOf(-1.0);
	
	/**
	 * Creates a Double object initialized to the value of the parameter.
	 *
	 * @param value The initialization value for the returned object.
	 */
	public Object createNumber(String value) {	return Double.valueOf(value);	}
	public Object createNumber(double value) {	return Double.valueOf(value);	}
	public Object createNumber(Number value) {	return value;	}
	public Object createNumber(boolean value) { return (value?ONE:ZERO); }
	public Object createNumber(float value) {return Double.valueOf(value);	}
	public Object createNumber(int value) {return Double.valueOf(value);	}
	public Object createNumber(short value) {return Double.valueOf(value);	}
	public Object createNumber(Complex value)  throws ParseException {
		throw new ParseException("Cannot create a number from a Complex value");	
	}
	public Object getMinusOne() {return MINUSONE;}
	public Object getOne() {return ONE;}
	public Object getTwo() {return TWO;}
	public Object getZero() {return ZERO;}
}
