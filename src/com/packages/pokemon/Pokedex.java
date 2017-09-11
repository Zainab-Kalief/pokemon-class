package com.packages.pokemon;

public class Pokedex extends Pokemon {

	public Pokedex(String name, String type) {
		super(name, type); //this will pass values back to class 
		// TODO Auto-generated constructor stub
	}
	
	
	public Pokemon pokemonInfo() {
		System.out.println(this.name + " of type " + this.type + " has health " + this.health);
		return this;
	}

}
