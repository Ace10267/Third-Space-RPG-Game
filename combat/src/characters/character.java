package characters;
public class character {

    //attributes 
    private int maxHp = 20;
    private int hp = maxHp;
    private double maxInstability = 100;
    private double instability = maxInstability;
    private int parryStacks = 0;
    private boolean isAlive = true;
    private boolean isUnstable;


    //getters 
    public boolean isAlive() {
        return isAlive;
    }
    public int getMaxHp() {
        return maxHp;
    }
    public int getHp() {
        return hp;
    }
    public double  getInstability() {
        return instability;
    }
    public double getMaxInstability() {
        return maxInstability;
    }
    public int getParryStacks() {
        return parryStacks;
    }
    public boolean isUnstable() {
        return isUnstable;
    }

    //setters 
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
    public void setHp(int hp) {
        this.hp = hp;
        if (this.hp <= 0) {
            isAlive = false;
        }
        if (this.hp > maxHp) {
            this.hp = maxHp;
        }
    }
    public void removeHp(int hp) {
        this.hp -= hp;
        if (this.hp <= 0) {
            isAlive = false;
        }
    }
    public void addHp(int hp) {
        this.hp += hp;
        if (this.hp > maxHp) {
            this.hp = maxHp;
        }
    }

    public void setMaxInstability(double maxInstability) {
        this.maxInstability = maxInstability;
    }
    public void setInstability(double instability) {
        this.instability = instability;
        if (this.instability >= this.maxInstability) {
            this.isUnstable = true;
        } else {
            this.isUnstable = false;
        }
    }
    public void addInstability(double instability) {
        this.instability += instability;
        if (this.instability >= this.maxInstability) {
            this.isUnstable = true;
        } else {
            this.isUnstable = false;
        }
    }
    public void removeInstability(double instability) {
        this.instability -= instability;
        if (this.instability < 0) {
            this.instability = 0;
        }
        if (this.instability >= this.maxInstability) {
            this.isUnstable = true;
        } else {
            this.isUnstable = false;
        }
    }



    public void setParryStacks(int parryStacks) {
        this.parryStacks = parryStacks;
    }
    public void addParryStacks(int parryStacks) {
        this.parryStacks += parryStacks;
    }

    public void setIsUnstable(boolean isUnstable) {
        this.isUnstable = isUnstable;
    }
    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }


}