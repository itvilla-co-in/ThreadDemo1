package Demo2;

public class PrintMessage {

	public synchronized  static void printmsg(String msg1,String msg2)
	{
		System.out.print(msg1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.print(msg2);
		System.out.println();
	}

	
	
}
