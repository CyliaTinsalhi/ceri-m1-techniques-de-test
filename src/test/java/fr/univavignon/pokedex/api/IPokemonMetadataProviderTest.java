package fr.univavignon.pokedex.api;

import junit.framework.TestCase;

public class IPokemonMetadataProviderTest extends TestCase implements IPokemonMetadataProvider {

    public void testGetPokemonMetadata() {
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return null;
    }
}