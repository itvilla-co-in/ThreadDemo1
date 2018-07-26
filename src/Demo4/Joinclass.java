package Demo4;

public class Joinclass  extends Thread 
{

	private String name;
	private int count;
	
	
	public Joinclass(String name, int count) {
		super(name);
		
		this.count = count;
	}


	public void run()
	{
		System.out.println(" hello Here is your message" + currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				 System.out.println("Exception " + e);
				
			}
       		for(int i=0;i<=count;i++)
       		{
       			System.out.println("Your count " + i);
       		}
  	}
	
	

}
