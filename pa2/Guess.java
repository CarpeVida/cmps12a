// Guess.java
// Daniel Schmelter
// dschmelt
// pa2
// This guessing game taught me about conditional phrasing and the backslash n function

import java.util.Scanner;

class Guess{
public static void main( String[] args ){

int g1, g2, g3, ranint;
double rannum;
Scanner sc = new Scanner(System.in);

rannum = Math.floor(Math.random() * 10) + 1;
ranint=(int)rannum;
System.out.println("\nI'm thinking of an integer in the range 1 to 10.  You have three guesses.\n");
System.out.print("Enter your first guess: ");
g1 = sc.nextInt();
if(ranint == g1)
   System.out.println("You win!");
else{
   if(g1>ranint)
      System.out.println("Your guess is too high.\n");
   else{
      System.out.println("Your guess is too low.\n");
   }  
      System.out.print("Enter your second guess: ");
      g2 = sc.nextInt();
      if (ranint == g2)
         System.out.println("You win!\n");
      else{
         if(g2>ranint)
            System.out.println("Your guess is too high.\n");
         else{
            System.out.println("Your guess is too low.\n");
         }
            System.out.print("Enter your third guess: ");
             g3 = sc.nextInt();
            if (ranint == g3)
               System.out.println("You win!\n");
            else{
               if(g3>ranint)
                  System.out.println("Your guess is too high.\n");
               else{
                  System.out.println("Your guess is too low.\n");
               }
                  System.out.println("You lose.  The number was "+ranint+".\n");
            }
      }
}
}
}
