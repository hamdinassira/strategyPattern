package com.strategy.pattern;

public class Test {

	public static void main(String[] args) {
	Archer a=new Archer();
	a.combattre();
	a.setArme(new ComportementArcFleche());
	a.display();
	System.out.println("*************************");
	Reine r=new Reine();
	r.combattre();
	r.setArme(new ComportementEpee());
	r.display();
	System.out.println("*************************");
	Chevalier c=new Chevalier();
	c.combattre();
	c.setArme(new  ComportementCouteau());
	c.display();
	
	}
}