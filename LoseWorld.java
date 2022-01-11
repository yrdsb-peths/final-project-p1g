import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * If the player loses, they go to the LoseWorld
 * 
 * @author Sherman, Marissa, and Carmen 
 * @version January 2022
 */
public class LoseWorld extends World
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
    public LoseWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 900, 1); 
        background = getBackground();
        
        // title
        background.setFont(titleFont);
        background.setColor(Color.WHITE);
        background.drawString("YOU LOSE!", 300, 120);
        
        // instructions
        background.setFont(subtitleFont);
        background.drawString("Better luck next time!", 260, 200);
        
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
