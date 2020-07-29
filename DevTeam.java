package Concurrent_Utility;

import java.util.concurrent.CountDownLatch;
public class DevTeam  extends Thread{
	private CountDownLatch countDownLatch;
	public DevTeam(CountDownLatch countDownLatch , String name)
	{
		super(name);
		this.countDownLatch =  countDownLatch;
		
	}
	public void run()
	{
		System.out.println("Task assigned is development team" +Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
			
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
			
		}
		System.out.println("Task finished team" +Thread.currentThread().getName());
		countDownLatch.countDown()
;
		
	}

	
}
