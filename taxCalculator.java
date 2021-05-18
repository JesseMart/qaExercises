


public class taxCalculator {
	static double salary = 15000;
	public static void main(String[] args) {
		
		double percentRate = 0;
		
		
		double x = getPercentage(percentRate);
		System.out.println(x);
		
		System.out.println("Your taxed income is: " + taxedIncome(x) );
		


	}

	public static double getPercentage(double percentRate) {
//		
		
		if (salary <= 14999 ) {
			System.out.println(" Your salary does not qualify for taxable income. ");
		} else if ( salary >= 15000) {
			percentRate = .10;
			System.out.println("Your taxable rate is 10%");
			return percentRate;
		} else if ( salary >= 20000) {
			percentRate = 0.15;
			System.out.println("Your taxable rate is 15%");
			return percentRate;
		} else if ( salary >= 30000) {
			percentRate = 0.20;
			System.out.println("Your taxable rate is 20%");
			return percentRate;
		} else {
			System.out.println("Your salary is not applicable.");
		}
		return percentRate;
	};
	public static double taxedIncome(double percentRate) {
		
		 double taxableIncome =  percentRate * salary;
		 
//		 System.out.println("Your total taxed income is: " + taxableIncome);
		 return taxableIncome;
	}
	
	
}
