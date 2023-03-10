package com.ticketbooking;

import java.util.Date;

import com.dto.Ticket;
import com.repository.DBRepository;

public class TicketBookingModel implements TicketBookingModelCallBack {

	private TicketBookingControllerCallBack ticketBookingController;
	public TicketBookingModel(TicketBookingController ticketBookingController) {
		this.ticketBookingController = ticketBookingController;
		
	}

	public interface TicketBookingModelControllerCallBack {

	}

	@Override
	public Ticket bookTicket(String name, byte age, String prefferedBerth, Date date, String depature, String arrival) {
		return DBRepository.getInstance().bookTicket(name, age, prefferedBerth, date, depature, arrival);

	}
}
