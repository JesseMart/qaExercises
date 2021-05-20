package inheritance;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle car1 = new Car("Charger ", "Dodge", 1);
		Vehicle motorcycle1 = new Car("V-Rod ", "Harley Davidson", 2);
		
		//checking if details can be pulled
		((Car) car1).carDetails();
		((Car) motorcycle1).carDetails();
		
		
		
		Garage grg = new Garage();
		grg.addVehicle(car1);
		grg.addVehicle(motorcycle1);
		//checking what's inside the garage
		System.out.println(grg.showVehicles());
		
		
	}

}
