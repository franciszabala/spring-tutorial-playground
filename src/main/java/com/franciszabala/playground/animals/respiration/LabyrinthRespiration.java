package com.franciszabala.playground.animals.respiration;

public class LabyrinthRespiration implements Respiration {
	
	private AirRespiration airResp = new AirRespiration();
	private WaterRespiration waterResp = new WaterRespiration();
	

	@Override
	public void inhale(String matter) {
		// TODO Auto-generated method stub
		//do some switching
		//if
		airResp.inhale(matter);
		//else
	}

	@Override
	public String exhale() {
		// TODO Auto-generated method stub
		return "exhaling carbonic acid";
	}

}
