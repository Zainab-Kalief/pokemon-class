package com.packages.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokedex tom = new Pokedex("tom", "rat");
		Pokedex tony = new Pokedex("tony", "tiger");
		
		tom.pokemonInfo();
		tony.attackPokemon(tom);
		tom.pokemonInfo();
	}

}
