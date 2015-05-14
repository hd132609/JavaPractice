package org.dimigo.oop;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		int kor,mat,eng,sum;
		Scanner scanner = new Scanner(System.in);
		kor = scanner.nextInt();
		System.out.print("국어 점수 입력 => ");
		kor = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		mat = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		eng = scanner.nextInt();
		System.out.println("");
		sum = kor + mat + eng;
		double avg = sum/3.0;
		scanner.close();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<<점수 출력>>\n")
		  .append("국어 점수 : " + "점")
		  .append(kor)
		  .append("수학 점수 : " + "점")
		  .append(mat)
		  .append("영어 점수 : " + "점")
		  .append(eng)
		  .append("총점 : " + "점")
		  .append(sum)
		  .append("평균 : " + "점")
		  .append(avg).toString();
	}
}
