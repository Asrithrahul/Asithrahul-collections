
	public class Singlethread2 extends Thread 
	{
	public void run()
	{
		for(int i=11;i<=20;i++) {
			System.out.println("Thread-1 value is"+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
	}
