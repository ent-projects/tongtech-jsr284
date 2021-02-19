/**
 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package javax.rcm;

/**
 * @author heng wu(wuheng@iscas.ac.cn)
 * 
 *         A Constraint is a callback that gets invoked when a resource
 *         consumption request is made for a resource.
 */
public interface Constraint {

	/**
	 * @param domain
	 * @param currentUsage
	 * @param proposedUsage
	 * @return Constrains proposed consumption of a resource.
	 */
	public long preConsume(ResourceDomain domain, long currentUsage, long proposedUsage);
}
