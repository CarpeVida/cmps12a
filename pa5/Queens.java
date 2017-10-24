//Daniel Schmelter
//Queens.java
//pa5
//Dschmelt
//This program computes all the given answers to a n-Queens.
class Queens{
   public static void main(String[] args){
      int n = 0, c=0;
      boolean verbose = false;
      if(args.length>2 || args.length<0){
      err();
      }
      if(2 == args.length){
         if(args[0].equals("-v")){
            verbose = true;
         }else err();
         try{
            n = Integer.parseInt(args[1]);
         }catch(NumberFormatException e){
            err();
         }
      }
      if(1 == args.length){
         try{
            n = Integer.parseInt(args[0]);
         }catch(NumberFormatException e){
            err();
         }
         
      }
      if(0 == args.length){
         err();
      }
      int[] A =new int[n];
      for(int i=0; i<n ; i++) A[i] = i+1;
      if(verbose){
         print(A, n);
      }
      c = solutionNumber(A, n, c);
      if( n >= 0) System.out.println(n+"-Queens has "+c+" solutions");
   }
   public static void err(){
      System.out.println("Usage: Queens [-v] number");
      System.out.println("Option:  -v   verbose output, print all solutions");
      System.exit(0);
   }
   public static int factorial(int n){
      for(int i=n-1; i>0; i--){
         n *= (i);
      }
   return n;
   }
   static void nextPermutation(int[] A){
//      int pivot = 0;
      int successorindex = 0;
      int pivotindex = 0;
      boolean pivotfound = false;   
      for(int i=A.length-2; i>=0 ;i--){
         if(A[i] < A[i+1]){
            pivotindex = i;
   	    pivotfound = true;
            break;
         }
      }
      if(!pivotfound){
         reverse(A, 0);
         return;
      }	
      for(int i=A.length-1; i>=0; i--){
         if(A[i]>A[pivotindex]){
             successorindex = i;
             break;   
         }
      }
      swap(A, pivotindex, successorindex);
      reverse(A, pivotindex+1);
      return;
   }
   public static int solutionNumber(int[] A, int n, int c){
      for(int i=0; i<factorial(n); i++){
         nextPermutation(A);
         if(isSolution(A)){
            c++;
         }
      }
   return c;
   }
   public static void print(int[] A, int n){
      for(int i=0; i<factorial(n); i++){
         nextPermutation(A);
         if(isSolution(A)){
            System.out.print("(");
            for(int d=0; d<A.length; d++){
               System.out.print(A[d]);
               if((d+1) < A.length){
                  System.out.print(", ");
               }
            }
            System.out.println(")");
         }
      }
      return;
   }
   static void swap(int[] A, int i, int j){
      int temp = A[i];
      A[i] = A[j];
      A[j] = temp;
   return;
   }
   static void reverse(int[] T,int i){
      int j = T.length-1;
      while(i<j){
         swap(T, i, j);
         i++;
         j--;
      }
   return;
   }

// Checks if a solution to n-rooks is also a solution to n-queens.
// Compare horizontal and verical distance to see if there's a horizonatl attack.
// Compare pairs, not ordered pairs. see number of sets with formula (n*(n-1))/2
// if find a diagonal attack, return false and cease. If no, return true
   static boolean isSolution(int[] A){
      int n = A.length;
      for(int i=0; i<n; i++){
         for(int j=i+1;j<n; j++){
            if(Math.abs(A[i]-A[j]) == Math.abs(i - j)){
               return false;
            }
         }
      }
      return true;
   }
}
