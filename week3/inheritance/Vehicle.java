package inheritance;

public abstract class Vehicle {
	
	//ATTRIBUTES
	private String model;
	private String manufacturer;
	private double price;
	private int id;
	private String typeOfVehicle;
	
	public Vehicle(String model, String manufacturer, int id, String typeOfVehicle) {
		
		this.model = model;
		this.manufacturer = manufacturer;
		this.id = id;
		this.typeOfVehicle = typeOfVehicle;
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
	public Integer getId() {
		return id;
	}
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}
	
}
