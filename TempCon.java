
/** Stella Bertoli
 * 2/27/25
 * TempCon
 * Calculate the average of temp
 */
import java.util.*;
public class TempCon {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Farenheit Temperature: "); 
        int temp;
        double celsius;

        temp = input.nextInt();
        
        input.close();
        celsius = (5.0/9.0*(temp - 32));
        
        

        int whole = 10;
        double fraction = 0.5;
        int answer = whole + fraction;
        System.out.println(answer);





        
    }
    
}