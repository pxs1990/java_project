package BankATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        // Create a bank account instance;
        BankAccount account = new BankAccount("123456", "1234", 1000.0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM");
        System.out.print("Enter your account number: ");
        String enteredAccountNumber = scanner.nextLine();
        System.out.print("Enter your PIN: ");
        String enteredPin = scanner.nextLine();

        if (enteredAccountNumber.equals(account.getAccountNumber()) && enteredPin.equals(account.getPin())) {
            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: $" + account.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter the deposit amount: $");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter the withdrawal amount: $");
                        double withdrawalAmount = scanner.nextDouble();
                        account.withdraw(withdrawalAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid account number or PIN. Please try again.");
        }
    }
}

