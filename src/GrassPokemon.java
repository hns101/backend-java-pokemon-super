public class GrassPokemon extends PokemonSuper{

    public GrassPokemon(int id, String name, int level, int hp) {
        super(id, name, level, hp);
    }

    public void razorLeaf() {
        int level = getLevel();
        if (level >= 39) {
            System.out.println(name + " Does Razor Leaf 🍃🍃🍃!!!!" + "\n");
        } else {
            System.out.println(name + " must be at least Level 39 to do Razor leaf" + "\n");
        }
    }

    @Override
    public void pokeDance() {
        System.out.println(name+ " is dancing grassingly groovy🍃🌿🍀🥬🍃");

    }


}





