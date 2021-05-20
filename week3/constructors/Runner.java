package constructors;

import constructors.constructors1.Book;
import constructors.constructors1.Person;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person x = new Person("John", 25, "M");
		Book exampleBook = new Book("The Green Pass", 250, "First Edit.");
		
		x.speak("Hello");
		
		x.read(exampleBook);
		
	}

}
