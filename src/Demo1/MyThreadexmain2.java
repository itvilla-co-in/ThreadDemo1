package Demo1;

public class MyThreadexmain2 
{
	public static void main(String[] args)
	{
	
		
		for (int i=0; i<5; i++)
		{
	      MyThreadex2 t1 = new MyThreadex2();
	      t1.start();
	      
		}
	}
}
