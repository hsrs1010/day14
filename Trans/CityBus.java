package com.Trans;

public class CityBus extends Trans {

	public CityBus(int cnt, int dis, int dan, int charge) {
		super(cnt, dis, dan, charge);
	}

	@Override
	public int getCharge() {
		
		return cnt*dan;
	}

}
