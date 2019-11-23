package com.murali.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.murali.springboot.entities.Ticket;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 23, 2019 10:27:50 PM 
 * @version:2.0
 */
public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
