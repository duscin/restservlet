package cn.com.seegoo.servletrest.config.exceptions;

public class DuplicateUrlPatternException extends RuntimeException {
	public DuplicateUrlPatternException() {
		super("Duplicate url pattern definition in config.");
	}
}
