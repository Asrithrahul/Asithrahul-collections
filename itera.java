import java.util.stream.*;
public class Itera {
	public static void main(String[] args) {
Stream.iterate(1,element->element+1)
.filter(element->element%2==0)
.limit(20)
.forEach(System.out::println);
}
}
