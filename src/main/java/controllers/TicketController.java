package controllers;

import dtos.IssueTicketRequest;
import dtos.IssueTicketResponse;
import exceptions.GateNotFoundException;
import exceptions.ParkingLotNotFoundException;
import models.Ticket;
import services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public IssueTicketResponse issueTicket(IssueTicketRequest request){
        Ticket ticket = null;
        try {
            ticket = ticketService.issueTicket(request);
        } catch (GateNotFoundException e) {
            System.out.println("Gate not found ");
            return new IssueTicketResponse(null, "FAILURE", "Invalid Gate");
        } catch (ParkingLotNotFoundException e) {
            System.out.println("Parking Log not found ");
            return new IssueTicketResponse(null, "FAILURE", "Invalid ParkingLot");
        }
        return new IssueTicketResponse(ticket, "SUCCESS", "Ticket Generated");
    }
}
