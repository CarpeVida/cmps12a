import java.util.Scanner;
class Pushups{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int n, sum=0;

System.out.print("Enter a number: ");
n = sc.nextInt();

for(int i=n; i>=0; i--){
   sum=sum+i;
}
//for(int i=0; i
System.out.print(sum+"\n");
}
}
