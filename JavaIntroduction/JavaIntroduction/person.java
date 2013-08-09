import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class person extends Actor
{
    public void act() 
    {
        moveRandomly();
        checkForpoop();
    }

    public void moveRandomly()
    {
        setLocation(getX() +xv, getY() +yv);
        if(Greenfoot.getRandomNumber(100) == 0)
        {
            xv = Greenfoot.getRandomNumber(5) - 2;
            yv = Greenfoot.getRandomnumber(5) - 2;
        }
    }

    public void checkForpoop()
    {
        poop p = (poop) getIntersectingObjects(poop.class);
        if (p != null) 
        {
            reactTopoop();
        }
    }

    public void reactTopoop()
    {

    }
}
