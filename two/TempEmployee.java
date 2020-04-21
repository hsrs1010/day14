package com.two;

public class TempEmployee extends Employee {
	
	private int hireyear;
	
	public TempEmployee(String empno, String name, int pay,int hireyear) {
		super(empno, name, pay);
		this.hireyear=hireyear;
	}

	@Override
	public double getMonthPay() {
		return pay/(double)12;
	}
}
