package Demo1;

public class MyThreadex1 extends Thread{

	public void run()
	{
		System.out.println("My Thread " +  Thread.currentThread().getId() + "  is executing");
		System.out.println("Lets see name of the thread " + Thread.currentThread().getName());
		Thread.currentThread().setName("itvilla1");
		System.out.println("Now Lets see name of the thread " + Thread.currentThread().getName());
	}


}
