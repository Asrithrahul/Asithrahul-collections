public interface Item extends Packing{
void name();
float price();
String pack();
}

abstract class Burgers implements Item {
}

abstract class ColdDrinks implements Item {
}

interface Packing {
String pack();
}

public class VegBurger extends Burgers implements Packing{
	String name="VegBurger";
float price=25.0f;
	@Override
	public void name() {
		System.out.print(name);
	}
	@Override
	public float price() {
return price;
	}
	@Override
	public String pack() {
		return "Wrapper";
	}
}

public class Coke extends ColdDrinks implements Packing{
String name="Coke";
float price=30.0f;
@Override
public void name() {
System.out.print(name);	
}
@Override
public float price() {
return price;
}
@Override
public String pack() {
	return "Bottle";
}
}

public class ChickenBurger extends Burgers implements Packing{
	String name="ChickenBurger";
	float Price=50.5f;
	@Override
	public void name() {
System.out.print(name);		
	}

	@Override
	public float price() {
return Price;
	}
	@Override
	public String pack() {
		return "Wrapper";
	}

}

public class Pepsi extends ColdDrinks implements Packing{
	String name="Pepsi";
	float Price=35.0f;
	@Override
	public void name() {
System.out.print(name);		
	}
	@Override
	public float price() {
return Price;
	}
	@Override
	public String pack() {
		return "Bottle";
	}
}

import java.util.*;
public class Meal {
 static List<Item> ite=new ArrayList<Item>();
public void addItem(Item i) {
ite.add(i);
}
public void getCost() {
	for(Item id:ite) {
		id.price();
	}
}
public void showItems() {
	for(Item itr:ite) {
		System.out.print("Item:");itr.name();
		System.out.print(" Packing:"+itr.pack());
		System.out.println(" Price:"+itr.price());
}
}
}

public interface MealBuilder {
abstract void buildBurger();
abstract void buildDrink();
abstract Meal getMeal();
}

public class VegMealBuilder implements MealBuilder {
static Meal m=new Meal();
@Override
public void buildBurger() {
m.addItem(new VegBurger());
}
@Override
public void buildDrink() {
m.addItem(new Coke());
}
public Meal getMeal() {
buildBurger();
buildDrink();
return m;
}
}

public class NonVegMealBuilder implements MealBuilder{
	static Meal m=new Meal();
	@Override
	public void buildBurger() {
m.addItem(new ChickenBurger());
	}
	@Override
	public void buildDrink() {
m.addItem(new Pepsi());
	}
	@Override
	public Meal getMeal() {
		this.buildBurger();
		this.buildDrink();
		return this.m;
	}
}


public class Director {
public static void main(String[] args) {
	VegMealBuilder vm=new VegMealBuilder();
	System.err.println("Veg Meal");
	Meal m=vm.getMeal();
	m.showItems();
   System.out.println("TotalCost:"+((new VegBurger().price)+(new Coke().price)));	
System.out.println("Non-Veg Meal");
   NonVegMealBuilder nm=new NonVegMealBuilder();
   Meal c=nm.getMeal();
   c.showItems();
   System.out.println("TotalCost:"+((new ChickenBurger().Price)+(new Pepsi().Price)));
}
}

OUTPUT:-
Veg Meal
Item:VegBurger Packing:Wrapper Price:25.0
Item:Coke Packing:Bottle Price:30.0
TotalCost:55.0
Non-Veg Meal
Item:ChickenBurger Packing:Wrapper Price:50.5
Item:Pepsi Packing:Bottle Price:35.0
TotalCost:85.5
