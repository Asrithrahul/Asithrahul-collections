public class Singlethread extends Thread 
{
public void run()
{
	for(int i=0;i<=5;i++) {
		System.out.println("Thread-1 value is"+i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
	}
}
}
