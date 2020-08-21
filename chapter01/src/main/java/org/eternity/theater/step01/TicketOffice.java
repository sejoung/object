package org.eternity.theater.step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {

	private Long amount;
	private List<Ticket> tickets = new ArrayList<>();

	public TicketOffice(Long amount, Ticket... tickets) {
		this.amount = amount;
		this.tickets.addAll(Arrays.asList(tickets));
	}

	private TicketOffice() {
	}

	public Ticket getTicket() {
		if (tickets.size() == 0) {
			return null;
		}
		return tickets.remove(0);
	}

	public void minusAmount(Long amount) {
		this.amount -= amount;
	}

	public void plusAmount(Long amount) {
		this.amount += amount;
	}

	public Long getAmount() {
		return amount;
	}
}
