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
    public Bullet()
    {
        GreenfootImage bulletSprite = getImage();
        int newHeight = bulletSprite.getHeight()+10;
        int newWidth = bulletSprite.getWidth()+10;
        bulletSprite.scale(newWidth, newHeight);
    }
    public void act()
    {
        setLocation(getX(), getY() - 7);
        removeFromWorld();
    }
    public void removeFromWorld()
    {
        GameWorld world = (GameWorld) getWorld();
        Actor Enemy =  getOneIntersectingObject(Enemy.class);
        if (Enemy != null)
        {
            getWorld().removeObject(Enemy);
            getWorld().removeObject(this);
            world.timeCount.add(2);
            world.increaseScore();
        }
        
        // if bullet gets to the top of the screen
        else if (getY() < 5)
        {
            getWorld().removeObject(this);
        }
    }
}
