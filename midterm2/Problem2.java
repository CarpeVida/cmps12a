class Problem2{ 
public static void main(String[] args){

int[] A = {1, 2, 3, 4};
int[] B = {5, 6, 7, 8};
int[] AB = new int[8];

AB = concatenate( A, B);

printArray(AB);

}
static void printArray(int[] X){
   System.out.print("( ");
for(int i=0; i<X.length; i++){
   System.out.print(X[i]+" ");
   }
System.out.println(") ");
}


static int[] concatenate(int[] A, int[] B){
 // your code starts here
int[] AB = new int[A.length+B.length];
for(int i=0; i<A.length; i++){
   AB[i] = A[i];
}
for(int i=0; i<B.length; i++){
   AB[i+A.length] = B[i];
}
return AB;

}

} // your code ends here
