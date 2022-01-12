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
    private Button creditButton;
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
        background.drawString("Be mindful of how much time you have left!", 80, 200);
        
        // buttons
        backButton = new Button ("Go Back");
        addObject (backButton, 144, 675);
        startButton = new Button ("Start Game");
        addObject (startButton, 576, 675);
        creditButton = new Button ("Credits");
        addObject (creditButton, 360, 675);
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
        if (Greenfoot.mouseClicked(creditButton)){
            Greenfoot.setWorld(new CreditsWorld());
        }
    }
}
