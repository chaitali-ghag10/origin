import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(new Integer(234));
		list.add(90);
		list.add(10);
		list.add(234);
		list.add(67);

		System.out.println("No.of elements="+list.size());
		
		System.out.println("\nList:\n"+list);

		
		
		list.add(2, 2000);
		
		System.out.println("\nList:\n"+list);
		
		list.remove(3);
		
		System.out.println("\nList:\n"+list);
		
		list.remove(new Integer(234));
		
		System.out.println("\nList:\n"+list);
		
	}

}
