public interface Hollywood {
void getmoviename(String type);
}

public interface Bollywood {
void getmoviename(String type);
}

public class Bollywoodactionmovie implements Bollywood{
	@Override
	public void getmoviename(String type) {
System.out.println(type);		
	}
}

public class Bollywoodcomedymovie implements Bollywood{
	@Override
	public void getmoviename(String type) {
System.out.println(type);		
	}
}


public class Hollywoodactionmovie implements Hollywood{
	@Override
	public void getmoviename(String type) {
System.out.println(type);		
	}
}

public class Hollywoodcomedymovie implements Hollywood{
	@Override
	public void getmoviename(String type) {
System.out.println(type);
	}
}

public interface Imoviefactory {
Hollywood gethollywoodmovie(String type);
Bollywood getbollywoodmovie(String type);
}

public class ComedyMovieFactory implements Imoviefactory{
	@Override
	public Hollywood gethollywoodmovie(String type) {
if(type==null) {
	return null;
}
if(type.equalsIgnoreCase("BasantaBilap")) {
System.out.println(type+" is a Hollywood Comedy Movie");
}
		return null;
	}

	@Override
	public Bollywood getbollywoodmovie(String type) {
		if(type==null) {
			return null;
		}
		if(type.equalsIgnoreCase("Munna Bhai MBBS")) {
System.out.println(type+" is a Bollywood Comedy Movie");
		}
		return null;
	}
}

public class ActionMovieFactory implements Imoviefactory{
	@Override
	public Hollywood gethollywoodmovie(String type) {
		if(type==null) {
			return null;
		}
if(type.equalsIgnoreCase("Kranti")) {
System.out.println(type+ " is a HollyWood Action Movie");
}
		return null;
	}
	@Override
	public Bollywood getbollywoodmovie(String type) {
if(type==null) {
	return null;
}
if(type.equalsIgnoreCase("Bang Bang")) {
System.out.println(type+" is a BollyWood Action Movie");
}
		return null;
	}
}

public class Client {
public static void main(String[] args) {
Imoviefactory im=new ComedyMovieFactory();
Imoviefactory am=new ActionMovieFactory();
System.out.println("Action Movies are:");
am.gethollywoodmovie("Kranti");
am.getbollywoodmovie("Bang Bang");
System.out.println("Comedy Movies are:");
im.gethollywoodmovie("BasantaBilap");
im.getbollywoodmovie("Munna Bhai MBBS");
}
}

OUTPUT:
Action Movies are:
Kranti is a HollyWood Action Movie
Bang Bang is a BollyWood Action Movie
Comedy Movies are:
BasantaBilap is a Hollywood Comedy Movie
Munna Bhai MBBS is a Bollywood Comedy Movie