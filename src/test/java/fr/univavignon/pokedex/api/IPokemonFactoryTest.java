package fr.univavignon.pokedex.api;

import junit.framework.TestCase;

public class IPokemonFactoryTest extends TestCase implements IPokemonFactory {

    public void testCreatePokemon() {
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return null;
    }
}