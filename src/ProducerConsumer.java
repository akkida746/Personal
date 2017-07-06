import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));
		
		producer.start();
		consumer.start();
	}

}

class Producer implements Runnable{
	
	BlockingQueue<Integer> queue = null;
	
	public Producer(BlockingQueue<Integer> queue){
		this.queue = queue;
	}

	@Override
	public void run() {
		
		int i = 1;

		while(true){
			try {
				queue.put(i++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Consumer implements Runnable{
	
	BlockingQueue<Integer> queue = null;
	
	public Consumer(BlockingQueue<Integer> queue){
		this.queue = queue;
	}

	@Override
	public void run() {

		while(true){
			System.out.println(queue.poll());
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
