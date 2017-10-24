// Problem7.java
import java.util.Scanner;
import java.io.*;
class Problem7{
 public static void main(String[] args){
 // your begins here
 Scanner sc = null;
 int n=0;
 double sum = 0, average;

    try{
      if(args.length == 1){ 
         sc = new Scanner( new File (args[0]));  // if there's one args file, initialize sc to args[0]
      }else{ 
         throw new FileNotFoundException();
      }
    }catch(FileNotFoundException e){    //catch if there's no file
        System.out.println("Error: wrong number of imput files");
        System.exit(1);
    }
  //  while(sc.hasNext()){   //there's another token
       while(sc.hasNextDouble()){   //it's a double parsable
           sum += sc.nextDouble();
           n++;
    }
 
 System.out.println("average is: "+ (sum/n));
 // your code ends here
} 
}
