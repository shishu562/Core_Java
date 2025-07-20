
// Java Banking Program

package PROJECT;

import java.util.Scanner;

public class BankProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    // DECLARE VARIABLES

    double balance = 0;
    boolean isRunning = true;
    int choice;

    while (isRunning) {
         // DISPLAY MENU

    System.out.println("****************");
    System.out.println("BANKING PROGRAM");
    System.out.println("****************");
    System.out.println("1. Show Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Exit");
    // System.out.println("");
        System.out.println("****************");


    //GET AND PROCESS USERS CHOICE

    System.out.print("Enter Your Choice (1-4) : ");
    choice = scanner.nextInt();

    switch (choice) {
        case 1 -> showBalance(balance);

        case 2 -> balance += deposite();

        case 3 -> balance -= withdraw(balance);

        case 4 -> isRunning = false;

        default -> System.out.println("INVALID CHOICE");

    }
    }

    // showBalance()



    // deposite()

    // withdraw()

    // EXIT MESSAGE

    System.out.println("************ HAPPY BANKING ****************");
    System.out.println("Thank you! have a nice day!");
    System.out.println("************* HAPPY BANKING ***************");
        
    scanner.close();
    }

    static void showBalance(double balance){
        System.out.println("****************");
        System.out.printf("$%.2f\n", balance);
    }

    static double deposite(){
        double amount;

        System.out.print("Enter a amount to be deposited : ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be Negative");
            return 0;
        }else{
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;
        System.out.println("Enter ammount to be withdrawn");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }else if(amount < 0){

            System.out.println("Amount can't be Negative");
            return 0;
        }else{
            return amount;
        }
    }
}
