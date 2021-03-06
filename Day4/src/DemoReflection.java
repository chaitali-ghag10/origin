import java.lang.reflect.*;
public class DemoReflection {

	public static void main(String[] args) {
	
		String s= new String();
		
		try {
			Class c = Class.forName("java.lang.String");
			
			System.out.println("name:"+c.getCanonicalName());
			
			Constructor[] constructors = c.getConstructors();
			
			for(Constructor con:constructors) {
				Type[] types =con.getGenericParameterTypes();
				for(Type t:types) {
					System.out.print(t.getTypeName()+",");
				}
				System.out.println();
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
