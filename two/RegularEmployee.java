package com.two;

public class RegularEmployee extends Employee {
	public int bonus;
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno,name,pay);
		this.bonus=bonus;
	}
	@Override
	public double getMonthPay() {
		// ¿¬ºÀÀ» 12·Î ³ª´²¼­ +º¸³Ê½º
		return (pay/(double)12)+bonus;
	}
}
