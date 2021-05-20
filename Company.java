public class  Company{
	public void classRoom(String trainerName)
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i+ " class is taken by"+trainerName);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class UserThread extends Thread{
	Company cobj;
	String trainerName;
	public void run()
	{
		cobj.classRoom(trainerName);
	
}
}
