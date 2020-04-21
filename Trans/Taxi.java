package com.Trans;

public class Taxi extends Trans {

	public Taxi(int cnt, int dis, int dan, int charge) {
		super(cnt, dis, dan, charge);
		
	}

	@Override
	public int getCharge() {
		
		return dis*dan/cnt;
	}

}
