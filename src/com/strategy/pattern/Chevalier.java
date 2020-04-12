package com.strategy.pattern;

public class Chevalier extends Individu{
	public Chevalier() {
		arme=new ComportementCouteau();
	}
 
    public void display() {
   	 System.out.println("this is chevalier");
    }
}
