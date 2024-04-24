import java.util.Scanner;

public class PlaceValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");

        int Num = sc.nextInt();
        System.out.println("Which number Place and Face Value you want to know : ");
        int place = sc.nextInt();
        String Number = Integer.toString(Num);
        int length = Number.length();
        int PlaceV = 0; 
        boolean found = false; // Flag to indicate if the digit is found

        for (int i = 0; i < length; i++) {
            char dig = Number.charAt(i); // Changed variable name to 'dig'
            int dig1 = Character.getNumericValue(dig); // Changed type casting and got the numeric value of the character
            if (dig1 == place) {
                found = true;
                if (length - i == 1) {
                    PlaceV = 1; // Changed the multiplication factor
                    break;
                } else if (length - i == 2) {
                    PlaceV = 10;
                    break;
                } else if (length - i == 3) {
                    PlaceV = 100;
                    break;
                } else if (length - i == 4) {
                    PlaceV = 1000;
                    break;
                } else if (length - i == 5) { // Fixed the condition and added a case for length 5
                    PlaceV = 10000;
                    break;
                } else {
                    System.out.println("Invalid entry");
                }
            }
        }
        if (!found) { // If the digit is not found in the number
            System.out.println("Digit not found in the number.");
        } else {
            System.out.println("Face Value of " + place + " is " + place+ ". Place  value of " + place + " is " + (place * PlaceV));
        }
    }
}
