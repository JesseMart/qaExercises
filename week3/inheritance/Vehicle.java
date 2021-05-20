package inheritance;

public abstract class Vehicle {
	
	//ATTRIBUTES
	private String model;
	private String manufacturer;
	private double price;
	private int id;
	
	public Vehicle(String model, String manufacturer, int id) {
		
		this.model = model;
		this.manufacturer = manufacturer;
		this.id = id;
	}
	
	//METHODS
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public double getPrice() {
		return price;
	}
	public int id() {
		return id;
	}
	
}
