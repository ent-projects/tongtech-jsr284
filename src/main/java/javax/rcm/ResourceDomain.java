/**
 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package javax.rcm;

/**
 * @author heng wu(wuheng@iscas.ac.cn)
 *
 *         A ResouceDomain binds a group of resource consumers to a resource,
 *         and imposes a common resource management policy on the consumer group
 *         for this resource.
 */
public class ResourceDomain {

	/**
	 * Adds a constraint to the set of constraints associated with this domain.
	 * 
	 * @param constraint
	 */
	public void addConstraint(Constraint constraint) {

	}

	/**
	 * Adds a resource consumer to this resource domain.
	 * 
	 * @param resourceConsumer
	 */
	public void addConsumer(ResourceConsumer resourceConsumer) {

	}

	/**
	 * Adds a notification to the set of notifications associated with this domain.
	 * 
	 * @param notification
	 */
	public void addNotification(Notification notification) {

	}

	/**
	 * @param quantity
	 * @param allowPartialGrant
	 * @return Determines whether a specified quantity of the resource can be
	 *         consumed.
	 */
	public long consume(long quantity, boolean allowPartialGrant) {
		return -1;
	}

	/**
	 * Tests this ResourceDomain for equality with the given object.
	 */
	public boolean equals(Object other) {
		return true;
	}

	/**
	 * @return Returns the domain name specified at domain creation time using
	 *         newDomain(ResourceAttributes resourceAttributes, String domainName)
	 */
	public String getName() {
		return null;
	}

	/**
	 * @return Returns the reservation associated with this domain.
	 */
	public long getReservation() {
		return -1;
	}

	/**
	 * @return Returns the resource controlled by this resource domain.
	 */
	public ResourceAttributes getResourceAttributes() {
		return null;
	}

	/**
	 * @return Returns the list of resource consumers currently bound to this
	 *         domain.
	 */
	public ResourceConsumer[] getResourceConsumers() {
		return null;
	}

	/**
	 * @return Returns the total reserved amount of the resource.
	 */
	public long getTotalReservation() {
		return -1;
	}

	/**
	 * @return Returns the total resource usage across all domains for this
	 *         resource.
	 */
	public long getTotalUsage() {
		return -1;
	}

	/**
	 * @return Returns the total rate of usage of the resource across all domains
	 *         for this resource.
	 */
	public long getTotalUsageRate() {
		return -1;
	}

	/**
	 * @return Returns the usage of the resource by resource consumers bound to this
	 *         resource domain.
	 */
	public long getUsage() {
		return -1;
	}

	/**
	 * @return Returns the rate of usage of the resource by this domain.
	 */
	public long getUsageRate() {
		return -1;
	}

	/**
	 * Returns a hash code value for this resource domain.
	 */
	public int hashCode() {
		return -1;
	}

	/**
	 * @return Tests whether the domain is in the terminated state.
	 */
	public boolean isTerminated() {
		return true;
	}

	/**
	 * Creates a resource domain for the specified resource and assigns a
	 * descriptive name to the domain.
	 * 
	 * @param resourceAttributes
	 * @param domainName
	 * @return
	 */
	public static ResourceDomain newDomain(ResourceAttributes resourceAttributes, String domainName) {
		return null;
	}

	/**
	 * @param quantity
	 * @return Notifies the resource management framework that a specified quantity
	 *         of the resource is no longer in use so that the amount of resource
	 *         available for consumption is kept up to date.
	 */
	public long relinquish(long quantity) {
		return -1;
	}

	/**
	 * Removes a constraint.
	 * 
	 * @param constraint
	 */
	public void removeConstraint(Constraint constraint) {

	}

	/**
	 * @param resourceConsumer
	 * @return Removes a resource consumer from this resource domain.
	 */
	public boolean removeConsumer(ResourceConsumer resourceConsumer) {
		return true;
	}

	/**
	 * Removes a notification.
	 * 
	 * @param notification
	 */
	public void removeNotification(Notification notification) {

	}

	/**
	 * Sets a reservation on this domain.
	 * 
	 * @param reservation
	 */
	public void setReservation(long reservation) {

	}

	/**
	 * Terminates this resource domain.
	 */
	public void terminate() {

	}

	/**
	 * Returns a string description of this resource domain.
	 */
	public String toString() {
		return null;
	}
}
