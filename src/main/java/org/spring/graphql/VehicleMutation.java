package org.spring.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class VehicleMutation implements GraphQLMutationResolver {
	
	@Autowired
    private VehicleService vehicleService;
	
    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
    	Vehicle vehicle = new Vehicle();
    	vehicle.setType(type);
    	vehicle.setModelCode(modelCode);
    	vehicle.setBrandName(brandName);
    	vehicle.setLaunchDate(launchDate);
        return this.vehicleService.createVehicle(vehicle);
    }

}
