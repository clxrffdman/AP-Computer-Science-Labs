
public class Mob11 extends Monster{

   public Mob11(){
       super("Hellstep", 11, 150, 25, 5, 15);
   }

   public int attack(){

       return power * stamina * power * rarity;

   }

   public String toString(){
       return "This monster is known as the " + name + ", and is classified as a level " + rarity + " rare mob. It's damage output is twice its strength times its stamina times its rarity";
   }
}
