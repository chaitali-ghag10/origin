
public class DemoArray {

	public static void main(String[] args) {
	   int[] numbers = new int[5];
	   
	   numbers[0] = 100;
	   numbers[1] = 300;
	   numbers[2] = 200;
	   numbers[3] = 1000;
	   numbers[4] = 500;
	   
	  /* System.out.println("0th: "+numbers[0]);
	   System.out.println("1st: "+numbers[1]);
	   System.out.println("2nd: "+numbers[2]);
	   */
	   
	   /*int sum =0;
	   sum = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
	   
	   System.out.println("Sum :"+sum);*/
	 /*  
	   for(int i=0;i<numbers.length;i++) {
		   System.out.println(numbers[i]);
	   }*/
	   
	   
	   for(int x:numbers) {
		   System.out.println(x);
	   }

	}

}
