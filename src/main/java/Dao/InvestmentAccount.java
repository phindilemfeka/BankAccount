package Dao;

import Dao.BankAccount;

import java.util.UUID;

public class InvestmentAccount extends BankAccount {
    //private final double accountBalance = 0.00;

    public InvestmentAccount(UUID accountNumber, double feeCharge) {
        super(accountNumber, feeCharge);
    }
}
