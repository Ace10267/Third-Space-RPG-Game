package attacks;

public class attack{

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

    //constructor
    public attack(int damage, String type, int damage){
        this.damage = damage;
        this.type = type;
        this.damage = damage; 
    }
}
