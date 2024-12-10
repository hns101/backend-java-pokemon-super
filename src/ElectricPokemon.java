public class ElectricPokemon extends PokemonSuper{

    int voltage;

    public ElectricPokemon(int id, String name, int level, int hp, int voltage) {
        super(id, name, level, hp);
        this.voltage = voltage;
    }


    public void thunder() {
        int level = getLevel();
        if (level >= 55) {
            System.out.println(getName() + " Does Thunder⚡⚡⚡⚡!!!!" + "\n");
        } else {
            System.out.println(getName() + " must be at least Level 55 to do Thunder" + "\n");
        }
    }

    @Override
    public void pokeDance() {
        System.out.println(getName()+ " is dancing shockingly goood⚡⚡⚡⚡");

    }

}
