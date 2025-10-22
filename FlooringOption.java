import java.util.Scanner;

public class FlooringOption {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please Select Flooring Plan Option");
        System.out.println("Option: 1");
        System.out.println("Option: 2");
        System.out.println("Option: 3");
        int plan = scanner.nextInt(); 

        switch (plan){
        case 1:
         System.out.println ( "Scored concrete. Price: $3,000" );
         break;
        case 2:
        System.out.println ("Carpeting. Price $5,000" ) ;
        break;
        case 3:
        System.out.println ( "Wood floors in living areas, carpeting in bedrooms, tile in bath areas. Price =  10,000$" ) ;

        scanner.close();
        }
    }
}
