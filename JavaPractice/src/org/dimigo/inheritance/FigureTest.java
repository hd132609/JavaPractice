package org.dimigo.inheritance;
public class FigureTest {
	public static void main(String[] args) {
		Circle cir = new Circle(5);
		Triangle tri = new Triangle(10,10,5,8);
		Rectangle rec = new Rectangle(20,20,5,8);
		
		System.out.println("원의 넓이 : " + String.format("%.1f", cir.calcArea()));
		System.out.println("삼각형의 넓이 : "+ tri.calcArea());
		System.out.println("사각형의 넓이 : " + rec.calcArea());
		
		System.out.println();
		
		cir.printCenter();
		tri.printCenter();
		rec.printCenter();
		
		System.out.println();
		System.out.println("-- 중심좌표 이동 (x,y축 5씩)");	
		System.out.println();
		
		cir.moveFigure(5, 5);
		tri.moveFigure(5, 5);
		rec.moveFigure(5, 5);
		
		cir.printCenter();
		tri.printCenter();
		rec.printCenter();
	}
}
