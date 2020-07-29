package Concurrent_Utility;

public class AssignTastManagerTest {

	public static void main(String args[]) throws InterruptedException
	{
		CountownLatch  countDownLatch = new CountDownLatch(2);
		DevTeam teamDevA = new DevTeam(countDownLatch , "dev-A");
		DevTeam teamDevB = new DevTeam(countDownLatch, "dev-B");
		teamDevA.start();
		teamDevB.start();
		countDownLatch.await();
		
		QATeam qaTeam = new QATeam("QA team");
		qaTeam.start();
		
	}

}
