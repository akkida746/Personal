
public class ThreadLocalDemo {

	public static void main(String[] args) {
		
		MyRunnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable, "t1");
		Thread t2 = new Thread(runnable, "t2");
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class MyRunnable implements Runnable{
	
	ThreadLocal<String> threadLocal = new ThreadLocal<String>();

	@Override
	public void run() {
		
		threadLocal.set(Thread.currentThread().getName());
		
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " - " + threadLocal.get());
	}
	
}
