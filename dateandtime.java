import java.time.LocalDate;
public class Dateandtime {
		public static void main(String[] args) {
			LocalDate today=LocalDate.now();
			LocalDate dob=LocalDate.of(2021, 05, 14);
			if(dob.equals(today))
			{
				System.err.println("my birthday");
		}
	}
}
