package com.strategy.pattern;

public class Archer extends Individu{

     public Archer() {
    	 arme=new ComportementArcFleche();
    			 
     }
     public void display() {
    	 System.out.println("this is an archer");
     }
}
