import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,0*50,0*50);
        MazeBlock mazeBlock2 = new MazeBlock();
        addObject(mazeBlock2,0*50,1*50);
        MazeBlock mazeBlock3 = new MazeBlock();
        addObject(mazeBlock3,0*50,11*50);
        MazeBlock mazeBlock4 = new MazeBlock();
        addObject(mazeBlock4,1*50,11*50);
        MazeBlock mazeBlock5 = new MazeBlock();
        addObject(mazeBlock5,2*50,11*50);
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,3*50,11*50);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,4*50,11*50);
        MazeBlock mazeBlock8 = new MazeBlock();
        addObject(mazeBlock8,5*50,11*50);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,6*50,11*50);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,7*50,11*50);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,8*50,11*50);
        MazeBlock mazeBlock12 = new MazeBlock();
        addObject(mazeBlock12,9*50,11*50);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,10*50,11*50);
        MazeBlock mazeBlock14 = new MazeBlock();
        addObject(mazeBlock14,11*50,11*50);
        MazeBlock mazeBlock15 = new MazeBlock();
        addObject(mazeBlock15,11*50,10*50);
        MazeBlock mazeBlock16 = new MazeBlock();
        addObject(mazeBlock16,11*50,9*50);
        MazeBlock mazeBlock17 = new MazeBlock();
        addObject(mazeBlock17,0*50,2*50);
        MazeBlock mazeBlock18 = new MazeBlock();
        addObject(mazeBlock18,0*50,3*50);
        MazeBlock mazeBlock19 = new MazeBlock();
        addObject(mazeBlock19,0*50,4*50);
        MazeBlock mazeBlock20 = new MazeBlock();
        addObject(mazeBlock20,0*50,5*50);
        MazeBlock mazeBlock21 = new MazeBlock();
        addObject(mazeBlock21,0*50,6*50);
        MazeBlock mazeBlock22 = new MazeBlock();
        addObject(mazeBlock22,0*50,7*50);
        MazeBlock mazeBlock23 = new MazeBlock();
        addObject(mazeBlock23,0*50,8*50);
        MazeBlock mazeBlock24 = new MazeBlock();
        addObject(mazeBlock24,0*50,9*50);
        MazeBlock mazeBlock25 = new MazeBlock();
        addObject(mazeBlock25,0*50,10*50);
        MazeBlock mazeBlock26 = new MazeBlock();
        addObject(mazeBlock26,1*50,0*50);
        MazeBlock mazeBlock27 = new MazeBlock();
        addObject(mazeBlock27,2*50,0*50);
        MazeBlock mazeBlock28 = new MazeBlock();
        addObject(mazeBlock28,2*50,1*50);
        MazeBlock mazeBlock29 = new MazeBlock();
        addObject(mazeBlock29,2*50,2*50);
        MazeBlock mazeBlock30 = new MazeBlock();
        addObject(mazeBlock30,4*50,0*50);
        MazeBlock mazeBlock31 = new MazeBlock();
        addObject(mazeBlock31,4*50,1*50);
        MazeBlock mazeBlock32 = new MazeBlock();
        addObject(mazeBlock32,4*50,2*50);
        MazeBlock mazeBlock33 = new MazeBlock();
        addObject(mazeBlock33,5*50,0*50);
        mazeBlock33.setLocation(5*50,0*50);
        MazeBlock mazeBlock34 = new MazeBlock();
        addObject(mazeBlock34,5*50,0*50);
        MazeBlock mazeBlock35 = new MazeBlock();
        addObject(mazeBlock35,7*50,0*50);
        MazeBlock mazeBlock36 = new MazeBlock();
        addObject(mazeBlock36,6*50,0*50);
        MazeBlock mazeBlock37 = new MazeBlock();
        addObject(mazeBlock37,8*50,0*50);
        MazeBlock mazeBlock38 = new MazeBlock();
        addObject(mazeBlock38,9*50,0*50);
        MazeBlock mazeBlock39 = new MazeBlock();
        addObject(mazeBlock39,10*50,0*50);
        MazeBlock mazeBlock40 = new MazeBlock();
        addObject(mazeBlock40,11*50,0*50);
        MazeBlock mazeBlock41 = new MazeBlock();
        addObject(mazeBlock41,11*50,1*50);
        MazeBlock mazeBlock42 = new MazeBlock();
        addObject(mazeBlock42,11*50,2*50);
        MazeBlock mazeBlock43 = new MazeBlock();
        addObject(mazeBlock43,1*50,4*50);
        MazeBlock mazeBlock44 = new MazeBlock();
        addObject(mazeBlock44,2*50,4*50);
        MazeBlock mazeBlock45 = new MazeBlock();
        addObject(mazeBlock45,2*50,5*50);
        MazeBlock mazeBlock46 = new MazeBlock();
        addObject(mazeBlock46,2*50,6*50);
        MazeBlock mazeBlock47 = new MazeBlock();
        addObject(mazeBlock47,2*50,8*50);
        MazeBlock mazeBlock48 = new MazeBlock();
        addObject(mazeBlock48,2*50,9*50);
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,3*50,9*50);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,4*50,9*50);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,4*50,8*50);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,4*50,7*50);
        MazeBlock mazeBlock53 = new MazeBlock();
        addObject(mazeBlock53,4*50,6*50);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,4*50,5*50);
        MazeBlock mazeBlock55 = new MazeBlock();
        addObject(mazeBlock55,4*50,4*50);
        MazeBlock mazeBlock56 = new MazeBlock();
        addObject(mazeBlock56,5*50,4*50);
        MazeBlock mazeBlock57 = new MazeBlock();
        addObject(mazeBlock57,5*50,2*50);
        MazeBlock mazeBlock58 = new MazeBlock();
        addObject(mazeBlock58,6*50,2*50);
        MazeBlock mazeBlock59 = new MazeBlock();
        addObject(mazeBlock59,7*50,2*50);
        MazeBlock mazeBlock60 = new MazeBlock();
        addObject(mazeBlock60,7*50,3*50);
        MazeBlock mazeBlock61 = new MazeBlock();
        addObject(mazeBlock61,7*50,4*50);
        MazeBlock mazeBlock62 = new MazeBlock();
        addObject(mazeBlock62,5*50,6*50);
        MazeBlock mazeBlock63 = new MazeBlock();
        addObject(mazeBlock63,6*50,6*50);
        MazeBlock mazeBlock64 = new MazeBlock();
        addObject(mazeBlock64,7*50,6*50);
        MazeBlock mazeBlock65 = new MazeBlock();
        addObject(mazeBlock65,8*50,6*50);
        MazeBlock mazeBlock66 = new MazeBlock();
        addObject(mazeBlock66,9*50,2*50);
        MazeBlock mazeBlock67 = new MazeBlock();
        addObject(mazeBlock67,9*50,3*50);
        MazeBlock mazeBlock68 = new MazeBlock();
        addObject(mazeBlock68,9*50,4*50);
        MazeBlock mazeBlock69 = new MazeBlock();
        addObject(mazeBlock69,9*50,5*50);
        MazeBlock mazeBlock70 = new MazeBlock();
        addObject(mazeBlock70,9*50,6*50);
        MazeBlock mazeBlock71 = new MazeBlock();
        addObject(mazeBlock71,10*50,3*50);
        MazeBlock mazeBlock72 = new MazeBlock();
        addObject(mazeBlock72,11*50,3*50);
        MazeBlock mazeBlock73 = new MazeBlock();
        addObject(mazeBlock73,6*50,8*50);
        MazeBlock mazeBlock74 = new MazeBlock();
        addObject(mazeBlock74,6*50,9*50);
        MazeBlock mazeBlock75 = new MazeBlock();
        addObject(mazeBlock75,6*50,10*50);
        MazeBlock mazeBlock76 = new MazeBlock();
        addObject(mazeBlock76,8*50,10*50);
        MazeBlock mazeBlock77 = new MazeBlock();
        addObject(mazeBlock77,8*50,9*50);
        MazeBlock mazeBlock78 = new MazeBlock();
        addObject(mazeBlock78,9*50,9*50);
        MazeBlock mazeBlock79 = new MazeBlock();
        addObject(mazeBlock79,8*50,7*50);
        MazeBlock mazeBlock80 = new MazeBlock();
        addObject(mazeBlock80,9*50,7*50);
        MazeBlock mazeBlock81 = new MazeBlock();
        addObject(mazeBlock81,11*50,4*50);
        MazeBlock mazeBlock82 = new MazeBlock();
        addObject(mazeBlock82,11*50,6*50);
        MazeBlock mazeBlock83 = new MazeBlock();
        addObject(mazeBlock83,11*50,7*50);
        MazeBlock mazeBlock84 = new MazeBlock();
        addObject(mazeBlock84,11*50,8*50);
        MazeRunner mazeRunner = new MazeRunner(3);
        addObject(mazeRunner,147,48);
        mazeRunner.setLocation(150,29);
        mazeRunner.setLocation(152,54);
        MazeBlock mazeBlock85 = new MazeBlock();
        addObject(mazeBlock85,596,199);
        MazeBlock mazeBlock86 = new MazeBlock();
        addObject(mazeBlock86,598,299);
        SpeedBoost speedBoost = new SpeedBoost();
        addObject(speedBoost,496,104);
        SpeedBoost speedBoost2 = new SpeedBoost();
        addObject(speedBoost2,149,399);
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1,56,154);
        Enemy1 enemy12 = new Enemy1();
        addObject(enemy12,246,400);
        mazeBlock75.setLocation(322,493);
        EnemyCar enemyCar = new EnemyCar(true);
        addObject(enemyCar,50,266);
        mazeBlock82.setLocation(540,284);
        mazeBlock82.setLocation(550,313);
        mazeBlock75.setLocation(405,543);
        YouWinPlatform youWinPlatform = new YouWinPlatform();
        addObject(youWinPlatform,551,259);
        EnemyCar2 enemyCar2 = new EnemyCar2(false);
        addObject(enemyCar2,266,54);
        enemyCar2.setLocation(257,52);
        SpeedBoost speedBoost3 = new SpeedBoost();
        addObject(speedBoost3,52,55);
        mazeBlock11.setLocation(559,557);
        mazeBlock75.setLocation(407,565);
        mazeBlock75.setLocation(411,555);
        mazeBlock10.setLocation(345,573);
        mazeBlock10.setLocation(349,550);
        mazeBlock75.setLocation(399,550);
        EnemyCar enemyCar3 = new EnemyCar(true);
        addObject(enemyCar3,496,482);
    }
}
