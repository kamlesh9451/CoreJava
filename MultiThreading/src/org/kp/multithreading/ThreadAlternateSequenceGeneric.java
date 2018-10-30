package org.kp.multithreading;

public class ThreadAlternateSequenceGeneric {

	public static void main(String[] args) {
		ResourceLockG lock = new ResourceLockG();
		ThreadG.noOfThreads=5;
		ThreadG a=new ThreadG(lock,1);
		ThreadG b=new ThreadG(lock,2);
		ThreadG c=new ThreadG(lock,3);
		ThreadG d=new ThreadG(lock,4);
		ThreadG e=new ThreadG(lock,5);
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
	}

}

class ResourceLockG{
    public volatile int flag = 1;
}

 class ThreadG extends Thread{ 
	 ResourceLockG lock;
     int threadNumber;
     static int noOfThreads;
     
    ThreadG(ResourceLockG lock,int threadNumber){
        this.lock = lock;
        this.threadNumber=threadNumber;
    }
    
    @Override
    public void run() {
        try{
            synchronized (lock) {
            	while(true) {
                    while(lock.flag!=this.threadNumber){
                        lock.wait();
                    }
                    System.out.print(this.threadNumber+" ");
                    Thread.sleep(1000);
                    
                    if(lock.flag==ThreadG.noOfThreads) {
                    	lock.flag=1;
                    }
                    else {
                    	 lock.flag = this.threadNumber+1;
                    }
                    
                    lock.notifyAll();
                }
            }
        }catch (Exception e) {
            System.out.println("Exception :"+e.getMessage());
        }
    }
}

 
 
 
