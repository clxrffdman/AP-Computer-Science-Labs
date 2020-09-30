public class Mob3 extends Monster{

    public Mob3(){
        super("Digimon", 3, 70, 8, 1, 3);
        //String s, int id, int hp, int stam, int rare, int str
        
    }
    
    public int attack(){
    
        return (power-1)*(stamina+1);
    }
    
    public String toString(){
       return "This monster is known as the " + name + ", and is classified as a level " + rarity + " rare mob. It's damage output is its power-1 times stamina+1";
    }

}