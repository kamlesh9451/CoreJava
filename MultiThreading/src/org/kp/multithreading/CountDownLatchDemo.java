package org.kp.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[] args) {
		CountDownLatch l = new CountDownLatch(4);
		ServiceThread st1= new ServiceThread(1000, l, "S1");
		ServiceThread st2= new ServiceThread(1000, l, "S2");
		ServiceThread st3= new ServiceThread(1000, l, "S3");
		ServiceThread st4= new ServiceThread(1000, l, "S4");
		
		WaitingThread wt1 = new WaitingThread(l, 1000, "WT1");
		WaitingThread wt2 = new WaitingThread(l, 1000, "WT2");
		WaitingThread wt3 = new WaitingThread(l, 1000, "WT3");
		wt1.start();
		wt2.start();
		wt3.start();
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		
		
		
		System.out.println("Main finished");

	}

}


class ServiceThread extends Thread{
	int delay;
	CountDownLatch  l;
	public ServiceThread(int delay, CountDownLatch l,String name) {
		super(name);
		this.delay = delay;
		this.l = l;
	}
	
	public void run() {
		try
        { 
            Thread.sleep(delay); 
           
            System.out.println(Thread.currentThread().getName() 
                            + " finished");
            l.countDown(); 
        } 
        catch (InterruptedException e) 
        { 
            e.printStackTrace(); 
        } 
		
	}
}

class WaitingThread extends Thread{
	CountDownLatch l;
	int delay;
	public WaitingThread(CountDownLatch l, int delay,String name) {
		super(name);
		this.l = l;
		this.delay = delay;
	}
	
	public void run() {
		try
        {    System.out.println(Thread.currentThread().getName() 
                + " waiting for service threads"); 
            Thread.sleep(delay); 
            l.await();
           
            System.out.println(Thread.currentThread().getName() 
                            + " finished"); 
        } 
        catch (InterruptedException e) 
        { 
            e.printStackTrace(); 
        } 
		
	}
		
		
	}
	
	
