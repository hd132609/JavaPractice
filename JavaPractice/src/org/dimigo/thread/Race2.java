package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_Race
 *
 * 1. 개요 : 
 * 2. 작성일 : #{date}
 * </pre>
 *
 * @author : hd132609
 * @version : 1.0
 */
public class Race2 {
	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread t1 = new Thread(new Runner2("홍길동"));
		Thread t2 = new Thread(new Runner2("홍길순"));
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
}
}
