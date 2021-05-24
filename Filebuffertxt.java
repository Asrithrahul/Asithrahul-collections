package com;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileBufferTest {
	public static void main(String[] args) {
		FileInputStream f=null;
		BufferedInputStream b=null;
		try 
		{
			f=new FileInputStream("d:/Data.txt");
			b=new BufferedInputStream(f);
			int i = b.read();

			while (i != -1) {
				System.out.print((char) i);
				i = b.read();
			}
			b.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}