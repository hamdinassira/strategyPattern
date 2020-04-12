package com.strategy.pattern;

public class Reine extends Individu{
    public Reine() {
   	 arme=new ComportementEpee();
   			 }
    public void display() {
   	 System.out.println("this is a reine");
    }
}
