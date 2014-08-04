package com.franciszabala.playground;

import java.util.List;

import com.franciszabala.playground.animals.Fish;

public class Aquarium {
	public float getVolume() {
		return length*width*depth;
	}
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setwidth(float width) {
		this.width = width;
	}
	public float getDepth() {
		return depth;
	}
	public void setDepth(float depth) {
		this.depth = depth;
	}
	public float getpHValue() {
		return pHValue;
	}
	public void setpHValue(float pHValue) {
		this.pHValue = pHValue;
	}
	public List<Fish> getListOfFish() {
		return listOfFish;
	}
	public void setListOfFish(List<Fish> listOfFish) {
		this.listOfFish = listOfFish;
	}
	public List<String> getAccessories() {
		return accessories;
	}
	public void setAccessories(List<String> accessories) {
		this.accessories = accessories;
	}
	
	
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		
		sb.append("Aquarium [length=" + length + ", width=" + width + ", depth="
				+ depth + ", pHValue=" + pHValue + ", listOfFish=" + listOfFish
				+ ", accessories=" + accessories + "] \n");
		
		for(String temp : accessories) {
			sb.append(temp);
			sb.append("\n");
		}
		
		return sb.toString();
	}



	private float length;
	private float width;
	private float depth;
	private float pHValue;
	private List<Fish> listOfFish;
	private List<String> accessories;

}
