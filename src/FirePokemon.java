public class FirePokemon extends PokemonSuper{


    public FirePokemon(int id, String name, int level, int hp) {
        super(id, name, level, hp);
    }

    public void flameThrower(){
        int level = getLevel();
        if(level >= 24){
            System.out.println( name + " Does FLAME Thrower🔥!!!!"+"\n");
        }
        else {
            System.out.println( name + " must be Level 24 to do FlameThrower"+"\n");
        }

    }

    @Override
    public void pokeDance() {
        System.out.println(name+ " is dancing flaming hot🔥🔥🔥🔥");

    }



}
