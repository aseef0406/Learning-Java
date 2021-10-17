package samples;

public class MyThread2 extends Thread {
	String threadName ="";
	
	public MyThread2(String name) {
		threadName = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
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
		MyThread2 t1 = new MyThread2("One");
		MyThread2 t2 = new MyThread2("Two");
		MyThread2 t3 = new MyThread2("Three");
		
		t1.start();
		try{  
			  t1.join();  
		}
		catch(Exception e){
			System.out.println(e);
		}  
		t2.start();
		t3.start();
	}

}
