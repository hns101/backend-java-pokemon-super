public class FirePokemon extends PokemonSuper{

    int temperature;

    public FirePokemon(int id, String name, int level, int hp, int temperature) {
        super(id, name, level, hp);
        this.temperature = temperature;
    }

    public void flameThrower(){
        int level = getLevel();
        if(level >= 24){
            System.out.println( getName() + " Does FLAME Thrower🔥!!!!"+"\n");
        }
        else {
            System.out.println( getName() + " must be Level 24 to do FlameThrower"+"\n");
        }

    }

    @Override
    public void pokeDance() {
        System.out.println(getName()+ " is dancing flaming hot🔥🔥🔥🔥");

    }



}
