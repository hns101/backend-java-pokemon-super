import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<PokemonSuper> pokemons = new ArrayList<>();

        FirePokemon charmander = new FirePokemon(4,"Charmander", 5, 39,678);
        ElectricPokemon zapdos = new ElectricPokemon(145,"Zapdos", 55, 90, 440);
        GrassPokemon bellsprout = new GrassPokemon(69,"Bellsprout", 36, 50,4);
        WaterPokemon lapras = new WaterPokemon(131,"Lapras", 53, 130,6);

        pokemons.add(charmander);
        pokemons.add(zapdos);
        pokemons.add(bellsprout);
        pokemons.add(lapras);


        charmander.pokedex();
        charmander.flameThrower();
        charmander.eats();
        charmander.speaks();

        zapdos.pokedex();
        zapdos.thunder();

        bellsprout.pokedex();
        bellsprout.razorLeaf();

        lapras.pokedex();
        lapras.giveRareCandy(3);
        lapras.hydroPump();

        charmander.pokeParty(pokemons);





    }
}
