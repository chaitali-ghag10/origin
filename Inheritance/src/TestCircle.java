import com.myAbstract.Circle;
import com.myAbstract.Shape;

public class TestCircle {

	public static void main(String[] args) {
		Shape s = new Circle(4,"Circle");
		double a = s.area();
		System.out.println("Area = "+a);
		s.description();

	}

}
