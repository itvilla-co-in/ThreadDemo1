package Demo1;

public class MyThreadex2 extends Thread{

	public void run()
	{
		System.out.println("My Thread " +  Thread.currentThread().getId() + "  is executing");
		System.out.println("Lets see name of the thread " + Thread.currentThread().getName());
		
		
	}


}
