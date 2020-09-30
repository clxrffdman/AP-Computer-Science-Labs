public class Monster{
    
    String name;
    boolean state;
    int idNumber, maxHealth, currentHealth, stamina, maxStamina, rarity;
    int power;
    
    public Monster(){
        name = "";
        state = false;
        idNumber = -1;
        maxHealth = 0;
        currentHealth = 0;
        stamina = 0;
        maxStamina = 0;
        rarity = 0;
        power = 0;
        
    }
    
    public Monster(String s, int id, int hp, int stam, int rare, int str){
        name = s;
        state = false;
        idNumber = id;
        maxHealth = hp;
        currentHealth = hp;
        stamina = stam;
        maxStamina = stam;
        rarity = rare;
        power = str;
        
    }
    
    public String toString(){
    
        return ("----------------------------\nName: " + name + "\nIdentification Number: " + idNumber + "\nMax Health: " + maxHealth + "\nMax Stamina: " + maxStamina + "\nPower: " + power + "\nRarity: " + rareToString());
    
    }
    
    public void call(){
    
        System.out.println("----------------------------\nName: " + name + "\nIdentification Number: " + idNumber + "\nMax Health: " + maxHealth + "\nMax Stamina: " + maxStamina + "\nPower: " + power + "\nRarity: " + rareToString());
    
    }
    
    public String battleState(){
    
        return ("----------------------------\nName: " + name + "\nHealth: " + currentHealth + "/" + maxHealth + "\nStamina: " + stamina + "/" + maxStamina + "\nPower: " + power + "\nRarity: " + rareToString() + "\nDefeated: " + state);
    
    }
    
    public int attack(int ids){
        if(ids==0){
            return power*stamina;
        }
        if(ids==1){
            return power*stamina;
        }
        if(ids==2){
            return power*stamina;
        }
        if(ids==3){
            return (power-1)*(stamina+1);
        }
        if(ids==4){
            return (power*stamina)-1;
        }
        if(ids==5){
            return power*stamina+1;
        }
        if(ids==6){
            return power * (power / 2);
        }
        if(ids==7){
            return power * (power / 2);
        }
        if(ids==8){
            return power * (idNumber + stamina);
        }
        if(ids==9){
            return power*stamina;
        }
        if(ids==10){
            return stamina * stamina;
        }
        if(ids==11){
            return power * stamina * power * rarity;
        }
        return 0;
    }
    
    public String rareToString(){
        if(rarity == 1)
            return "*";
            
        if(rarity == 2)
            return "**";
        
        if(rarity == 3)
            return "***";
            
        if(rarity == 4)
            return "****";
            
        if(rarity == 5)
            return "*****";    
        
            return "error";
    }
    
    public void skip(){
        System.out.println(name + " has skipped their turn!");
    
    }
    
    






}
