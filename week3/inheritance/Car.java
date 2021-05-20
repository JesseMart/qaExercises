package inheritance;

public class Car extends Vehicle {

	public Car(String model, String manufacturer, int id) {
		super(model, manufacturer, id);
		// TODO Auto-generated constructor stub
	}

	public void carDetails() {
		System.out.println("Model: "+ this.getModel() + "Manufacturer: " + this.getManufacturer());
	}
	

}
