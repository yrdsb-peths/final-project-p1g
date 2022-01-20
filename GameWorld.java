import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main game. 
 * 
 * @author Sherman, Marissa, and Carmen
 * @version 13/01/22
 */
public class GameWorld extends World
{
    //Stuff for world
    private Player player;
    SimpleTimer tim = new SimpleTimer();
    public static Counter timeCount = new Counter();
    public static Counter score = new Counter();
    
    // labels
    Label scoreText = new Label("score:", 30);
    Label timerText = new Label("time:", 30);
    
    //Stuff that adjusts difficulty
    int magicInt = 70;
    int level = 1;
    int enemyCount = 1;
    private Enemy enemy1;
    
    /**
     * Prepares GameWorld.
     * Adds player and labels into the world.
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 900, 1); 
        prepare();
        
        //Creates player
        player = new Player();
        addObject(player, 360, 800);
        
        //Creates labels
        addObject(scoreText, 100, 60);
        addObject(timerText, 500, 60);
    }
    
    /**
     * Prepare the world for the game page of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // adds score and timer to world
        addObject(timeCount,570,60);
        addObject(score, 170, 60);
        
        // sets original value of score and time
        timeCount.setValue(20); // time starts at 20 seconds
        score.setValue(0); // score starts at 0
    }
    
    public void act()
    {    
        timeCountDown();
        enemyCount++;
        if(enemyCount>magicInt)
        {
            addEnemy();
            enemyCount = 0;
        }
    }
    
    //spawns enemies randomly at the top of the screen
    public void addEnemy()
    {
        Enemy enemy = new Enemy();
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = 0;
        addObject(enemy, x, y);
    }
    
    public Enemy getEnemy()
    {
        return enemy1;
    }
    
    /**
     * Timer
     * Ends game when the time gets to 0
     */
    public void timeCountDown()
    {    
        if(tim.millisElapsed() > 1000) { //time count down every second
            timeCount.add(-1);
            tim.mark();
        }
        
        if (tim.millisElapsed() * 1000 == timeCount.getValue()) { //if time limit is reached
            EndWorld endWorld = new EndWorld();
            Greenfoot.setWorld(endWorld);
        }

    }
}
