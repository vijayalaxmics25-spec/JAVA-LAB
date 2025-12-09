import java.util.Scanner;


class Account {
    String customerName;
    String accountNumber;
    String accountType;
    double balance;

    Account(String name, String accNo, String type, double bal) {
        customerName = name;
        accountNumber = accNo;
        accountType = type;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited!");
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


class SavingsAccount extends Account {

    SavingsAccount(String name, String accNo, double bal) {
        super(name, accNo, "Savings", bal);
    }

    
    void computeInterest(double rate, int years) {
        double interest = balance * Math.pow((1 + rate / 100), years) - balance;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}


class CurrentAccount extends Account {
    final double MIN_BALANCE = 1000;
    final double SERVICE_CHARGE = 100;

    CurrentAccount(String name, String accNo, double bal) {
        super(name, accNo, "Current", bal);
    }

    void checkMinimumBalance() {
        if (balance < MIN_BALANCE) {
            System.out.println("Balance below minimum! Service charge imposed.");
            balance -= SERVICE_CHARGE;
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            checkMinimumBalance();
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}


public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        SavingsAccount sAcc = new SavingsAccount("Rahul", "S102", 5000);
        CurrentAccount cAcc = new CurrentAccount("Priya", "C205", 1200);

        
        System.out.println("--- Savings Account ---");
        sAcc.deposit(1000);
        sAcc.computeInterest(5, 2);
        sAcc.withdraw(2000);
        sAcc.displayBalance();

        System.out.println("\n--- Current Account ---");
        cAcc.withdraw(500);
        cAcc.displayBalance();

        sc.close();
    }
}