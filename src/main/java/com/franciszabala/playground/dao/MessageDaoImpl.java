package com.franciszabala.playground.dao;

public class MessageDaoImpl implements MessageDao {
	
	public void retrieveMessage(String message) {
		System.out.println(message);
	}
	@Override
	public String retrieveMessage() {
		return "Message from MessageDaoImpl";
	}
}
