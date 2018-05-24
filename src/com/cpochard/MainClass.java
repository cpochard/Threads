package com.cpochard;

public class MainClass {

	public static void main(String[] args) {
/*
		Thread eleve1 = new Thread (new Eleve ("Martin"));
		Thread eleve2 = new Thread (new Eleve ("Julie"));
		Thread eleve3 = new Thread (new Eleve ("Tom"));
		eleve1.start();
		eleve2.start();
		eleve3.start();
		*/
		CompteBancaire monCompte = new CompteBancaire ();
		
		/*System.out.println("Le nouveau solde de votre compte bancaire est de " + monCompte.deposer(2000));
		System.out.println("Le nouveau solde de votre compte bancaire est de " + monCompte.deposer(3000));
		System.out.println("Le nouveau solde de votre compte bancaire est de " + monCompte.retirer(1000));
		System.out.println("Le nouveau solde de votre compte bancaire est de " + monCompte.retirer(4000));
		*/
		
		Thread manip = new Thread (new ManipulationCompte (monCompte));
		Thread manip2 = new Thread (new ManipulationCompte (monCompte));
		Thread manip3 = new Thread (new ManipulationCompte (monCompte));
		manip.start();
		manip2.start();
		manip3.start();
		
		try {
			manip.join();
			manip2.join();
			manip3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
