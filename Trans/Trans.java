package com.Trans;

public abstract class Trans {
	
	protected int cnt;
	protected int dis;
	protected int dan;
	protected int charge;

	public Trans(int cnt, int dis, int dan, int charge) {
		this.cnt = cnt;
		this.dis = dis;
		this.dan = dan;
		this.charge = charge;
	}
	public abstract int getCharge();
	
	@Override
	public String toString() {
		return cnt+" : "+dis+" : "+dan+" : "+charge;
}
}