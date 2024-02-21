package strategies;

import exceptions.ParkingLotFullException;
import models.ParkingLot;
import models.ParkingSpot;
import models.VehicleType;

public interface ParkingPlaceAllotmentStrategy {

    ParkingSpot getParkingSpot(VehicleType vehicleType, ParkingLot parkingLot) throws ParkingLotFullException;
}
