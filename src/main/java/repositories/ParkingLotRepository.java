package repositories;

import exceptions.ParkingLotNotFoundException;
import models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {

    Map<Long, ParkingLot> parkingLotMap = new HashMap<>();

    public ParkingLot getParkingLotById(Long id) throws ParkingLotNotFoundException {
        if (parkingLotMap.containsKey(id)) {
            return parkingLotMap.get(id);
        }
        throw new ParkingLotNotFoundException();
    }
}
