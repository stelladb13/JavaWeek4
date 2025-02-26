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
        int thousands;
        int num;

        num = 6258;
        hundreds = ((num/100)%10);
        tens = (num/10)%10;
        ones = num%10;
        thousands = (num/1000)%10;

        
        System.out.println("The ones digit is " + ones);
        System.out.println("The tens digit is " + tens);
        System.out.println("The hundreds digit is " + hundreds);
        System.out.println("The thousands digit is " + thousands);
        
    }

}
    
