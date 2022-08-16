import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// Aquí se encuentran los metodos para el sistema de movimiento del personaje. 
// También hay otros como el método para que el personaje no atraviese paredes,
// y también al tocar un enemigo.
public class Movers extends Actor
{
    int speed = 5;
    /**
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void maxSpeed()
    {
        if (speed>=7)
        {
            speed = 7;
        }
    }
     public void moveAndTurn()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(4);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(4);
        }
    }
    public void slideAround()
    {
        int x = getX();
        int y = getY();
       if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x + 4, y);
            if(hitWalls())
            {
                setLocation(x -4, y);
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x - 4, y);
            if(hitWalls())
            {
                setLocation(x +4, y);
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y-4);
            if(hitWalls())
            {
                setLocation(x, y+4);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y+4);
            if(hitWalls())
            {
                setLocation(x, y-4);
            }
        } 
    }
    public boolean hitWalls()
    {
        if (isTouching(MazeBlock.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void collectBoost()
    {
        if (isTouching(SpeedBoost.class))
        {
            speed++;
            removeTouching(SpeedBoost.class);
        }

    }
    public boolean hitEnemy()
    {
        if(isTouching(Enemies.class))

        {
            return true;
        }
        else 
        {
            return false;
        }
        
    }
}
