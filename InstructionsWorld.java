import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsWorld here.
 * 
 * @author Marissa Abesdris 
 * @version Jan 10 2022
 */
public class InstructionsWorld extends World
{
    private GreenfootImage background;
    Font calibriFont = new Font ("Calibri", false, false, 32);
    Font subtitleFont = new Font ("Calibri", false, false, 24);
    
    /**
     * Constructor for objects of class InstructionsWorld.
     * 
     */
    public InstructionsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        background = getBackground();
        
        // title
        background.setFont(calibriFont);
        background.setColor(Color.BLACK);
        background.drawString("Instructions", 210, 70);
        
        // instructions
        background.setFont(subtitleFont);
        background.drawString("Use the arrow keys (left and right) to move", 10, 130);
        background.drawString("Shoot oncoming targets with the space bar", 10, 170);
    }
}
