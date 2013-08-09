import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shooting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shooting extends World
{
    private shooter hunter1;
    private shooter hunter2;
    /**
     * Constructor for objects of class shooting.
     * 
     */
    public shooting()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 800, 1); 
        prepare();
    }

    public void prepare()
    {
        hunter1 = new shooter();
        addObject(hunter1, 300,150);
        hunter2 = new shooter();
        addObject(hunter2, 300,450);
    }

    public void  getRandomShooter(){
        if(Greenfoot.getRandomNumber(2) == 0) {
            return hunter1;
        }
        else
        {
            return hunter2;
        }
    }
}