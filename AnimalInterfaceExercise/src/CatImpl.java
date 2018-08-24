import java.util.Scanner;

public class CatImpl implements AnimalInterface {

	@Override
	public String favFood() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the favourite food of cat: ");
		String food = in.next();
		in.close();
		return food;
		
	}
	
	public void printFood(String favfood) {
		System.out.println("The favourite food of cat is:"+favfood);
	}

}
