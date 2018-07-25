package Demo1;

public class MyThreadexmain3 
{
	public static void main(String[] args)
	{
	
		
		for (int i=0; i<5; i++)
		{
	      MyThreadex3 t1 = new MyThreadex3();
	      Thread TO1 = new Thread(t1);
	      // You can combine above two lines into one by below code
	      // Thread TO1 = new Thread(new MyThreadex3());
	      TO1.start();
	      
		}
	}
}
