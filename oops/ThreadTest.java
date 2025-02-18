package oops;

public class ThreadTest {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("One");
		MyThread t2 = new MyThread("Two");
//		t1.start();
//		t2.start();
		t1.run();
		t2.run();
		for (int i = 1; i<=10; i++) {
			System.out.println("Main Thread : " + i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
