import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world is in charge of moving the enemy and removing it from
 * the world when it gets too close to the bottom of the screen.
 * 
 * @author Sherman, Marissa, and Carmen
 * @version 09/01/22
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy()
    {
        // resize enemies
        GreenfootImage enemySprite = getImage();
        int newHeight = enemySprite.getHeight()/8;
        int newWidth = enemySprite.getWidth()/8;
        enemySprite.scale(newWidth, newHeight);
    }
    
    
    public void act()
    {
        setLocation(getX(), getY() + 3);
        
        if (getY() > 895)
        {
            getWorld().removeObject(this);
        }
    }
}
