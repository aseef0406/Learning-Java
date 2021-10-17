package samples;
//https://www.geeksforgeeks.org/start-function-multithreading-java/
//https://www.javatpoint.com/what-if-we-call-run()-method-directly
public class MyThread implements Runnable {
	String threadName ="";
	
	public MyThread(String name) {
		threadName = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println("Thread Id: "+Thread.currentThread().getId() +" Thread Name: "+threadName+" i: "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public  static void main(String args[]) {
		MyThread t1 = new MyThread("One");
		MyThread t2 = new MyThread("Two");
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();
	}

}
