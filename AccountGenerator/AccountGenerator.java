import java.util.Scanner;
import java.util.Random;

public class AccountGenerator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        Random randGen = new Random();
        String firstName;
        String lastName;
        String userName;
        
        System.out.print("Enter your first name: ");
        firstName = scnr.next();
        System.out.print("Enter your first name: ");
        lastName = scnr.next();
        userName = String.format("%.1s%.5s%d",firstName.toLowerCase(),lastName.toLowerCase(),randGen.nextInt(90)+10);
        System.out.printf("Username: %s\n", userName);
    }
}

