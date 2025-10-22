import java.util.Scanner;

public class TravelEligibility {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in) ; 
        System.out.println("Please enter your age:");
        System.out.println("True or False: Do you have a passport?") ;
        int age = scanner.nextInt() ; 
        Boolean passport = scanner.nextBoolean() ;

        if (age >= 18) {
            if (passport) {
            System.out.println ("Eligible to travel internationally!") ; }
            else {
            System.out.println("Not Eligible to travel internationally");}
            }
        if (age < 18) {
            if (passport) {
            System.out.println("Eligible to travel with guardian!"); }
            else {
            System.out.println(" Not Eligible to travel internationally"); }
        }
        
        

            scanner.close() ; 
            }
        

}
    
