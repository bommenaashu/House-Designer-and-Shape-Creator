
public class Line extends Shape
{
   private int length;  // line would have (length + 1) characters
   private int rInc;   // -1 (go up), 0 or 1 (go down)
   private int cInc;   // -1, 0 or 1
   // if both = 0, then have a point

   //define the constructor following the signature in the specification

   public Line(int rb, int cb, int length, int rInc, int cInc, char character)
   {
      super(rb,cb, character);
      this.length=length;
      this.rInc=rInc;
      this.cInc=cInc;

   }

   public void draw(Window window)
   {
      int a=getRb();
      int b=getCb();
      char c=getchar();
      for(int i = 0; i <= length; i++)
      {
         // int a=getRb();
         //int b=getCb();
         // char c=getchar();//determine appropriate row, col values
         if (rInc == 0 && cInc == 1)//For printing number 1
         {
            window.setCell(a,b,c);
            b++;
         }
         else if (rInc == 1 && cInc == 1)//For printing number  2
         {
            window.setCell(a,b,c);
            a++;
            b++;
         }


         else if (rInc == 1 && cInc == 0) //For printing number 3
         {
            window.setCell(a,b,c);
            a++;
         }
         else if( rInc == 1 && cInc == -1) //For printing number 4
         {
            window.setCell(a,b,c);
            a++;
            b--;
         }
         else if(rInc == 0 && cInc == -1) //For printing number 5
         {
            window.setCell(a,b,c);
            b--;
         }
         else if(rInc == -1 && cInc == -1) //For printing number 6
         {
            window.setCell(a,b,c);
            a--;
            b--;
         }
         else if(rInc == -1 && cInc == 0) //For printing number 7
         {
            window.setCell(a,b,c);
            a--;
         }
         else if(rInc == -1 && cInc == 1)// For printing number 8
         {
            window.setCell(a,b,c);
            b++;
            a--;
         }
         //then make a call to setCell() method of the Window class

         //after reading the specification, draw a line in a piece of paper first
         //to visualize the different points in a line
      }

   }

}
                         :