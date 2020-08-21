package org.eternity.theater.step01;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;
import org.junit.Test;

public class Step01Test {

	@Test
	public void theater_enter_정상() {
		Audience audience1 = new Audience(new Bag(10000));
		Audience audience2 = new Audience(
				new Bag(new Invitation(LocalDateTime.now().plusDays(1)), 10000));
		TicketOffice ticketOffice = new TicketOffice(1000000L, new Ticket(10000L), new Ticket(10000L));

		Theater theater = new Theater(new TicketSeller(ticketOffice));
		theater.enter(audience1);
		theater.enter(audience2);

		assertThat(audience1.getBag().getAmount()).isEqualTo(0);
		assertThat(audience2.getBag().getAmount()).isEqualTo(10000);
		assertThat(audience1.getBag().hasTicket()).isTrue();
		assertThat(audience2.getBag().hasTicket()).isTrue();
		assertThat(ticketOffice.getAmount()).isEqualTo(1010000);
	}




}