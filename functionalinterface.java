
interface Messenger{
	void display(String msg);
}



public class functionalnterface implements Messenger {
public void display(String msg) {
	System.out.println(msg);
}
public static void main(String[] args) {
	functionalnterface fobj=new functionalnterface();
	fobj.display("happy people..!!keep smiling");
}
}
