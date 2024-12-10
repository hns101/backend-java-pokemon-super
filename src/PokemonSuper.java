import java.util.List;
import java.util.ArrayList;
public abstract class PokemonSuper {

    private int id;
    private String name;
    private int level;
    private int hp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PokemonSuper(int id, String name, int level, int hp) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.hp = hp;
    }


    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void eats() {
        System.out.println (name + " is eating"+"\n");
    }

    public void speaks() {
        System.out.println (name + " is making some noise!!!!"+"\n");

    }

    public void pokedex(){
        System.out.println ("///////🔴POKEDEX⚪///////"+"\n" +
                            "Poke-ID: " + id + "\n" +
                            "Name: " + name + "\n" +
                            "Lvl: " + level + "\n"+
                            "HP: " + hp + "\n" +
                            "/////////////////////////"+"\n"
        );
    }

    public void giveRareCandy (int amount){
        level += amount;
        hp += (amount*3);
        System.out.println (name + " ate " + amount + " Rare Candy"+"\n"+
                            name + ": New Stats are Lvl:"+ level + " HP:"+hp+"\n"
                            );

    }

    public abstract void pokeDance();

    public void pokeParty(List<PokemonSuper> pokemons){
        System.out.println(         "///////////////////🔊🎵💿🪩🔴POKEPARTY⚪🪩💿🎵🔊///////////////////"+"\n"+
                                    name + " invited his Friends for an Pokemon Super Party !!!!!! "+ "\n"+
                                    "DJ Pikachu is in Da House and the Poke-Music is playing!!!!!! "+ "\n");
        for (PokemonSuper i : pokemons) {
            i.pokeDance();
        }
        System.out.println(         "//////////////////////////////////////////////////////////////////////"+"\n");

    }


}
