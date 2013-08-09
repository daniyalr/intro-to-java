import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lemur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lemur extends Animal
{
    /**
     * Act - do whatever the lemur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(atWorldEdge())
        {
            turn(2);
        }
        int Chipseaten = 0;
        if(canSee(Chips.class) )
        {

            eat(Chips.class);
            Chipseaten = Chipseaten +1;
        }
        if(isTouching(Lemur.class))
        {

            turn(3);
        }
        //move(Greenfoot.getMoveRandom(10) -5);
        //turn(Greenfoot.getMoveRandom(10) -5);
        checkKeys();
    } 

    public void checkforchips()
    {}
    
    public void poop()
    {
        getWorld().addObject(new poop(), getX(), getY());
    }
    
    public void checkKeys()
    {  if(Greenfoot.isKeyDown("left") )
        {
            move(2);
            turn(-4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(2);
            turn(4);

        }
        if(Greenfoot.isKeyDown("up"))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("space"))
        {
            poop();

        }
    }
  
}