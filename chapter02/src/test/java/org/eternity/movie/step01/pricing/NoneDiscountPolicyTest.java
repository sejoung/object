package org.eternity.movie.step01.pricing;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
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


	@Test
	public void 친구거르기() {

		List<친구> 친구들 = List.of(new 친구(10000, 0), new 친구(10000, 0), new 친구(10000, 100000));

		친구들.stream().filter(친구 -> 친구.get빌려받을돈() == 0).forEach(System.out::println);
	}


}
