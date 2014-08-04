package com.franciszabala.playground.animals;

import com.franciszabala.playground.animals.respiration.Respiration;

public class Corydoras extends Fish {
	private Respiration respire;
	
	public Respiration getRespire() {
		return respire;
	}
	public void setRespire(Respiration respire) {
		this.respire = respire;
	}

}
