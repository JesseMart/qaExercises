package wrapperClasses_ArrayContinuation;

public class StringManipExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///Join two Strings together and convert to upper case.
		
//			String str1 =  "Today it is sunny ";
//			String str2 = "Yesterday it was raining ";
		
		
//		System.out.println(str1.toUpperCase() + ", " + str2.toUpperCase());
		
		// SUBSTRING METHOD
//			String subString1 = str1.substring(0, 11);
//			String subString2 = str2.substring(16, 24);
//			
//			System.out.println(subString1 + subString2);
		
		//4 Methods Exercise for String object Manipulation
		
//		lengthEx();
//		stringVert();
//		reversedString();
		
		String str1 = "Find a string in this sentence.";
		String str2 = "string";
		
		int findWord = findString(str1, str2);
		
		if(findWord == -1)
			System.out.println("Second String was not found in first String");
		else
			System.out.println("String was found at index " + findWord);
		
	}

		//4 Methods Exercise for String object Manipulation
		
//		public static void lengthEx() {
//			String str1 = "This string is long";
//			int stringLength = str1.length();
//			System.out.println("The length of this String is " + stringLength);
//		}
	
//		public static void stringVert() {
//			String str1 = "Vertical string";
//			for(int i = 0; i <= str1.length()-1; i++) {
//				System.out.println(str1.charAt(i));
//			}
//		}
	
//		public static void reversedString() {
//			String str1 = "StringInReverse";
//			for (int i = str1.length() - 1; i >= 0; --i) {
//				System.out.println(str1.charAt(i) + " ");
//			}
//		}
	
		static int findString(String str1, String str2) {

			
			for (int i = 0; i <= str1.length() - str2.length(); i++) {
				int j;
				for(j = 0; j < str2.length(); j++) 
					if(str1.charAt( i + j) != str2.charAt(j))
						break;
					if(j == str2.length())
						return i;
			}
			return -1;
			
		}
}
