

/**
 * Write a description of class Console here.
 * 
 * @author Austin Lynch 
 * @version (a version number or a date)
 */
public abstract class Console
{
    /** the player currently in action */
    private Player activePlayer;
    /** the roster of players (should only have 2) */
    private Player[] roster;
    /** the index of the current player*/
    private int current;
    /** the state of the game */
    private boolean gameRunning;

    /**
     * Default constructor for objects of class Console
     */
    public Console(Player[]contestents)
    {
        // initialise instance variables
        this.roster=contestents;
        this.current=0;
        this.gameRunning=true;
    }
    /**
     * Changes the turn to the next player
     */
    public void changePlayer()
    {
        // put your code here
        this.activePlayer=this.roster[(this.current+1)%2];
    }
    /**
     * runs the action with the current player, then changes player and checks if win or tie conditions are fullfilled
     */
    public void performAction()
    {
        this.activePlayer.action();
        if (this.findWinner()==null)
            {this.changePlayer();}
        else if (this.isTie())
        {
            this.tieGame();
            this.gameRunning=false;
        }
        else
        {
            this.winGame();
            this.gameRunning=false;
        }
    }
    /**
     * Finds out if either player has fullfilled the win condition (defined here)
     */
    public abstract Player findWinner();
    /**
     * Finds out if tie condition is fullfilled (defined here)
     */
    public abstract boolean isTie();
    /**
     * Performs the action only performed when a player wins
     */
    public abstract void winGame();
    /**
     * Performs the action when players tie
     */
    public abstract void tieGame();

}
