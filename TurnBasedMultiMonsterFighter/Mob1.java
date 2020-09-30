public class Mob1 extends Monster{

    public Mob1(){
        super("Bakugan", 1, 60, 8, 1, 2);
        //String s, int id, int hp, int stam, int rare, int str
        
    }
    
    public int attack(){
    
        return power*stamina;
    }
    
    public String toString(){
       return "This monster is known as the " + name + ", and is classified as a level " + rarity + " rare mob. It's damage output is its strength times its stamina";
    }
        

}