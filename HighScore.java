import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScore extends Actor
{
    protected void addedToWorld(World world)
    {
        int count = GameWorld.score.getValue();
        if (UserInfo.isStorageAvailable())
        {
            UserInfo myInfo = UserInfo.getMyInfo();
            if (myInfo != null)
            {
                if (count > myInfo.getScore())
                {
                    myInfo.setScore(count);
                    myInfo.store();
                }
                String text = "High score: "+myInfo.getScore();
                setImage(new GreenfootImage(text, 50, Color.WHITE, Color.BLACK));
                return;
            }
        }
        world.removeObject(this);
    }
}
