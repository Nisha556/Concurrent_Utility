package Concurrent_Utility;
import java.util.concurrent.CountDownLatch;
public class SimpleLatchExample1 {
public static void main(String args[])
{
	CountDownLatch latch = new CountDownLatch(2);
	new Thread(new ServiceOne(latch)).start();
	new Thread(new ServiceTwo(latch)).start();
	try {
		latch.await();
		System.out.println("Staring main thread"  +  latch.getCount());
		
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
		
	}
	latch.countDown();
	
}
}
class ServiceOne implements Runnable {
	private CountDownLatch latch;
	public ServiceOne(CountDownLatch latch)
	{
		super();
		this.latch = latch;
	}
	public void run()
	{
		System.out.println("Starting service one " +latch.getCount());
		this.latch.countDown();
		
	}
}
class ServiceTwo implements Runnable {
	private CountDownLatch latch;
	public ServiceTwo(CountDownLatch latch)
	{
		this.latch = latch;
		
	}
	public void run()
	{
		System.out.println("Starting Sevice two"   + latch.getCount());
		this.latch.countDown();
		
	}
}