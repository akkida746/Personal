import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
	
	static int counter = 0;
	static Semaphore semaphore = new Semaphore(2);

	public static void main(String[] args) {		
		
		Thread t1 = new Thread(new SemaphoreDemo.Calculate());
		Thread t2 = new Thread(new SemaphoreDemo.Calculate());
		Thread t3 = new Thread(new SemaphoreDemo.Calculate());
		Thread t4 = new Thread(new SemaphoreDemo.Calculate());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
	static class Calculate implements Runnable{
		
		@Override
		public void run() {
			
			try {
				semaphore.acquire();
				
				while(counter<10)
					System.out.println(Thread.currentThread().getName() + " -> " + ++counter);
				
				semaphore.release();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
