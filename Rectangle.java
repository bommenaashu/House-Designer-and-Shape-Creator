
public class Rectangle extends Shape
{
   private int height;
   private int width;


   public Rectangle(int rb,int cb, int height,int width, char character)
   {

      super(rb,cb, character);
      this.height=height;
      this.width=width;

   }

   //define the constructor following the signature in the specification

   public void draw(Window window)
   {  int a=getRb();
      int b=getCb();
      char c=getchar();

      Line lobj1=new Line(a, b,height,1,0,c);
      lobj1.draw(window);

      Line lobj2=new Line(a, b+width,height,1,0,c);
      lobj2.draw(window);
      Line lobj3=new Line(a, b,width,0,1,c);
      lobj3.draw(window);
      Line lobj4=new Line(a+height, b,width,0,1,c);
      lobj4.draw(window);

      //treat the rectangle as four lines

      //Line line1 = new Line(/*appropriate parameters goes here*/);
      //similarly line2, line3, line4

      //now use the draw method in the Line class to draw the rectangle
   }



}
                 