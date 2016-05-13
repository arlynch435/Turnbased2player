

/**
 * Write a description of class Player here.
 * 
 * @author Austin Lynch
 * @version (a version number or a date)
 */
public abstract class Player
{
    /** name of the player */
    private String name;

    /**
     * Default constructor for objects of class Player
     */
    public Player(String title)
    {
        // initialise instance variables
        this.name=title;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public abstract void action();

}
