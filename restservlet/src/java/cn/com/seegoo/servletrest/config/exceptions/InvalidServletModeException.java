package cn.com.seegoo.servletrest.config.exceptions;

public class InvalidServletModeException extends RuntimeException {
	public InvalidServletModeException(final String wrongMode) {
		super("invalid servlet mode:" + wrongMode);
	}
}
