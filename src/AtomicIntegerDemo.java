import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
	
	static AtomicInteger value = new AtomicInteger();

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable(){

			@Override
			public void run() {

				while(value.get() < 10){
					System.out.println(Thread.currentThread().getName() + " -> " + value.incrementAndGet());
				}
			}			
		};
		
		Thread t1 = new Thread(runnable, "t1");
		Thread t2 = new Thread(runnable, "t2");
		Thread t3 = new Thread(runnable, "t3");
		Thread t4 = new Thread(runnable, "t4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
