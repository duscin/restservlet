package cn.com.seegoo.servletrest.config.exceptions;

public class InvalidServletException extends RuntimeException {
	public InvalidServletException() {
		super();
	}

	public InvalidServletException(final String msg) {
		super(msg);
	}
}
