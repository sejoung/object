package org.eternity.theater.step02;


import java.time.LocalDateTime;
import org.assertj.core.api.Assertions;
import org.junit.Test;


public class AudienceTest {

	@Test
	public void 금액만_가지고_있는_Audience() {

		Audience audience = new Audience(new Bag(10000));
		Ticket ticket = new Ticket(10000L);

		Assertions.assertThat(audience.buy(ticket)).isEqualTo(10000);
	}


	@Test
	public void 금액_초대장_가지고_있는_Audience() {

		Audience audience = new Audience(
				new Bag(new Invitation(LocalDateTime.now().plusDays(1)),
						10000));
		Ticket ticket = new Ticket(10000L);

		Assertions.assertThat(audience.buy(ticket)).isEqualTo(0);
	}
}