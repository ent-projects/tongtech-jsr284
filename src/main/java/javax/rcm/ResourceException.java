/**
 * Copyright (2021, ) Institute of Software, Chinese Academy of Sciences
 */
package javax.rcm;

/**
 * @author heng wu(wuheng@iscas.ac.cn)
 * 
 *         ResourceException should be used by implementations of resources to
 *         indicate resource shortage.
 */
public class ResourceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6934948869596926625L;

	public ResourceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ResourceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ResourceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ResourceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
