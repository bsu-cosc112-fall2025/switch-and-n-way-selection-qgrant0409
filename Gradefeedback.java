import java.util.Scanner;

public class Gradefeedback {
    public static void main(String[] args) {
        String letter;
        String feedback;
        
        Scanner scanner = new Scanner(System.in) ;
        System.out.println ("Enter your numeric grade 0-100");
        int grade = scanner.nextInt() ; 

        if(grade >= 90 ) {
            letter = "A";
            feedback = "Excellent!" ; }
        else if (grade >= 80) {
            letter = "B";
            feedback = "Good Job!"; }
        else if (grade >= 70) {
            letter = "C";
            feedback = "Fair Effort!"; }
        else if (grade >= 60){
            letter= "D"; 
            feedback = "Needs Improvement" ;}
        else {
            letter = "F";
            feedback = "Failing Grade";}

            
            System.out.println(letter);
            System.out.println (feedback);

        scanner.close();
        
    }
}
