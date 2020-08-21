package org.eternity.theater.step01;

public class Audience {

	private Bag bag;

	public Audience(Bag bag) {
		this.bag = bag;
	}

	private Audience() {
	}

	public Bag getBag() {
		return bag;
	}
}
