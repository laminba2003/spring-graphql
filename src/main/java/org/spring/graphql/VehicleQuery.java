package org.spring.graphql;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

	@Autowired
	private VehicleService vehicleService;
	
	public List<Vehicle> getVehicles() {
		return vehicleService.getVehicles();
    }
	
    public Vehicle getVehicle(final int id) {
        return vehicleService.getVehicle(id);
    }
	
}
