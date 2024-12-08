public class WaterPokemon extends PokemonSuper{


    public WaterPokemon(int id, String name, int level, int hp) {
        super(id, name, level, hp);
    }

    public void hydroPump() {
        int level = getLevel();
        if (level >= 55) {
            System.out.println(name + " Does Hydro Pump 💦🌪️🌊💧!!!!" + "\n");
        } else {
            System.out.println(name + " must be at least Level 55 to do Hydro Pump" + "\n");
        }
    }

    @Override
    public void pokeDance() {
        System.out.println(name+ " is dancing Bubbling smooth🫧💦💧");

    }




}
