import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsWorld here.
 * 
 * @author Sherman, Marissa, and Carmen
 * @version 09/01/22
 */
public class CreditsWorld extends World
{
    private GreenfootImage background;
    private Font titleFont = new Font ("Calibri", false, false, 30);
    private Font subtitleFont = new Font ("Calibri", false, false, 24);
    /**
     * Constructor for objects of class CreditsWorld.
     * 
     */
    public CreditsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 900, 1); 
        background = getBackground();
        
        //Creates credit header
        background.setFont(titleFont);
        background.setColor(Color.WHITE);
        background.drawString("Credits", 300, 80);
        
        //Credits
        background.setFont(subtitleFont);
        background.drawString("Game created by: Sherman L., Marissa A., and Carmen P.", 70, 140);
        background.drawString("Most assets were from the internet\nand are free to use for non-commercial purposes", 70, 180);

    }
}
