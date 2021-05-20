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
	
	public boolean addVehicle(Vehicle newVehicle) {
		
		vehiclesInside.add(newVehicle);
		return true;
	}
	//ADD REMOVE VEHICLE BY ID
	//ADD EMPTY GARAGE METHOD
	//ADD CALCUALTE FIX BILL DEPENDING ON TYPE OF VEHICLE
	
	// iterating through the list of vehicles inside the garage
	public String showVehicles() {
		String msg = "Vehicles Inside Garage: " ; 
		Iterator<Vehicle> it = vehiclesInside.iterator();
		Vehicle v;
		while (it.hasNext()) {
			v = it.next();
			msg = msg + v.getModel() + " - ";
		}
;		return msg;
	}
	
}
