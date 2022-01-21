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
    //buttons
    private Button instructionsButton;
    private Button startButton;
    musicButton sound;
    //Stuff that controls sound
    public static boolean soundStatus = true;
    
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
        sound = new musicButton();
        addObject(sound, 360, 780);
    }
    
    public void act(){
        checkMouse();
        playSound();
    }
    
    private void checkMouse(){
        if (Greenfoot.mouseClicked(instructionsButton)){
            Greenfoot.setWorld(new InstructionsWorld());
        }
        if (Greenfoot.mouseClicked(startButton)){
            Greenfoot.setWorld(new GameWorld());
        }
    }
    
    public void playSound()
    {    
        if (Greenfoot.mouseClicked(sound)) { //if user clicked music off
            if(soundStatus) {
                soundStatus = false;
                //bgm.stop(); //stop music
                sound.setImage("musicOff.jpg"); //change image to off
                sound.getImage().scale(sound.getImage().getWidth()/6, sound.getImage().getHeight()/6);
            } else {
                soundStatus = true;
                //bgm.playLoop(); //play music
                sound.setImage("musicOn.png"); //change image to on
                sound.getImage().scale(sound.getImage().getWidth()/6, sound.getImage().getHeight()/6);   
            }
        } else{
            if (soundStatus) { //if music is on
                //bgm.playLoop();
            }
        }
    }
}
