import java.io.BufferOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
Public class FileBufferOutputTest{
public static void main(String[] args){
FileOutputStream fo=null;
Scanner sc=new Scanner(Scanner.in);
System.out.println("Enter name");
String name=sc.next();
System.out.println("Enter id");
byte id=sc.nextByte();
try{
fo=new FileOutputStream("newFile.txt");
BufferedOutputStream bs=new BufferOutputStream(fo);
byte buf[]=new byte[100];
bs.write(buf);
System.out.println("welcome "+name+" your Emloyee id is"+id);
}
catch(FileNotFoundException e){
e.printStackTrace();
}catch(IOException e1){
e1.printStackTrace();
}
finally{
try{
fo.close();
}catch(IOException e){
e.printStackTrace();
}
}
}
}