package fr.univavignon.pokedex.api;

import junit.framework.TestCase;

public class IPokedexFactoryTest extends TestCase implements IPokedexFactory {

    public void testCreatePokedex() {
    }

    @Override
    public IPokedex createPokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory) {
        return null;
    }
}