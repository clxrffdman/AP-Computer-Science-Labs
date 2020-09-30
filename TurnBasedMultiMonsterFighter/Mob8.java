
public class Mob8 extends Monster{

   public Mob8(){
       super("Corpseface", 8, 120, 5, 3, 11);
   }

   public int attack(){

       return power * (idNumber + stamina);

   }

   public String toString(){
       return "This monster is known as the " + name + ", and is classified as a level " + rarity + " rare mob. It's damage output is its strength times its id + stamina";
   }
}
