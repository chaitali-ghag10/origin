
public class DemoJagged {

	public static void main(String[] args) {
		
		
		String[] names = {"a","b","c"};
		
		int [][] values = new int [3][];
		
		values[0] = new int[4];
		values[0][0] = 122;
		values[0][1] = 123;
		values[0][2] = 124;
		values[0][3] = 125;
		
		values[1] = new int[2];
		values[1][0] = 12;
		values[1][1] = 2;
		
		values[2] = new int[1];
		values[2][0] = 5;
		
		/*for(int i=0;i<values.length;i++) {
			for(int j=0;j<values[i].length;j++) {
				System.out.print(values[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		for(int[] arr:values) {
			for(int x:arr) {
				System.out.print(x+"\t");
			}
			System.out.println();
		}
		

	}

}
