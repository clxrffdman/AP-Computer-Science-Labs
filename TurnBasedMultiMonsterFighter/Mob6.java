
public class Mob6 extends Monster{

   public Mob6(){
       super("The Crimson Demon Gargoyle", 6, 100, 5, 3, 8);
   }

   public int attack(){

       return power * (stamina / 2);

   }

   public String toString(){
       return "This monster is known as the " + name + ", and is classified as a level " + rarity + " rare mob. It's damage output is its strength times half its stamina";
   }
}
