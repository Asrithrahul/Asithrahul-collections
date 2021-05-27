import java.util.*;
	public class billpughimp {
	    private billpughimp() {
	    }
	    private static class Singleton{
	    	private static final billpughimp ins=new billpughimp();
	    }
	public static billpughimp getInstance() {
return Singleton.ins;
	}
	public static void main(String[] args) {
    	System.out.println("New Capitan selected for your Team");
		System.out.println("Trying to make captian for our team");
		billpughimp c1=billpughimp.getInstance();
		System.out.println("Trying to make another capitan");
		billpughimp c2=billpughimp.getInstance();
if(c1==c2) {
	System.out.println("You already have a capitan send him for the toss");
	System.out.println("c1 and c2 are same instances");
}
	}
	}
Output:New Capitan selected for your Team
Trying to make captian for our team
Trying to make another capitan
You already have a capitan send him for the toss
c1 and c2 are same instances