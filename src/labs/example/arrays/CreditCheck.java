/*
@author: DeAndre Colston
@date: 03/22/2026
@purpose: Week 10 Lab
*/

public class CreditCheck {
    public static void main(String[] args) {

        String cardNumber = "4539148803436467"; 
        
        if (isValidMod10(cardNumber)) {
            System.out.println("Credit Card " + cardNumber + " is valid.");
        } else {
            System.out.println("Credit Card " + cardNumber + " is not valid.");
        }
    }
    
    public static boolean isValidMod10(String cardNo) {
        int sum = 0;
        boolean alternate = false;

        for (int i = cardNo.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNo.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n -= 9;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}
