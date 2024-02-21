package strategies;

import models.ParkingSpot;
import models.VehicleType;

public class SimpleParkingSpotAllotmentStrategy implements ParkingPlaceAllotmentStrategy{


    @Override
    public ParkingSpot getParkingSpot(VehicleType vehicleType, Long parkingLotId) {

        /*
          1. Find the parking lot
          2. Get all the floors of the parking lot
             For each floor, check the slots with vehicletype and status being free
             return it.
         */
        return null;
    }
}
