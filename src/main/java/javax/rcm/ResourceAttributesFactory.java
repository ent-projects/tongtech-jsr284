/**
 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package javax.rcm;

/**
 * @author heng wu(wuheng@iscas.ac.cn)
 * 
 *         This class assists in creating instances of ResourceAttributes and
 *         registering them to be managed in deployments of JSR 284-enabled
 *         implementations of J2SE.
 */
public class ResourceAttributesFactory {

	/**
	 * @param name
	 * @return Factory method for creating instances of implementations of the
	 *         ResourceAttributes interface.
	 */
	public static ResourceAttributes getInstanceByName(String name) {
		return null;
	}

	/**
	 * @return Returns resources previously registered.
	 */
	public static ResourceAttributes[] getRegistered() {
		return null;
	}

	/**
	 * Registers a resource named and described by attributes for management.
	 * 
	 * @param attributes
	 */
	public static void register(ResourceAttributes attributes) {

	}
}
