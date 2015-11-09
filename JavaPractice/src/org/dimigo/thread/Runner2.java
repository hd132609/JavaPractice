/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_Runner
 *
 * 1. 개요 : 
 * 2. 작성일 : #{date}
 * </pre>
 *
 * @author : hd132609
 * @version : 1.0
 */
public class Runner2 extends Thread{
	private String name;

	public Runner2() {
		
	}
	
	public Runner2(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		System.out.println(name + "춥발");
		for (int i=0; i<11; i++) {
			System.out.println(name + " " + (100-10*i) + "미터");
			
			try { 
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name + "도착");
	}
}
