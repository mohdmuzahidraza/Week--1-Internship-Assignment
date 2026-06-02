import java.util.Scanner;

public class BankManagementApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0.0;
        int choice;

        System.out.println("==============================");
        System.out.println("   Welcome to My Bank App    ");
        System.out.println("==============================");

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                if (amount > 0) {
                    balance += amount;
                    System.out.println("✔ Deposited Rs. " + amount);
                } else {
                    System.out.println("✘ Invalid amount!");
                }

            } else if (choice == 2) {

                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();
                if (amount > balance) {
                    System.out.println("✘ Insufficient balance!");
                } else if (amount <= 0) {
                    System.out.println("✘ Invalid amount!");
                } else {
                    balance -= amount;
                    System.out.println("✔ Withdrawn Rs. " + amount);
                }

            } else if (choice == 3) {

                System.out.println("Current Balance: Rs. " + balance);

            } else if (choice == 4) {

                System.out.println("Thank you for using My Bank App. Goodbye!");

            } else {

                System.out.println("✘ Invalid choice! Please enter 1-4.");

            }

        } while (choice != 4);

        sc.close();
    }
}
