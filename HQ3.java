import java.util.Scanner;
public class HQ3{
    public static double totalenergy(double morningenergy, double eveningenergy) {
        return morningenergy + eveningenergy;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter morning energy : ");
        double morning = sc.nextDouble();
        System.out.print("Enter evening energy: ");
        double evening = sc.nextDouble();
        double total = totalenergy(morning, evening);
        System.out.println("Total energy generated: " + total + " kwh");
        sc.close();
    }
}

//we are using the concepts of methods
//we have parameters
//this has a return