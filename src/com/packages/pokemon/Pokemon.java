package com.packages.pokemon;

public abstract class Pokemon implements PokemonInterface {
	protected String name;
	protected String type;
	protected int health;
	public static int count;
	
	public void createPokemon(String name, String type, int health) {  //interface 
		this.name = name;
		this.type = type;
		this.health = health;
	}
	public Pokemon(String name, String type) {
		createPokemon(name, type, 50);
		count ++;
	}

	public Pokemon attackPokemon(Pokemon pokemon) {
		pokemon.health += 10;
		return this;
	}
}
