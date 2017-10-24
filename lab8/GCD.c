/*lab8
 * dschmelt
 * Daniel Schmelter
 * This program takes 2 user positive ints and computes GCD to sd out.
 * */
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>

int main(){
   int x[2];
   int int1, int2, divd, divs, rem, temp;
   char str[100];

   printf("Enter a positive integer: ");
   while( 1 ){
      int1 = scanf(" %d", &x);
      while( int1!=1 ){
         scanf("%s", str);
         printf("Please enter a positive integer: ");
         int1 = scanf(" %d", &x);
      }
      if( x[0]>0) break;
      printf("Please enter a positive integer: ");
   }

   printf("Enter another positive integer: ");
   while( 1 ){
      int2 = scanf(" %d", &x[1]);
      while( int2!=1 ){
         scanf("%s", str);
         printf("Please enter a positive integer: ");
         int2 = scanf(" %d", &x[1]);
      }
      if( x[1]>0) break;
      printf("Please enter a positive integer: ");
   }     
int1 = x[0];
int2 = x[1];

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
}
printf("The GCD of %d and %d is %d\n", int1, int2, divs);







return 0;
}
