package com.franciszabala.playground.renderer;

public class SystemOutRenderer implements MessageRenderer {
	
	public void renderMessage(String message) {
		System.out.println(message);
	}

}
