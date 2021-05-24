package com;
import java.util.*;
import java.io.*;

public class FileReverseReading 
{
	public static void main (String [] args)throws IOException
	{
		FileReader fr = new FileReader("d:/Data.txt");
		BufferedReader br = new BufferedReader(fr);

		String data;  
        
		while ((data = br.readLine()) != null){
		    String[] words = data.split(" ");
		    for(String a: words)
		    {
		        StringBuilder builder=new StringBuilder(a);
		        System.out.print(builder.reverse().toString()+" ");
		    }  
		}
	}
}