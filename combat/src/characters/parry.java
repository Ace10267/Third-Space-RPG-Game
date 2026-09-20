package characters;

public class parry extends character{

    private boolean isParrying = false; 
    private boolean justSucecessfulParried = false;
    private boolean justUnsuccessfulParried = false;

    public boolean getIsParrying(){
        return isParrying; 
    }
    public boolean getJustSucecessfulParried(){
        return justSucecessfulParried;
    }
    public boolean getJustSucessfulParried(){
        return justSucecessfulParried;
    }

    public void successfulParry(){
        addParryStacks(1);
        double instability = getInstability() + 10;

        if (instability >= getMaxInstability()){
            instability = getMaxInstability() - .1;
        }

        setInstability(instability);
        addParryStacks(1);

        boolean isParrying = false;
        boolean justSuccessfulParried = true;
    }

    public void UnsuccesfulParry(){
        double instability = getInstability() + 20;
        addInstability(instability);
        boolean isParrying = false; 
        justUnsuccessfulParried = true;
    }

    public void ParryReset(){
        isParrying = false;
        justUnsuccessfulParried = false;
        justSucecessfulParried = false;
    }
}
