import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxNumber {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter the first number:\n");
			String num1 = br.readLine();
			int number1 =  Integer.parseInt(num1);
			
			System.out.println("Enter the second number:\n");
			String num2 = br.readLine();
			int number2 =  Integer.parseInt(num2);
			
			if(number1>number2)
			{
				System.out.println("\nMaximum number is: "+num1);
			}
			
			else if(number2>number1)
			{
				System.out.println("\nMaximum number is: "+num2);
			}
			else 
			{
				System.out.println("\nBoth numbers are equal");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
