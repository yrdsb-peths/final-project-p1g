import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player class. In charge of player movement and shooting.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // movement
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 5, getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 5, getY());
        }
        
        // shoot
        if(Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new Bullet(), getX(), getY());
        }
    }
}
