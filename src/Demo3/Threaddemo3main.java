package Demo3;


	import java.util.LinkedList;
	import java.util.Queue;

	public class Threaddemo3main {

		public static void main(String[] args) 
		{
			Queue<Integer> buffer = new LinkedList<>();
			int maxsize=10;
			
			Thread producer = new producer(buffer,maxsize,"producer");
			Thread consumer = new consumer(buffer,maxsize,"consumer");
			
			int s=0;
			producer.start();
			consumer.start();

		}

	}

