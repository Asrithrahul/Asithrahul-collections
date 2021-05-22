package Test1;
import java.util.*;
public class Main {
	static List<String> l=new ArrayList<String>();
	static Map<String,Integer> n=new HashMap<String, Integer>();
	public static Map<String,Integer> check()
	{

		for(String s:l)
		{
			String s1=(String)s;
			s1=s1.replace("#"," ");
			String[] st=s1.split(" ");
			int marks=Integer.parseInt(st[1])+Integer.parseInt(st[2])+Integer.parseInt(st[3]);
			n.put(st[0],marks);
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		l.add("Rahul#70#70#70");
		l.add("Tom#90#90#90");
		System.out.println(check());
		String str="";
		int max=0;
		Set s=n.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry i=(Map.Entry)itr.next();
			if((int)i.getValue()>max)
			{
				max=(int)i.getValue();
				str=(String)i.getKey();
			}
		}
		System.out.println(n);
		System.out.println(max+" "+str);
	}
}
