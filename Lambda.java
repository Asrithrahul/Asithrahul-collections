
interface Auto{
	void bookAuto(String source,String Destination);
}
/*class Uber implements Auto{
	public void bookAuto()
	{
		System.err.println("auto is booked... Enjoy your ride");
	}
}*/

public class Lambda {
public static void main(String[] args) {
	Auto auto=(source,destination)->{
		System.out.println("auto is booked"+ source+"to"+ destination+"Enjoy the ride");
};
auto.bookAuto("chennai","banglore");
}
