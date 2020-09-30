public class Mob2 extends Monster{

   public Mob2(){
        super("Lego", 2, 60, 10, 1, 3);
        //String s, int id, int hp, int stam, int rare, int str
        
   }
    
   public int attack(){
    
        return power*stamina;
   }
   
   public String toString(){
       return "This monster is known as the " + name + ", and is classified as a level " + rarity + " rare mob. It's damage output is its strength times its stamina";
   }



}