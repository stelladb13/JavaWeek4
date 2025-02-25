public class digits{

    /****2/25/25
 * Stella Bertoli
 * Digits
 * Use modular division and isolate digits
 */
    public static void main(String[]args) {
        int ones;
        int tens;
        int hundreds;
        int num;

        num = 258;
        hundreds = ((num/10)%10)/2;
        tens = (num/10)%10;
        ones = num%10;
        
        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hundreds);
        
    }

}
    
