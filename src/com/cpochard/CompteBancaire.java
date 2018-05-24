package com.cpochard;

public class CompteBancaire {
	
	int solde = 1000;
	
	public int getSolde() {
		return solde;
	}

	public int  deposer (int depot) {
		System.out.println("Vous allez faire un d�pot de " + depot + " � votre solde de " + this.getSolde());
		solde = this.getSolde() + depot;
		return solde;
	}
	
	public int retirer (int retrait) {
		System.out.println("Vous allez faire un retrait de " + retrait + " � votre solde de " + this.getSolde());
		solde = this.getSolde() - retrait;
		return solde;
	}
	
	//Faire une m�thode qui prend en compte d�poser et retirer pour pas qu'on puisse d�poser et retirer en m�me temps !
	public synchronized void faireOperation (boolean ope, int somme) {
		if (ope) {
			deposer(somme);
			System.out.println("Vous utilisez la m�thode d�poser, la valeur du solde est de " + this.getSolde());
		}
		else {
			retirer (somme);
			System.out.println("Vous utilisez la m�thode retirer, la valeur du solde est de " + this.getSolde());
		}
	}

}
