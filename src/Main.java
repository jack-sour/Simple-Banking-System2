import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[10];
        int accountCount = 0;

        while(true) {
            System.out.println("1. Create a New Account ");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4 Check Account Balance");
            System.out.println("");
            System.out.println("Dear Customer, Welcome To Jay Bank. Enter Your Choice");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Your name:");
                    String name = input.next();
                    System.out.println("");
                    System.out.println("Enter age");
                    int age = input.nextInt();
                    System.out.println("");
                    System.out.println("Enter Date of Birth:");
                    String date = input.next();
                    System.out.println("");
                    System.out.println("Initial Deposit must Be Made To Create Account:");
                    System.out.println("");
                    System.out.println("Enter Initial Deposit: ");
                    double depositD = input.nextDouble();
                    System.out.println("");
                    System.out.println("Account Has Being Created Successfully 🤑🤑🤑!!! ");
                    System.out.println("");
                    System.out.println("Your name is " + name + " and you're " + age + " years old ");
                    System.out.println("Your Initial Deposit Is: " + depositD);

                    accounts[accountCount] = new BankAccount(65433455,"Khobby",765445676);
                    accountCount++;
                    break;

                case 2:
                    System.out.println("Enter account number ");
                    int accountNumber = input.nextInt();
                    System.out.println("");
                    System.out.println("Enter Amount ");
                    double depositAmount = input.nextDouble();
                    System.out.println("");
                    System.out.println("Deposit Succcesful !!!");
                    accounts[accountNumber - 1].deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter Account Number: ");
                    int accountNum = input.nextInt();
                    System.out.println("");
                    System.out.println("Enter Amount");
                    double withdrawal = input.nextDouble();
                    System.out.println("Enter Your Four Digit Pin");
                    int pin =input.nextInt();
                    accounts[accountNum -1].withdraw(withdrawal);
                    break;


                case 4:
                    System.out.println("Enter account number");
                    int acc = input.nextInt();
                    System.out.println("Enter pin");
                    int Pin = input.nextInt();
                    System.out.println("balance is " + accountCount);
                    accounts[acc -1].checkBalance();
                    break;
            }
        }


    }
}