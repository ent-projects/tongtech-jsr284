/**
 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package javax.rcm;

import java.security.BasicPermission;
import java.security.Permission;

/**
 * @author heng wu(wuheng@iscas.ac.cn)
 * 
 *         This class is used to implement a security policy that permits only
 *         trusted code to influence the execution of Java programs through the
 *         use of the Resource Management API.
 */
public class ResourcePermission extends BasicPermission {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5948119429318147284L;

	public ResourcePermission(String name, String actions) {
		super(name, actions);
		// TODO Auto-generated constructor stub
	}

	public ResourcePermission(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Tests if the current permission has same name and actions as the argument.
	 */
	public boolean equals(Object obj) {
		return true;
	}

	/**
	 * Returns the actions of this permission.
	 */
	public String getActions() {
		return null;
	}

	/**
	 * Checks if this permission implies the argument permission.
	 */
	@Override
	public boolean implies(Permission p) {
		return super.implies(p);
	}

	/**
	 * Obeys the general contact of the hashCode method.
	 */
	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
