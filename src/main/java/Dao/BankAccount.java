package Dao;

import Model.User;
import java.util.Scanner;

@Reposatory
public class BankAccount implements UserInterface {


    @Override
    public double deposit() {
        System.out.println("How much would you like deposit: ");
        Scanner scan = new Scanner(System.in);
        int depositedAmount = scan.nextInt();

        if (depositedAmount<50){
            System.out.println("Amount is less than R50");
        }
        else
            accountBalance = accountBalance + depositedAmount;

        return accountBalance;
    }

    @Override
    public double withdraw() {
        System.out.println("How much you would like to withdraw?: ");
        Scanner scan1 = new Scanner(System.in);
        int withdrawedAmount = scan1.nextInt();

        if (withdrawedAmount>accountBalance){
            System.out.println("Amount is less than balance");
        }
        else
            accountBalance = accountBalance - withdrawedAmount;

        return accountBalance;
    }

    @Override
    public void interestRate() {


    }

    @Override
    public void bankCharges() {

    }
}
