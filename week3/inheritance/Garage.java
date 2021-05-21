package inheritance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Garage {
	
	private List<Vehicle> vehiclesInside = new ArrayList<>();
	
	public List<Vehicle> getVehicles() {
		return vehiclesInside;
	}
	
	public void setVehicles(List<Vehicle> vehiclesInside) {
		this.vehiclesInside = vehiclesInside;
	}
	//ADD VEHICLE
	public boolean addVehicle(Vehicle newVehicle) {
		
		vehiclesInside.add(newVehicle);
		return true;
	}
	//REMOVE VEHICLE BY ID
	public boolean  removeVehicle(Integer id) {
		Iterator<Vehicle> it = vehiclesInside.iterator();
		while (it.hasNext()) {
			Vehicle v = it.next();
			if(v.getId().equals(id)) {
				it.remove();
			}
		}
		return true;
	}
	//EMPTY GARAGE METHOD
	public boolean emptyGarage() {
		vehiclesInside.clear();
		
		return true;
	}
	
	//CALCUALTE FIX BILL DEPENDING ON TYPE OF VEHICLE
	public String generateBill(String typeOfVehicle) {
		
		Iterator<Vehicle> it = vehiclesInside.iterator();
		Vehicle v = it.next();
		String msg = "Total invoice repairs for ";
		double total = 0.00;
		double fourWheels = 550.00;
		double labor = 5;
		double twoWheels = 650;

			
			if(typeOfVehicle.equals("Four Wheels")) {
				total = total + fourWheels * labor;
				msg = msg + "a four wheel vehicle  : $"+ total ;
				
			} else if (typeOfVehicle.equals("Two Wheels")) {
				total = twoWheels * labor;
				msg = msg + "a two wheel vehicle : $"  + total;
				
			} else {
				System.out.println("NO VEHICLE TYPE DETECTED");
			}
		
		return msg;
			
	}
	// iterating through the list of vehicles inside the garage
	public String showVehicles() {
		String msg = "Vehicles Inside Garage: " ; 
		Iterator<Vehicle> it = vehiclesInside.iterator();
		Vehicle v;
		while (it.hasNext()) {
			v = it.next();
			msg = msg + v.getModel() + " - ";
		} if(vehiclesInside.isEmpty()) {
			 msg = "NO VEHICLES INSIDE GARAGE";
			 
		}
;		return msg;
	}
	
}
