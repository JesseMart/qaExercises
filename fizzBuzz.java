
public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
			//usign for loop
			for (int i = 1; i <= 100; i ++) {
				
				if(i%15 == 0) 
					System.out.println("Fizz" + " ");
				else if (i%5 == 0 )
					System.out.println("Buzz" + " ");
				else if (i%3 ==0)
					System.out.println("FIZZBUZZ" + " ");
				else System.out.println( i + " ");
			}
	}

}
