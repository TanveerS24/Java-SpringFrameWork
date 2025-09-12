package com.SeleniumExpress.DI;

public class Friend {

	private Cheating cheating;

	public void setCheating(Cheating cheating) {
		this.cheating = cheating;
	}

	private void caughCheating() {
		cheating.cheating();
		System.out.println("Take my paper too");
	}
}
