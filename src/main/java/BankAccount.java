/**
 * <h1>The bank project to implement concept of encapsulation</h1>
 * @author Phindile Mfeka
 * @version 1.0
 * @since 2020-04-04
 *
 */

import java.util.Scanner;
import java.util.UUID;

public class BankAccount {
    /**
     * @param name,surname,idNumber: Details of a client
     */
    private String name;
    private String surname;
    private long idNumber;
    private UUID accountNumber;
    private double accountBalance;
    private double feeCharge;
    Scanner scan = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(UUID accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BankAccount(double accountBalance, UUID accountNumber, double feeCharge) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.feeCharge = feeCharge;
        System.out.println("Congratulations , you have created a bank account");
        System.out.println("Your Account Number is: "+accountNumber);

    }

    public double deposit(){    //Method for deposit
        System.out.println("Please Enter the amount you would like to deposit: ");
        int depositedAmount = scan.nextInt();

        if (depositedAmount>=50){
            accountBalance = accountBalance + depositedAmount;
        }
        else {
            System.out.println("you can not deposit an amount less than R50.");
        }
        System.out.print("Account balance: ");
        return accountBalance;
    }

    public double withdraw(){ //Method for withdrawing

        System.out.println("Please Enter the amount you would like to withdraw: ");
        int withdrawedAmount = scan.nextInt();

        if (withdrawedAmount <= accountBalance){
            accountBalance = accountBalance-withdrawedAmount-feeCharge;

        }else {
            System.out.println("Declined, balance amount exceeded");
        }
        System.out.print("Account balance: ");
        return accountBalance;
    }

    public double checkBalance(){
        System.out.print("Account Balance: ");
        return accountBalance;
    }

    public void interestRate(double rate){
        int year = 1;
        double yearlyRate = accountBalance * rate;
        double totalAmount =0;


        System.out.println(accountBalance + " grows with the interest rate of "+rate);

        for (int i = 1; i <= year; i++ ){
            totalAmount =totalAmount + accountBalance + yearlyRate;
            System.out.println(i+" "+ totalAmount);
        }

    }
}
