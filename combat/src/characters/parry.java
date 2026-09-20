package characters;

public class parry extends character{

    private boolean isParrying = false; 
    private boolean justSucecessfulParried;
    private boolean justUnsuccessfulParried;

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


}
