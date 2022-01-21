import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player class. In charge of player movement and shooting.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    boolean canFire = true;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player()
    {
        GreenfootImage playerSprite = getImage();
        int newHeight = playerSprite.getHeight()-15;
        int newWidth = playerSprite.getWidth()-15;
        playerSprite.scale(newWidth, newHeight);
    }
    
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
        shoot();
        
        // Checks to see if an enemt hit the player
        Enemy e = (Enemy) getOneIntersectingObject(Enemy.class);
        if (e != null)
        {
            Greenfoot.setWorld(new EndWorld());
        }
    }
    
    public void shoot()
    {
        if(Greenfoot.isKeyDown("space") && canFire == true)
        {
            getWorld().addObject(new Bullet(), getX(), getY());
            Greenfoot.playSound("sounds/shoot.wav");
            canFire = false;
        }
        else if(!Greenfoot.isKeyDown("space"))
        {
            canFire = true;
        }
    }
}
