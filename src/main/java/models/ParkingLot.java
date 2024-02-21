package models;

import java.util.List;

public class ParkingLot {

    private List<Floor> floors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;


    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getParkingStatus() {
        return parkingLotStatus;
    }

    public void setParkingStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}
