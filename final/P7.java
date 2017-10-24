import java.io.*;
import java.util.Scanner;
// Problem 7
class P7{
 public static void main(String[] args){
double sum = 0;
int n = 0;
Scanner sc = null;
try{ sc = new Scanner( new File ( args[0]));

}
catch(FileNotFoundException e | ArrayIndexOutOfBounds e){
 System.out.println("c'monnnn!");
 System.exit(1);
}
while(sc.hasNextDouble()){
 sum += sc.nextDouble();
 n++;
}
System.out.println( sum/n);
}
}
