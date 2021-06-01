package edu.neu.csye6200;

/**
 * 
 * @author maharshi
 *
 * Design a class that will start two PERFECTLY alternating threads demonstrating control as they
		 * alternate output.
 * Two threads take turns alternating outputting the letters of the alphabet
 * (LOWERCASE and UPPERCASE) to console (aAbAcCdD...zZ).
 * 
 * 25 POINTS: Output ENTIRE alphabet using TWO Threads on a SINGLE LINE
 * 25 POINTS: Start Threads
 * 50 POINTS: Control Threads
 */


class A implements Runnable{
	public void run(){
		for(char i = 97;i <= 122;i++) {
			TwoAlternatingThreads.out.ap((char)i);
		}
	}
}

class B implements Runnable{
	public void run(){
		for(int i = 65;i <= 90; i++) {
			TwoAlternatingThreads.out.bp((char)i);
		}
	}
 }
public class TwoAlternatingThreads {
	  public static TwoAlternatingThreads out = new TwoAlternatingThreads();

	  private Object sync = new Object ();
	  private int state = 0;

	  public void ap(char i) {
	    synchronized (sync) {
	        while (true) {
	            if (state == 0) {
	                System.out.print(i);
	                state = 1;
	                sync.notify();
	                return;
	            } else {
	                try {
	                    sync.wait();
	                } catch (InterruptedException e) {
	                }
	            }
	        }
	    }
	  }

	  public void bp(char i) {
	    synchronized (sync) {
	        while (true) {
	            if (state == 1) {
	                System.out.print(i);
	                state = 0;
	                sync.notify();
	                return;
	            } else {
	                try {
	                    sync.wait();
	                } catch (InterruptedException e) {
	                }
	            }
	        }
	     }
	  }
	  public static void demo() {
			Runnable b = new B();
			Thread bt = new Thread(b);
			Runnable a = new A();
			Thread at = new Thread(a);
			bt.start();
			at.start();
	  }
	}

