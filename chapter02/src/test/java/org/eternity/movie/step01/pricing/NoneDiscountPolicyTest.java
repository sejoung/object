package org.eternity.movie.step01.pricing;

import java.time.Duration;
import java.time.LocalDateTime;
import org.assertj.core.api.Assertions;
import org.eternity.money.Money;
import org.eternity.movie.step01.DiscountPolicy;
import org.eternity.movie.step01.Movie;
import org.eternity.movie.step01.Screening;
import org.junit.Test;

public class NoneDiscountPolicyTest {

	@Test
	public void 정상() {
		DiscountPolicy discountPolicy = new NoneDiscountPolicy();

		Screening screening = new Screening(
				new Movie("타이타닉", Duration.ofMinutes(120), Money.wons(10000), discountPolicy), 1,
				LocalDateTime.now());


		Assertions.assertThat(discountPolicy.calculateDiscountAmount(screening)).isEqualTo(Money.ZERO);

	}


}