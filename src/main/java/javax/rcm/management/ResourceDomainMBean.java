/**
 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package javax.rcm.management;

/**
 * @author heng wu(wuheng@iscas.ac.cn)
 * 
 *         Management interface exposed for ResourceDomain instances.
 */
public interface ResourceDomainMBean {

	/**
	 * @return Returns the reservation associated with this domain.
	 */
	long getReservation();

	/**
	 * @return Returns the resource name controlled by this resource domain.
	 */
	String getResourceAttributesName();

	/**
	 * @return Returns the total resource availability.
	 */
	long getTotalQuantity();

	/**
	 * @return Returns the total reserved amount of the resource.
	 */
	long getTotalReservation();

	/**
	 * @return Returns the system-wide resource usage.
	 */
	long getTotalUsage();

	/**
	 * @return Returns the total rate of usage of the resource by this domain.
	 */
	long getTotalUsageRate();

	/**
	 * @return Returns the usage of the resource by resource consumers bound to this
	 *         resource domain.
	 */
	long getUsage();

	/**
	 * @return Returns the rate of usage of the resource by this domain.
	 */
	long getUsageRate();

	/**
	 * @return Tests whether the domain is in the terminated state.
	 */
	boolean isTerminated();
}
