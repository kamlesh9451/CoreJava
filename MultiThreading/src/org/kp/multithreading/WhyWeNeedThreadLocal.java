package org.kp.multithreading;

public class WhyWeNeedThreadLocal {
	
	public static void main(String args[]) {
		ThreadSample runnable = new ThreadSample();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		t1.start();
		t2.start();


	
	}

}

class ThreadSample implements Runnable {
	
	int local=10;
	public ThreadLocal<Number> threadLocal = new ThreadLocal<Number>();
	
	public void run() {
		threadLocal.set(100);
		int temp = (int) threadLocal.get();
		temp = temp+10;
		threadLocal.set(temp);
		local=local+10;
		System.out.println("Normal Value"+local);//will give inconsistent value of local both thread as both modify it simultaneously.
		System.out.println("ThreadLocal Value"+threadLocal.get());//same value for both thread because its separate for each thread.
	}
}


