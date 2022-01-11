import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instructions for the game. Buttons to go back or start playing.
 * 
 * @author Marissa Abesdris 
 * @version January 2022
 */
public class InstructionsWorld extends World
{
    private GreenfootImage background;
    private Font titleFont = new Font ("Calibri", false, false, 24);
    private Font subtitleFont = new Font ("Calibri", false, false, 20);
    
    private Button backButton;
    private Button startButton;
    /**
     * Constructor for objects of class InstructionsWorld.
     * 
     */
    public InstructionsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 900, 1); 
        background = getBackground();
        
        // title
        background.setFont(titleFont);
        background.setColor(Color.WHITE);
        background.drawString("Instructions", 300, 80);
        
        // instructions
        background.setFont(subtitleFont);
        background.drawString("Move using the left and right arrow keys", 80, 140);
        background.drawString("Shoot targets using the space bar", 80, 170);
        
        // buttons
        backButton = new Button ("Go Back");
        addObject (backButton, 150, 590);
        startButton = new Button ("Start Game");
        addObject (startButton, 570, 590);
    }
    
    public void act(){
        checkMouse();
    }
    
    private void checkMouse(){
        if (Greenfoot.mouseClicked(backButton)){
            Greenfoot.setWorld(new StartWorld());
        }
        if (Greenfoot.mouseClicked(startButton)){
            Greenfoot.setWorld(new GameWorld());
        }
    }
}
