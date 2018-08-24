
public class Calculator {
	public void calculations(int operator1,int operator2) {
		int sum = operator1+operator2;
		int difference = operator1-operator2;
		int product = operator1* operator2;
		float quotient = operator1/operator2;
		
		System.out.println("Sum: "+sum+"\tDifference: "+difference+"\tProduct: "+product+"\tQuotient: "+quotient);
		
	}
	
	public void calculations(double operator1,double operator2) {
		double sum = operator1+operator2;
		double difference = operator1-operator2;
		double product = operator1* operator2;
		double quotient = operator1/operator2;
		
		System.out.println("Sum: "+sum+"\tDifference: "+difference+"\tProduct: "+product+"\tQuotient: "+quotient);
		
		
	}

}
