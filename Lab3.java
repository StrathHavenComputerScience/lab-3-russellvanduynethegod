public class Lab3
{
    public static void testLightCandles1()
    {
        Robot.load("candles1.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testLightCandles2()
    {
        Robot.load("candles2.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void checkandplace()
    {
        //tests to see if bricks are in the way of robot, if not robot moves
        //and darkens square. if occupied, robot manuevers around.
        if(Robot.frontIsClear())
        {
            Robot.move();
            Robot.makeDark();

        }
        if(!Robot.frontIsClear())
        {
            Robot.turnLeft();
            Robot.move();
            turnRight();
            checkandplace();

        }

    }

    public static void returnGround()
    {
        //robot moves itself forward, and down a level.
        Robot.move();
        turnRight();
        Robot.move();
        Robot.turnLeft();
    }

    public static void turnRight()
    {
        //turns the robot to the right
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft();
    }

    public static void lightCandles()
    {
        Robot.turnLeft();
        Robot.move();
        turnRight();
        checkandplace();
        returnGround();
        checkandplace();
        returnGround();
        checkandplace();
        returnGround();
        checkandplace();
        returnGround();
        checkandplace();
        returnGround();
        checkandplace();
        returnGround();
        checkandplace();
        returnGround();
        checkandplace();
        returnGround();
        checkandplace();
        returnGround();
        checkandplace();
        Robot.move();
        turnRight();
        Robot.move();
        Robot.turnLeft();

        //method will end robot on the other side of the map, having lit all the
        //candles through a series of if statements.

    }
    //Run this method to test completeRoom on map room1.txt
    public static void testCompleteRoom1()
    {
        Robot.load("room1.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    //Run this method to test completeRoom on map room2.txt
    public static void testCompleteRoom2()
    {
        Robot.load("room2.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    public static void checkandDark()
    {
        //checks if the robot is able to move, and then darkens the space accordingly.
        if(Robot.frontIsClear())
        {
            Robot.move();
            if(Robot.onDark())
            {
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.turnLeft();
            }
            else
            {
                Robot.makeDark();
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.turnLeft();
            }
        }
        if(!Robot.frontIsClear())
        {
            turnRight();
        }
    }

    public static void completeColumn()
    {
        //fills in one column of the board
        Robot.move();
        Robot.turnLeft();
        checkandDark();
        Robot.move();
        Robot.turnLeft();
        checkandDark();
        Robot.move();
        Robot.turnLeft();
        checkandDark();
        Robot.move();
        if(Robot.frontIsClear())
        {
            Robot.move();
            if(Robot.onDark())
            {
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.turnLeft();
                Robot.turnLeft();
            }
            else
            {
                Robot.makeDark();
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.turnLeft();
                Robot.turnLeft();
            }

        }
        Robot.turnLeft();
        if(Robot.frontIsClear())
        {
            Robot.move();
            if(Robot.onDark())
            {
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.turnLeft();
            }
            else
            {
                Robot.makeDark();
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.turnLeft();
            }

        }
        else
        {
            turnRight();
        }
        turnRight();
    }

    public static void completeRoom()
    {
        completeColumn();
        completeColumn();
        completeColumn();
        completeColumn();

    }
    //Run this method to test swapAll on map swap1.txt
    public static void testSwapAll1()
    {
        Robot.load("swap1.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Run this method to test swapAll on map swap2.txt
    public static void testSwapAll2()
    {
        Robot.load("swap2.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    public static void checkRow()
    {
        //checks one row and flips it.
        turnRight();
        Robot.move();
        if(Robot.onDark())
        {
            Robot.makeLight();
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
            Robot.move();
            if(Robot.onDark())
            {
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.move();
                Robot.makeDark();
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                turnRight();
                Robot.move();
            }
            else
            {
                Robot.makeDark();
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.turnLeft();
                Robot.move();
            }

        }
        else
        {
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
            Robot.move();
            if(Robot.onDark())
            {
                Robot.makeLight();
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.move();
                Robot.makeDark();
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                turnRight();
                Robot.move();
            }
            else
            {
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.turnLeft();
                Robot.move();
            }
        }
    }

    public static void checkrowFinal()
    {
        //checks one row and flips it, but doesn't move ahead to new one.
        turnRight();
        Robot.move();
        if(Robot.onDark())
        {
            Robot.makeLight();
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
            Robot.move();
            if(Robot.onDark())
            {
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.move();
                Robot.makeDark();
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                turnRight();

            }
            else
            {
                Robot.makeDark();
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.turnLeft();

            }

        }
        else
        {
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
            Robot.move();
            if(Robot.onDark())
            {
                Robot.makeLight();
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.move();
                Robot.makeDark();
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                turnRight();

            }
            else
            {
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                Robot.turnLeft();

            }
        }
    }

    public static void swapAll()
    {
        checkRow();
        checkRow();
        checkRow();
        checkRow();
        checkRow();
        checkRow();
        checkRow();
        checkRow();
        checkRow();
        checkrowFinal();
    }
    //Don't run these. I will!
    public static void testLightCandles3()
    {
        Robot.load("candles3.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testLightCandles4()
    {
        Robot.load("candles4.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testCompleteRoom3()
    {
        Robot.load("room3.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    public static void testCompleteRoom4()
    {
        Robot.load("room4.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    public static void testSwapAll3()
    {
        Robot.load("swap3.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Run this method to test swapAll on map swap2.txt
    public static void testSwapAll4()
    {
        Robot.load("swap4.txt");
        Robot.setDelay(0.05);
        swapAll();
    }
}
