package challenge;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the bank! ");
        System.out.println("Do you have a account? (yes/no) ");
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            System.out.println("Please enter your account number: ");
            int account = scanner.nextInt();
        } else {
            System.out.println("Please enter your name:");
            String n = scanner.nextLine();
            System.out.println("Please enter your age:");
            int a = scanner.nextInt();
            System.out.println("Please enter your phone number:");
            int p = scanner.nextInt();
            System.out.println("Please enter your address:");
            String ad = scanner.nextLine();
            System.out.println("Account created successfully!. Next time you can login with your account number. 123456");
            
        }
        

        
    }
}
