 import java.util.Scanner;
 public class HQ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter energy generated :"
        );
        int energy = sc.nextInt();
    if(energy>=10){
        System.out.println("Good energy generation ");
    }
     else{
         System.out.println("low energy generation");
    }

    }
 }

 // we are using if else logic here
 // if else is used when atleast one of the conditions are to be satisfied
 // if we ahve more than 10 energy units then we will get good energy generation
 // sacnner class is used to take our input