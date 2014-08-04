package com.franciszabala.playground;

public class HelloWorld {
	private String greetingMsg;
	private String receivingMsg;
	public String getGreetingMsg() {
		return greetingMsg;
	}
	public void setGreetingMsg(String greetingMsg) {
		this.greetingMsg = greetingMsg;
	}
	public String getReceivingMsg() {
		return receivingMsg;
	}
	public void setReceivingMsg(String receivingMsg) {
		this.receivingMsg = receivingMsg;
	}
	@Override
	public String toString() {
		return "HelloWorld [greetingMsg=" + greetingMsg + ", receivingMsg="
				+ receivingMsg + "]";
	}
	
}
