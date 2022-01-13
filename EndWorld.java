import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * If the games ends, the player goes to the EndWorld
 * 
 * @author Sherman, Marissa, and Carmen 
 * @version January 2022
 */
public class EndWorld extends World
{
    private GreenfootImage background;
    private Font titleFont = new Font ("Calibri", false, false, 24);
    private Font subtitleFont = new Font ("Calibri", false, false, 20);
    
    private Button quitButton;
    private Button replayButton;
    /**
     * Constructor for objects of class LoseWorld.
     * 
     */
    public EndWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 900, 1); 
        background = getBackground();
        
        // title
        background.setFont(titleFont);
        background.setColor(Color.WHITE);
        background.drawString("Good job!", 300, 120);
        
        // instructions
        background.setFont(subtitleFont);
        background.drawString("Would you like to play again?", 220, 200);
        
        // buttons
        quitButton = new Button ("Quit");
        addObject (quitButton, 150, 720);
        replayButton = new Button ("Replay");
        addObject (replayButton, 570, 720);
    }
    
    public void act(){
        checkMouse();
    }
    
    private void checkMouse(){
        if (Greenfoot.mouseClicked(quitButton)){
            Greenfoot.setWorld(new StartWorld());
        }
        if (Greenfoot.mouseClicked(replayButton)){
            Greenfoot.setWorld(new GameWorld());
        }
    }
}
