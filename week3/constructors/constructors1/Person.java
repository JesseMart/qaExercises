package constructors.constructors1;

public class Person {
	
	//Attribute
	public String name;
	public int age;
	public String gender;
	
	
	//Constructors 
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//methods
	public void speak(String msg) {
		System.out.println(this.name + " says: " + msg);
	}
	public void read(Book item) {
		item.open();
		System.out.println(this.name + " reads the book titled:  \"" + item.title + "\"");
	}
}
