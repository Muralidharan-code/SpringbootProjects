package com.murali.springboot;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.murali.springboot.entities.Ticket;
import com.murali.springboot.service.TicketBookingService;

/**
 * @author:Sanapala MuraliDharan
 * @date:Nov 23, 2019 10:20:17 PM
 * @version:2.0
 */
@SpringBootApplication
public class TicketBookingManagementAppApplication {

    public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext = SpringApplication
		.run(TicketBookingManagementAppApplication.class, args);
	TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService",
		TicketBookingService.class);

	Ticket ticket = new Ticket();
	ticket.setBookingDate(new Date());
	ticket.setDestStation("Hyderabad");
	ticket.setSourceStation("RajahMiundry");
	ticket.setPassengerName("MuraliDharan");
	ticket.setEmail("murali.sanapala@gmail.com");

	ticketBookingService.createTicket(ticket);
    }

}
