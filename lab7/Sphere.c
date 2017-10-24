/*Daniel Schmelter
 * lab 7
 * dschmelt
 * this program takes imput radius and returns SA and V
*/

#include<stdio.h>
#include<math.h>


int main(){
   double r, V, SA;
   const double pi = 3.141592654;

   printf("Enter the radius of the sphere: ");
   scanf(" %lf", &r);
   V = (4.0/3.0)*pi*pow(r,3);
   SA = 4.0*pi*pow(r,2);
   printf("The volume is %f and the surface area is %f.", V, SA);
   printf("\n");
   return 0;
}
