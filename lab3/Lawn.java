// Lawn.java
// Daniel Schmelter
// Dschmelt
// pa1
// Hi!  This program calculates lawn area.

//Area

import java.util.Scanner;

class Lawn{

   public static void main( String[] args ){
     double length, width, lotarea;
     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter the length and width of the lot, in feet: ");
     width = sc.nextDouble();
     length = sc.nextDouble();
     lotarea = width*length;

     double houselength, housewidth, housearea, lawnarea;
//     System.out.print("Enter the length and width of the house, in feet: ");
     housewidth = sc.nextDouble();  
     houselength = sc.nextDouble();
     housearea = housewidth*houselength;
     lawnarea = lotarea - housearea;
     System.out.print("The lawn area is ");
     System.out.print(lawnarea);    
     System.out.println(" square feet.");
    
     int s, m, h;
     double rate, sraw;
//     System.out.print("Enter the mowing rate, in square feet per second: ");
     rate = sc.nextDouble();
     sraw = lawnarea/rate; 
     s = (int) Math.round(sraw); 
     m = s/60;
     s = s%60;
     h = m/60;
    System.out.println ("The mowing time is "+h+" hour"+(h==1?"":"s ")+m+(" minute"+(m==1? " ":"s ")+s+(" second")+(s==1? ".":"s.")));
}
}
