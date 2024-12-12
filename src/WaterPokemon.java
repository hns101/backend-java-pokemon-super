public class WaterPokemon extends PokemonSuper{

    int waterLvl;

    public WaterPokemon(int id, String name, int level, int hp, int waterLvl) {
        super(id, name, level, hp);
        this.waterLvl = waterLvl;
    }

    public void hydroPump() {
        int level = getLevel();
        if (level >= 55) {
            System.out.println(getName() + " Does Hydro Pump 💦🌪️🌊💧!!!!" + "\n");
        } else {
            System.out.println(getName() + " must be at least Level 55 to do Hydro Pump" + "\n");
        }
    }

    @Override
    public void pokeDance() {
        System.out.println(getName() + " is dancing Bubbling smooth🫧💦💧");

    }




}
