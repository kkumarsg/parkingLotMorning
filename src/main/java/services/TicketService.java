package services;

import dtos.IssueTicketRequest;
import exceptions.GateNotFoundException;
import exceptions.ParkingLotNotFoundException;
import models.*;
import repositories.GateRepository;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;
import strategies.ParkingPlaceAllotmentStrategy;

import java.util.Date;
import java.util.UUID;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;


    public Ticket issueTicket(IssueTicketRequest request) throws GateNotFoundException,
            ParkingLotNotFoundException {

        /*
            1. SET TIME
            2. GET VEHICLE AND GATE DETAILS
            3. GET PARKING LOT
               Assign an empty spot for this vehicle.
            4. GENERATE TICKET NUMBER
            5. SAVE AND RETURN THE TICKET
         */

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Gate gate = gateRepository.findGateById(request.getGateId());
        ticket.setGate(gate);

        Vehicle vehicle = vehicleRepository.getVehicleByNumber(request.getVehicleNumber());
        if(vehicle==null){
            vehicle = new Vehicle(request.getVehicleNumber(), request.getVehicleType(), request.getOwner());
            vehicleRepository.save(vehicle);
        }

        ticket.setVehicle(vehicle);

        // feel free to pass this to strategy
        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(request.getParkingLotId());

        ParkingPlaceAllotmentStrategy allotmentStrategy = request.getParkingPlaceAllotmentStrategy();

        ParkingSpot parkingSpot =
                allotmentStrategy.getParkingSpot(request.getVehicleType(), request.getParkingLotId());

        ticket.setParkingSpot(parkingSpot);
        ticket.setNumber(request.getVehicleNumber()+ UUID.randomUUID());

        ticketRepository.save(ticket);

        return ticket;
    }
}
