class Reverse{
public static void main(String[] args){
int[] A = {0,1,2,3,4};
reverse(A, 1);
for(int i = 0; i<A.length; i++){
System.out.print(A[i]+" ");
} 
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

}
