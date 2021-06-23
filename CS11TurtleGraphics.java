

/*
 * Name: Javisth-Chabria Student
 * Login: cs11faol
 * Date: September 24, 2016
 * File: CS11TurtleGraphics.java
 * Sources of Help: Google, CSE11 Useful Links page
 *
 * This program displays a given text graphically on a computer screen
 */

import turtleClasses.*;
import java.awt.Color;

/*
 * Name:      Class CSE11TurtleGraphics
 * Purpose:   This class implements a turtle that manually displays graphics
 *            on a computer screen
 */


public class CS11TurtleGraphics extends Turtle
{
      private final static int CHAR_WIDTH=40;


      private final static int CHAR_HEIGHT=80;
      private final static int PADDING_BETWEEN_CHARS=40;
      private final static int PADDING_BETWEEN_LINES=40;
      private final static int CHAR_SPACING= CHAR_WIDTH+PADDING_BETWEEN_CHARS;      
      private final static int LINE_SPACING= CHAR_HEIGHT+PADDING_BETWEEN_LINES;
      private final static int DOUBLE_CHAR_SPACING=CHAR_SPACING+ CHAR_SPACING;
      private final static int DIAGONAL_DIST=(int)Math.sqrt
      (CHAR_HEIGHT*CHAR_HEIGHT + CHAR_WIDTH*CHAR_WIDTH);
      private final static int DIAGONAL_ANGLE=(int)Math.asin
        (CHAR_WIDTH/DIAGONAL_DIST);

      private final static int START_X_1=40; // starting x offset for line 1
      private final static int START_X_2=40; // starting x offset for line 2
      private final static int START_X_3=40; // starting x offset for line 3
      private final static int START_Y=40;   // starting y offset


      private final static int   PEN_WIDTH=10;
      private final static Color PEN_COLOR=Color.BLUE;


      private final static int WORLD_WIDTH=1080;
      private final static int WORLD_HEIGHT=480;

      private final static int HALF_CHAR_WIDTH=CHAR_WIDTH/2;
      private final static int HALF_CHAR_HEIGHT=CHAR_HEIGHT/2;



/*
 * Delay between turtle actions (turns, moves) in milliseconds.
 * 1000=1 sec. so 200=0.2 sec.
 */
       private final static int DELAY=200;


/*
 * Name:       CS11TurtleGraphics
 * Purpose:    Constructor to create turtle
 * Parameters: w of type object World where the turtle is implemented
 *             delay of type int which stores the delay of turtle's action
 */


        public CS11TurtleGraphics(World w, int delay)
        {
           super(w,delay);  //Invoke superclass's ctor to create this turtle
        }                   // on World w with delay of each turtle's action.


/*
 * Name:       drawC
 * Purpose:    The turtle moves on the screen to display the letter C
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */


         private void drawC(int x, int y)
         {   
             penUp();
             moveTo(x,y);//always start in upper left corner of this char block
             turnToFace(getXPos()+1, getYPos()); // face right
             penDown();
             forward(CHAR_WIDTH);
             backward(CHAR_WIDTH);
             turnRight();
             forward(CHAR_HEIGHT);
             turnLeft();
             forward(CHAR_WIDTH);
          }


/*
 * Name:       drawS
 * Purpose:    The turtle moves on the screen to diplay the letter S
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */





        private void drawS(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();  
orward(CHAR_WIDTH);
          backward(CHAR_WIDTH);
          turnRight();
          forward(HALF_CHAR_HEIGHT);
          turnLeft();
          forward(CHAR_WIDTH);
          turnRight();
          forward(HALF_CHAR_HEIGHT);
          turnRight();
          forward(CHAR_WIDTH);
         }


/*
 * Name:       draw1
 * Purpose:    The turtle moves on the screen to diplay the number 1
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */



private void draw1(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1,getYPos());
          penDown();
          forward(CHAR_WIDTH);
          backward(HALF_CHAR_WIDTH);
          turnLeft();
          forward(CHAR_HEIGHT);
          turnLeft();
          turn(-CHAR_WIDTH);
          forward(HALF_CHAR_WIDTH);
         }




/*
 * Name:       drawF
 * Purpose:    The turtle moves on the screen to diplay the letter F
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */





        private void drawF(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          forward(CHAR_WIDTH);
          backward(CHAR_WIDTH);
          turnRight();
          forward(HALF_CHAR_HEIGHT);
          turnLeft();
          forward(CHAR_WIDTH);
          backward(CHAR_WIDTH);
          turnRight();
          forward(HALF_CHAR_HEIGHT);
         }





/**
** Name:       drawA
** Purpose:    The turtle moves on the screen to diplay the letter A
** Parameters: x of type int represents the x co-ordinate of the turtle
**             y of type int represents the y co-ordinate of the turtle
** Return:     void
**/





        private void drawA(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          turn(-75);
          forward(HALF_CHAR_HEIGHT);
          turn(75);
          forward(HALF_CHAR_WIDTH);
          backward(HALF_CHAR_WIDTH);                     
          turn(-75);
          forward(HALF_CHAR_HEIGHT);
          turn(75);
          turn(75);
          forward(CHAR_HEIGHT);
         }




/*
 * Name:       drawO
 * Purpose:    The turtle moves on the screen to diplay the letter O
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */





        private void drawO(int x, int y)
{
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          forward(CHAR_WIDTH);
          turnRight();
          forward(CHAR_HEIGHT);
          turnRight();
          forward(CHAR_WIDTH);
          turnRight();
          forward(CHAR_HEIGHT);
         }



/*
 * Name:       drawL
 * Purpose:    The turtle moves on the screen to diplay the letter L
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */





 private void drawL(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          forward(CHAR_WIDTH);
          backward(CHAR_WIDTH);
          turnLeft();
          forward(CHAR_HEIGHT);
         }




/*
 * Name:       drawJ
 * Purpose:    The turtle moves on the screen to diplay the letter J
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */





 private void drawJ(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          forward(CHAR_WIDTH);
          backward(HALF_CHAR_WIDTH);
          turnRight();
          forward(CHAR_HEIGHT);
          turnRight();
          forward(HALF_CHAR_WIDTH);
          turnRight();
          forward(HALF_CHAR_WIDTH);
         }




/*
 * Name:       drawV
 * Purpose:    The turtle moves on the screen to diplay the letter V
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */





        private void drawV(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          turn(75);
          forward(CHAR_HEIGHT);
          turn(-75);
          turn(-75);
          forward(CHAR_HEIGHT);
         }





/*
 * Name:       draw2
 * Purpose:    The turtle moves on the screen to diplay the number 2
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */





        private void draw2(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          forward(CHAR_WIDTH);
          turnRight();
          forward(HALF_CHAR_HEIGHT);
          turnRight();
          forward(CHAR_WIDTH);
          turnLeft();
          forward(HALF_CHAR_HEIGHT);
          turnLeft();
          forward(CHAR_WIDTH);
        }




/*
 * Name:       draw6
 * Purpose:    The turtle moves on the screen to diplay the number 6
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */





        private void draw6(int x, int y)
        {  
penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          forward(CHAR_WIDTH);
          backward(CHAR_WIDTH);
          turnRight();
          forward(CHAR_HEIGHT);
          turnLeft();
          forward(CHAR_WIDTH);
          turnLeft();
          forward(HALF_CHAR_HEIGHT);
          turnLeft();
          forward(CHAR_WIDTH);
         }





/*
 * Name:       drawU
 * Purpose:    The turtle moves on the screen to diplay the letter U
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */




 private void drawU(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          turnRight();
          forward(CHAR_HEIGHT);
          turnLeft();
          forward(CHAR_WIDTH);
          turnLeft();
          forward(CHAR_HEIGHT);
         }






/*
 * Name:       drawN
 * Purpose:    The turtle moves on the screen to diplay the letter N
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */




 private void drawN(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          turnLeft();
          forward(CHAR_HEIGHT);
          turnRight();
          turn(65);
          forward(DIAGONAL_DIST);
          turn(-65);
          turnLeft();
          forward(CHAR_HEIGHT);
         }




/*
 * Name:       drawD
 * Purpose:    The turtle moves on the screen to diplay the letter D
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */





 private void drawD(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          forward(HALF_CHAR_WIDTH);
          turn(35);
          forward(HALF_CHAR_WIDTH);
          turn(-35);
          turnRight();
          forward(HALF_CHAR_HEIGHT);
          turn(35);
          forward(HALF_CHAR_WIDTH);
          turn(-35);
          turnRight();
          forward(HALF_CHAR_WIDTH);
          turnRight();
          forward(CHAR_HEIGHT);
         }





/*
 * Name:       drawI
 * Purpose:    The turtle moves on the screen to diplay the letter I
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */




         private void drawI(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          forward(CHAR_WIDTH);
          backward(HALF_CHAR_WIDTH);
          turnLeft();
          forward(CHAR_HEIGHT);
          turnRight();
          forward(HALF_CHAR_WIDTH);
          backward(CHAR_WIDTH);
        }





/*
 * Name:       drawE
 * Purpose:    The turtle moves on the screen to diplay the letter E
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */





         private void drawE(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          forward(CHAR_WIDTH);
          backward(CHAR_WIDTH);
          turnLeft();
          forward(HALF_CHAR_HEIGHT);
          turnRight();
          forward(CHAR_WIDTH);
          backward(CHAR_WIDTH);
          turnLeft();
          forward(HALF_CHAR_HEIGHT);
          turnRight();
          forward(CHAR_WIDTH);
         }  





/*
 * Name:       drawG
 * Purpose:    The turtle moves on the screen to diplay the letter G
 * Parameters: x of type int represents the x co-ordinate of the turtle
 *             y of type int represents the y co-ordinate of the turtle
 * Return:     void
 */




         private void drawG(int x, int y)
        {
          penUp();
          moveTo(x,y);//always start in the upper left corner of this char block
          turnToFace(getXPos()+1, getYPos()); // face right
          penDown();
          forward(CHAR_WIDTH);
          backward(CHAR_WIDTH);
          turnRight();
          forward(CHAR_HEIGHT);
          turnLeft();
          forward(CHAR_WIDTH);
          turnLeft();
          forward(HALF_CHAR_HEIGHT);
          turnLeft();
          forward(HALF_CHAR_WIDTH);
        }      





/*
 * Name:       main
 * Purpose:    Controlling the movements of the turtle by calling all functions
 * Parameters: args of array type String represents all the program elements
 * Return:     void
 */





 public static void main(String [] args)
         {
             int startX1=START_X_1; // starting x offset for line 1
             int startX2=START_X_2; // starting x offset for line 2
             int startX3=START_X_3; // starting x offset for line 3
             int startY=START_Y;    // starting y offset


             int x, y;


             World w= new World(WORLD_WIDTH, WORLD_HEIGHT);
             CS11TurtleGraphics myTurtle=new CS11TurtleGraphics(w, DELAY);


             myTurtle.setPenWidth(PEN_WIDTH);
             myTurtle.setPenColor(PEN_COLOR);



             myTurtle.drawC(x=startX1, y=startY);
             myTurtle.drawS(x +=CHAR_SPACING, y);
             myTurtle.draw1(x +=CHAR_SPACING, y+CHAR_HEIGHT);
             myTurtle.draw1(x +=CHAR_SPACING, y+CHAR_HEIGHT);
             myTurtle.drawF(x +=CHAR_SPACING, y);
             myTurtle.drawA(x +=CHAR_SPACING, y+CHAR_HEIGHT);
             myTurtle.drawO(x +=CHAR_SPACING, y);
             myTurtle.drawL(x +=CHAR_SPACING, y+CHAR_HEIGHT);
             myTurtle.drawJ(x=startX2 , y=y+LINE_SPACING);
             myTurtle.drawA(x +=CHAR_SPACING, y+CHAR_HEIGHT);
             myTurtle.drawV(x +=CHAR_SPACING, y);
             myTurtle.drawA(x +=CHAR_SPACING, y+CHAR_HEIGHT);
             myTurtle.draw2(x +=DOUBLE_CHAR_SPACING, y);
             myTurtle.drawO(x +=CHAR_SPACING, y);
             myTurtle.draw1(x +=CHAR_SPACING, y+CHAR_HEIGHT);
             myTurtle.draw6(x +=CHAR_SPACING, y);
             myTurtle.drawU(x=startX3, y=y+LINE_SPACING);
             myTurtle.drawC(x +=CHAR_SPACING, y);
             myTurtle.drawS(x +=DOUBLE_CHAR_SPACING, y);
             myTurtle.drawA(x +=CHAR_SPACING, y+CHAR_HEIGHT);
             myTurtle.drawN(x +=CHAR_SPACING, y+CHAR_HEIGHT);
             myTurtle.drawD(x +=DOUBLE_CHAR_SPACING, y);
             myTurtle.drawI(x +=CHAR_SPACING, y+CHAR_HEIGHT);
             myTurtle.drawE(x +=CHAR_SPACING, y+CHAR_HEIGHT);
             myTurtle.drawG(x +=CHAR_SPACING, y);
             myTurtle.drawO(x +=CHAR_SPACING, y);
            }

 }                         