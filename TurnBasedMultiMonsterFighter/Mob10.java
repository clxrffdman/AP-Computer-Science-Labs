public class Mob10 extends Monster{

   public Mob10(){
       super("Zombie Maverick", 10, 140, 17, 4, 13);
   }

   public int attack(){

       return (stamina * stamina)+power;

   }

   public String toString(){
       return "This monster is known as the " + name + ", and is classified as a level " + rarity + " rare mob. It's damage output is twice its stamina plus power";
   }
}