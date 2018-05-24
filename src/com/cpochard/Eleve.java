package com.cpochard;

import java.util.Random;

public class Eleve implements Runnable {
	
	protected String nom;
	protected int chiffre = 0;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getChiffre() {
		return chiffre;
	}
	public void setChiffre(int chiffre) {
		this.chiffre = chiffre;
	}

	public Eleve(String tmpNom) {
		nom=tmpNom;
	}

	@Override
	public void run() {
		Random r = new Random ();
		for (int i=0; i<10; i++) {
			chiffre ++;
			System.out.println(this.getNom() + " dit " + chiffre);
			try {
				Thread.sleep(r.nextInt(2000)+1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.getNom() + " a compté jusqu'à 10 !");
		
		
	}
	
}

	
