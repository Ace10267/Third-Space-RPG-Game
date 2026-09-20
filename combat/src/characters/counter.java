package characters;

public class counter extends parry{

    private boolean isCountering = false;
    private boolean justCountered = false;

    public void setIsCountering(boolean isCountering){
        this.isCountering = isCountering;
    }
    public void setJustCountered(boolean justCountered){
        this.justCountered = justCountered;
    }
    public boolean getIsCountering(){
        return isCountering;
    }
    public boolean getJustCountered(){
        return justCountered;
    }

    public boolean counterattack(){
        if ((!getJustCountered()) && (getParryStacks() >= 1) && (!getIsUnstable())){
            setJustCountered(true);;
            return true;
        }
        return false;
    }

    public void counterReset(){
        isCountering = false;
        justCountered = false;
    }

}
