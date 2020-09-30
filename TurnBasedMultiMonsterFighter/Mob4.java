public class Mob4 extends Monster{

    public Mob4(){
        super("Minecraft", 4, 60, 13, 1, 1);
        //String s, int id, int hp, int stam, int rare, int str
        
    }
    
    public int attack(){
    
        return (power*stamina)-1;
    }
        
    public String toString(){
       return "This monster is known as the " + name + ", and is classified as a level " + rarity + " rare mob. It's damage output is its strength times its stamina minus one";
    }


}