
public class arrayExer1 {

	
	public static int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	public static int[] secondArray = new int[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		EXERCISE 1
		for (int i = 0; i < firstArray.length; i++) {
			System.out.print(firstArray[i] + "\s" );
		}
		System.out.println("");
		
//		EXERCISE 2
		for (int j = 0; j < secondArray.length; j++) {
			secondArray[j] = j + 1;
			System.out.print(secondArray[j] + " ");
		}
		System.out.println("");
		
//		EXERCISE 2.5
		for (int j = 0; j < secondArray.length; j++) {
			secondArray[j] *= 10;
			System.out.print(secondArray[j] + " ");
		}
		
	}

}
