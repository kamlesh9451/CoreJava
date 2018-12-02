package org.kp.multithreading;

public class VolatileDemo {

	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource();
		Thraed1 t1 = new Thraed1(sharedResource);
		Thraed1 t2 = new Thraed1(sharedResource);
		t1.start();
		t2.start();
		System.out.println(sharedResource.x);
		
	}

}

class SharedResource{
	 public int x=10;
} 

class Thraed1 extends Thread{
	volatile SharedResource sharedResource;

	public Thraed1(SharedResource sharedResource) {
		super();
		this.sharedResource = sharedResource;
	}
	
	public void run() {
		sharedResource.x++;
		System.out.println(sharedResource.x);
		
	}
	

}