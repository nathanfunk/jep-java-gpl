/* @author rich
 * Created on 16-Nov-2003
 *
 * This code is covered by a Creative Commons
 * Attribution, Non Commercial, Share Alike license
 * <a href="http://creativecommons.org/licenses/by-nc-sa/1.0">License</a>
 */
package org.lsmp.djep.xjep;

import org.nfunk.jep.*;

/**
 * A Visitor which returns an exact copy of the tree.
 * This class should be extended by visitors which
 * modify trees and creates a new tree.
 * 
 * @author Rich Morris
 * Created on 16-Nov-2003
 */
public class DeepCopyVisitor extends DoNothingVisitor implements ParserVisitor {

	private XJepI xjep;
	/** Creates a deepCopy of a Node **/	
	public Node deepCopy(Node node,XJepI xjep) throws ParseException
	{
		this.xjep = xjep;
		Node res = (Node) nodeAccept(node,null);
		return res;
	}

	public Object visit(ASTConstant node, Object data)  throws ParseException
	{
		return xjep.getNodeFactory().buildConstantNode(node);
	}

	public Object visit(ASTVarNode node, Object data)  throws ParseException
	{
		return xjep.getNodeFactory().buildVariableNode(node);
	}

	public Object visit(ASTFunNode node, Object data)  throws ParseException
	{
		Node children[]=acceptChildrenAsArray(node,data);
		return xjep.getNodeFactory().buildFunctionNode(node,children);
	}
}
