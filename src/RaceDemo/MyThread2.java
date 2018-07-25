package RaceDemo;

public class MyThread2 implements Runnable {
	@Override
	public void run() {
		
		for (int i = 0; i < 4; i++) {
			 
			System.out.println("In Runnable the value of I is " + i + "thread Name " + Thread.currentThread().getName() );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			System.out.println(e);
			}
		}
		
	}

	
}
