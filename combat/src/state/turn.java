package state;
public class turn {

    private boolean isPlayerTurn;
    private boolean isEnemyTurn;
    private int turnCharPlayer;
    private int turnCharEnemy;

    //getters
    public boolean getIsPlayerTurn() {
        return isPlayerTurn;
    }
    public boolean getIsEnemyTurn() {
        return isEnemyTurn;
    }
    public int getTurnCharPlayer() {
        return turnCharPlayer;
    }
    public int getTurnCharEnemy() {
        return turnCharEnemy;
    }

    //setters
    public void setIsPlayerTurn(boolean isPlayerTurn) {
        this.isPlayerTurn = isPlayerTurn;
        this.isEnemyTurn = !isPlayerTurn;
    }
    public void setTurnCharPlayer(int turnCharPlayer) {
        this.turnCharPlayer = turnCharPlayer;
    }
    public void setTurnCharEnemy(int turnCharEnemy) {
        this.turnCharEnemy = turnCharEnemy;
    }
}

