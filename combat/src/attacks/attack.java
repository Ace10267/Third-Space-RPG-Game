package attacks;

import enemies.Enemy;

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


    public void attackHitEnemy(Attack attack, Enemy enemy){
        int damage = attack.getDamage();
        int enrage = attack.getEnrage();
        enemy.removeHp(damage);
        enemy.addEnrage(enrage);
    }


    //constructor
    public Attack(int damage, String type, int enrage){
        this.damage = damage;
        this.type = type;
        this.enrage = enrage; 
    }
}
