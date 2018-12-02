package org.kp.multithreading;
import java.util.ArrayList;
import java.util.List;

public class WaitNoitfyDemo {

	public static void main(String[] args) {
		int MAX_CAPACITY=5;;
		List<Integer> sharedTaskQueue = new ArrayList<Integer>();
		
		ProducerThread producer = new ProducerThread(MAX_CAPACITY,sharedTaskQueue);
		ProducerThread producer1 = new ProducerThread(MAX_CAPACITY,sharedTaskQueue);
		ConumerThread consumer = new ConumerThread(sharedTaskQueue);
		ConumerThread consumer1 = new ConumerThread(sharedTaskQueue);
		producer.start();
		consumer.start();
		producer1.start();
		consumer1.start();
    
	}

}

class ProducerThread extends Thread{
	int MAX_CAPACITY;
	List<Integer> sharedTaskQueue;
	
	ProducerThread(int MAX_CAPACITY,List<Integer> sharedTaskQueue){
		this.MAX_CAPACITY=MAX_CAPACITY;
		this.sharedTaskQueue=sharedTaskQueue;
	}
	
	public void run() {
		int counter =0;
		while(true) {
			try {
				produce(counter++);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
   public void produce(int item) throws InterruptedException {
	   
	   synchronized(sharedTaskQueue) {
		   if(sharedTaskQueue.size()==MAX_CAPACITY)
		   {
			   System.out.println("SharedTaskQueue is full " + Thread.currentThread().getName() + " is waiting , size: " + sharedTaskQueue.size());
			   sharedTaskQueue.wait();  
		   }
		   Thread.sleep(1000);
		   sharedTaskQueue.add(item);
		   System.out.println("Item :"+item+"added by :"+Thread.currentThread().getName()+"to the SharedTaskQueue");
		   sharedTaskQueue.notifyAll();		   
		   
	   }	   	   
   }
	
}


class ConumerThread extends Thread{
	
	List<Integer> sharedTaskQueue;
	ConumerThread(List<Integer> sharedTaskQueue){
		this.sharedTaskQueue=sharedTaskQueue;
	}
	
	public void run() {
		
		
		while(true) {
			try {
				consume();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void consume() throws InterruptedException {
		   synchronized(sharedTaskQueue) {
			   if(sharedTaskQueue.isEmpty()) {
				   System.out.println("SharedTaskQueue is empty " + Thread.currentThread().getName() + " is waiting , size: " + sharedTaskQueue.size());
				   sharedTaskQueue.wait();
			   }
			   Integer item = sharedTaskQueue.remove(0);
			   System.out.println("Item :"+item+"has been removed by "+Thread.currentThread().getName()+" from the SharedTaskQueue");
			   sharedTaskQueue.notifyAll();
			   
			   
		   }	   	   
	   }
	
}

