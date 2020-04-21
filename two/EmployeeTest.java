package com.two;

public class EmployeeTest {
	public static void main(String[] args) {
//		Employee emp1=new RegularEmployee("E001", "홍길동", 3000, 500);
//		System.out.println(emp1);
//		
//		Employee emp2=new TempEmployee("E002", "임꺽정", 4000, 0);
//		System.out.println(emp2);
//		
//		Employee emp3=new PartTimeEmployee("E003", "황진이", 5, 10);
//		System.out.println(emp3);

		Employee[] emps=new Employee[3];
		emps[0]=new RegularEmployee("E001", "홍길동", 3000, 500);
		emps[1]=new TempEmployee("E002", "임꺽정", 4000, 0);
		emps[2]=new PartTimeEmployee("E003", "황진이", 5, 10);
		for (int i = 0; i < emps.length; i++) {
			printpay(emps[i]);
		}
		
	}
	public static void printpay(Employee emp) {
		System.out.println("===============================");
		System.out.println(emp);
		System.out.println("===============================");
		System.out.println(emp.getMonthPay());
	}
}
