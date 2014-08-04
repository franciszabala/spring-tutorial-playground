package com.franciszabala.playground.animals.respiration;

public class AirRespiration implements Respiration {

	@Override
	public void inhale(String matter) {
		// TODO Auto-generated method stub
		System.out.println("Inhaling " + matter+ "using lungs");
	}

	@Override
	public String exhale() {
		// TODO Auto-generated method stub
		System.out.println("Exhaling carbon dioxide and air");
		return "Exhaling carbon dioxide and air";
	}

}
