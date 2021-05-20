import java.util.*;
public class Hashset2 {
	static Set<Integer> num=new HashSet<Integer>();
	static public Set CountryNames()
	{
		Set<String> mylist=new HashSet<String>();
		mylist.add("india");
		mylist.add("america");
		mylist.add("newzeland");
		mylist.add("Greenland");
		mylist.add("europe");
		return mylist;

	}
	static public Set modify()
	{
		//ArrayList c=new ArrayList();
		//ArrayList c1=numbers();
		for(int i=11;i<=15;i++)
			num.add(i);
		return num;
	}
	static public Set numbers()
	{
		for(int i=1;i<10;i++)num.add(i);
		return num;
	}	
	}
