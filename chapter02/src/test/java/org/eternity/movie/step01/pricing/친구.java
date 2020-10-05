package org.eternity.movie.step01.pricing;


public class 친구 {

	private int 돈;

	private int 빌려받을돈;

	public 친구(int 돈, int 빌려받을돈) {
		this.돈 = 돈;
		this.빌려받을돈 = 빌려받을돈;
	}

	public int get돈() {
		return 돈;
	}

	public int get빌려받을돈() {
		return 빌려받을돈;
	}

	@Override
	public String toString() {
		return "친구{" +
				"돈=" + 돈 +
				", 빌려받을돈=" + 빌려받을돈 +
				'}';
	}
}
