package com.packages.pokemon;

public interface PokemonInterface {
	void createPokemon(String name, String type, int health);
	Pokemon attackPokemon(Pokemon pokemon);
	Pokemon pokemonInfo();
}
