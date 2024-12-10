public class GrassPokemon extends PokemonSuper{

    int growthLvl;

    public GrassPokemon(int id, String name, int level, int hp,int growthLvl) {
        super(id, name, level, hp);
        this.growthLvl = growthLvl;
    }

    public void razorLeaf() {
        int level = getLevel();
        if (level >= 39) {
            System.out.println(getName() + " Does Razor Leaf 🍃🍃🍃!!!!" + "\n");
        } else {
            System.out.println(getName()+ " must be at least Level 39 to do Razor leaf" + "\n");
        }
    }

    @Override
    public void pokeDance() {
        System.out.println(getName() + " is dancing grassingly groovy🍃🌿🍀🥬🍃");

    }


}





