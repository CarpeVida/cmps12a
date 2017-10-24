//  lab4
// Asks for imput and calculates GCD using Euclidian algorithm.`
// Daniel Schmelter
// dschmelt

import java.util.Scanner;

class GCD{
public static void main( String[] args){
Scanner sc = new Scanner(System.in);

int int1, int2, divd, divs, rem, temp;

System.out.print("Enter a positive integer: ");
while(true){
      if(sc.hasNextInt() ){
         int1 = sc.nextInt();
         if(int1 > 0) break;
         else{
            System.out.print("Please enter a positive integer: "); 
            continue;
         }
      }else{
         System.out.print("Please enter a positive integer: ");
         sc.next();
         continue;
      }
}
System.out.print("Enter another positive integer: ");
while(true){ 
  if(sc.hasNextInt() ){
      int2 = sc.nextInt();
      if(int2 > 0)break;
      else{
         System.out.print("Please enter a positive integer: ");
         continue;
         }
   }else{ 
      sc.next();
      System.out.print("Please enter a postive integer: "); 
      continue;
   }
}
if(int1 > int2){
   divd = int1;
   divs = int2;
}else{
   divs = int1;
   divd = int2;
}while(divd%divs != 0){
   rem = divd%divs;
   temp = divs;
   divs = rem;
   divd = temp;
   continue;
}System.out.println("The GCD of "+int2+" and "+int1+" is "+ divs);

}   
}


