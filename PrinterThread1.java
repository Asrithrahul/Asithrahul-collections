public class PrinterThread1 extends Thread {
	String s1;
	String s2;
	PrinterThread1(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
	}
	public synchronized void run()
	{
		System.out.println(s1+s2);
	}

}
