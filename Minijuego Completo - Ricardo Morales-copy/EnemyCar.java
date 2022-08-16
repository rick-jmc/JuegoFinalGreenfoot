import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class EnemyCar extends Enemies
{
    /**
     * Act - do whatever the EnemyCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean upDown;
    int speed = 2;
    public EnemyCar(boolean upAndDown)
    {
        getImage().scale(getImage().getWidth()/4*3, getImage().getHeight()/4*3);
        upDown = upAndDown;
    }
    public void act()
    {
        moveAround();
        enemyHitWalls();
    }
    public void enemyHitWalls()
    {
        if (hitWalls() || isAtEdge())
        {
            speed = -speed;
        }
     
    }
    private void moveAround()
    {
        int x = getX();
        int y = getY();
        if (upDown)
        {
            setLocation(x, y + speed);
        }
        else if (!upDown)
        {
            setLocation(x + speed, y);
        }
    }
}
