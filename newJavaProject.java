
public class newJavaProject {

	public static void main(String[] args) {
		
		int result_add = numbers(10, 10);
		int result_mult =  mult(10, 10);
		int result_sub =  sub(10, 10);
		int result_div =  div(10, 10);
		double result_double_div =  double_div(25.0, 5.0);
		
		 System.out.println("This is the result of addition - " + result_add  );
		 System.out.println("This is the result of multiplication - " + result_mult  );
		 System.out.println("This is the result of subtraction - " + result_sub  );
		 System.out.println("This is the result of division - " + result_div  );
		 System.out.println("This is the result of division using doubles - " + result_double_div  );
		 
	}
		public static int numbers( int x, int y) {
			return x + y;
		}
		public static int mult( int x, int y) {
			return x * y;
		}
		public static int sub( int x, int y) {
			return x - y;
		}
		public static int div( int x, int y) {
			return x / y;
		}
		public static double double_div( double x, double y) {
			return x / y;
		}
		
}
