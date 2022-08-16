import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeRunner extends Players
{
    /**
     * Act - do whatever the MazeRunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int mazeRunnerLives;
    //Creando un constructor 
    public MazeRunner(int lives)
    {
        getImage().scale(getImage().getWidth()/4*3, getImage().getHeight()/4*3);
        mazeRunnerLives = lives;
    }
    public void act()
    {
        slideAround();
        collectBoost();
        maxSpeed();
        loseLife();
        mazeRunnerHit();
        youWin();
        youLose();
    }
    public void mazeRunnerHit()
    {
        if(hitEnemy())
        {
            setLocation(150,29);
        }   
    }
    public void loseLife()
    {
        if (hitEnemy())
        {
            mazeRunnerLives--;
        }
    }
    public void youLose()
    {
        if(mazeRunnerLives == 0)
        {
            getWorld().addObject(new YouLose(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
