public class Mob9 extends Monster{

    public Mob9(){
        super("Gravetree", 8, 130, 15, 3, 12);
    }

    public int attack(){

        return power * stamina;

    }

    public String toString(){
        return "This monster is known as the " + name + ", and is classified as a level " + rarity + " rare mob. It's damage output is its strength times its stamina";
    }
}