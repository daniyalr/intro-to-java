import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poop extends Actor
{
    int altitude = 100;
    public poop() 
    {
        getImage().scale(25,25);
    }

    public void act()
    {
        if (altitude >10)
        {
            altitude = altitude -1;
            getImage().scale(altitude / 4, altitude/4);
        }
        else
        {
            GreeenfootImage image = new GreenfootImage

            setImage(image);      
        }
    }
}