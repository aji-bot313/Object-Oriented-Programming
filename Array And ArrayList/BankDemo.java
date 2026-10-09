import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an array of Bank objects (accounts)
        Bank[] accounts = new Bank[3];
        accounts[0] = new Bank(100000); // Account 1 (Index 0)
        accounts[1] = new Bank(250000); // Account 2 (Index 1)
        accounts[2] = new Bank(500000); // Account 3 (Index 2)

        System.out.println("=================================");
        System.out.println("       WELCOME TO BANK ABC       ");
        System.out.println("=================================");

        // Select an account from the array
        System.out.print("Select Account (1, 2, or 3): ");
        int accountChoice = scanner.nextInt() - 1;

        if (accountChoice < 0 || accountChoice >= accounts.length) {
            System.out.println("Invalid account selection!");
            return;
        }

        Bank currentAccount = accounts[accountChoice];
        boolean running = true;

        while (running) {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Current balance: Rp " + String.format("%.0f", currentAccount.getBalance()));
                    break;

                case 2:
                    System.out.print("Enter deposit amount: Rp ");
                    double depositAmount = scanner.nextDouble();
                    currentAccount.deposit(depositAmount);
                    System.out.println("Deposit successful!");
                    System.out.println("Current balance: Rp " + String.format("%.0f", currentAccount.getBalance()));
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: Rp ");
                    double withdrawAmount = scanner.nextDouble();
                    currentAccount.withdraw(withdrawAmount);
                    System.out.println("Current balance: Rp " + String.format("%.0f", currentAccount.getBalance()));
                    break;

                case 4:
                    System.out.println("Thank you for using Bank ABC!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}