import java.io.*;

/*
This is just an initial skeleton of the class to help you get started.
It does NOT contain all the methods to complete the assignment requirements.
As you add more code to it, you might have to do more imports.
*/

public abstract class Shape
{
 private int rb;           // row position of e point
   private int cb;            // col position of base point
   private char character;    // drawing character

   public Shape(){};

   public Shape(int rb, int cb, char character)
   {
      this.rb = rb;
      this.cb = cb;
      this.character = character;
   }
   public int getRb()
   {return rb;
   }
   public int getCb()
   {return cb;
   }

   public char getchar()
   {return character;
   }


   public abstract void draw(Window window);

   public abstract String writeSpec();
   //you might need to add more abstract/concrete methods in this class...
}
