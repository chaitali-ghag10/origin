import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileData {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("somename.txt");
			byte value = 0;
			do
			{
				int data = reader.read();
				if((byte)data != -1)	 
					System.out.print((char)data);
				value =(byte) data;
			}while(value!=-1);
			
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
