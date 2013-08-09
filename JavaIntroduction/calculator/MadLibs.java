
/**
 * MadLib generator!
 */

import java.util.Scanner;

public class MadLibs
{
    public static void main(String[] args)
    { 
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("enter an evil:");
        String evil = keyboard.nextLine();
        
        System.out.print("enter an animal:");
        String bob = keyboard.nextLine();
        
        
        System.out.println("once apon a time the was a " + bob +".");
        System.out.println("the evil " + evil + " wanted to kill "+ bob+" or his fur.saddly the "+bob+" was too dumb and died The End");
    }
}
