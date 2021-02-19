/**
 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package javax.rcm;

/**
 * @author heng wu(wuheng@iscas.ac.cn)
 *
 *         A ResourceConsumer is an executable entity whose resource usage is
 *         controlled by the Resource Consumption Management API.
 */
public class ResourceConsumer {

	/**
	 * @return Returns an array of all resource consumers in the system.
	 */
	public static ResourceConsumer[] currentConsumers() {
		return null;
	}

	/**
	 * @param consumer
	 * @return Creates a new resource consumer.
	 */
	public static ResourceConsumer newConsumer(Object consumer) {
		return null;
	}

	/**
	 * @param resourceAttributes
	 * @return Finds the current domain for the specified resource to which this
	 *         resource consumer is bound.
	 */
	public ResourceDomain currentDomain(ResourceAttributes resourceAttributes) {
		return null;
	}

	/**
	 * @return Returns all resource domains to which this resource consumer is
	 *         bound.
	 */
	public ResourceDomain[] currentDomains() {
		return null;
	}

	/**
	 * Compares this resource consumer to another object.
	 */
	public boolean equals(Object obj) {
		return true;
	}

	/**
	 * @return Returns the object wrapped inside this instance.
	 */
	public Object getConsumer() {
		return null;
	}

	/**
	 *
	 */
	public int hashCode() {
		return -1;
	}

}
