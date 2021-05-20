package unittest;

import static org.junit.Assert.*;
public class AssertClass {
@Test
public void testAssertions()
{
	String str=new String("virtusa");
	String str1=new String("virtusa");
	String str2=null;
	String str3="virtusa";
	int value1=5;
	int value2=7;
	String[] exceptArray= {"one","two","three"};
	String[] resultarray= {"one","two","three"};
	assertEquals(str,str1);
	//check for true
	assertTrue(value1<value2);
	assertFalse(value1<value2);
}
}
