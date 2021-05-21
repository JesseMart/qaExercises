package inheritance;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle car1 = new Car("Charger ", "Dodge ", 1, "Four Wheels");
		Vehicle motorcycle1 = new Car("V-Rod ", "Harley Davidson ", 2, "Two Wheels");
		Garage grg = new Garage();
		
		//checking if details can be pulled
		((Car) car1).carDetails();
		((Car) motorcycle1).carDetails();
		
		
		//ADD VEHICLE TO GARAGE
		grg.addVehicle(car1);
		grg.addVehicle(motorcycle1);
		//checking what's inside the garage
		System.out.println(grg.showVehicles());
		
		//GENERATE BILL FOR TYPE OF VEHICLE
		System.out.println(grg.generateBill("Two Wheels"));
		System.out.println(grg.generateBill("Four Wheels"));

		
		//REMOVE VEHICLE FROM GARAGE
//		grg.removeVehicle(1);
//		System.out.println(grg.showVehicles());
		
		//EMPTY GARAGE
//		grg.emptyGarage();
//		System.out.println(grg.showVehicles());
		
		
	}

}
