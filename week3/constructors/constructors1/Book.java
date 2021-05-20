package constructors.constructors1;

public class Book {

	
		//Attributes
	public String title;
	public String author;
	public String genre;
	public String edition;
	public int pageCount;
	public boolean isOpen;
	
	
	//Constructor
	public Book(String title, int pageCount , String edition) {
		this.title = title;
		this.edition = edition;
		this.pageCount = pageCount;
		
	}
	//methods
	public void open() {
		this.isOpen = true;
	}
	public void closed() {
		this.isOpen = false;
	}
	
}
