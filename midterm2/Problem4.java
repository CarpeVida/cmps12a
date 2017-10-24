class Problem4{
public static void main(String[] args){
System.out.println(sum(999));
}
static int sum(int n){
if( n<= 1)
   return n;
else
   return(n+sum(n-1));
}
}
