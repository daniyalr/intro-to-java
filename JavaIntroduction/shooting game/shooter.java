import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shooter extends Actor
{
    boolean facingLeft = false;
    boolean facingRight = true;
    int playerNumber = 0;
    int delay = 0;
    public void shooter(int player)
    {   
         playerNumber =player;
        getImage().scale(30,30);
    }

    /**
     * Act - do whatever the shooter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFireKey();
       
    } 

    public void checkKeys()
    {
        String upKey = "up";
        if (playerNumber == 2) {
            upKey = "w";
        }
        String upKey = "down";
         if (playerNumber == 2) {
            upKey = "s";
        }
        String upKey = "right";
         if (playerNumber == 2) {
            upKey = "d";
        }
        String upKey = "left";
         if (playerNumber == 2) {
            upKey = "a";
        }
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() -5);
        }
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() +5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            if (facingRight){  
                setLocation(getX() + 5, getY());
            }
            else{
                getImage().mirrorHorizontally();
                facingRight = true;
                facingLeft = false;
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            if (facingLeft){  
                 setLocation(getX() -5, getY());
            }
            else{
                getImage().mirrorHorizontally();
                facingLeft = true;
               facingRight = false;
            }
        }
    }

    public void checkFireKey()
    {
       if(dalay > 0){
        delay = delay -1;
        }
        
        String fireKey = "space";
        if (playerNumber == 2){
        fireKey = "q";
        }
        if(Greenfoot.isKeyDown(fireKey)){
            firebulet();
        }
    }
    public void firebulet()
    {
      bulet Bulet = new bulet();
      getWorld().addObject(Bulet, getX(), getY());
      if (facingLeft) 
      {
        Bulet.turn(180);
        Bulet.getImage().mirrorVertically();
       }
    }
}
