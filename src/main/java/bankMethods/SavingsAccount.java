package bankMethods;

import java.util.Scanner;

public class SavingsAccount implements BankAccount {
    private double accountBalance;

    public SavingsAccount(double accountBalance){
        this.accountBalance = accountBalance;
        this.accountBalance = 0.00;
    }

    @Override
    public double deposit(int depositAmount) {
        System.out.println("How much would you like to deposit ");
        Scanner scan = new Scanner(System.in);
        depositAmount = scan.nextInt();

        if (depositAmount > 50){
            accountBalance += depositAmount;
        }
        else {
            System.out.println("You are not allowed to deposit lass than R50");
            accountBalance += 0;
        }
            return accountBalance;
    }

    @Override
    public double withdraw(int withdrawAmount) {
        System.out.println("How much would like to withdraw");
        Scanner scan1 = new Scanner(System.in);
        withdrawAmount = scan1.nextInt();

        if (withdrawAmount > accountBalance){
            accountBalance -= withdrawAmount;
        }
        else {
            System.out.println("You can not withdraw an amount greater than your account balance");
            accountBalance -= 0;
        }
        return accountBalance;
    }

    @Override
    public double interestRate(double annualInterestRate) {

        double decimalInterest = annualInterestRate/100;

        return (decimalInterest/12)*100;
    }

    @Override
    public double bankCharges(double amountCharged) {
        int day = 31;

        for (int i=0; i<day; i++ ){
            if (i==30){
                accountBalance -= amountCharged;
            }
            else
                return accountBalance - 0;
        }

        return accountBalance;
    }
}
