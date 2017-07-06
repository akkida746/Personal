public class WaitNotify {
	
	private static int i = 1;
	private static boolean flag = false;
	static Object obj = new Object();

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
					while(i<10){
						synchronized (obj) {
							try {
								if(i%2 == 0){
									obj.wait();
								}
								System.out.println("t1 -> " + i++);
								obj.notify();
								
								Thread.currentThread().sleep(500);
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}						
					}	
			}			
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				while(i<10){
					synchronized (obj) {
						try {
							if(i%2 != 0){
								obj.wait();
							}
							System.out.println("t2 -> " + i++);
							obj.notify();
							Thread.currentThread().sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}						
				}	
			}			
		});
		
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