package repositories;

import models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    Map<String, Ticket> ticketMap = new HashMap<>();

    public void save(Ticket ticket){
        ticketMap.put(ticket.getNumber(), ticket);
    }
}
