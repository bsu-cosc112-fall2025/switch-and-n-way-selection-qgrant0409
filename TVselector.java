import java.util.Scanner;

public class TVselector {
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Select Model Number:");
        System.out.println("1: Model 100");
        System.out.println("2: Model 200");
        System.out.println("3:Model 300");
        System.out.println("Please Type Model Number:");

        int number = scanner.nextInt();
    

        switch (number) {
            case 1:
            System.out.println ("Remote control, timer, stereo sound — $1000") ;
            break ; 

            case 2:
            System.out.println ("Adds picture-in-picture — $120") ;
            break ; 

            case 3:
            System.out.println(" Adds HDTV, flat screen, 16x9 aspect ratio — $2400") ;

            scanner.close();

         
    }
}
}