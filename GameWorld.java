import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author Sherman, Marissa, and Carmen
 * @version 13/01/22
 */
public class GameWorld extends World
{
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount = new Counter();
    //Player stats
    int hp = 3;
    //Targets hit - Total score is equal to time + hits.
    //Final score calculation is to be calculated somewhere else
    int hits = 0;
    Label scoreLabel = new Label("Hits: " + hits, 30);
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 900, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the game page of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(timeCount,200,60);
        /**
         * Timer method. Value should be lower for hard stage
         */
        timeCount.setValue(20);
        
        addObject(scoreLabel, 100, 60);
    }
    public void act()
    {    
        timeCountDown();
    }
    
    /**
     * 
     * 
     */
    public void timeCountDown()
    {    
        if(tim.millisElapsed() > 1000) { //time count down every second
            timeCount.add(-1);
            tim.mark();
        }
        
        if (tim.millisElapsed() * 1000 == timeCount.getValue()) { //if time limit is reached
            LoseWorld endWorld = new LoseWorld();
            Greenfoot.setWorld(endWorld);
        }

    }
}
