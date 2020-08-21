package org.eternity.theater.step01;

import java.time.LocalDateTime;

public class Invitation {

	private LocalDateTime when;

	// 초대장을 set 할수있는 부분이 없다.
	public Invitation(LocalDateTime when) {
		this.when = when;
	}

	private Invitation() {
	}
}
