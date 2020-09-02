package Dao;

import Dao.BankAccount;

import java.util.UUID;

public class SavingsAccount extends BankAccount {
    //private final double accountBalance = 0.00;

    public SavingsAccount(UUID accountNumber, double withdrawalFeeCharge) {
        super(accountNumber, withdrawalFeeCharge);
    }
}
