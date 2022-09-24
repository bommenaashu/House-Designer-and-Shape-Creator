import java.io.*;
import java.util.*;

import java.math.*;


public class diamond
{
   public static void main(String args[])
   {
   
  
      Scanner keyboard = new Scanner(System.in);
      System.out.println ("Enter height of the diamond (<=0 to exit)");
      int height = keyboard.nextInt();
      int row, noOfSpaces, noOfStars, spaceCount, starCount;

            int upperTriangleSize = height /2 + height%2;
            for( row=1;row<=upperTriangleSize; ++row)
            {
               noOfSpaces = upperTriangleSize - row;
                noOfStars = row *2-1;
               for(spaceCount=1;spaceCount<=noOfSpaces; ++spaceCount)
               {
                  System.out.print(" ");
               }

               for( starCount =1; starCount<=noOfStars;++starCount)
               {
                  System.out.print("*");
               }

                  System.out.println();
            

            }
            int lowerTriangleSize = height/2;
           for(row= lowerTriangleSize ; row >= 1; --row)
            {
        	   noOfSpaces = upperTriangleSize -row;
               noOfStars = row*2-1;
              for(spaceCount=1;spaceCount<=noOfSpaces; ++spaceCount)
                  {
                   System.out.print(" ");
                  }
                     for(starCount =1; starCount<=noOfStars;++starCount)
                        {
                           System.out.print("*");
                         }
                            System.out.println();  
            }
                                                                                                                                                            }
       
   }
   
     