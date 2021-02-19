/**
 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package javax.rcm;

/**
 * @author heng wu(wuheng@iscas.ac.cn)
 * 
 *         A Notification is a callback that gets invoked immediately after a
 *         resource consumption request has been handled.
 */
public interface Notification {

	/**
	 * Reacts to a resource consumption operation.
	 * 
	 * @param domain
	 * @param previousUsage
	 * @param currentUsage
	 */
	public void postConsume(ResourceDomain domain, long previousUsage, long currentUsage);
}
