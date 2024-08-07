import java.util.*;
public class BankAccount {
    Scanner input = new Scanner(System.in);
    int accountNumber;
    double balance;
    String name;
    public BankAccount(int accountNumber,String name,double balance){
        this.accountNumber =accountNumber;
        this.name =name;
        this.balance =balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful !! ");
    }

    public void withdraw(double amount)  {
        if(balance >= amount){
            System.out.println("Enter Your Four Digit Pin");


            int pin = input.nextInt();
            System.out.println("");
            System.out.println("Withdrawal Successful");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance(){
        System.out.println("Balance " + balance);
    }
}
