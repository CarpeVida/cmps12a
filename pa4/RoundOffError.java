//-----------------------------------------------------------------------------
// RoundOffError.java
// Illustrates the fundamental problem of round-off error in floating point
// calculations.  Try changing the value of the int variable n.  Notice that
// for some values you get true, but for most you get false.  What values 
// of n give true?  Why?  (Hint:  try n=4096).
//-----------------------------------------------------------------------------

class RoundOffError{

   public static void main(String[] args){
      int i, n = 4096; 
      double sum = 0.0;
      double increment = 1/(double)n;
      
      // add 1/n to itself n times
      for(i=0; i<n; i++){
         // System.out.println(sum);
         sum += increment;
      }
      
      // the answer is in general not equal to 1.0
      System.out.println( sum + " == " + 1.0 + " is " + (sum==1.0) );
   }
   
}
