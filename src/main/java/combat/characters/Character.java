package combat.characters;
public class Character{


//#region basic char
    //attributes 

    private int charHp = 20;
    private int hp = charHp;
    private double charInstability = 100;
    private double instability = 0;
    private int parryStacks = 0;
    private boolean isAlive = true;
    private boolean isUnstable = false;
    private int charSpeed;
    private int speed = charSpeed; 
    private boolean justHit = false;
    private int maxEnrage;
    private int enrage = 0;
    private boolean isEnraged = false;

    //getters 
    public int getMaxEnrage(){
        return maxEnrage;
    }
    public int getEnrage(){
        return enrage;
    }
    public boolean getJustHit(){
        return justHit;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public boolean getIsUnstable(){
        return isUnstable;
    }
    public int getCharHp() {
        return charHp;
    }
    public int getHp() {
        return hp;
    }
    public double getInstability() {
        return instability;
    }
    public double getCharInstability() {
        return charInstability;
    }
    public int getParryStacks() {
        return parryStacks;
    }
    public boolean isUnstable() {
        return isUnstable;
    }
    public int getSpeed(){
        return speed;
    }
    public void setEnrage(int enrage){
        this.enrage = enrage;
        if (enrage >= maxEnrage){
            isEnraged = true;
        }
    }
    public void addEnrage(int enrage){
        this.enrage += enrage;
        if (enrage >= maxEnrage){
            isEnraged = true;
        }
    }    
    public void removeEnrage(int enrage){
        this.enrage -= enrage;
        if (enrage >= maxEnrage){
            isEnraged = true;
        }
    }       
    public void setJustHit(boolean justHit){
        this.justHit = justHit;
    }
    public void setCharHp(int charHp) {
        this.charHp = charHp;
    }
    public void setHp(int hp) {
        this.hp = hp;
        if (this.hp <= 0) {
            isAlive = false;
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
    }


    public void setCharSpeed(int charSpeed) {
        this.charSpeed = charSpeed;
    }
    public void addCharSpeed(int speed){
        charSpeed += speed;
    }
    public void addSpeed(int speed){
        this.speed += speed;
    }
    public void removeSpeed(int speed){
        this.speed -= speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }




    public void setParryStacks(int parryStacks) {
        this.parryStacks = parryStacks;
    }
    public void addParryStacks(int parryStacks) {
        this.parryStacks += parryStacks;
    }
    public void removeParryStacks(int parryStacks){
        this.parryStacks = parryStacks;
        if (this.parryStacks < 0){
            this.parryStacks = 0;
        }
    }


    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }


    public void setCharInstability(double charInstability){
        this.charInstability = charInstability;
    }
    public void addCharInstability(double charInstability){
        this.charInstability += charInstability;
    }
    public void setIsUnstable(boolean isUnstable) {
        this.isUnstable = isUnstable;
    }
     public void setInstability(double instability) {
        this.instability = instability;
        if (this.instability >= this.charInstability) {
            this.isUnstable = true;
        } else {
            this.isUnstable = false;
        }
    }
    public void addInstability(double instability) {
        this.instability += instability;
        if (this.instability >= this.charInstability) {
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
        if (this.instability >= this.charInstability) {
            this.isUnstable = true;
        } else {
            this.isUnstable = false;
        }
    }
    //reset
    public void charReset(){
        setIsAlive(true);
        setParryStacks(0);
        setInstability(0);
        setSpeed(charSpeed);
        setHp(charHp);
        setJustHit(false);
    }
//#endregion


//#region parrying
    private boolean isParrying = false; 
    private boolean justSucceessfulParried = false;
    private boolean justUnsuccessfulParried = false;

    //getters
    public boolean getIsParrying(){
        return isParrying; 
    }
    public boolean getJustSucecessfulParried(){
        return justSucceessfulParried;
    }
    public boolean justUnsuccessfulParried(){
        return justUnsuccessfulParried;
    }

    //can you parry
    public boolean canParry(){
        if (!isParrying){
            return true;
        }
        return false;
    }
  
    //if parry succesful
    public void successfulParry(){
        addParryStacks(1);
        double instability = getInstability() + 10;

        if (instability >= getCharInstability()){
            instability = getCharInstability() - .1;
        }

        setInstability(instability);
        addParryStacks(1);

        isParrying = false;
        justSucceessfulParried = true;
    }

    public void unsuccesfulParry(){
        double instability = getInstability() + 20;
        addInstability(instability);
        isParrying = false; 
        justUnsuccessfulParried = true;
        
    }

    //constructor
    public void parry(){}

    //reset
    public void parryReset(){
        isParrying = false;
        justUnsuccessfulParried = false;
        justSucceessfulParried = false;
    }

    //#endregion


//#region counterattacking
    private boolean isCountering = false;
    private boolean justCountered = false;
 
    //setters counter
    public void setIsCountering(boolean isCountering){
        this.isCountering = isCountering;
    }
    public void setJustCountered(boolean justCountered){
        this.justCountered = justCountered;
    }

    //getters counter
    public boolean getIsCountering(){
        return isCountering;
    }
    public boolean getJustCountered(){
        return justCountered;
    }


    //checks if counterattack is possible
    public boolean canCounter(){
        if ((!getJustCountered()) && (getParryStacks() >= 1) && (!getIsUnstable())){
            setJustCountered(true);;
            return true;
        }
        return false;
    }

    //reset
    public void counterReset(){
        isCountering = false;
        justCountered = false;
    }
//#endregion
    
 //default constructor for testing
   public Character(){}
   

    public Character(int charHp, int charSpeed, int charInstabilty){
        this.charHp = charHp;
        this.charSpeed = charSpeed;
        this.charInstability = charInstabilty;
        this.maxEnrage = 100;
    }

    
    
}