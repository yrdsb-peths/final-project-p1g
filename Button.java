import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    public static final double FONT_RATIO = 0.58;
    
    private boolean touching;
    
    private String myText;

    private int drawX;
    private int drawY;
    
    private GreenfootImage image;
    private GreenfootImage touchingImage; 
    
    private static Color green = new Color (214, 253, 206);
    
    // Set up a 24-pt, bold Courier New font for drawing text onto my Button
    private Font buttonFont = new Font("Courier New",  true,  false,  24);

    public Button (String text) {
        image = new GreenfootImage (180, 40);
        touchingImage = new GreenfootImage (180, 40);
        myText = text;
        // centering the letters
        int wordLength = myText.length();  
        // pixels
        int wordWidth = (int)(wordLength * buttonFont.getSize() * FONT_RATIO); 
        drawX = (image.getWidth() - wordWidth)/2;
        drawY = image.getHeight() - (image.getHeight() - buttonFont.getSize()) /2;
        //System.out.println("ww: " + wordWidth + " drawX: " + drawX);
      
        
        
        draw();
        setImage (image);
    }

    /*
    public void act() 
    {
        if (isTouching(Player.class)){
            setImage(touchingImage);
            touching = true;
        } else {
            setImage(image);
            touching = false;
        }
    }    

    public boolean touchingPlayer(){
        return touching;
    }
    */
    
    private void draw () {
        
        image.setColor(Color.WHITE);
        image.fill();
        image.setColor(Color.BLACK);
        image.setFont (buttonFont);
        image.drawString (myText, drawX, drawY);

        touchingImage.setColor(green);
        touchingImage.fill();
        touchingImage.setColor(Color.WHITE);
        touchingImage.setFont (buttonFont);
        touchingImage.drawString (myText, drawX, drawY);
    }

}
