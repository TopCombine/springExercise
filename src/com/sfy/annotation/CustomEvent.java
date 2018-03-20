package com.sfy.annotation;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7117376761791956348L;

	public CustomEvent(Object source) {
		super(source);
	}

	public String toString() {
		return "My Custom Event";
	}
}