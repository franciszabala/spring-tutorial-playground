package com.franciszabala.playground;

import com.franciszabala.playground.dao.MessageDao;
import com.franciszabala.playground.renderer.MessageRenderer;

public class GreeterOfDeveloper {
	private MessageRenderer msgRen;
	private MessageDao msgDao;
	
	public void greetDeveloper() {
		msgRen.renderMessage(msgDao.retrieveMessage());
	}
	
	public MessageRenderer getMsgRen() {
		return msgRen;
	}
	public void setMsgRen(MessageRenderer msgRen) {
		this.msgRen = msgRen;
	}
	public MessageDao getMsgDao() {
		return msgDao;
	}
	public void setMsgDao(MessageDao msgDao) {
		this.msgDao = msgDao;
	}

}
