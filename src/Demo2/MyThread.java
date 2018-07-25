package Demo2;

public class MyThread implements Runnable  {

	private String msg1;
	private String msg2;
	Thread t;
	
	
	
	public MyThread(String msg1, String msg2) {
	
		this.msg1 = msg1;
		this.msg2 = msg2;
		t=new Thread(this);
		t.start();
	}



	@Override
	public void run() 
	{
		
		PrintMessage.printmsg(msg1, msg2);
		
	}
	

	
}
