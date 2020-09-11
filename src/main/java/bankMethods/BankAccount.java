package bankMethods;

public interface BankAccount {

    double deposit(int depositAmount);
    double withdraw(int withdrawAmount);
    double interestRate(double annualInterestRate);
    double bankCharges(double amount);
}
