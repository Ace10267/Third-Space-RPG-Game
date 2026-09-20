package attacks;

import characters.Character;

public class Attack{

    private int damage;
    private String name;
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
    public String getName(){
        return name;
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
    public void setName(String name){
        this.name = name;
    }

    //when attack hits either ways
    public void attackHit(Attack attack, Character victim){
        int damage = attack.getDamage();
        int enrage = attack.getEnrage();
        victim.removeHp(damage);
        victim.addEnrage(enrage);
    }


    //constructor
    public Attack(int damage, String type, int enrage, String name){
        this.damage = damage;
        this.type = type;
        this.enrage = enrage; 
        this.name = name;
    }
}
