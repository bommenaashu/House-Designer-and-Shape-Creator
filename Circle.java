
public class Circle extends Shape
{
   private int rad;    // radius

   //define the constructor following the signature in the specification
   public Circle(int rb, int cb, int rad, char character)
   {
      super(rb,cb, character);
      this.rad=rad;

   }
   public void draw(Window window)
   {
      //assuming row position of the center of this circle is 'rb'
      //assuming column position of the center of this circle is 'cb'
      int a=getRb();
      int b=getCb();
      char c=getchar();

      //Attempt to draw 20 points and a possible way is shown below
      //you can come up with other possible logic for drawing a circle as well

      for(int i = 0; i < 20; i++)
      {
         double angle = i * Math.PI/10; //radian angle
         int rdif = (int) Math.round(rad * Math.cos(angle));
         int row = a + rdif;
         int cdif = (int) Math.round(rad * Math.sin(angle));
         int col = b + cdif;

         //now row and col forms a point on the perimeter of the circle
         window.setCell(row,col,c);

         //appropriate call to setCell() method of the Window class...
      }
   }

         //define other methods...
}
                                