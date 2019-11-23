package com.murali.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murali.springboot.entities.Ticket;
import com.murali.springboot.service.TicketBookingService;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 23, 2019 10:28:23 PM
 * @version:2.0
 */
@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {
    @Autowired
    private TicketBookingService ticketBookingService;

    @PostMapping(value = "/create")
    public Ticket createTicket(@RequestBody Ticket ticket) {
	return ticketBookingService.createTicket(ticket);
    }

    @GetMapping(value = "/ticket/{ticketId}")
    // @RequestMapping(value="/ticket/{ticketId}") 
    // both will work same but the default method is GET
    public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
	return ticketBookingService.getTicketById(ticketId);
    }

    @GetMapping(value = "/ticket/alltickets")
    public Iterable<Ticket> getAllBookedTickets() {
	return ticketBookingService.getAllBookedTickets();
    }

    @DeleteMapping(value = "/ticket/{ticketId}")
    public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
	ticketBookingService.deleteTicket(ticketId);
    }

    @PutMapping(value = "/ticket/{ticketId}/{newEmail:.+}")
    public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId, @PathVariable("newEmail") String newEmail) {
	return ticketBookingService.updateTicket(ticketId, newEmail);
    }
}
