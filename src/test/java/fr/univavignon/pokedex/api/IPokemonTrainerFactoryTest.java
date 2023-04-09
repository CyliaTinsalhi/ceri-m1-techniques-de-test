package fr.univavignon.pokedex.api;

import junit.framework.TestCase;

public class IPokemonTrainerFactoryTest extends TestCase implements  IPokemonTrainerFactory{

    public void testCreateTrainer() {
    }

    @Override
    public PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory) {
        return null;
    }
}