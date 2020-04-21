package com.Trans;

public class Express extends Trans {

	public Express(int cnt, int dis, int dan, int charge) {
		super(cnt, dis, dan, charge);
	}

	@Override
	public int getCharge() {
		
		return cnt*dan;
	}

}
