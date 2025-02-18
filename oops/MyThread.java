package oops;

public class MyThread extends Thread {
	//Constructor
	public MyThread(String threadName) {
		super(threadName);
	}
//	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() +" : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
