package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		
		long a=1700000;
		long b=3;
		long c=1500;
		long d;
		
		d= (a*12) * b * c;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		String.format("%,d", 10000);
		System.out.println("월 평균 급여 : " + String.format("%,d", a) + "원");
		System.out.println("점포 내 직원 수 : " + b + "명");
		System.out.println("점포 수 : " + String.format("%,d", c) + "개");
		System.out.println("연간 인건비 : " + String.format("%,d", d) + "원");
	}
}
