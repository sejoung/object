package org.eternity.theater.step01;

public class TicketSeller {

	private TicketOffice ticketOffice;

	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	private TicketSeller() {
	}

	public TicketOffice getTicketOffice() {
		return ticketOffice;
	}
}
