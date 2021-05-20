
public class Test {
public static void main(String[] args) {
	PrinterThread1 p1=new PrinterThread1("Hello..","there");
	StringThread p2=new StringThread("How are You");
	SyncEx p3=new SyncEx("Thank you,  ","very Much");
	Thread t=new Thread(p1);
	Thread t1=new Thread(p2);
	Thread t2=new Thread(p3);
	t.start();
	t1.start();
	t2.start();
	
}
}
