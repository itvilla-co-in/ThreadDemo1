package RaceDemo;

public class ThreadR {
public static void main(String[] args) {
		
		MyThread2 mt1 = new MyThread2();
		MyThread2 mt2 = new MyThread2();
		Thread t1=new Thread(mt1,"run1");
		Thread t2=new Thread(mt1,"run2");
		t1.start();
		t2.start();
		for (int i = 0; i < 4; i++) {
			 
			System.out.println("The value of I is " + i + "thread Name " + Thread.currentThread().getName() );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			System.out.println(e);
			}
		}
		

	}



}
