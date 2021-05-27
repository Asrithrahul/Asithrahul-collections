public interface Animal {
public void says();
}

public class Duck implements Animal{
	@Override
	public void says() {
System.out.println("Duck says Pack-pack");		
	}
}

public class Tiger implements Animal
{
	@Override
	public void says() {
System.out.println("Tiger says Halum..Halum");		
	}
}

public class AnimalFactory {
public  Animal getAnimalType(String type) {
if(type==null) {
	return null;
}
else if(type.equalsIgnoreCase("Duck")) {
return new Duck();
}
else if(type.equalsIgnoreCase("Tiger")) {
	return new Tiger();
}
return null;
}
}

public class AnimalFactoryDemo {
public static void main(String[] args) {
	AnimalFactory e=new AnimalFactory();
	Animal d=e.getAnimalType("DUCK");
	d.says();
	Animal t=e.getAnimalType("Tiger");
	t.says();
}
}