package com.murali.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murali.springboot.dao.TicketBookingDao;
import com.murali.springboot.entities.Ticket;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 23, 2019 10:26:51 PM
 * @version:2.0
 */
@Service
public class TicketBookingService {

    @Autowired
    private TicketBookingDao ticketBookingDao;

    public Ticket createTicket(Ticket ticket) {
	return ticketBookingDao.save(ticket);
    }

    public Ticket getTicketById(Integer ticketId) {
	return ticketBookingDao.findOne(ticketId);
    }

    public Iterable<Ticket> getAllBookedTickets() {
	return ticketBookingDao.findAll();
    }

    public void deleteTicket(Integer ticketId) {
	ticketBookingDao.delete(ticketId);
    }

    public Ticket updateTicket(Integer ticketId, String newEmail) {
	Ticket ticketFromDb = ticketBookingDao.findOne(ticketId);
	ticketFromDb.setEmail(newEmail);
	Ticket upadedTicket = ticketBookingDao.save(ticketFromDb);
	return upadedTicket;
    }
}
