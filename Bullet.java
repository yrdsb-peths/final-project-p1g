import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() - 10);
        
        // Checks to see if a bullet hit an enemy
        Enemy e = (Enemy) getOneIntersectingObject(Enemy.class);
        if (e != null)
        {
            getWorld().removeObject(e);
            getWorld().removeObject(this);
        }
        
        // if bullet gets to the top of the screen
        else if (getY() < 5)
        {
            getWorld().removeObject(this);
        }
    }
}
