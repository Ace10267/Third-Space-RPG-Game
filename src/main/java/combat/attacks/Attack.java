package combat.attacks;

import combat.characters.Character;

public class Attack{

    private int damage;
    private String type;
    private int enrage;

    //getters
    public int getDamage(){
        return damage;
    }
    public String getType(){
    return type;
    }
    public int getEnrage(){
        return enrage;
    }

    //setters
    public void setDamage(int damage){
        this.damage = damage;
    }
    public void setEnrage(int enrage){
        this.enrage = enrage;
    }
    public void setType(String type){
        this.type = type; 
    }


    public void attackHitEnemy(Attack attack, Character victim){
        int damage = attack.getDamage();
        int enrage = attack.getEnrage();
        victim.removeHp(damage);
        victim.addEnrage(enrage);
    }


    //constructor
    public Attack(int damage, String type, int enrage){
        this.damage = damage;
        this.type = type;
        this.enrage = enrage; 
    }
}
