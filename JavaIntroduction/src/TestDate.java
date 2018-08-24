
public class TestDate {

	public static void main(String[] args) {
		Date date1= new Date(10,"December",1980);
		Date date2 = new Date();
		
		System.out.println("-----Date 1-------");
		date1.display();
		
		System.out.println("\n-----Date 2-------");
		date2.display();
		
		date1.setDay(12);
		date1.setMonth("February");
		
		System.out.println("\n------Date 1--------");
		date1.display();
		
		
		
	}

}
