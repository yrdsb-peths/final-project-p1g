import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartWorld here.
 * 
 * @author Sherman, Marissa, and Carmen
 * @version 09/01/22
 */
public class StartWorld extends World
{
    private GreenfootImage background;
    private Font titleFont = new Font ("Calibri", false, false, 24);
    private Font subtitleFont = new Font ("Calibri", false, false, 20);
    
    private Button instructionsButton;
    private Button startButton;
    /**
     * Constructor for objects of class StartWorld.
     * 
     */
    public StartWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 900, 1);
        background = getBackground();
        
        // title
        background.setFont(titleFont);
        background.setColor(Color.WHITE);
        background.drawString("Insert Name Here", 260, 120);
        
        // buttons
        instructionsButton = new Button ("Instructions");
        addObject (instructionsButton, 150, 720);
        startButton = new Button ("Start Game");
        addObject (startButton, 570, 720);
    }
    
    public void act(){
        checkMouse();
    }
    
    private void checkMouse(){
        if (Greenfoot.mouseClicked(instructionsButton)){
            Greenfoot.setWorld(new InstructionsWorld());
        }
        if (Greenfoot.mouseClicked(startButton)){
            Greenfoot.setWorld(new GameWorld());
        }
    }
}
