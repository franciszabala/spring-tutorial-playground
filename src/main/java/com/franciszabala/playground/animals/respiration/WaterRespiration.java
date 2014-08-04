package com.franciszabala.playground.animals.respiration;

public class WaterRespiration implements Respiration {

	@Override
	public void inhale(String matter) {
		// TODO Auto-generated method stub
		System.out.println("Inhaling " + matter+ " using gills underwater");
	}

	@Override
	public String exhale() {
		// TODO Auto-generated method stub
		System.out.println("Exhaling carbon dioxide and carbonic acid");
		return "exhaling carbon dioxide and carbonic acid";
	}

}
