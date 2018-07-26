package Demo4;

import Demo3.consumer;
import Demo3.producer;

public class joinmain {

	public static void main(String[] args) {
		 
		
		Thread Joinclass1 = new Joinclass("itvilla1",5);
		Thread Joinclass2 = new Joinclass("itvilla2",3);
		
		Joinclass1.start();
		try {
			Joinclass1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Joinclass2.start();
		
		
		System.out.println(Joinclass1.isAlive());
		System.out.println(Joinclass2.isAlive());

	}

}
