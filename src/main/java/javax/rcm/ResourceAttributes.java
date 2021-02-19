/**
 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package javax.rcm;

import java.util.Properties;

/**
 * @author heng wu(wuheng@iscas.ac.cn)
 *
 *         The ResourceAttributes interface describes the properties or
 *         attributes of a resource that is managed by the Resource Consumption
 *         Management API.
 */
public interface ResourceAttributes {

	/**
	 * Configures the attributes of the resource.
	 * 
	 * @param properties
	 */
	void configure(Properties properties);

	/**
	 * Indicates whether this instance of resource attributes is equal to another.
	 * 
	 * @param obj
	 * @return
	 */
	boolean equals(Object obj);

	/**
	 * Return the granularity used for measuring usage of this resource.
	 * 
	 * @return
	 */
	long getGranularity();

	/**
	 * Returns the maximum possible interval, in nanoseconds, between the moment
	 * that this method is called and the moment the measurement is taken.
	 * 
	 * @return
	 */
	long getMaximumMeasurementDelay();

	/**
	 * 
	 * @return Returns the name of this particular instance of ResourceAttributes.
	 */
	String getName();

	/**
	 * @return Returns the length, in nanoseconds, of the time interval to which
	 *         rate management methods of ResourceDomain are relative.
	 */
	long getRateManagementPeriod();

	/**
	 * @return Total available quantity of resource or -1 if this cannot be
	 *         determined.
	 */
	long getTotalQuantity();

	/**
	 * @return Returns the name of the unit in which the resource consumption is
	 *         measured, e.g., "unit", "milisecond", "cycle", "byte".
	 */
	String getUnitName();

	/**
	 * @return See Object.hashCode()
	 */
	int hashCode();

	/**
	 * @return Returns true if and only if this resource is disposable.
	 */
	boolean isDisposable();

	/**
	 * @return Returns true if and only if this resource is reservable.
	 */
	boolean isReservable();

	/**
	 * @return Returns true if and only if this resource is unbounded.
	 */
	boolean isUnbounded();

	/**
	 * @return Returns the name of this resource.
	 */
	String toString();
}
