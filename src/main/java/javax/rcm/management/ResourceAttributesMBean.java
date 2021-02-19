/**
 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package javax.rcm.management;

/**
 * @author heng wu(wuheng@iscas.ac.cn)
 * 
 *         Management interface exposed for ResourceAttributes implementations.
 */
public interface ResourceAttributesMBean {

	/**
	 * @return The granularity of measuring the usage of this resource.
	 */
	long getGranularity();

	/**
	 * @return The maximum time interval the reported resource usage can be
	 *         out-of-date.
	 */
	long getMaximumMeasurementDelay();

	/**
	 * @return The period for rate management
	 */
	long getRateManagementPeriod();

	/**
	 * @return Total available quantity of resource or -1 if it cannot be determined
	 */
	long getTotalQuantity();

	/**
	 * @return The name of the unit in which the resource consumption is measured.
	 */
	String getUnitName();

	/**
	 * @return Returns true if an only if this resource is disposable
	 */
	boolean isDisposable();

	/**
	 * @return Returns true if an only if this resource is reservable.
	 */
	boolean isReservable();

	/**
	 * @return Returns true if an only if this resource is unbounded
	 */
	boolean isUnbounded();
}
