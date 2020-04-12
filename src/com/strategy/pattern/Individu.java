package com.strategy.pattern;

public  class Individu {
 ComportementArme arme;
 
 

public void combattre() {
	 arme.utiliseArme();
 }
 public void display() {}

public void setArme(ComportementArme ca) {
	this.arme = ca;
}

 
}
