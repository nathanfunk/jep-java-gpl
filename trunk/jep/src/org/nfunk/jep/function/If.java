/* @author rich
 * Created on 18-Nov-2003
 *
 * This code is covered by a Creative Commons
 * Attribution, Non Commercial, Share Alike license
 * <a href="http://creativecommons.org/licenses/by-nc-sa/1.0">License</a>
 */
package org.nfunk.jep.function;

import org.nfunk.jep.*;
import org.nfunk.jep.type.*;
import java.util.Stack;
/**
 * The if(condExpr,posExpr,negExpr) function.
 * The value of trueExpr will be returned if condExpr is >0 or Boolean.TRUE
 * and value of negExpr will be returned if condExpr is &lt;= 0 or Boolean.TRUE.
 * <p>
 * This function performs lazy evaluation so that
 * only posExpr or negExpr will be evaluated.
 * For Complex numbers only the real part is used.
 * <p>
 * An alternate form if(condExpr,posExpr,negExpr,zeroExpr)
 * is also availiable. Note most computations
 * are carried out over floating point doubles so
 * testing for zero can be dangerous.
 * <p>
 * This function implements the SpecialEvaluationI interface
 * so that it handles setting the value of a variable. 
 * @author Rich Morris
 * Created on 18-Nov-2003
 * @version 2.3.0 beta 1 now supports a Boolean first arguement.
 */
public class If extends PostfixMathCommand implements SpecialEvaluationI {

	/**
	 * 
	 */
	public If() {
		super();
		numberOfParameters = -1;
	}

	/**
	 * Performs the specified action on an expression tree.
	 * Serves no function in standard JEP but 
	 * @param node top node of the tree
	 * @param data	The data passed to visitor, typically not used.
	 * @param pv	The visitor, can be used decend on the children.
	 * @return top node of the results.
	 * @throws ParseException
	 */
//	public Node process(Node node,Object data,ParserVisitor pv) throws ParseException
//	{
//		return null;
//	}

	/** For assignment **/
	public Object evaluate(Node node,Object data,ParserVisitor pv,Stack inStack,SymbolTable symTab) throws ParseException
	{
		int num = node.jjtGetNumChildren(); 
		if( num < 3 || num > 4)
			throw new ParseException("If operator must have 3 or 4 arguments.");

		// get value of argument

		node.jjtGetChild(0).jjtAccept(pv,data);	
		checkStack(inStack); // check the stack
		Object condVal = inStack.pop();
		
		// convert to double
		double val;
		if(condVal instanceof Boolean)
		{
			if(((Boolean) condVal).booleanValue())
				node.jjtGetChild(1).jjtAccept(pv,data);
			else
				node.jjtGetChild(2).jjtAccept(pv,data);
			return data;
		}
		if(condVal instanceof Double)
		{
			val = ((Double) condVal).doubleValue();
		}
		else if(condVal instanceof Complex)
		{
			val = ((Complex) condVal).re();
		}
		else
		{
			throw new ParseException("Condition in if operator must be double or complex");
		}

		if(val>0.0)
		{
			node.jjtGetChild(1).jjtAccept(pv,data);
		}
		else if(num ==3 || val <0.0)
		{
			node.jjtGetChild(2).jjtAccept(pv,data);
		}
		else
		{
			node.jjtGetChild(3).jjtAccept(pv,data);
		}
		
		return data;
	}

}
