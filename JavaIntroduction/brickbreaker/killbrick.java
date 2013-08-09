import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class killbrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class killbrick extends Brick
{
    public  killbrick()
    {
     GreenfootImage image = new GreenfootImage(40,20);
     image.setColor(Color.red);
     image.fillRect(0,0,40,20);
     image.setColor(Color.black);
     image.fillOval(10,4,20,8);
     image.fillRect(15,8,10,8);
     
     image.setColor(Color.white);
     image.fillOval(14,6,4,4);
     image.fillOval(24,6,4,4);
     setImage(image);
    }
    
    /**
     * Act - do whatever the killbrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int getScoreValue() 
    {
        return -1000;// Add your action code here.
    }    
}
