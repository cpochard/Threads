package com.cpochard;

import java.util.Random;

public class ManipulationCompte implements Runnable {
	CompteBancaire c;
	
	public ManipulationCompte (CompteBancaire c) {
		this.c = c;
	}

	@Override
	public void run() {
		Random r = new Random();
		for (int i=0; i<5 ; i++) {
			boolean ope = r.nextBoolean();
			int montant = 1+ r.nextInt(100);
			c.faireOperation(ope, montant);
		}
		}
	}


