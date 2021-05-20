public class Run extends Thread{
	public void run() {
		for(int i=0;i<=4;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
class Deer{
	public void main(String[] args) {
		Run r=new Run();
		r.start();
		System.err.println("Before setting name"+Thread.currentThread().getName());
		Thread.currentThread().setName("load");
		System.out.println("after setting name"+Thread.currentThread().getName());
		System.out.println("before setting priority"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(3);
		System.out.println("After setting priority"+Thread.currentThread().getPriority());
	}
}
}
