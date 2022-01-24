import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * If the games ends, the player goes to the EndWorld
 * Sorts through the scores and shows the player their highscore
 * 
 * @author Sherman, Marissa, and Carmen 
 * @version January 2022
 */
public class EndWorld extends World
{
    private GreenfootImage background;
    
    // Fonts
    private Font titleFont = new Font ("Calibri", false, false, 24);
    private Font subtitleFont = new Font ("Calibri", false, false, 20);
    
    // Buttons
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
        
        // subtitles
        background.setFont(subtitleFont);
        background.drawString("Your score was: " + GameWorld.score.getValue(), 220, 180);
        background.drawString("Would you like to play again?", 220, 230);
        
        addObject(new HighScore(), 220, 600);
        
        // buttons
        quitButton = new Button ("Quit");
        addObject (quitButton, 150, 720);
        replayButton = new Button ("Replay");
        addObject (replayButton, 570, 720);
    }
    
    public void act(){
        checkMouse();
    }
    
    // Checks to see if the buttons have been clicked
    private void checkMouse(){
        if (Greenfoot.mouseClicked(quitButton)){
            Greenfoot.setWorld(new StartWorld());
        }
        if (Greenfoot.mouseClicked(replayButton)){
            Greenfoot.setWorld(new GameWorld());
        }
    }
    
    /**
     * A simple sorting algorithm
     * @param arr An integer array
     */
    public void insertionSort(int[] arr)
    {
        int N = arr.length;
        for(int i = 1; i < N; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    ArrayUtil.swap(arr, j, j-1);
                }
                else
                {
                    break;
                }
            }
        }
    }
}
