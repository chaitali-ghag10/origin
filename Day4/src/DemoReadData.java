import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DemoReadData {

	public static void main(String[] args) {
		/*InputStreamReader rd= new InputStreamReader(System.in);
		
		try {
			int value = rd.read();
			System.out.println(value);
		} catch (IOException e) {
			
			e.printStackTrace();
		}*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Please enter a line:\n");
			String line =br.readLine();
			
			System.out.println("You entered:\n"+line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
