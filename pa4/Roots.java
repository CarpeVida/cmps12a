//pa4
//Daniel Schmelter
//dschmelt
//This program computes the roots of a user given polynomial
import java.util.*;
class Roots{
public static void main(String[] args){
double resolution = 0.01, tolerance = 0.0000001, threshold = 0.001;
double L, R, a, b, mid;

Scanner sc = new Scanner(System.in);

int n, i;
System.out.print("Enter the degree: ");
n = sc.nextInt();
int c = (n+1);
System.out.print("Enter " + c +" coefficients: ");
double[] C = new double[c];
for(i=0; i<c; i++){
   C[i]=sc.nextDouble();
   }
System.out.print("Enter the left and right endpoints: ");
L = sc.nextDouble();
R = sc.nextDouble();

a=L;
b=L+resolution;
double[] D;
D = diff(C);
System.out.println("");
int count=0;
while(a<R){
   if(poly(C,a)*poly(C,b)<0){
     mid = findRoot(C,a,b,tolerance);
     System.out.printf("Root found at "+"%.5f%n", mid);
   count++;
   }
   else if((poly(D,a))*(poly(D,b))<0){
      mid = findRoot(D,a,b,tolerance);
      if((Math.abs(poly(C,mid))<threshold)){
         System.out.printf("Root found at "+"%.5f%n", mid);
         count++;
      }
   }
a=b;
b+=resolution;
}
if(count==0){
   System.out.println("No roots were found in the specified range.");
}

}
// returns the sum f(x) given array of coefficients C and an x value
static double poly(double[] C, double x){
double sum=0;
for(int i=0; i<C.length; i++){
   sum += C[i]*Math.pow(x,i);
}
return sum;
}
//diff returns a new array D, whose values are the derivative of C. 
static double[] diff(double[] C){
double[] D = new double [C.length-1];
for(int i=0; i<D.length; i++){
   D[i] = C[i+1]*(i+1); 
}
return D;
}
//findRoot takes user input and uses the interval method to find zeros.
static double findRoot(double[] C, double a, double b, double tolerance){
//interval method start
double width = b-a, mid=a;
while (width > tolerance){
   mid = (a +b) / 2;
   if((poly(C,a)*poly(C,mid))<=0){
      b=mid;
   }
   else{
      a=mid;
   }
      width = b-a;
   }
return mid;
}
}
