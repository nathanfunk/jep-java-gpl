/* @author rich
 * Created on 26-Feb-2004
 *
 * This code is covered by a Creative Commons
 * Attribution, Non Commercial, Share Alike license
 * <a href="http://creativecommons.org/licenses/by-nc-sa/1.0">License</a>
 */
package org.lsmp.djep.djep;

import org.nfunk.jep.Node;

/**
 * This interface specifies methods needed for variables which have
 * equations specified.
 * 
 * @author Rich Morris
 * Created on 26-Feb-2004
 */
public interface DVariableI {
	/** Does this variable has an associated equation? **/
	public abstract boolean hasEquation();
	/** get the equation */
	public abstract Node getEquation();
}