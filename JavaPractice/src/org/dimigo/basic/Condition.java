package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int a=850,b=300,c=600;
		String car="고속버스";
		int distance=10;
		int money;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		
		switch(car) {
		case "고속버스":
			money = a + (distance-10)/10 * 300 ;
			System.out.println("차종 : " + car);
			System.out.println("통행료 : " + money + "원");
			break;
		case "경차":
			money = b + (distance-10)/10 * 200 ;
			System.out.println("차종 : " + car);
			System.out.println("통행료 : " + money + "원");
			break;
		case "그 외":
			money = c + (distance-10)/10 * 200 ;
			System.out.println("차종 : " + car);
			System.out.println("통행료 : " + money + "원");
			break;
		}
	}
}
