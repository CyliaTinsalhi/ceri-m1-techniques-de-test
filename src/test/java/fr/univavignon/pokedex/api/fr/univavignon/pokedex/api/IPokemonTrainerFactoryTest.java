package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;


public class IPokemonTrainerFactoryTest {

//hjghgh
    IPokemonTrainerFactory pokemonTrainerFactory = mock(IPokemonTrainerFactory.class);
    IPokedexFactory pokedexFactory = mock(IPokedexFactory.class);
    IPokedex pokedex = mock(IPokedex.class);
    Pokemon pokemon1 =new Pokemon(1, "Aquali", 23, 75, 430, 0, 0, 0, 0, 0);

    @Before
    public  void init() {

        when(pokemonTrainerFactory.createTrainer(
                anyString(), any(), any()
        )).thenAnswer(new Answer<PokemonTrainer>() {
            public PokemonTrainer answer(InvocationOnMock invocation) {
                Object[] args = invocation.getArguments();
                String name = (String) args[0];
                Team team = (Team) args[1];
                when(pokedex.size()).thenReturn(0);
                return new PokemonTrainer(name, team, pokedex);
            }
        });
    }




    @Test
    public  void creationPokemonTrainerTest() throws PokedexException {

        PokemonTrainer pokemonTrainer = pokemonTrainerFactory.createTrainer("Cylia", Team.VALOR, pokedexFactory);
        pokemonTrainer.getPokedex().addPokemon(pokemon1);
        assertEquals("Cylia", pokemonTrainer.getName());
        assertEquals(Team.VALOR, pokemonTrainer.getTeam());
        assertNotNull(pokemonTrainer.getPokedex());
        assertEquals(0, pokemonTrainer.getPokedex().size());
    }


}