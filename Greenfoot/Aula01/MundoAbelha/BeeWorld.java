import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,33,39);
        Abelha abelha = new Abelha();
        addObject(abelha,41,182);
        Mosca mosca = new Mosca();
        addObject(mosca,552,157);
        mosca.setLocation(23,332);
        mosca.setLocation(23,332);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,100,334);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,164,327);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,223,239);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,248,305);
        Mosca mosca6 = new Mosca();
        addObject(mosca6,230,353);
        mosca4.setLocation(327,297);
        mosca3.setLocation(320,352);
        mosca2.setLocation(428,271);
        mosca.setLocation(446,336);
        mosca5.setLocation(47,292);
        mosca6.setLocation(65,357);
        mosca3.setLocation(178,349);
        mosca4.setLocation(131,273);
        mosca3.setLocation(212,356);
        mosca4.setLocation(180,314);
        mosca2.setLocation(123,271);
        mosca2.setLocation(294,298);
        mosca4.setLocation(179,295);
        mosca.setLocation(301,357);
    }
}
