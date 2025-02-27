/** Stella Bertoli
 * 2/27/25
 * GradeAvg
 * Calculate the average of grades
 */
import java.util.*;
public class GradeAvg {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a grade: "); //prompt user for grade
        int grade1;
        int grade2;
        int grade3;
        int grade4; 
        int grade5; 
        double average;

        grade1 = input.nextInt();
        System.out.println("Enter a grade: "); //prompt user for grade
        grade2 = input.nextInt();
        System.out.println("Enter a grade: "); //prompt user for grade
        grade3 = input.nextInt();
        System.out.println("Enter a grade: "); //prompt user for grade
        grade4 = input.nextInt();
        System.out.println("Enter a grade: "); //prompt user for grade
        grade5 = input.nextInt();
        input.close();
        average = (grade1+grade2+grade3+grade4+grade5)/5.0;
        
        System.out.println("Your grade average is " + average);





        
    }
    
}
