package com.Trans;

public class Train extends Trans {

	public Train(int cnt, int dis, int dan, int charge) {
		super(cnt, dis, dan, charge);
	}

	@Override
	public int getCharge() {
		
		return cnt*dan;
	}

}
