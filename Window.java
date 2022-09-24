import java.util.ArrayList;
import java.io.*;
import java.util.*;
/*
   This is just an initial skeleton of the class to help you get started.
   It does NOT contain all the methods to complete the assignment requirements.
   As you add more code to it, you might have to do more imports.
   */

public class Window
{
   protected int rows;
   protected int cols;
   protected ArrayList<Shape> shapes;
   protected char [][] cells;
   protected char border;

   /*
      rows = number of rows available for drawing, borders excluded
      cols = number of cols available for drawing, borders excluded
      =999
      cells = 2D array of char depicting the drawing, its size should be: [rows+2][cols+2]
      shapes = ordered list of shapes (You can use Arrays, or LinkedList as well if you want)
      */
   public Window(int rows, int cols, char border)
   {
      //Initialize everything
      this.rows=rows;
      this.cols=cols;
      this.border=border;
      this.shapes= new ArrayList<Shape> ();
      cells = new char[rows +2 ][cols +2];

      //Make a call to addBorders()
      addBorders(border);
   }

   protected void addBorders(char ch)
   {
      for (int r1 =0; r1< rows +2; r1++)
      {
         for (int c1 =0; c1< cols +2; c1++ )
         {
            if(r1==0 || r1==rows+1 || c1==0||c1==cols+1)
               cells[r1][c1] = ch;
            else
               cells[r1][c1]=' ';
         }
                                          
   //add the border using ch as the character
      }
   }
   public  void display()
   {           for (int r2 =0; r2<= rows +1; r2++)
      {
         for (int c2 =0; c2<= cols +1; c2++ )
         {
            System.out.print(cells[r2][c2]+" " );

         }
         System.out.println();
      }
      //display the content of the array to the screen
   }

   public void addShape(Shape shape)
   {
      //add a shape to the collection
      //call the draw() method of the shape to draw itself on this window
      shapes.add(shape);
      shape.draw(this);
   }

   // This method is needed by classes of type Shape for method draw()
   // It cannot be private
   // We choose it to be accessible at the package level as the safest
   // choice open to us
   void setCell(int row, int col, char ch)
   {
      //set the character at cells[row][col] to 'ch'
      cells[row][col] = ch;
   }

   //define other methods as needed...
}
                                  
                