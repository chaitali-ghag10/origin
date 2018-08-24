
public class SearchArray {

	public static void main(String[] args) {
		int[] array = {12,34,44,54,34,55,65,78,90,23,90};
		int i=0;
		System.out.println("Your elements are:\n");

		while(i<array.length) {
			System.out.print(array[i]+"\t");
			i++;
		}
		
		i=0;
		boolean flag=false;
		
		while(i<array.length) {
			if(array[i] == 54) {
				flag=true;
				break;
			}
			i++;
		}
		
		if(flag) 
		{
			System.out.println("\n54 found!");
		}
		else {
			System.out.println("\n54 not found:(");
		}

	    
		
		
		/*System.out.println("\n\nDo-while:\n");
		
		do {
			System.out.print(array[i]+"\t");
			i++;
		}while (i<array.length);
		*/
	}

}
