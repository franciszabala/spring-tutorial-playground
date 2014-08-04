package com.franciszabala.playground.animals;

import com.franciszabala.playground.animals.respiration.Respiration;

public abstract class Animal {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public Respiration getRespire() {
		return respire;
	}
	public void setRespire(Respiration respire) {
		this.respire = respire;
	}
	
	private String name;
	private String habitat;
	private Respiration respire;

}
