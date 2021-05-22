import java.util.ArrayList;

class Main
{
  // List<Integer> list = new ArrayList<Integer>();

  public static void main (String[]args)
  {

   Main obj = new Main ();
    int input1 = 90;
    int input2 = 120;

    int total = 0;

    for (int i = input1; i < input2; i++)
      {

	int i_dup = i;

	int r, sum = 0, temp;

	  temp = i;
	while (i > 0)
	  {
	    r = i % 10;		//gettiig remaiider  
	    sum = (sum * 10) + r;
	    i = i / 10;
	  }

	if (temp == sum)
	  total += i_dup;
	i = i_dup;
      }

    System.out.println (total);

  }


}
