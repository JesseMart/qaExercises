package inheritance;

public class Car extends Vehicle {

	public Car(String model, String manufacturer, Integer id, String typeOfVehicle) {
		super(model, manufacturer, id, typeOfVehicle);
		// TODO Auto-generated constructor stub
	}

	public void carDetails() {
		System.out.println("MODEL: "+ this.getModel() + "MANUFACTURER: " + this.getManufacturer() + "VEHICLE TYPE: " + this.getTypeOfVehicle());
	}
	

}
