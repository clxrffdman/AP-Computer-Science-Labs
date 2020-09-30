
public class Mob7 extends Monster{

   public Mob7(){
       super("Bonestep", 7, 110, 8, 3, 9);
   }

   public int attack(){

       return power * (power / 2);

   }

   public String toString(){
       return "This monster is known as the " + name + ", and is classified as a level " + rarity + " rare mob. It's damage output is its strength times half its stamina";
   }
}
