import java.util.Scanner;
class DrawSquare{
 public static void main(String[] args){
 int n = 0;
 if(args.length != 1){
    Usage();
 }
 try{
  Integer.parseInt(args[0]);
 }
 catch(NumberFormatException e){
    Usage();
 }
 if(Integer.parseInt(args[0])<2 ){
     Usage();
 }
 n = Integer.parseInt(args[0]);
 
//draw the muthafucka
 for(int i = 0; i<n; i++){
    System.out.print("*");
 }
 System.out.println("");
 for(int i=0; i<n-2; i++){
    System.out.print("*");
    for(int j=0; j<n-2; j++){
       System.out.print(" ");
    }
    System.out.println("*");
 }
 for(int i=0; i<n; i++){
    System.out.print("*");
 }

 System.out.println("");

}

 public static void Usage(){
    System.out.println("Usage: java DrawSquare <positive integer at least 2>");
    System.exit(1);
 }
}

