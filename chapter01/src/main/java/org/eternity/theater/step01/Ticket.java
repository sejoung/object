package org.eternity.theater.step01;

public class Ticket {

	private Long fee;

	public Ticket(Long fee) {
		this.fee = fee;
	}

	private Ticket() {
	}

	public Long getFee() {
		return fee;
	}
}
