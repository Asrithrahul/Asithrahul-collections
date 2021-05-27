abstract class Car implements Cloneable {
String modelname;
int price=45663;
public String getModelname() {
	return modelname;
}
public void setModelname(String modelname) {
	this.modelname = modelname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Object clone() throws CloneNotSupportedException {
	Object c=null;
	c=super.clone();
	return c;
	
}
}

public class Nano extends Car {
public Nano() {
price=189818;
}
}

public class Ford extends Car{
public Ford() {
	price=561925;
}
}

import java.util.Hashtable;
public class CarCache {
static Hashtable b=new Hashtable();
public static Car getcar(String i) throws CloneNotSupportedException {
	Car c=(Car) b.get(i);
	return (Car) c.clone();
}
public static void insert() {
	Nano na=new Nano();
	na.setModelname("Nano");
	b.put(na.getModelname(), na);
	Ford fo=new Ford();
	fo.setModelname("Ford");
	b.put(fo.getModelname(),fo);
}
}

import java.io.ObjectInputStream.GetField;
public class ClientDemo {
public static void main(String[] args) throws CloneNotSupportedException {
	CarCache.insert();
		Car nano=CarCache.getcar("Nano");
		System.out.println("Green Nano and it's price is Rs."+nano.getPrice());
 Car ford=CarCache.getcar("Ford");
 System.out.println("Yellow Ford and it's price is Rs."+ford.getPrice());
}
}


Output:
Green Nano and it's price is Rs.189818
Yellow Ford and it's price is Rs.561925