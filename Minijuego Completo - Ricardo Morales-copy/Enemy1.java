import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Enemies
{
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy1()
    {
        getImage().scale(getImage().getWidth()/4*3, getImage().getHeight()/4*3);

    }
    
    public void act()
    {
        move(5);
        wrapAtEdge();
    }
}
