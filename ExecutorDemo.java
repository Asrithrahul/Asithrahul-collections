import java.util.concurrent.*;
public class ExecutorDemo {
	public static void main(String[] args) {
		System.out.println("Inside:" +Thread.currentThread().getName());
		
		System.out.println("Creating excuting service");
		ExecutorService excutorService= Executors.newSingleThreadExecutor();
		System.out.println("creating a runable");
		Runnable runnable=()->{
			System.out.println("Inside:"+Thread.currentThread().getName());	
		};
		System.out.println("submit the task specified by the runnable to the executor service.");
		excutorService.submit(runnable);
		System.out.println("Shutting doen the excutor");
		excutorService.shutdown();
	}

}
