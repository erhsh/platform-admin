package com.blackcrystal.pa.exception;

/**
 * 服务器内部错误
 * 
 * @author j
 * 
 */
public class PaServerException extends RuntimeException {

	//
	private static final long serialVersionUID = -5260040953512974506L;

	public PaServerException(String msg) {
		super(msg);
	}

	public PaServerException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public PaServerException(Throwable cause) {
		super(cause);
	}

}
