package com.cpochard;

public class CompteBancaire {
	
	int solde = 1000;
	
	public int getSolde() {
		return solde;
	}

	public int  deposer (int depot) {
		System.out.println("Vous allez faire un dépot de " + depot + " à votre solde de " + this.getSolde());
		solde = this.getSolde() + depot;
		return solde;
	}
	
	public int retirer (int retrait) {
		System.out.println("Vous allez faire un retrait de " + retrait + " à votre solde de " + this.getSolde());
		solde = this.getSolde() - retrait;
		return solde;
	}
	
	//Faire une méthode qui prend en compte déposer et retirer pour pas qu'on puisse déposer et retirer en même temps !
	public synchronized void faireOperation (boolean ope, int somme) {
		if (ope) {
			deposer(somme);
			System.out.println("Vous utilisez la méthode déposer, la valeur du solde est de " + this.getSolde());
		}
		else {
			retirer (somme);
			System.out.println("Vous utilisez la méthode retirer, la valeur du solde est de " + this.getSolde());
		}
	}

}
