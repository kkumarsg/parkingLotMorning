package dtos;

import models.VehicleType;
import strategies.ParkingPlaceAllotmentStrategy;

public class IssueTicketRequest {

    private VehicleType vehicleType;
    private String vehicleNumber;
    private String owner;
    private Long gateId;
    private Long parkingLotId;
    private ParkingPlaceAllotmentStrategy parkingPlaceAllotmentStrategy;

    public ParkingPlaceAllotmentStrategy getParkingPlaceAllotmentStrategy() {
        return parkingPlaceAllotmentStrategy;
    }

    public void setParkingPlaceAllotmentStrategy(ParkingPlaceAllotmentStrategy parkingPlaceAllotmentStrategy) {
        this.parkingPlaceAllotmentStrategy = parkingPlaceAllotmentStrategy;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public Long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}
