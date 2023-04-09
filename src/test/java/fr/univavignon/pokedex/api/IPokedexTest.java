package fr.univavignon.pokedex.api;

import junit.framework.TestCase;

import java.util.Comparator;
import java.util.List;

public class IPokedexTest extends TestCase implements IPokedex {

    public void testSize() {
    }

    public void testAddPokemon() {
    }

    public void testGetPokemon() {
    }

    public void testGetPokemons() {
    }

    public void testTestGetPokemons() {
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        return 0;
    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        return null;
    }

    @Override
    public List<Pokemon> getPokemons() {
        return null;
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        return null;
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return null;
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return null;
    }
}