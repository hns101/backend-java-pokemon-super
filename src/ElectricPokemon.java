public class ElectricPokemon extends PokemonSuper{

    public ElectricPokemon(int id, String name, int level, int hp) {
        super(id, name, level, hp);
    }


    public void thunder() {
        int level = getLevel();
        if (level >= 55) {
            System.out.println(name + " Does Thunder⚡⚡⚡⚡!!!!" + "\n");
        } else {
            System.out.println(name + " must be at least Level 55 to do Thunder" + "\n");
        }
    }

    @Override
    public void pokeDance() {
        System.out.println(name+ " is dancing shockingly goood⚡⚡⚡⚡");

    }

}
