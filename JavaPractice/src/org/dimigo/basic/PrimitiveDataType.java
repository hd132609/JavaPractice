package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		int i=23;
		String name = "아이유";
		double a=161.8;
		float b=44.3f;
		char c='A';
	
		System.out.println("이름 : " + name);
	 boolean flag = true;
			
			if(flag) {
				System.out.println("성별 : 여자");
		}
			else {
				System.out.println("성별 : 남자");
		}
			
		System.out.println("나이 : " + i+"세");
		System.out.println("키 : " + a+"cm");
		System.out.println("몸무게 : " + b+"kg");
		System.out.println("혈액형 : " + c+"형");
	}
}
