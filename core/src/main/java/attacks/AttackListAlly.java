package attacks;

import java.util.ArrayList;

public class AttackListAlly {
    
    private ArrayList<Attack> attacks = new ArrayList<Attack>();

    Attack counterattack = new Attack(10, "neutral", 20, "counterattack");
    Attack punch = new Attack(5, "neutral", 20, "punch");

    public ArrayList<Attack> GetAllAttacks(){
        return attacks;
    }  

    public Attack GetAttack(String attackname){
        for (Attack attack : attacks){
            if (attack.getName().equals(attackname)){
                return attack;
            }
        }
        return null; 
    }
    public AttackListAlly(){
    attacks.add(counterattack);
    attacks.add(punch);
    }


}
