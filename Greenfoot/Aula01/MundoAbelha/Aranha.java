import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aranha here.
 * 
 * @author Lara
 * @version 2025-06-03
 */
public class Aranha extends Inseto
{
    /**
     * Act - do whatever the Aranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act()
    {
        // Add your action code here.
        move(1);
        turn(10-Greenfoot.getRandomNumber(20));
        if ( getX() > getWorld().getWidth()/2 && 
             getY() > getWorld().getHeight()/2 ){
            move(2);
        }
        verificarCanto();
        interseptarAbelha();
    }
    
    public void interseptarAbelha(){
        BeeWorld beeW = (BeeWorld)getWorld();
        //Virando em direção a Abelha
        turnTowards(beeW.getAbelha().getX(),beeW.getAbelha().getY());
    }
}
