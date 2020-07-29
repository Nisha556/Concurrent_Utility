package Concurrent_Utility;

import java.util.concurrent.BrokenBarrierException;

public class CyclicBarrier  implements Runnable{

	CyclicBarrier barrier1 = null;
	CyclicBarrier barrier2 = null;
	public CyclicBarrier (CyclicBarrier barrier1 , CyclicBarrier barrier2)
	{
		this.barrier1 = barrier1; 
		this.barrier2 = barrier2;
		
	}
	public void run()
	{
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + "Waiting at barrier 1");
			this.barrier1.await();
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+ "Waiting at barrier 2 ");
			this.barrier1.await();
			System.out.println(Thread.currentThread().getName() +"done!");
			
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
			
		}
		catch(BrokenBarrierException e)
		{
			e.printStackTrace();
			
		}
	}
			




	Runnable barrier1Action = new Runnable()
	{
		public void run()
	
			{
		System.out.println("BarrierAction 1 excuted");
		
			}	
		};
		Runnable barrier2Action = new Runnable()
				{
			public void run()
			{
				System.out.println("Barrier Action 2 executed");
				
			}
				};
				CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action);
				CyclicBarrier barrier2 = new CyclicBarrier(2  , barrier2Action);
				CyclicBarrier barrierRunnable1 = new CyclicBarrier(barrier1, barrier2);
				CyclicBarrier barrierRunnable2 = new CyclicBarrier(barrier1, barrier2);
				new Thread(barrierRunnable1).start();
				new Thread(barrierRunnable2).start();
				
}


