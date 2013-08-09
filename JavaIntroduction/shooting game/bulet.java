import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bulet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bulet extends Actor
{
    /**
     * Act - do whatever the bulet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       atWorldEdge();
    }
    public void atWolrdend()
    {
        if (atWorldEdge()){
            getWorld().removeObject(this);
        }
    }
}
