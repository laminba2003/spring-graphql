package org.spring.graphql;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class VehicleService {

	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public VehicleService() {
		Vehicle vehicle = new Vehicle();
		vehicle.setId(1);
		vehicle.setType("Electric");
		vehicle.setBrandName("Mustang");
		vehicle.setModelCode("AMS5665");
		vehicle.setLaunchDate("04/10/1960");
		vehicles.add(vehicle);
	}
	
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	
	public Vehicle getVehicle(final int id) {
		for(Vehicle vehicle : vehicles) {
			if(vehicle.getId() == id) {
				return vehicle;
			}
		}
		return null;
	}
	
	public Vehicle createVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
		vehicle.setId(new Random().nextInt());
		return vehicle;
	}
	
}