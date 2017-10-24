class Swap{

public static void main(String[] args){
 int[] A = {1,2,3,4};
 swap(A, 2, 3);
 for(int i=0; i<A.length; i++){
    System.out.print(A[i]+" ");
   
}
}
static void swap(int[] A, int i, int j){
   int temp;
   temp = A[i];
   A[i] = A[j];
   A[j] = temp;
return;
}

}
